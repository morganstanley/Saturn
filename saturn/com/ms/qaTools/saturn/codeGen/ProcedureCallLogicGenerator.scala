package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.ConcatGen
import com.ms.qaTools.codeGen.scala.ForAssignment
import com.ms.qaTools.codeGen.scala.ForTryExpr
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.{ProcedureCallStep => MProcedureCallStep}
import com.ms.qaTools.saturn.modules.procedureCallModule.AbstractArgument
import com.ms.qaTools.saturn.modules.procedureCallModule.AttributeArgument
import com.ms.qaTools.saturn.modules.procedureCallModule.ResourceArgument
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper

object ProcedureArgumentGenerator {
  def apply(parameter:AbstractArgument)(implicit codeGenUtil:SaturnCodeGenUtil):Try[ForAssignment] = {
    import codeGenUtil.getWrapped
    val procedure = parameter.containingRunGroup.getOrElse(throw new Exception(s"Parameter: $parameter has no containing runGroup."))
    parameter match {
      case a:AttributeArgument => {
        ComplexValueStringGenerator(a.getValue()).map{valueGen => ForAssignment(a.getName(),
                                                                                valueGen.withRethrow(s"An exception occurred while evaluating procedure call '${procedure.getName}' complex value argument:'${a.getName}'."))}
      }
      case r:ResourceArgument  => {
        ResourceGenerator(r.getResource()).map{valueGen => ForAssignment(r.getName(),
                                                                         valueGen.withRethrow(s"An exception occurred while evaluating procedure call '${procedure.getName}' resource argument:'${r.getName}'."))}
      }
    }
  }
}

object ProcedureCallLogicGenerator {
  def apply(procedureCall:MProcedureCallStep)(implicit codeGenUtil:SaturnCodeGenUtil):Try[FutureGen] = for {
    procedureCallConfiguration <- Try{procedureCall.getProcedureCallConfiguration()}
    procNameGen                <- ComplexValueCodeGenerator.genPure(procedureCallConfiguration.getRunGroup()).rethrow("An exception occurred while generating referent name, referent name must be only text.")
    argumentsAssignmentGen     <- procedureCallConfiguration.getArguments().map{argument => ProcedureArgumentGenerator(argument)}.toTrySeq
    argumentsGen               <- Try{ConcatGen(procedureCallConfiguration.getArguments().map{argument => ScalaExpr(s"${argument.getName()} = ${argument.getName()}")}, ", ")}
    metaDataGen                <- Try{ConcatGen(procedureCallConfiguration.getArguments().map{argument => ScalaExpr(s"""argsMetaContext.appendMetaDataContext("${argument.getName}", ${argument.getName})""")}, "\n")}
    procCallGen                <- Try {
      new ScalaGen() {
        def generate: Try[String] = for {
          procNameStr  <- procNameGen.generate()
          argumentsStr <- argumentsGen.generate()
          metaDataStr  <- metaDataGen.generate()
        } yield s"""context.appendMetaDataContext("ProcName", "$procNameStr")
                    val argsMetaContext = context.appendMetaDataContext("Arguments", "ProcedureCall Arguments")
                    $metaDataStr
                    $procNameStr($argumentsStr).map{ result =>
                      val procCallResult = ProcedureCallResult("$procNameStr", result)
                      IterationResult(procCallResult.status, context, iterationMetaData, procCallResult, ${codeGenUtil.getDefaultIterationNo(procedureCall)})
                    }"""

      }
    }
    procCallForGen             <- Try { if(argumentsAssignmentGen.isEmpty) TryExpr(procCallGen) else ForTryExpr(argumentsAssignmentGen, procCallGen) }
  } yield new FutureGen() {
    def generate:Try[String] = for {
      procCallForStr      <- procCallForGen.generate()
    } yield  s""" {
    val procFuture = $procCallForStr
    val procRes = tf2ft(procFuture)//.map{result => IterationResult(Passed(), context, iterationMetaData, result.asInstanceOf[Try[IteratorResult[Result]]], ${codeGenUtil.getDefaultIterationNo(procedureCall)}) }
    procRes
  }"""
  }
}