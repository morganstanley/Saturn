package com.ms.qaTools.saturn.kronus.codeGen

import java.io.PrintWriter
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path

import scala.collection.JavaConverters._
import scala.collection.mutable.Buffer
import scala.compat.Platform.EOL
import scala.tools.nsc.Global
import scala.tools.nsc.Settings
import scala.tools.nsc.ast.TreeDSL
import scala.tools.nsc.reporters.StoreReporter

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference

import com.ms.qaTools.CompilerClassLoader
import com.ms.qaTools.ScalaParseException
import com.ms.qaTools.saturn.{kronus => k}
import com.ms.qaTools.saturn.kronus.codeGen.Implicits._
import com.ms.qaTools.saturn.resource.DependencyTrackingEObjectDescription

import org.eclipse.emf.ecore.util.EcoreUtil

object KronusTreeGenerator {
  def compiler = {
    val settings = new Settings
    settings.usejavacp.value = true
    settings.embeddedDefaults(new CompilerClassLoader)
    val compiler = Global(settings, new StoreReporter)
    ; { // Need to put compiler in parser phase in order to use quasiquotes
      val run = new compiler.Run
      compiler.phase = run.parserPhase
      run.cancel()
    }
    compiler
  }

  def apply(): KronusTreeGenerator = new KronusTreeGenerator(compiler)

  object ValRefExtractor {
    def unapply(vr: k.ValRef): Option[k.ReferenceableDefs] = Option(vr.getRef)
  }

  def sortDefs(defs: Seq[k.AbstractDef]): Seq[k.AbstractDef] = {
    val defSet = defs.toSet
    val deps = defs.map { n =>
      n -> n.eAllContents.asScala.collect {
             case ValRefExtractor(vd: k.ValDef)      if defSet(vd)           => vd
             case ValRefExtractor(fd: k.FunctionDef) if defSet(fd)           => fd
             case fc: k.FunctionCall                 if defSet(fc.getMethod) => fc.getMethod
             case GraphRef(graph,_)                                          => graph
           }.toSet[k.AbstractDef]
    }
    k.topSort(deps) match {
      case (Seq(), xs) =>
        xs
      case (cycle, _) =>
        val msg = {
          Seq("Cyclic dependencies in Kronus file:") ++ cycle.map {
            case (n, ms) => s"${n.name.getOrElse("<unnamed>")} -> ${ms.map(_.name.getOrElse("<unnamed>"))}"
          }
        }.mkString("\n")
        throw new IllegalArgumentException(msg)
    }
  }
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

  def genKronus(kronus: k.Kronus, resultVal: Option[String]): Seq[Tree] = {
    mutator.materializeGraph(kronus)
    val imports  = Buffer.empty[Tree]
    val includes = Buffer.empty[Tree]
    val typeDefs = Buffer.empty[Tree]
    val others   = Buffer.empty[k.AbstractDef]
    kronus.getDefs.asScala.foreach {
      _.getDef match {
        case x: k.ImportDef  => imports += parseScala("import " + x.getModule)
        case x: k.IncludeDef => includes += genInclude(x)
        case x: k.TypeDef    => if (x.getValue != null) typeDefs += genTypeDef(x)
        case _: k.HashtagDef =>
        case _: k.Assignment =>
        case x               => others += x
      }
    }
    val defs = sortDefs(others).map(genAbstractDef)
    val builder = Buffer.newBuilder[Tree]
    builder.sizeHint(imports.length + includes.length + typeDefs.length + others.length + 1)
    builder ++= imports ++= includes ++= typeDefs ++= defs += genReturn(kronus, resultVal)
    builder.result()
  }

  def includedModule(inc: k.IncludeDef): TermName =
    TermName(Option(inc.getName).getOrElse(inc.getModule.getPackage.getModule))

  def genInclude(inc: k.IncludeDef): ValDef = {
    val name = includedModule(inc)
    val value = q"new ${parseType(inc.getModule.getPackage.getModule)}(Some(${Ident(k.GeneratedSymbol.currentScope)}))"
    val singleton = inc.parent[k.Kronus].fold(false)(_.eContainer.isInstanceOf[k.TopLevelKronus])
    val rhs = if (singleton) q"implicitly[KronusRunParameters].injector.get($value)" else value
    q"val $name = $rhs"
  }

