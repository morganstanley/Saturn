package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.runtime.ZippedTraversable3.zippedTraversable3ToTraversable
import scala.util.Try
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.codeGen.scala.ForAssignment
import com.ms.qaTools.codeGen.scala.ForTryExpr
import com.ms.qaTools.codeGen.scala.FutureExpr
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.SeqTryExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.{ MQStep => MMQStep }
import com.ms.qaTools.saturn.modules.mqModule.AbstractMQOperation
import com.ms.qaTools.saturn.modules.mqModule.InputMessageType
import com.ms.qaTools.saturn.modules.mqModule.MQClearOperation
import com.ms.qaTools.saturn.modules.mqModule.MQGetOperation
import com.ms.qaTools.saturn.modules.mqModule.MQPutOperation
import com.ms.qaTools.saturn.modules.mqModule.MQReportOperation
import com.ms.qaTools.saturn.modules.mqModule.MQWaitOperation
import com.ms.qaTools.codeGen.scala.ScalaGen

object MQLogicGenerator {

  def apply(mq: MMQStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      cfg <- Try { val c = mq.getMQConfiguration(); if (c == null) throw new NullPointerException((s"Configuration for MQ Step: $mq cannot be null.")) else c }
      mqResource <- ResourceGenerator(cfg.getMQResource())(appendOptions = ContextAppendOptions(true)).rethrow(s"An exception occurred while generating code for mq resource in mq step $mq.")
      operationGen <- genMQOperation(cfg.getOperation()).rethrow(s"An exception occurred while generating code for operations in mq step $mq.")
    } yield
    StepLogicGenerator.modifierGen(ForTryExpr(
        Seq(
          ForAssignment("mqResource", mqResource),
          ForAssignment("iterationResult", new TryGen {
            override def generate(): Try[String] = for {
              operationStr <- operationGen.generate
            } yield s"""{
                      implicit val session = mqResource.session
                      $operationStr
                    }"""
          })),
        ScalaExpr("iterationResult")), mq, cfg.getOperation() match {
        case op: MQPutOperation    => "MQPut"
        case op: MQGetOperation    => "MQGet"
        case op: MQClearOperation  => "MQClear"
        case op: MQReportOperation => "MQReport"
        case op: MQWaitOperation   => if(op.getComparison.isCheckTotal) "MQWaitTotalQueueDepth" else "MQWaitIndividualQueueDepth"
      })

  def genMQOperation(operation: AbstractMQOperation): Try[TryGen] =
    operation match {
      case op: MQPutOperation    => genMQPutOperation(op)
      case op: MQGetOperation    => genMQGetOperation(op)
      case op: MQClearOperation  => genMQClearOperation(op)
      case op: MQReportOperation => genMQReportOperation(op)
      case op: MQWaitOperation   => genMQWaitOperation(op)
    }

  def genMQPutOperation(operation: MQPutOperation): Try[TryGen] =
    for {
      actions <- Try { operation.getActions().filter(_.isEnabled()) }.rethrow("An exception occurred while getting actions.")
      queuesGen <- actions.map(a => ComplexValueStringGenerator(a.getQueue())).toTrySeq.rethrow("An exception occurred while generating code for queues in MQ Step.")
      inputsGen <- actions.zipWithIndex.map {
        case (a, i) =>
          val appendOptions = ContextAppendOptions(true, (s: String) => s"${s}_$i")
          ResourceGenerator(a.getInput, withConnectTry = false)(appendOptions = appendOptions)
      }.toTrySeq.rethrow("An exception occurred while generating code for inputs resources in MQ Step.")
    } yield new TryGen {
      override def generate(): Try[String] = for {
        queuesStr <- queuesGen.map(_.generate).toTrySeq
        inputsStr <- inputsGen.map(_.generate).toTrySeq
      } yield {
        val messageTypes = actions.map(a => a.getInputType() match {
          case InputMessageType.BYTES  => "BytesMessage"
          case InputMessageType.MAP    => "TextMessage"
          case InputMessageType.OBJECT => "TextMessage"
          case InputMessageType.STREAM => "TextMessage"
          case InputMessageType.TEXT   => "TextMessage"
          case invalid                 => throw new Exception(s"Input type '$invalid' is not a valid message type.")
        })
        val putStrs = (queuesStr, inputsStr, messageTypes).zipped.toSeq.zipWithIndex.map {
          case ((queueStr, inputStr, inputType), i) => s"""MQPutRunner.put$inputType(context, mqResource, $queueStr, $inputStr, $i)"""
        }
        s"""MQPutRunner(context, ${putStrs.mkString("Seq(", ",", ")")})"""
      }
    }

