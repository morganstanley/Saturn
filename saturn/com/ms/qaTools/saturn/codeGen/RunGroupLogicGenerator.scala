package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConverters._
import scala.util.Properties
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.ConcatGen
import com.ms.qaTools.codeGen.scala.FutureFnExpr
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.saturn.NoopTerminal
import com.ms.qaTools.saturn.{RunGroup => MRunGroup}
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.listeners.{ScenarioReportListener => MScenarioReportListener}
import com.ms.qaTools.saturn.types.{SaturnStatusEnum, SaturnStatusConditionEnum}

object RunGroupLogicGenerator {
  def apply(runGroup: MRunGroup)(implicit codeGenUtil:SaturnCodeGenUtil): Try[FutureGen] = {
    import codeGenUtil.getWrapped
    val (procedures, runGroups) = runGroup.getRunGroups.asScala.partition(_.isProcedure)
    for {
      runGroups        <- codeGenUtil.sortRunGroups(runGroups)
      procedureCodeGen <- procedures.map{ProcedureGenerator(_)}.toTrySeq
      runGroupCodeGen  <- runGroups.map{NonProcedureGenerator(_)}.toTrySeq
    } yield {
      val runGroupFuturesMap = runGroups.map { x =>
        val affectStatus = x.isEnabled && !x.isInstanceOf[NoopTerminal]
        s"""("${x.getFullName()}", ${x.getName}Future, $affectStatus)"""
      }.mkString("Seq(", ", ", ")")
      val terminals = runGroup.getPassFailTerminals.map(_.getName + "Future").mkString("Seq(", ", ", ")")
      val defaultStatus = s"${classOf[SaturnStatusEnum].getName}.${runGroup.getDefaultStatus.getName}"
      val statusCondition = s"${classOf[SaturnStatusConditionEnum].getName}.${runGroup.getStatusCondition.getName}"
      val scenarioReportListener = runGroup match {
        case saturn: MSaturn if saturn.getListeners.asScala.exists(_.isInstanceOf[MScenarioReportListener]) =>
          "Option(scenarioReportListenerOutput)"
        case _ =>
          "None"
      }
      val resultCode =
        Seq(runGroupFuturesMap, terminals, defaultStatus, statusCondition,
            scenarioReportListener, "context", "iterationMetaData",
            codeGenUtil.getDefaultIterationNo(runGroup)).mkString("runGroupResultsToIterationResult(", ", ", ")")
      FutureFnExpr(ConcatGen(procedureCodeGen ++ runGroupCodeGen :+ ScalaExpr(resultCode), Properties.lineSeparator))
    }
  }
}
