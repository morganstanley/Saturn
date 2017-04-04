package com.ms.qaTools.saturn.codeGen

import scala.util.Failure
import scala.util.Success
import scala.util.Try

import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.StringExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.{SoapIOStep => MSoapIOStep}
import com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation
import com.ms.qaTools.saturn.modules.soapIOModule.PerlTerminationCondition
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation
import com.ms.qaTools.saturn.values.{ComplexValue => MComplexValue}

object SoapIOLogicGenerator {
  def apply(soap: MSoapIOStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    implicit val appendOptions = ContextAppendOptions(true)
    for {
      cfg <- Try(soap.getSoapIOConfiguration)
      soapIO <- ResourceGenerator(cfg.getSoapIOResource)
      timeout <- timeOut(cfg.getOperation.getTimeOut)
      operation <- operationGenerator(cfg.getOperation, soap, soapIO, timeout)
    } yield operation
  }

  def operationGenerator(operation: AbstractSoapIOOperation,
                         soap: MSoapIOStep,
                         soapGen: TryGen,
                         timeOut: TryGen)(implicit appendOptions: ContextAppendOptions,
                                                   codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = operation match {
    case op: SoapIOPutOperation       => putOperationGenerator(op, soap, soapGen, timeOut)
    case op: SoapIOGetOperation       => getOperationGenerator(op, soap, soapGen, timeOut)
    case op: SoapIOPutAndGetOperation => putAndGetOperationGenerator(op, soap, soapGen, timeOut)
  }

  def putOperationGenerator(operation: SoapIOPutOperation,
                            soap: MSoapIOStep,
                            soapGen: TryGen,
                            timeOut: TryGen)(implicit appendOptions: ContextAppendOptions,
                                                      codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      requestIO <- ResourceGenerator(operation.getInput)
      resourceType <- Try {
        ResourceGenerator.getMetaData(operation.getInput).flatMap(_.inputType).getOrElse(throw new Exception("Could not get type for SoapPut input resource."))
      }
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        soapResourceStr <- soapGen.generate
        timeOutStr <- timeOut.generate
        requestIOStr <- requestIO.generate
      } yield s"""SoapIOPutRunner(context, $soapResourceStr, $requestIOStr, $timeOutStr)"""
    }, soap, s"SoapPut[$resourceType]")

  def getOperationGenerator(operation: SoapIOGetOperation,
                            soap: MSoapIOStep,
                            soapGen: TryGen,
                            timeOut: TryGen)(implicit appendOptions: ContextAppendOptions,
                                                      codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      responseIO <- ResourceGenerator(operation.getOutput)
      resourceType <- Try {
        ResourceGenerator.getMetaData(operation.getOutput).flatMap(_.outputType).getOrElse(throw new Exception("Could not get type for SoapGet output resource."))
      }
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        soapResourceStr <- soapGen.generate
        timeOutStr <- timeOut.generate
        responseIOStr <- responseIO.generate
        termCondStr <- genTerminationCondition(operation)
      } yield s"""SoapIOGetRunner(context, $soapResourceStr, $responseIOStr, $timeOutStr, $termCondStr)"""
    }, soap, s"SoapGet[$resourceType]")

  def putAndGetOperationGenerator(operation: SoapIOPutAndGetOperation,
                                  soap: MSoapIOStep,
                                  soapGen: TryGen,
                                  timeOut: TryGen)(implicit appendOptions: ContextAppendOptions,
                                                            codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      requestIO <- ResourceGenerator(operation.getInput) // FIXME backwards, an object should write to its output and read from its input
      responseIO <- ResourceGenerator(operation.getOutput)
      inputResourceType <- Try {
        ResourceGenerator.getMetaData(operation.getInput).flatMap(_.inputType).getOrElse(throw new Exception("Could not get type for SoapPutAndGet input resource."))
      }
      outputResourceType <- Try {
        ResourceGenerator.getMetaData(operation.getOutput).flatMap(_.outputType).getOrElse(throw new Exception("Could not get type for SoapPutAndGet output resource."))
      }
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        soapResourceStr <- soapGen.generate
        timeOutStr <- timeOut.generate
        requestIOStr <- requestIO.generate
        responseIOStr <- responseIO.generate
      } yield s"""SoapIOPutAndGetRunner(context, $soapResourceStr, $requestIOStr, $responseIOStr, $timeOutStr)"""
    }, soap, s"SoapPutAndGet[$inputResourceType, $outputResourceType]")

  def timeOut(timeout: MComplexValue): Try[TryGen] = Option(timeout) flatMap { cv =>
    ComplexValueStringGenerator(cv) match {
      case Success(TryExpr(StringExpr("", _), _)) => None
      case other                                  => Option(other)
    }
  } getOrElse Try(TryExpr("\"60\""))

  protected def genTerminationCondition(op: SoapIOGetOperation): Try[Option[String]] =
    Option(op.getTerminationCondition) match {
      case Some(cond: PerlTerminationCondition) => for {
        codeTryGen <- ComplexValueCodeGenerator(cond.getPerlCode)
        codeTry <- codeTryGen.generate
      } yield Some(codeTry)
      case Some(unknown) =>
        new Failure(new IllegalArgumentException(s"Unknown SoapIO terminaion condition: $unknown"))
      case None =>
        new Success(None)
    }
}