  def genMQGetOperation(operation: MQGetOperation): Try[TryGen] =
    for {
      actions <- Try { operation.getActions().filter(_.isEnabled()) }.rethrow("An exception occurred while getting actions.")
      queuesGen <- actions.map(a => ComplexValueStringGenerator(a.getQueue())).toTrySeq.rethrow("An exception occurred while generating code for queues in MQ Step.")
      outputsGen <- actions.zipWithIndex.map {
        case (a, i) =>
          val appendOptions = ContextAppendOptions(true, (s: String) => s"${s}_$i")
          ResourceGenerator(a.getOutput, withConnectTry = false)(appendOptions = appendOptions)
      }.toTrySeq.rethrow("An exception occurred while generating code for output resources in MQ Step.")
    } yield new TryGen {
      override def generate(): Try[String] = for {
        queuesStr <- queuesGen.map(_.generate).toTrySeq
        outputsStr <- outputsGen.map(_.generate).toTrySeq
      } yield {
        val getStrs = queuesStr.zip(outputsStr).zipWithIndex.map {
          case ((queueStr, outputStr), i) => s"""MQGetRunner.get(context, mqResource, $queueStr, $outputStr, $i)"""
        }
        s"""MQGetRunner(context, 
                        ${getStrs.mkString("Seq(", ",", ")")})"""
      }
    }

  def genMQClearOperation(operation: MQClearOperation): Try[TryGen] =
    for {
      queueList <- Try { operation.getQueues().filter(_.isEnabled()) }.rethrow("An exception occurred while generating code for enabled queues in MQ Step.")
      queuesGen <- queueList.map(ComplexValueStringGenerator(_)).toTrySeq.map(SeqTryExpr(_)).rethrow("An exception occurred while generaing code for queue names.")
    } yield new TryGen {
      override def generate(): Try[String] = for {
        queuesStr <- queuesGen.generate
      } yield s"""MQClearRunner(context, mqResource, $queuesStr)"""
    }

  def genMQReportOperation(operation: MQReportOperation): Try[TryGen] =
    for {
      queueList <- Try { operation.getQueues().filter(_.isEnabled()) }.rethrow("An exception occurred while generating code for enabled queues in MQ Step.")
      queuesGen <- queueList.map(ComplexValueStringGenerator(_)).toTrySeq.map(SeqTryExpr(_)).rethrow("An exception occurred while generaing code for queue names.")
    } yield new TryGen {
      override def generate(): Try[String] = for {
        queuesStr <- queuesGen.generate
      } yield s"""MQReportRunner(context, mqResource, $queuesStr)"""
    }

  def genMQWaitOperation(operation: MQWaitOperation): Try[TryGen] =
    for {
      queueList <- Try { operation.getQueues().filter(_.isEnabled()) }.rethrow("An exception occurred while generating code for enabled queues in MQ Step.")
      queuesGen <- queueList.map(ComplexValueStringGenerator(_)).toTrySeq.map(SeqTryExpr(_)).rethrow("An exception occurred while generaing code for queue names.")
      comparison <- Try { operation.getComparison() }.rethrow("An exception occurred while getting comparison.")
      operator <- Try { comparison.getOperator() }.rethrow("An exception occurred while comparison operator.")
    } yield new TryGen {
      override def generate(): Try[String] = for {
        queuesStr <- queuesGen.generate
      } yield s"""MQWaitRunner(context, 
                               mqResource,
                               $queuesStr,
                               "${operator.getLiteral()}",
                               ${comparison.isCheckTotal()},
                               ${comparison.getDepth()},
                               ${comparison.getTimeout()}).asInstanceOf[Try[${if(comparison.isCheckTotal) "MQWaitTotalQueueDepth" else "MQWaitIndividualQueueDepth"}]]"""
    }
}
