package com.ms.qaTools.saturn.runtime.runner.module

import scala.util.Try

import org.w3c.dom.Document

import com.ms.qaTools.io.Input
import com.ms.qaTools.io.definition.XmlIO
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.saturn.codeGen.Utils.connectTry
import com.ms.qaTools.toolkit.xmlGen.XmlGen

object XmlGenRunner {
  def apply[TEMPLATE_TYPE](context: Context,
                           templateIOTry: Try[Input[Iterator[TEMPLATE_TYPE]]],
                           outputIOTry: Try[XmlIO],
                           inputIOTry: Try[Input[Iterator[Seq[String]] with ColumnDefinitions]],
                           isLegacy: Boolean)(implicit templateTypeToSeqString: Iterator[TEMPLATE_TYPE] => Iterator[Document]): Try[XmlGen] =
    XmlGen(templateIOTry.flatMap(input => connectTry(context, input.input, "TemplateInput", false)),
           outputIOTry.flatMap(output => connectTry(context, output.output, "Output", false)),
           inputIOTry.flatMap(input => connectTry(context, input.input, "DsInput", false)),
           isLegacy)
}