  def qualifier(context: EObject, ref: EReference): Option[RefTree] = context.eAdapters.asScala.collectFirst {
    case x: DependencyTrackingEObjectDescription.Adapter =>
      val hd +: tl = x.dependencies(ref).reverseMap(includedModule)
      tl.foldLeft(Ident(hd): RefTree)(Select.apply)
  }

  def qualifiedTermName(context: EObject, ref: EReference): RefTree = {
    val name = TermName(context.eGet(ref).asInstanceOf[k.NamedRuntimeDef].getName)
    qualifier(context, ref) match {
      case Some(q) => Select(q, name)
      case None    => Ident(name)
    }
  }

  // Implicit parameters here are unique per run
  def genClassSignature(cls: String, classBody: Seq[Tree]) =
    q"""class ${TypeName(cls)}(parentScope: Option[Scope])(implicit __runParams: KronusRunParameters)
        extends ConstellationDecoration.HighPriorityFromImplicits {
          implicit def __executor = implicitly[KronusRunParameters].executor
          implicit def __locale = implicitly[KronusRunParameters].locale
          implicit def __referenceCounter = implicitly[KronusRunParameters].referenceCounter
          implicit def __constellationClient = implicitly[KronusRunParameters].constellationClient
          implicit def __materializer = implicitly[KronusRunParameters].materializer
          ..$classBody
        }"""

  // Class members here are unique per script.
  def genClassDef(topLevel: k.TopLevelKronus, cls: String, resultVal: String) = {
    val pkgNameDef          = q"val ${TermName(k.GeneratedSymbol.packageName)} = getClass.getName"
    val uriDef              = q"val ${TermName(k.GeneratedSymbol.sourceURI)} = ${k.Location.getURI(topLevel)}"
    val scopeDef            = q"val ${TermName(k.GeneratedSymbol.currentScope)} = new ValDefScope(${Ident(k.GeneratedSymbol.packageName)}, parentScope, None, Nil)"
    val closeablesDef       = q"val __closeables = new Closeables"
    val classBody:Seq[Tree] = pkgNameDef +: uriDef +: scopeDef +: closeablesDef +: genKronus(topLevel.getKronus, Some(resultVal))
    genClassSignature(cls, classBody)
  }

