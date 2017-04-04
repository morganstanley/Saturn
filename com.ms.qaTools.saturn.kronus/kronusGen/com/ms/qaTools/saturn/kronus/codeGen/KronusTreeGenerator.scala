package com.ms.qaTools.saturn.kronus.codeGen

import java.io.PrintWriter
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path

import scala.collection.JavaConverters._
import scala.compat.Platform.EOL
import scala.tools.nsc.Global
import scala.tools.nsc.Settings
import scala.tools.nsc.ast.TreeDSL
import scala.tools.nsc.reporters.StoreReporter

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.CompilerClassLoader
import com.ms.qaTools.saturn.{kronus => k}

object KronusTreeGenerator {
  def apply(): KronusTreeGenerator = {
    val settings = new Settings
    settings.usejavacp.value = true
    settings.embeddedDefaults(new CompilerClassLoader)
    val compiler = Global(settings, new StoreReporter)
    ; { // Need to put compiler in parser phase in order to use quasiquotes
      val run = new compiler.Run
      compiler.phase = run.parserPhase
      run.cancel()
    }
    new KronusTreeGenerator(compiler)
  }

  object ValRefExtractor {
    def unapply(vr: k.ValRef): Option[k.ReferenceableDefs] = Option(vr.getRef)
  }

  def sortDefs(defs: Seq[k.AbstractDef]): Seq[k.AbstractDef] = {
    val (typeDefs, defSeq) = defs.partition(_.isInstanceOf[k.TypeDef])
    val defSet = defSeq.toSet
    val deps = defSeq.map { n =>
      n -> n.eAllContents.asScala.collect {
        case ValRefExtractor(vd: k.ValDef) if defSet(vd)      => vd
        case ValRefExtractor(fd: k.FunctionDef) if defSet(fd) => fd
        case fc: k.FunctionCall if defSet(fc.getMethod)       => fc.getMethod
      }.toSet[k.AbstractDef]
    }
    k.topSort(deps) match {
      case (cycle, xs) if cycle.isEmpty =>
        typeDefs ++ xs
      case (cycle, _) =>
        val msg = {
          Seq("Cyclic dependencies in Kronus file:") ++ cycle.map {
            case (n, ms) => s"${n.getName} -> ${ms.map(_.getName)}"
          }
        }.mkString("\n")
        throw new IllegalArgumentException(msg)
    }
  }

  class ScalaParseException(code: String) extends Exception(s"Error parse code: $code")
}

class KronusTreeGenerator(val global: Global) extends KronusGenerator with TreeDSL {
  import scala.collection.JavaConversions._
  import scala.reflect.internal.Flags._
  import global._, CODE._, KronusGenerator.CompileException, KronusTreeGenerator._

  implicit val freshNameCreator = currentFreshNameCreator

  implicit val genURI = Liftable[URI](uri => q"new java.net.URI(${uri.toASCIIString})")

  implicit val genLocation = Liftable[k.Location] { l =>
    val pkg = Ident(k.GeneratedSymbol.packageName)
    val uri = Ident(k.GeneratedSymbol.sourceURI)
    q"new Location($pkg, $uri, ${l.startLine}, ${l.endLine})"
  }

