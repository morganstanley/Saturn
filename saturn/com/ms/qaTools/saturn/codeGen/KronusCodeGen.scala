package com.ms.qaTools.saturn.codeGen

import scala.collection.mutable.LinkedHashMap
import scala.util.Try

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.codeGen.scala._
import com.ms.qaTools.saturn.AbstractRunGroup
import com.ms.qaTools.saturn.KronusStep
import com.ms.qaTools.saturn.codeGen.ResourceGenerator.ResourceMetaData
import com.ms.qaTools.saturn.kronus._
import com.ms.qaTools.saturn.kronus.backport.KronusCallConfiguration
import com.ms.qaTools.saturn.modules.procedureCallModule.{AbstractArgument, AttributeArgument, ResourceArgument}
import com.ms.qaTools.saturn.types.KronusResource

trait KronusCodeGen {
  def genResource(resource: KronusResource): Try[TryGen]
  def genResourceMeta(resource: KronusResource)(implicit codeGenUtil: SaturnCodeGenUtil): ResourceMetaData
  def genStep(step: KronusStep): Try[FutureGen]
  def genTypeInstance(ti: TypeInstance, fd: FunctionDef, owner: EObject): ParameterTypeInferencer.TypeTree
  def genArgumentType(call: KronusCallConfiguration, arg: ResourceArgument): ParameterTypeInferencer.TypeTree
}

object KronusCodeGen {
  def apply(kronus: Backport): KronusCodeGen = new KronusCodeGenImpl(kronus)
}

class KronusCodeGenImpl(kronus: Backport) extends KronusCodeGen {
  import com.ms.qaTools._
  import scala.collection.JavaConversions._

  def genResource(resource: KronusResource) = {
    val c = resource.getKronusCallConfiguration
    genFun(resource, kronus.resourceDefs(c.getDef), c.getArguments, false)
  }.rethrow(s"Error while generating Kronus Resource ${resource.getName}")

  def genStep(step: KronusStep) = {
    val c = step.getKronusCallConfiguration
    genFun(step, kronus.stepDefs(c.getDef), c.getArguments, true) map { tg =>
      FutureExpr {
        tg.withMap(ScalaExpr(s"""{ r =>
                                |  val kr = KronusResult(r, Nil)
                                |  IterationResult(kr.status, context, iterationMetaData, kr)
                                |}""".stripMargin)).withRethrow(s"Error while evaluating Kronus Step ${step.getName}")
      }
    }
  }.rethrow(s"Error while generating Kronus Step ${step.getName}")

  def genFun(caller: EObject, fd: FunctionDef, args: Seq[AbstractArgument], asResult: Boolean) = {
    val argsByName = args.groupBy(_.getName)
    fd.getParameterDefs.map { p =>
      val name = p.getName
      val pVal = argsByName.getOrElse(name, Nil) match {
        case args if p.isList => args.map(genArg(_, p.getType)).toTrySeq.map { args =>
          SeqTryExpr(args.map(_.withMap(ScalaExpr("com.ms.qaTools.saturn.kronus.runtime.Context.successful")))).toTryGen
        }
        case Seq(arg) =>
          genArg(arg, p.getType)
        case Nil =>
          require(p.getDefaultValue != null, s"no default value for parameter $name")
          Try(genExpression(p.getDefaultValue))
        case args =>
          throw new IllegalArgumentException(s"more than one argument supplied for parameter $name")
      }
      pVal.map(tg => ForAssignment(name, tg.withRethrow(s"An exception occurred while evaluating argument: `$name'.")))
    }.toTrySeq.map { forArgs =>
      val funCall: TryGen = genFunCall(fd, forArgs, asResult)
      genAttributes(caller, fd).fold(funCall) { attrs =>
        TryFnExpr(ConcatGen(Seq(attrs, funCall), "\n", "{", "}"))
      }.withRethrow {
        s"Error while evaluating Kronus def ${fd.getName}"
      }
    }
  }.rethrow(s"Error while generating Kronus def ${fd.getName}")

