package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.SeqTryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.DSConvertStep
import com.ms.qaTools.saturn.modules.dsConvertModule.AbstractOperation
import com.ms.qaTools.saturn.modules.dsConvertModule.SimpleOperation

object DsConvertLogicGenerator {
  def genOperationCode(operation: AbstractOperation, i: Int): Try[(TryGen, TryGen, Seq[TryGen])] = {
    operation match {
      case simple: SimpleOperation => for {
        sourceIOGen <- ResourceGenerator(simple.getSource)(appendOptions = ContextAppendOptions(true, (s) => s"Source_$i")).rethrow("An exception occurred generating resource code for the source.")
        targetIOGen <- ResourceGenerator(simple.getTarget)(appendOptions = ContextAppendOptions(true, (s) => s"Target_$i")).rethrow("An exception occurred generating resource code for the target.")
        ignoreCols <- Try(simple.getIgnoreCols.toList).getOrElse(Nil).map(ComplexValueStringGenerator(_)).toTrySeq
        // TODO consider value simple.isNumberDuplicateCols or disable from GUI
      } yield (sourceIOGen, targetIOGen, ignoreCols)
      case unknown => Try { throw new Exception(s"Unknown DsConvert operation: $unknown.") }
    }
  }

  def apply(dsConvert: DSConvertStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = for {
    cfg <- Try { dsConvert.getDSConvertConfiguration }
    operations <- Try { cfg.getOperations.filter { _.isEnabled } }
    resourcesGen <- operations.zipWithIndex.map { Function.tupled(genOperationCode) }.toTrySeq
  } yield StepLogicGenerator.modifierGen(new ScalaGen {
    val (sources, targets, ignoreColsSeq) = resourcesGen.unzip3
    override def generate(): Try[String] = for {
      sourceStr <- SeqTryExpr(sources).generate
      targetStr <- SeqTryExpr(targets).generate
      ignoreColsStr <- ignoreColsSeq.map(ignoreCols => SeqTryExpr(ignoreCols).generate).toTrySeq
    } yield s"""DsConvertRunner(context, 
                                $sourceStr,
                                $targetStr,
                                ${ignoreColsStr.mkString("Seq(", ",", ")")})"""
  }, dsConvert, "DsConvertAggregate")
}