  def generateFile(topLevel: k.TopLevelKronus, outputDir: Path) = scala.util.Try {
    val wrappedTL: k.WrappedTopLevelKronus = topLevel
    val pkg = wrappedTL.pkg
    val cls = wrappedTL.clazz
    val app = wrappedTL.app
    val dir = outputDir.resolve(pkg.mkString("/"))
    val resultVal = k.GeneratedSymbol.result
    Files.createDirectories(dir)
    val scalaFile = dir.resolve(s"$cls.scala")
    val writer = new PrintWriter(Files.newOutputStream(scalaFile))
    try {
      if (pkg.nonEmpty) writer.printf("package %s%n%n", pkg.mkString("."))
      Seq("import scala.collection.JavaConversions._",
          "import scala.concurrent.ExecutionContext",
          "import scala.util.Try",
          "import java.util.Locale",
          "import com.ms.qaTools.saturn.kronus.Location",
          "import com.ms.qaTools.saturn.kronus.runtime._").foreach(writer.println)
      writer.println()
      val classDef = {
        val pkgNameDef = q"val ${TermName(k.GeneratedSymbol.packageName)} = getClass.getName"
        val uriDef = q"val ${TermName(k.GeneratedSymbol.sourceURI)} = ${k.Location.getURI(topLevel)}"
        val scopeDef = q"val ${TermName(k.GeneratedSymbol.currentScope)} = new ValDefScope(${Ident(k.GeneratedSymbol.packageName)}, parentScope, None, Nil)"
        val closeablesDef = q"val __closeables = new Closeables"
        val classBody = pkgNameDef +: uriDef +: scopeDef +: closeablesDef +: genKronus(topLevel.getKronus, Some(resultVal))
        q"""class ${TypeName(cls)}(parentScope: Option[ValDefScope])
                                  (implicit executor: ExecutionContext,
                                            locale: Locale,
                                            referenceCounter: ReferenceCounter,
                                            constellationClient: IConstellationClient)
            extends ConstellationDecoration.HighPriorityFromImplicits {..$classBody}"""
      }
      writer.println(showCode(classDef))
      writer.println()
      writer.println {
        s"""object $app extends App {
           |  import java.net.URL
           |  import scala.concurrent.Await, scala.concurrent.duration.Duration
           |  import ExecutionContext.Implicits.global
           |  implicit val locale = Locale.US
           |  implicit val referenceCounter = new ReferenceCounter
           |  implicit val constellationClient = ConstellationClient(new URL("http://localhost:9090/"))
           |  val main = new $cls(None)
           |  val (result, _) = Await.result(main.$resultVal.future, Duration.Inf)
           |  constellationClient.close()
           |  val exitCode = if (result.isSuccess) 0 else 1
           |  if (!args.contains("--noExitCode")) System.exit(exitCode)
           |}
           |
           |@org.junit.runner.RunWith(classOf[org.specs2.runner.JUnitRunner])
           |class ${cls}Specs extends org.specs2.mutable.Specification {
           |  $app.main(Array("--noExitCode"))
           |  "Result should be successful" >> {
           |    $app.result.recover {case t: Throwable => t.printStackTrace()}
           |    $app.result must beSuccessfulTry
           |  }
           |  "Exit code should be 0" >> {$app.exitCode === 0}
           |}""".stripMargin
      }
    } finally writer.close()
    KronusGenerator.Result(scalaFile, wrappedTL.appFQN)
  }

  def genKronus(kronus: k.Kronus, resultVal: Option[String]): Seq[Tree] = {
    val imports = kronus.getImports.map(i => parseScala("import " + i.getModule))
    val includes = kronus.getIncludes.flatMap(genInclude)
    val defs = sortDefs(kronus.getDefs).flatMap(genAbstractDef)
    imports ++ includes ++ defs :+ genReturn(kronus, resultVal)
  }

  def genInclude(inc: k.IncludeDef): Seq[Tree] = {
    val mod = inc.getModule
    val obj = q"new ${parseType(mod)}(Some(${Ident(k.GeneratedSymbol.currentScope)}))"
    inc.getName match {
      case null =>
        val v = freshTermName(mod + "$")
        Seq(q"val $v = $obj", q"import $v._")
      case alias =>
        Seq(q"val ${TermName(alias)} = $obj")
    }
  }

  def genAbstractDef(x: k.AbstractDef): Option[MemberDef] = CompileException.rethrow(x) {
    x match {
      case x: k.TypeDef if x.getValue != null => Some(genTypeDef(x))
      case _: k.TypeDef                       => None
      case _: k.HashtagDef                    => None
      case x: k.AnnotationDef                 => Some(genAnnotationDef(x))
      case x: k.FunctionDef                   => Some(genFunctionDef(x))
      case x: k.ValDef                        => Some(genValDef(x))
    }
  }

