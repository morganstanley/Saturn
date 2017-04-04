package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.saturn.{XmlGenStep => MXmlGenStep}

object XmlGenLogicGenerator {
  implicit val appendOptions = ContextAppendOptions(true)

  def apply(xmlGen: MXmlGenStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = for {
    cfg <- Try { val c = xmlGen.getXmlGenConfiguration; if (c == null) throw new NullPointerException(s"Configuration for RunCmds Step: $xmlGen cannot be null.") else c }
    templateGen <- ResourceGenerator(cfg.getTemplateFile())
    outputGen <- ResourceGenerator(cfg.getOutputResource())
    inputGen <- Try {
      val dataSets = cfg.getDataSets()
      if (dataSets.length != 1) throw new Exception("XmlGen should have exactly one dataSet.")
      val dataSet = dataSets.get(0)
      dataSet.getFile()
    }.flatMap(dataSet => ResourceGenerator(dataSet))
  } yield StepLogicGenerator.modifierGen(new ScalaGen {
    override def generate(): Try[String] = for {
      templateStr <- templateGen.generate
      outputStr <- outputGen.generate
      inputStr <- inputGen.generate
    } yield s"""XmlGenRunner(context, 
                             $templateStr,
                             $outputStr,
                             $inputStr,
                             ${cfg.isLegacyMode})"""
  }, xmlGen, "XmlGen")
}