  def generateFile(topLevel: k.TopLevelKronus, outputDir: Path) = {
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
          "import com.ms.qaTools.saturn.kronus.runtime._",
          "import akka.stream.scaladsl.RunnableGraph",
          "import akka.stream.scaladsl.GraphDSL").foreach(writer.println)
      writer.println()
      writer.println(showCode(genClassDef(topLevel,cls,resultVal)))
      writer.println()
      writer.println {
        s"""object $app extends App {
           |  def inner_main(args: Array[String]) = {
           |    val cmdLine = new KronusCmdLine(args)
           |    if (cmdLine.options.help) {
           |      println(KronusCmdLine.HelpMessage)
           |      scala.util.Success(())
           |    } else {
           |      val constellationClient = new NopConstellationClient
           |      val system = akka.actor.ActorSystem("QATools-Kronus")
           |      try {
           |        implicit val runParams = KronusRunParameters(ExecutionContext.global, Locale.US, new ReferenceCounter,
           |                                                     constellationClient, cmdLine,
           |                                                     akka.stream.ActorMaterializer()(system),
           |                                                     new KronusModuleInjector, ConstellationLogNotifier() :: Nil)
           |        concurrent.Await.result((new $cls(None)).$resultVal.future, concurrent.duration.Duration.Inf)._1
           |      } finally {
           |        system.terminate()
           |        constellationClient.close()
           |      }
           |    }
           |  }
           |  sys.exit(if(inner_main(args).isSuccess) 0 else 2) // App is meant to exit, JUnit should call inner_main
           |}
           |
           |@org.junit.runner.RunWith(classOf[org.specs2.runner.JUnitRunner])
           |class ${cls}Specs extends org.specs2.mutable.Specification {
           |  "Result should be successful" >> {
           |    val result = $app.inner_main(Array())
           |    result.recover {case t: Throwable => t.printStackTrace()}
           |    result must beSuccessfulTry
           |  }
           |}""".stripMargin
      }
    } finally writer.close()
    KronusGenerator.Result(scalaFile, wrappedTL.appFQN)
  }

  def genAbstractDef(x: k.AbstractDef): MemberDef = CompileException.rethrow(x) {
    x match {
      case a: k.AnnotationDef => genAnnotationDef(a)
      case f: k.FunctionDef   => genFunctionDef(f)
      case v: k.ValDef        => genValDef(v)
      case g: GraphDef        => genGraphDef(g)
      case o                  => throw new IllegalArgumentException("" + o)
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
    val tn = TypeName(name)
    val qn = for {
      _ <- Option(td.getValue)
      q <- qualifier(ti, k.KronusPackage.eINSTANCE.getTypeInstance_Name)
    } yield Select(q, tn)
    tq"${qn.getOrElse(Ident(tn))}[..${args.map(genTypeInstance)}]"
  }

  def genFunctionDef(fd: k.FunctionDef): DefDef = {
    val tparams = fd.getTypeParameters.map(genTypeParameter)
    val vparamss = {
      val pds = fd.getNonStreamParameters.map(genParameterDef)
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
        withScope(q"new ParameterValueScope(${pd.getName}, ${parentScope(x)})", genExpression(x))
    }
    ValDef(Modifiers(flags), TermName(pd.getName), typ, default)
  }

  def genCodeBlock(cb: k.CodeBlock): Tree = cb match {
    case scb: k.ScalaCodeBlock =>
      val code = parseScala(scb.getCodeStr)
      assert(!code.exists(_.isInstanceOf[Return]), "Explicit `return` is not allowed in Scala code block")

      val fd = Option(cb.eContainer).collect {case fd: k.FunctionDef => fd}
//      val ad = fd.flatMap{fd => Option(fd.eContainer).collect {case ad: k.AnnotatedDef => ad}}
      val params = cb.getNonStreamParameters
      val body = scb.getType match {
        case "for"   => code
        case "yield" => if (params.isEmpty) q"Context.execute($code)" else {
          val unlifts = params.map(pd => fq"${TermName(pd.getName)} <- ${Ident(pd.getName)}")
          q"for (..$unlifts) yield $code"
        }
        case other => throw new Exception(s""""$other" is not a valid generate parameter.""")
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
        val vds = kronus.collectDefs[k.ValDef].map(vd => Ident(vd.getName)).toIterable
        q"passIfAllPass(Seq(..$vds))"
      case ret =>
        genExpression(ret)
    }
    resultVal.fold(rhs)(v => q"val ${TermName(v)} = ${withScope(Ident(k.GeneratedSymbol.currentScope), rhs)}")
  }

  def parentScope(x: EObject): Tree = {
    import k.EObjectOps
    val owner = x.eContainers.collectFirst {
      case x: k.ParameterDef => x.eContainer
      case x@(_: k.ValDef | _: k.FunctionCall | _: k.FunctionDef | _: k.ParameterValue) => x
    }
    owner match {
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
    val ad = vd.eContainer.asInstanceOf[k.AnnotatedDef]
    val n = vd.getName
    val annos = ad.getAnnotations.map(genAnnotationCall)
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
    case e: k.Sequence        => q"Context.successful(Seq(..${e.getValues.map(genExpression)}))"
    case e: k.UnaryOperation  => q"${genExpression(e.getExpr)}.map(_.${TermName("unary_" + e.getOp)})"
    case e: k.BinaryOperation => genBinaryOperation(e)
    case e: k.CodeBlock       => genCodeBlock(e)
    case GraphRef(g,s)        => parseScala({
      val currentSink = s"g._${g.sinkDefs.indexOf(s) + 1 }"
      val sinkMaterializer =
        if (g.sinkDefs.size <= 1)
          s"Await.result($currentSink.future, scala.concurrent.duration.Duration.Inf)"
        else
          currentSink
      s"${g.name}.map { g => $sinkMaterializer }"
    })
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
    val qn = qualifiedTermName(fc, k.KronusPackage.eINSTANCE.getFunctionCall_Method)
    val parent = parentScope(fc)
    val scope = q"new FunctionCallScope(${qn.toString}, $parent, ${k.Location.fromEObject(fc)})"
    val args = genParameterValues(fc.getParameterValues, fc.getMethod.getNonStreamParameters)
    withScope(scope, q"$qn(...${Seq(Seq(parent, Ident("__closeables")), args)})")
  }

  def genAnnotationCall(ac: k.AnnotationCall): Tree = {
    val name = qualifiedTermName(ac, k.KronusPackage.eINSTANCE.getAnnotationCall_Method)
    val args = genParameterValues(ac.getParameterValues, ac.getMethod.getParameterDefs)
    q"$name(..$args)"
  }

  def genValRef(vr: k.ValRef): Tree = {
    import k.KronusPackage.eINSTANCE.getValRef_Ref
    vr.getRef match {
      case r: k.ParameterDef => Ident(r.getName)
      case r: k.ValDef       => qualifiedTermName(vr, getValRef_Ref)
      case r: k.FunctionDef  => q"Context.successful(${qualifiedTermName(vr, getValRef_Ref)}(${parentScope(r)}, __closeables) _)"
    }
  }

  def genAssignmentByName(srcName: String, accessor: String, letName: String, defined: Seq[String]) =
    s""".$accessor.find {_.toString == "${letName.ensuring({defined.contains(_)}, s"'$letName' is not in the stream node definition $accessor: $defined")}"}.getOrElse(throw new NoSuchElementException(s"$letName was not found in $accessor $${$srcName.outlets.map {_.toString}}"))"""

  def genOutletAssignmentByName(srcName: String, outletName: String, definedOutlets: Seq[String] /* from the stream node definition */, outletTypeName: String) =
    genAssignmentByName(srcName, "outlets", outletName, definedOutlets) + s".asInstanceOf[Outlet[$outletTypeName]]"

  def genInletAssignmentByName(srcName: String, inletName: String, definedInlets: Seq[String] /* from the stream node definition */, inletTypeName: String) =
    genAssignmentByName(srcName, "inlets", inletName, definedInlets) + s".asInstanceOf[Inlet[$inletTypeName]]"

  def genGraphBodyDef(g:GraphDef): Tree = {
    val sinks         = g.sinkDefs.map{s => s.getName + "_SHAPE"}.mkString(",")
    val nonSinks      = g.resolvedNodes.toSeq.filter{ !_.isSinkDef }.map{n => s"""val ${n.getName}_SHAPE = builder.add(${n.getName}.graph)"""}.mkString("\n")
    val grouppedEdges = g.edges.groupBy{e => (e.getRhs, e.getRhsParameter)}
    val flowAssignments = (for {
      ((valDef,parameterName),assignments) <- grouppedEdges
    } yield {
      val srcName = s"""${valDef.getName}_SHAPE"""
      val inletTypeName = assignments.head.getLhs.getStreamNodeDefinition.flatMap {_.getInletType}.map {_.getName}.getOrElse("Any")
      val outletTypeName = valDef.getStreamNodeDefinition.flatMap{_.getOutletType.map{_.getName}}.getOrElse("Any")

      if(assignments.size > 1) {
        val broadcastName = s"""${srcName}_BROADCAST_SHAPE"""
        val broadcastDef  = s"""val $broadcastName = builder.add(Broadcast[$outletTypeName](${assignments.size}))"""
        val srcBroadcast = s"""$srcName ~> $broadcastName"""
        val tgtBroadcast = assignments.toList.map{a => s"""$broadcastName ~> ${a.getLhs.getName}_SHAPE"""}

        broadcastDef :: srcBroadcast :: tgtBroadcast
      }
      else {
        val outlets = valDef.getStreamNodeDefinition.map {_.getOutlets}.getOrElse(Nil)
        val inlets = assignments.head.getLhs.getStreamNodeDefinition.map {_.getInlets}.getOrElse(Nil)
        val inletType = assignments.head.getLhs.getStreamNodeDefinition.flatMap {_.getInletType}.map {_.getName}.getOrElse("Any")
        List(s"""$srcName${Option(assignments.head.getRhsParameter).map {genOutletAssignmentByName(srcName,_,outlets,outletTypeName)}.getOrElse("")} ~> ${assignments.head.getLhs.getName}_SHAPE${Option(assignments.head.getLhsParameter).map {genInletAssignmentByName(assignments.head.getLhs.getName + "_SHAPE",_, inlets,inletTypeName)}.getOrElse("")}""")
      }
    }).flatten.mkString("\n")
    val bodyStr = s"""{
        (builder) => {
          ($sinks) => {
          implicit val IMPLICIT_BUILDER = builder

          import akka.stream.scaladsl.GraphDSL.Implicits._
          import akka.stream.scaladsl.Broadcast
          import akka.stream.scaladsl.GraphDSL
          import akka.stream.scaladsl.RunnableGraph
          import akka.stream.ClosedShape
          import akka.stream.Outlet
          import akka.stream.Inlet
          import akka.stream.FlowShape

          $nonSinks
          $flowAssignments

          ClosedShape
  }}}"""
    parseScala(bodyStr)
  }

  def genGraphDef(g:GraphDef):ValDef = {
    val graphNodes  = g.resolvedNodes.map{n => fq"${TermName(n.getName)} <- ${TermName(n.getName)}"}
    val sinksShapes = g.sinkDefs.map(s => q"${Ident(s.getName)}.graph")
    val sinkTypes   = g.sinkDefs.flatMap{ sd => sd.getMaterializedType }
    val graphDslCreate: Tree =
        if (g.sinkDefs.size <= 1)
          q"GraphDSL.create(..$sinksShapes)(${genGraphBodyDef(g)})"
        else {
          val conversionParameters = sinkTypes.zipWithIndex.map{case (t,i) => q"${Ident(s"ff$i")}:${parseType(s"Future[$t]")}"}
          val conversionUnpack     = sinkTypes.zipWithIndex.map{case (t,i) => fq"${Ident(s"f$i")} <- ${Ident(s"ff$i")}"}
          val conversionTuple      = sinkTypes.zipWithIndex.map{case (t,i) => Ident(s"f$i")}
          val sinkConversionFn     = q"(..$conversionParameters) => for (..$conversionUnpack) yield (..$conversionTuple)"
          q"GraphDSL.create(..$sinksShapes)($sinkConversionFn)(${genGraphBodyDef(g)})"
        }
    val graph = fq"""graph <- Context.fromFuture(RunnableGraph.fromGraph($graphDslCreate).named("graph0").run())"""
    val rhs = q"for(..$graphNodes;$graph) yield {graph}"
    q"""val ${TermName(g.name)} = ${if (g.sinkDefs.size <= 1) q"Tuple1($rhs)" else rhs}"""
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
    if (reporter.hasErrors) throw ScalaParseException.fromReporter(reporter, code)
    val PackageDef(_, List(ModuleDef(_, _, Template(_, _, _ :: parsed)))) = wrappedTree
    parsed match {
      case expr :: Nil   => expr
      case stats :+ expr => Block(stats, expr)
    }
  }

  def parseType(name: String): Tree = {
    val q"type $_ = $t" = parseScala(s"type __T = $name")
    t
  }

  object mutator {
    def materializeGraph(kronus: k.Kronus) = {
      val graphDefs = GraphDefs(kronus.collectDefs[k.Assignment].toSeq)
      graphDefs.foreach { g =>
        g.sinkDefs.foreach { s =>
          val matDef = CreateValDef("__MATERIALIZED_" + s.getName, GraphRef(g, s))
          kronus.getDefs.add(k.KronusFactory.eINSTANCE.newAnnotatedDef(matDef))
          EcoreUtil.UsageCrossReferencer.find(s, kronus).foreach { setting =>
            if (!setting.getEObject.isInstanceOf[k.Assignment]) EcoreUtil.replace(setting, s, matDef)
          }
        }
        kronus.getDefs.add(k.KronusFactory.eINSTANCE.newAnnotatedDef(g))
      }
    }
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