  def genTypeDef(td: k.TypeDef): TypeDef = {
    require(td.getBoundsHi == null && td.getVariance == null)
    val params = td.getTypeParameters.map(genTypeParameter)
    val rhs = {
      val v = td.getValue
      val t = genTypeValue(v)
      v.getExtensions.toList match {
        case Nil => t
        case ts  => CompoundTypeTree(Template(t :: ts.map(genTypeValue), noSelfType, Nil))
      }
    }
    q"type ${TypeName(td.getName)}[..$params] = $rhs"
  }

  def genTypeParameter(tp: k.TypeDef): TypeDef = {
    require(tp.getValue == null && tp.getTypeParameters.isEmpty)
    val mods = Modifiers {
      tp.getVariance match {
        case null => PARAM
        case "+"  => PARAM | COVARIANT
        case "-"  => PARAM | CONTRAVARIANT
      }
    }
    val hi = tp.getBoundsHi match {
      case null => EmptyTree
      case ti   => genTypeInstance(ti)
    }
    q"$mods type ${TypeName(tp.getName)} = ${TypeBoundsTree(EmptyTree, hi)}"
  }

  def genTypeValue(tv: k.TypeValue): Tree = {
    val args = tv.getParms
    val name = tv.getType match {
      case n: k.TypeName =>
        parseType(n.getName)
      case r: k.TypeRef =>
        val td = r.getTypeRef
        val name = td.getName
        val parmsSize = td.getTypeParameters.size
        assert(args.size == parmsSize, s"Type value $name has ${args.size} argument(s) but need $parmsSize parameter(s)")
        Ident(TypeName(name))
    }
    tq"$name[..${args.map(genTypeValue)}]"
  }

  def genTypeInstance(ti: k.TypeInstance): Tree = {
    val td = ti.getName
    val name = td.getName
    val args = ti.getTypeParameters
    val parmsSize = td.getTypeParameters.size
    assert(args.size == parmsSize, s"Type instance $name has ${args.size} argument(s) but need $parmsSize parameter(s)")
    tq"${Ident(TypeName(name))}[..${args.map(genTypeInstance)}]"
  }

  def genFunctionDef(fd: k.FunctionDef): DefDef = {
    val tparams = fd.getTypeParameters.map(genTypeParameter)
    val vparamss = {
      val pds = fd.getParameterDefs.map(genParameterDef)
      val attrsParam = fd.hashtags.collectFirst {
        case k.Attributes(name) => q"${Modifiers(PARAM)} val ${TermName(name)}: Seq[(String, Any)] = Nil" // TODO
      }
      val scope = q"${Modifiers(PARAM)} val ${TermName(k.GeneratedSymbol.callerScope)}: Some[Scope]"
      val closeables = q"${Modifiers(PARAM)} val __closeables: Closeables"
      val implicits = fd.hashtags.collect {
        case k.Implicit(t) =>
          ValDef(Modifiers(PARAM | IMPLICIT), freshTermName("implicitParam$"), parseType(t), EmptyTree)
      }
      Seq(Seq(scope, closeables), pds ++ attrsParam) ++ Option(implicits).filter(_.nonEmpty)
    }
    val retType = tq"Context[${genTypeInstance(fd.getReturnType)}]"
    val rhs = genCodeBlock(fd.getValue.asInstanceOf[k.CodeBlock])
    q"def ${TermName(fd.getName)}[..$tparams](...$vparamss): $retType = $rhs"
  }

  def genParameterDef(pd: k.ParameterDef): ValDef = {
    var typ = tq"Context[${genTypeInstance(pd.getType)}]"
    var flags = PARAM
    if (pd.isList) typ = tq"Context[Seq[$typ]]"
    if (pd.isByName) {
      typ = tq"_root_.scala.${TypeName("<byname>")}[$typ]"
      flags = flags | BYNAMEPARAM
    }
    val default = pd.getDefaultValue match {
      case null =>
        EmptyTree
      case x =>
        flags = flags | DEFAULTPARAM
        genExpression(x)
    }
    ValDef(Modifiers(flags), TermName(pd.getName), typ, default)
  }

