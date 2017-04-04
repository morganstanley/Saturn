package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.OptionExpr
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.SeqTryExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.saturn.{CometStep => MCometStep}
import com.ms.qaTools.saturn.{PerlRunGroupModifier => MPerlRunGroupModifier}

object CometLogicGenerator {
  def apply(cometWait: MCometStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    implicit val appendOptions = ContextAppendOptions(true)
    for {
      cfg         <- Try { Option(cometWait.getCometConfiguration()).getOrElse(throw new Error(s"Configuration for Comet Step: $cometWait cannot be null.")) }      
      dbGen       <- ResourceGenerator(cfg.getDatabase()).rethrow("An exception occurred while generating code for database connection.")
      outputIOGen <- Option(cfg.getOutput()) match {
        case Some(o) => ResourceGenerator(cfg.getOutput()).map(OptionExpr(_)).rethrow("An exception occurred while generating code for output resource.")
        case None    => Try { ScalaExpr { "None" } }
      }
      timeoutGen  <- Option(cfg.getTimeOut()).map { ComplexValueStringGenerator(_) }.getOrElse(Try(TryExpr("\"60\""))).rethrow("An exception occurred while generating code for timeout.")
      tuple       <- cfg.getMessages().map { message =>
        for {
          checkpoint <- ComplexValueStringGenerator(message.getCheckpoint())
          nameValuePairs <- message.getDescriptors().map { descriptor =>
            ComplexValueStringGenerator(descriptor.getName()) flatMap { nameGen =>
              ComplexValueStringGenerator(descriptor.getValue()) map (valueGen => (nameGen, valueGen))
            }
          }.toTrySeq
          types <- Try { message.getDescriptors().map("\"" + _.eClass().getName() + "\"") }
        } yield (checkpoint, nameValuePairs, types)
      }.toTrySeq
      modifiers <- cometWait.getModifiers().collect { case m: MPerlRunGroupModifier => ComplexValueCodeGenerator(m.getPerlCode()) }.toTrySeq.map(SeqTryExpr(_, Some("")))
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      val (checkpointsGen, pairsGen, types) = tuple.unzip3
      override def generate(): Try[String] = for {
        dbConnection <- dbGen.generate
        outputIO <- outputIOGen.generate
        timeout <- timeoutGen.generate
        checkpoints <- checkpointsGen.map(_.generate).toTrySeq
        pairs <- pairsGen.map { descriptors =>
          descriptors.map {
            case (nameGen, valueGen) => nameGen.generate flatMap (name => valueGen.generate map (value => (name, value)))
          }.toTrySeq
        }.toTrySeq
      } yield {
        val messageDefs = (checkpoints, pairs, types).zipped.toSeq.map {
          case (checkpoint, pairs, dType) =>
            val pairStr = pairs.map { case (name, value) => s"($name, $value)" }
            s"""RunnerMessageDefinition(context, $checkpoint, Seq[(Try[String], Try[String])](${pairStr.mkString(",")}), Seq[String](${dType.mkString(",")}))"""
        }
        s"""CometWaitRunner(context,
                            $dbConnection, 
                            $outputIO, 
                            $timeout, 
                            Seq[Try[MessageDefinition]](${messageDefs.mkString(",")}))"""
      }
    }, cometWait, "CometWait")
  }
}
