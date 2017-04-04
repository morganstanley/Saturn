package com.ms.qaTools.saturn.codeGen

import scala.util.Try

import com.ms.qaTools.TryUtil
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.OptionExpr
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.saturn.{Xml2CsvStep => MXml2CsvStep}

object Xml2CsvLogicGenerator {
  def apply(xml2csv: MXml2CsvStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    implicit val appendOptions = ContextAppendOptions(true)
    for {
      cfg <- Try { val c = xml2csv.getXml2CsvConfiguration(); if (c == null) throw new NullPointerException(s"Configuration for Xml2Csv Step: $xml2csv cannot be null.") else c }
      inputGen <- ResourceGenerator(cfg.getXMLFile()).rethrow(s"An exception occurred while generating code for input resource in Xml2Csv step $xml2csv.")
      outputGen <- ResourceGenerator(cfg.getCSVFile()).rethrow(s"An exception occurred while generating code for output resource in Xml2Csv step $xml2csv.")
      nsFileGen <- {
        val nsFile = Option(cfg.getNamespaceFile())
        nsFile match {
          case Some(f) => ResourceGenerator(f).map(OptionExpr(_)).rethrow(s"An exception occurred while generating code for namespace resource in Xml2Csv step $xml2csv.")
          case None    => Try { ScalaExpr("None") }
        }
      }
      configGen <- ResourceGenerator(cfg.getConfigFile()).rethrow(s"An exception occurred while generating code for config resource in Xml2Csv step $xml2csv.")
      nullMarkerStr = if (cfg.isRemoveNulls) "\"\"" else "null"
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        inputStr <- inputGen.generate
        outputStr <- outputGen.generate
        configStr <- configGen.generate
        nsStr <- nsFileGen.generate
      } yield s"""Xml2CsvRunner(context, 
                                $inputStr,
                                $outputStr,
                                $configStr,
                                $nsStr,
                                ${cfg.isAddHeader()},
                                ${cfg.isDetachNodes()},
                                $nullMarkerStr)"""
    }, xml2csv, "Xml2Csv")
  }
}