  def genFunCall(fd: FunctionDef, args: Seq[ForAssignment], coalesceToResult: Boolean) = {
    val packageName = fd.eContainers.collectFirst {
      case topLevel: TopLevelKronus => topLevel.getPackage.getModule
    }.getOrElse(throw new Error(s"fail to get package of $fd"))
    val kronusArgs = {
      fd.getParameterDefs.map { pd =>
        val name = pd.getName
        s"$name = com.ms.qaTools.saturn.kronus.runtime.Context.successful($name)"
      } ++ fd.hashtags.collectFirst { case Attributes(v) => s"$v = $v"}
    }.mkString("(", ",", ")")
    def resultExpr(r: String) =
      if (coalesceToResult) s"$r match { case r: Result => r; case _ => Result(Passed)}" else r
    val body = ScalaExpr {
      s"""import com.ms.qaTools.saturn.kronus.runtime.Closeables
         |import com.ms.qaTools.toolkit.{Result, Passed, Failed}
         |val kronus = sc.kronusModules.get(new $packageName(Some(context.root))(sc.toKronusRunParameters))
         |val result = kronus.${fd.getName}(Some(context), new Closeables)$kronusArgs
         |${resultExpr("Await.result(result.future, Duration.Inf)._1. get")}""".stripMargin
    }
    ForTryExpr(args, body)
  }

  protected def genArg(arg: AbstractArgument, typ: TypeInstance): Try[TryGen] = arg match {
    case a: AttributeArgument =>
      val str = ComplexValueStringGenerator(a.getValue).map(AttributeTry(_, a.getName))
      typ.getName.getName match {
        case t@("Int" | "Double" | "Boolean") => str.map(_.withMap(ScalaExpr("_.to" + t)))
        case _                                => str
      }
    case r: ResourceArgument =>
      ResourceGenerator(r.getResource)(appendOptions = ContextAppendOptions(true, Function.const(r.getName.capitalize)))
  }

  def genExpression(expr: Expression): TryGen = try expr match {
    case s: StringLiteral  => TryExpr(StringExpr(s.getValue), guaranteedSuccess = true)
    case n: IntegerLiteral => TryExpr(ScalaExpr(n.getValue.toString), guaranteedSuccess = true)
    case x: DoubleLiteral  => TryExpr(ScalaExpr(x.getValue.toString), guaranteedSuccess = true)
    case p: BooleanLiteral => TryExpr(ScalaExpr(p.isValue.toString), guaranteedSuccess = true)
    case fc: FunctionCall  =>
      val fd = fc.getMethod
      val params = {
        val m = LinkedHashMap[String, ParameterDef]()
        fd.getParameterDefs.seq.foreach(p => m += p.getName -> p)
        m
      }
      var keywordStarts = false
      val argsAssign = fc.getParameterValues.seq.map {
        case a: PositionParameterValue =>
          if (keywordStarts) sys.error(s"Positional parameter cannot be after keyword parameter")
          val (pn, _) = params.head
          params -= pn
          ForAssignment(pn, genExpression(a.getValue))
        case a: KeywordParameterValue =>
          keywordStarts = true
          val an = a.getName
          if (params.remove(an).isEmpty) sys.error(s"No parameter $an found in ${fd.getName}")
          ForAssignment(an, genExpression(a.getValue))
      }
      val defaultArgsAssign = for ((pn, p) <- params) yield {
        require(p.getDefaultValue != null,
                s"Mandatory parameter $pn in Kronus function ${fd.getName} is missing")
        ForAssignment(pn, genExpression(p.getDefaultValue))
      }
      genFunCall(fd, argsAssign ++ defaultArgsAssign, false)
  } catch {
    case e: Exception => throw new Exception(s"Exception while generating $expr", e)
  }

