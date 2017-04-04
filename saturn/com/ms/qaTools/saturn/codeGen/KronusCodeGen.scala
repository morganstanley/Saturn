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
      FutureExpr(tg.withMap(ScalaExpr(s"""{
        case (r, m) =>
          val kr = KronusResult(r, m)
          IterationResult(kr.status, context, iterationMetaData, kr)
      }""")).withRethrow(s"Error while evaluating Kronus Step ${step.getName}"))
    }
  }.rethrow(s"Error while generating Kronus Step ${step.getName}")

  def genFun(caller: EObject, fd: FunctionDef, args: Seq[AbstractArgument], withMeta: Boolean) = {
    val parmArgs = fd.getParameterDefs.map(parm => (parm, args.find(_.getName == parm.getName)))
    val suppliedParmArgs = parmArgs collect {case (parm, Some(arg)) => (parm, arg)}
    val defaultArgs      = parmArgs collect {case (parm, None)      => parm}
    def addMeta(body: ScalaGen) = if (withMeta) {
      val meta = (args.flatMap(genArgMeta) ++ defaultArgs.map(genParmMeta)).mkString("Seq(", ", ", ")")
      Tuple2Expr(body, ScalaExpr(meta))
    } else {
      body
    }
    (suppliedParmArgs.map((genArg _).tupled) ++ defaultArgs.map(genDefaultArg)).toTrySeq map { forArgs =>
      val funCall: TryGen = genFunCall(fd, forArgs, addMeta)
      genAttributes(caller, fd).fold(funCall) { attrs =>
        TryFnExpr(ConcatGen(Seq(attrs, funCall), "\n", "{", "}"))
      }.withRethrow {
        s"Error while evaluating Kronus def ${fd.getName}"
      }
    }
  }.rethrow(s"Error while generating Kronus def ${fd.getName}")

  def genFunCall(fd: FunctionDef, args: Seq[ForAssignment], addMeta: ScalaGen => ScalaGen) = {
    fd.getValue match {
      case code: ScalaCodeBlock =>
        val body = ScalaExpr(code.getCodeStr)
        code.getType match {
          case "for"   => throw new Error("`for' scala code block is not supported")
          case "yield" => ForTryExpr(args, addMeta(body))
        }
    }
  }

  def genArg(parm: ParameterDef, 
             arg: AbstractArgument) = {
    require(parm.getName == arg.getName, s"${parm.getName} != ${arg.getName}")
    val name = arg.getName
    val tryGen = arg match {
      case a: AttributeArgument =>
        val str = ComplexValueStringGenerator(a.getValue)
        if (parm.getType.getName == kronus.typeDefs("Int")) str.map(_.withMap(ScalaExpr("_.toInt")))
        else str
      case r: ResourceArgument  =>
        ResourceGenerator(r.getResource)(appendOptions = ContextAppendOptions(true, Function.const(name.capitalize)))
    }
    tryGen.map(tg => ForAssignment(name, tg.withRethrow(s"An exception occurred while evaluating argument: `$name'.")))
  }

  def genDefaultArg(parm: ParameterDef) = Try {
    require(parm.getDefaultValue != null, "parm.getDefaultValue == null")
    ForAssignment(parm.getName, genExpression(parm.getDefaultValue))
  }

  def genExpression(expr: Expression): TryGen = try expr match {
    case s: StringLiteral  => TryExpr(StringExpr(s.getValue), guaranteedSuccess = true)
    case n: IntegerLiteral => TryExpr(ScalaExpr(n.getValue.toString), guaranteedSuccess = true)
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
      genFunCall(fd, argsAssign ++ defaultArgsAssign, identity)
  } catch {
    case e: Exception => throw new Exception(s"Exception while generating $expr", e)
  }

  def genAttributes(obj: EObject, fd: FunctionDef) =
    fd.getHashtags.find(_.getMethod == kronus.hashtags("Attributes")) map { attrsCall =>
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

  def genTypeInstance(ti: TypeInstance, fd: FunctionDef, owner: EObject): ParameterTypeInferencer.TypeTree = {
    import ParameterTypeInferencer._
    val name = genTypeDefName(ti.getName)
    if (fd.getTypeParameters.map(_.getName).contains(name)) TypeParameter(name, TypeParameterOwner(owner))
    else AppliedType(name, ti.getTypeParameters.map(genTypeInstance(_, fd, owner)))
  }

  def genTypeDefName(td: TypeDef): String = Option(td.getValue).map {
    _.getType match {
      case tn: TypeName => tn.getName
      case tr: TypeRef  => genTypeDefName(tr.getTypeRef)
    }
  }.getOrElse(td.getName)
}
