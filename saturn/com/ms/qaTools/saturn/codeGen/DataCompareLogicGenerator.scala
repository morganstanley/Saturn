package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import org.apache.commons.lang.StringEscapeUtils.escapeJava

import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.saturn.{DataCompareStep => MDataCompareStep}
import com.ms.qaTools.saturn.modules.datacompareModule.AbstractDiffSetExplainer
import com.ms.qaTools.saturn.modules.datacompareModule.{MappedColumn => MMappedColumn}
import com.ms.qaTools.saturn.modules.datacompareModule.{Output => MOutput}
import com.ms.qaTools.saturn.modules.datacompareModule.{Page => MPage}
import com.ms.qaTools.saturn.modules.datacompareModule.{Pages => MPages}
import com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer
import com.ms.qaTools.saturn.modules.datacompareModule.SortType.BOTH
import com.ms.qaTools.saturn.modules.datacompareModule.SortType.LEFT
import com.ms.qaTools.saturn.modules.datacompareModule.SortType.NONE
import com.ms.qaTools.saturn.modules.datacompareModule.SortType.RIGHT
import com.ms.qaTools.saturn.types.ColumnTypeEnum

object DataCompareLogicGenerator {
  val colTypeMap = Map(ColumnTypeEnum.NUMERIC -> "NumericColumnType()")

  def columnInfo(columns: Seq[MMappedColumn]) = (
    (for(c <- columns; k <- Option(c.getKeyOrder); if k.intValue > 0) yield c.getName -> k.intValue).toMap,
    columns.filter(_.isIgnored).flatMap(c => Option(c.getName)),
    (for(c <- columns; r <- Option(c.getMappingColumn); if r.length > 0) yield c.getName -> r).toMap,
    columns.map(c => (c.getName, colTypeMap.getOrElse(c.getType, "StringColumnType()"))).toMap
  )

  def thresholds(columns: Seq[MMappedColumn]) =
    for(c <- columns; t <- Option(c.getThreshold); n <- Option(c.getName))
      yield (s""""$n"""", t.toDouble)

  protected sealed trait DataSourcePosition
  protected case object Left  extends DataSourcePosition
  protected case object Right extends DataSourcePosition

  def genExplainerStr(explainer: AbstractDiffSetExplainer) =
    Option(explainer) match {
      case Some(e: PerlDiffSetExplainer) =>
        for {
          generator <- ComplexValueCodeGenerator(e.getDiffCode)
          code <- generator.generate
        } yield s"Option(CodedExplainer[AbstractDiff]{expl => val diff = expl \n ${code}.get})"
      case None => Try{"None"}
      case _ => throw new Error("Unsupported explainer type")
    }

  def genOutput(o: MOutput) =
    for {
      mpages <- Try{Option(o.getPages)}
      pages = Map(
        "SummaryPage"     -> mpages.flatMap((p: MPages) => Option(p.getSummary)),
        "DifferencesPage" -> mpages.flatMap((p: MPages) => Option(p.getDifferent)),
        "ExplainedPage"   -> mpages.flatMap((p: MPages) => Option(p.getExplained)),
        "InLeftOnlyPage"  -> mpages.flatMap((p: MPages) => Option(p.getInLeftOnly)),
        "InRightOnlyPage" -> mpages.flatMap((p: MPages) => Option(p.getInRightOnly)),
        "IdenticalPage"   -> mpages.flatMap((p: MPages) => Option(p.getIdentical)),
        "LeftPage"        -> mpages.flatMap((p: MPages) => Option(p.getLeft)),
        "RightPage"       -> mpages.flatMap((p: MPages) => Option(p.getRight)))
      omit = pages.collect{case (k, Some(v)) if v.isOmit => k}
      names = pages.mapValues(_.flatMap((v: MPage) => Option(v.getName)))
        .collect{case (k, Some(v)) => (k, s""""${escapeJava(v)}"""")}
    } yield (omit.toString, names.toString)

  def invalid[T](element: String, step: String): PartialFunction[Throwable, T] = {
    case (t: Throwable) =>
      throw new Error(s"invalid $element in $step: " + t.getMessage)}

  def apply(dataCompare: MDataCompareStep)(implicit codeGenUtil: SaturnCodeGenUtil) = {
    implicit val appendOptions = ContextAppendOptions(true)
    for {
      cfg           <- Try { dataCompare.getDataCompareConfiguration }
      step          <- Try(dataCompare.getName)
      dataSources   <- Try(cfg.getDataSources).recover(invalid("configuration", step))
      (k, i, m, t)  <- Try { columnInfo(dataSources.getColumns.filter(_.isEnabled)) }
      thresholds    <- Try(thresholds(dataSources.getColumns.filter(_.isEnabled)))
      leftDsGen     <- ResourceGenerator(dataSources.getLeft)
      rightDsGen    <- ResourceGenerator(dataSources.getRight)
      output        <- Try {cfg.getOutput.getResource}.recover(invalid("output resource", step))
      outputGen     <- ResourceGenerator(output)(appendOptions = ContextAppendOptions(true, (_) => "Output")).recover(invalid("output resource", step))
      explainer     <- genExplainerStr(cfg.getDiffSetExplainer)
      (omit, names) <- genOutput(cfg.getOutput)
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        leftDsStr  <- leftDsGen.generate
        rightDsStr <- rightDsGen.generate
        outputStr  <- outputGen.generate
        keysStr    <- Try { k.toList.map { case (k, v) => s""""${escapeJava(k)}" -> $v""" }.mkString("Map[String, Int](", ", ", ")") }
        ignoreStr  <- Try { i.map(k => s""""${escapeJava(k)}"""").mkString("Seq[String](", ", ", ")") }
        mapStr     <- Try { m.toList.map { case (k, v) => s""""${escapeJava(k)}" -> "${escapeJava(v)}"""" }.mkString("Map[String, String](", ", ", ")") }
        typStr     <- Try { t.toList.map { case (k, v) => s""""${escapeJava(k)}" -> $v""" }.mkString("Map[String, ColumnType](", ", ", ")") }
        sortStr    <- Try {
          dataSources.getSortDatasets() match {
            case BOTH  => "com.ms.qaTools.saturn.modules.datacompareModule.SortType.BOTH"
            case LEFT  => "com.ms.qaTools.saturn.modules.datacompareModule.SortType.LEFT"
            case RIGHT => "com.ms.qaTools.saturn.modules.datacompareModule.SortType.RIGHT"
            case NONE  => "com.ms.qaTools.saturn.modules.datacompareModule.SortType.NONE"
            case other => throw new IllegalArgumentException(s"Invalid sort stype '$other'.")
          }
        }
      } yield s"""DataCompareRunner(context, 
                                    $leftDsStr,
                                    $rightDsStr,
                                    $keysStr,
                                    $ignoreStr,
                                    $mapStr,
                                    $typStr,
                                    ${cfg.isIgnoreInRightOnlyColumns},
                                    ${cfg.isIgnoreInLeftOnlyColumns},
                                    $outputStr,
                                    $sortStr,
                                    Seq(NameNumericThresholdExplainer(${thresholds.mkString("Seq[(String, Double)](", ",", ")")})) ++ $explainer,
                                    None,
                                    $names,
                                    $omit)"""
    }, dataCompare, "DsCompare")
  }
}