  def genAttributes(obj: EObject, fd: FunctionDef) =
    fd.eContainer.asInstanceOf[AnnotatedDef].getHashtags.find {
      _.getMethod == kronus.hashtags("Attributes")
    }.map { attrsCall =>
      val Seq(varName) = attrsCall.getParameterValues.map(_.ensuring(_.getName == "varName").getValue)
      val attrs = Iterator.iterate(obj)(_.eContainer).takeWhile(_ != null).collect {
        case x: AbstractRunGroup => x
      }.flatMap(_.getAttributes).map(_.getName).toSet
      val attrsSeq = attrs.map(x => s""""$x" -> $x""").mkString("Seq[(String, String)](", ", ", ")")
      ScalaExpr(s"val $varName = $attrsSeq")
    }

  def genArgMeta(arg: AbstractArgument) = {
    val name = arg.getName
    arg match {
      case _: AttributeArgument => Some(s"""s"${name.capitalize}: $$$name"""")
      case r: ResourceArgument  => None
    }
  }

  def genParmMeta(parm: ParameterDef) = {
    val name = parm.getName
    s"""s"${name.capitalize}: $$$name""""
  }

  def genResourceMeta(resource: KronusResource)(implicit codeGenUtil: SaturnCodeGenUtil) = {
    import ParameterTypeInferencer._
    val call = resource.getKronusCallConfiguration
    val rdef = kronus.resourceDefs(call.getDef)
    val retTyp = genTypeInstance(rdef.getReturnType, rdef, resource)
    val tparams = for {
      tparam <- retTyp.collect {case tp: TypeParameter => tp}
      p <- rdef.getParameterDefs
      pt = genTypeInstance(p.getType, rdef, resource) if pt.exists(_ == tparam)
      arg = call.getArguments.find(_.getName == p.getName).getOrElse {
        throw new IllegalArgumentException(s"No argument for parameter ${p.getName} in Kronus def ${call.getDef}")
      }
      at = getArgumentType(arg)
    } yield tparam -> pt.reifyTypeParam(tparam.name, at)
    ResourceMetaData.fromTypeTree(retTyp.mapTypeParams(tparams.toMap))
  }

  def genArgumentType(call: KronusCallConfiguration, arg: ResourceArgument) = {
    val funDef = kronus.stepDefs(call.getDef)
    val typIns = funDef.getParameterDefs.find(_.getName == arg.getName).getOrElse {
      throw new IllegalArgumentException(s"No argument ${arg.getName} in Kronus def ${call.getDef}")
    }.getType
    genTypeInstance(typIns, funDef, call.eContainer)
  }

  def genTypeInstance(ti: TypeInstance, fd: FunctionDef, owner: EObject) = new TypeInstanceGenerator(fd, owner).gen(ti)

  class TypeInstanceGenerator(fd: FunctionDef, owner: EObject) {
    import ParameterTypeInferencer._

    val tparams = fd.getTypeParameters.toSet

    def genTypeValue(tv: TypeValue, tparamsMapping: Map[TypeDef, TypeTree]): TypeTree = {
      val targs = tv.getParms.map(genTypeValue(_, tparamsMapping))
      tv.getType match {
        case tn: TypeName => AppliedType(tn.getName, targs)
        case tr: TypeRef  => tparamsMapping.getOrElse(tr.getTypeRef, genTypeDef(tr.getTypeRef, targs))
      }
    }

    def genTypeDef(td: TypeDef, targs: Seq[TypeTree]): TypeTree = {
      require(td.getTypeParameters.size == targs.length,
              s"Type ${td.getName} requires ${td.getTypeParameters.size} type parameters but ${targs.length} supplied")
      if (tparams(td)) TypeParameter(td.getName, TypeParameterOwner(owner))
      else if (td.getValue == null) AppliedType(td.getName, targs)
      else genTypeValue(td.getValue, (td.getTypeParameters, targs).zipped.toMap)
    }

    def gen(ti: TypeInstance): TypeTree = genTypeDef(ti.getName, ti.getTypeParameters.map(gen))
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