  def genCodeBlock(cb: k.CodeBlock): Tree = cb match {
    case scb: k.ScalaCodeBlock =>
      val code = parseScala(scb.getCodeStr)
      assert(!code.exists(_.isInstanceOf[Return]), "Explicit `return` is not allowed in Scala code block")
      val fd = Option(cb.eContainer).collect {case fd: k.FunctionDef => fd}
      val params = fd.map(_.getParameterDefs.toSeq).getOrElse(Nil)
      val body = scb.getType match {
        case "for" =>
          code
        case "yield" => if (params.isEmpty) q"Context.execute($code)" else {
          val unlifts = params.map(pd => fq"${TermName(pd.getName)} <- ${Ident(pd.getName)}")
          q"for (..$unlifts) yield $code"
        }
      }
      fd.flatMap {
        _.hashtags.collectFirst {
          case k.Closeable(deps) => deps.map { d =>
            Ident(d.ensuring(params.exists(_.getName == d), s"Cannot find Closeable dependency parameter $d"))
          }
        }
      }.fold(body)(deps => q"__closeables.addNew(Seq(..$deps), $body)")
    case cb: k.KronusCodeBlock =>
      q"__closeables.addRef(kronusCodeBlock {__closeables => ..${genKronus(cb.getCode, None)}})"
  }

  def genReturn(kronus: k.Kronus, resultVal: Option[String]): Tree = {
    val rhs = kronus.getReturn match {
      case null =>
        val vds = kronus.getDefs.collect {case vd: k.ValDef => Ident(vd.getName)}
        q"passIfAllPass(Seq(..$vds))"
      case ret =>
        genExpression(ret)
    }
    resultVal.fold(rhs)(v => q"val ${TermName(v)} = ${withScope(Ident(k.GeneratedSymbol.currentScope), rhs)}")
  }

  def parentScope(x: EObject): Tree = {
    import k.EObjectOps
    def owner(x: EObject): Option[EObject] = x.eContainers.collectFirst {
      case x@(_: k.ValDef | _: k.FunctionCall | _: k.ParameterDef | _: k.FunctionDef | _: k.ParameterValue) => x
    }.flatMap {
      case x: k.ParameterDef => owner(x.eContainer.asInstanceOf[k.FunctionDef])
      case x: EObject        => Some(x)
    }
    owner(x) match {
      case Some(_: k.ValDef | _: k.FunctionCall | _: k.ParameterValue) | None =>
        q"Some(${Ident(k.GeneratedSymbol.currentScope)})"
      case Some(_: k.FunctionDef) =>
        Ident(k.GeneratedSymbol.callerScope)
      case Some(x) =>
        sys.error(s"Unreachable code: $x")
    }
  }

  def withScope(scope: Tree, body: Tree): Tree = {
    val currentScopeParam = q"${Modifiers(PARAM)} val ${TermName(k.GeneratedSymbol.currentScope)} = ${EmptyTree}"
    q"Context.withScope($scope)($currentScopeParam => $body)"
  }

  def genValDef(vd: k.ValDef): ValDef = {
    val n = vd.getName
    val annos = vd.getAnnotations.map(genAnnotationCall)
    val scope = q"new ValDefScope($n, ${parentScope(vd)}, ${k.Location.fromEObject(vd)}, Seq(..$annos))"
    q"val ${TermName(n)} = ${withScope(scope, genExpression(vd.getValue))}"
  }

  def genExpression(e: k.Expression): Tree = e match {
    case e: k.IntegerLiteral  => q"Context.successful(${e.getValue})"
    case e: k.DoubleLiteral   => q"Context.successful(${e.getValue})"
    case e: k.StringLiteral   => q"Context.successful(${e.getValue})"
    case e: k.BooleanLiteral  => q"Context.successful(${e.isValue})"
    case e: k.ValRef          => genValRef(e)
    case e: k.FunctionCall    => genFunctionCall(e)
    case e: k.IncludeRef      => genExpression(e.getRef)
    case e: k.Sequence        => q"Context.successful(Seq(..${e.getValues.map(genExpression)}))"
    case e: k.UnaryOperation  => q"${genExpression(e.getExpr)}.map(_.${TermName("unary_" + e.getOp)})"
    case e: k.BinaryOperation => genBinaryOperation(e)
    case e: k.CodeBlock       => genCodeBlock(e)
  }

  def genBinaryOperation(bop: k.BinaryOperation): Tree = {
    val Seq(l, r) = Seq("l$", "r$").map(freshTermName)
    q"for ($l <- ${genExpression(bop.getLeft)}; $r <- ${genExpression(bop.getRight)}) yield $l ${TermName(bop.getOp)} $r"
  }

  def genParameterValues(args: Seq[k.ParameterValue], params: Seq[k.ParameterDef]): Seq[Tree] = {
    var keywordStarts = false
    for ((arg, param) <- args.zip(params).seq) yield {
      def wrap(name: String, value: Tree) =
        if (arg.eContainer.isInstanceOf[k.FunctionCall])
          withScope(q"new ParameterValueScope($name, ${parentScope(arg)})", value)
        else
          value
      arg match {
        case p: k.PositionParameterValue =>
          if (keywordStarts) sys.error(s"Positional parameter cannot be after keyword parameter")
          wrap(param.getName, genExpression(p.getValue))
        case p: k.KeywordParameterValue =>
          keywordStarts = true
          AssignOrNamedArg(Ident(p.getName), wrap(p.getName, genExpression(p.getValue)))
      }
    }
  }

  def genFunctionCall(fc: k.FunctionCall): Tree = {
    val qn = qualifiedName(fc.getMethod.getName, fc)
    val parent = parentScope(fc)
    val scope = q"new FunctionCallScope(${qn.toString}, $parent, ${k.Location.fromEObject(fc)})"
    val args = genParameterValues(fc.getParameterValues, fc.getMethod.getParameterDefs)
    withScope(scope, q"$qn(...${Seq(Seq(parent, Ident("__closeables")), args)})")
  }

  def genAnnotationCall(ac: k.AnnotationCall): Tree = {
    val name = qualifiedName(ac.getMethod.getName, ac)
    val args = genParameterValues(ac.getParameterValues, ac.getMethod.getParameterDefs)
    q"$name(..$args)"
  }

  def genValRef(vr: k.ValRef): Tree = {
    def qualified(name: String) = qualifiedName(name, vr)
    vr.getRef match {
      case r: k.ParameterDef => qualified(r.getName)
      case r: k.ValDef       => qualified(r.getName)
      case r: k.FunctionDef  => q"Context.successful(${qualified(r.getName)}(${parentScope(r)}, __closeables) _)"
    }
  }

  def qualifiedName(name: String, eObj: EObject): RefTree = eObj.eContainer match {
    case inc: k.IncludeRef => q"${Ident(inc.getInclude.getName)}.${TermName(name)}"
    case _                 => Ident(name)
  }

  def genAnnotationDef(ad: k.AnnotationDef): ClassDef = {
    val typ = TypeName(ad.getName)
    val params = ad.getParameterDefs.map(genParameterDef)
    val jsonFmt = TermName("jsonFormat" + params.size)
    q"""case class $typ(..$params) extends com.ms.qaTools.saturn.kronus.runtime.DynamicAnnotation {
          def decorationValue = $jsonFmt(${Ident(typ)}.apply).write(this)
        }"""
  }

  def parseScala(code: String): Tree = global synchronized {
    reporter.reset()
    val wrappedCode = "object wrapper {" + EOL + code + EOL + "}"
    val wrappedTree = newUnitParser(wrappedCode, "<kronus-tree-gen>").parse()
    if (reporter.hasErrors) throw new ScalaParseException(code)
    val PackageDef(_, List(ModuleDef(_, _, Template(_, _, _ :: parsed)))) = wrappedTree
    parsed match {
      case expr :: Nil   => expr
      case stats :+ expr => Block(stats, expr)
    }
  }

  def parseType(name: String): Tree = {
    val q"type $_ = $typ" = parseScala(s"type __T = $name")
    typ
  }
}
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
