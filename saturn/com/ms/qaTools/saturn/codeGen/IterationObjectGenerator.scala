package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.codeGen.scala.AttributeTry
import com.ms.qaTools.codeGen.scala.ConcatGen
import com.ms.qaTools.codeGen.scala.ConnectTry
import com.ms.qaTools.codeGen.scala.ForAssignment
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.codeGen.scala.TryFnExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.codeGen.scala.ValDefinition
import com.ms.qaTools.saturn.{Attribute => MAttribute}
import com.ms.qaTools.saturn.AttributeParameter
import com.ms.qaTools.saturn.IncludeFile
import com.ms.qaTools.saturn.ResourceParameter
import com.ms.qaTools.saturn.listeners.{ScenarioReportListener => MScenarioReportListener}
import com.ms.qaTools.saturn.repetition.{ForEachRepetition => MForEachRepetition}
import com.ms.qaTools.saturn.repetition.{ForEachXPathRepetition => MForEachXPathRepetition}
import com.ms.qaTools.saturn.repetition.{ForRepetition => MForRepetition}
import com.ms.qaTools.saturn.types.{NamedResourceDefinition => MNamedResourceDefinition}

object IterationObjectGenerator {
  def apply(eObject:EObject)(implicit codeGenUtil: SaturnCodeGenUtil):Try[ForAssignment] = {
    Option(eObject) match {  
      case Some(namedResource: MNamedResourceDefinition) => ResourceGenerator(namedResource, name = Option(namedResource.getName)).map{ r => 
        ForAssignment(namedResource.getName(), 
                      r.withRethrow(s"An exception occurred while connecting resource '${namedResource.getName}'."))
      }
      case Some(attribute: MAttribute)                   => ComplexValueStringGenerator(attribute).map{a => 
        ForAssignment(attribute.getName(), 
                      AttributeTry(a, attribute.getName()).withRethrow(s"An exception occurred while evaluating attribute complex value '${attribute.getName}'."))
      }
      case Some(forEachRepetition: MForEachRepetition) => ResourceGenerator(forEachRepetition.getDataSetResource()).map { tryGen =>
        ConnectTry(tryGen.withFlatMap(TryFnExpr("_.input")), "RepetitionDataSetInput", false)
      }.map { ForAssignment("rows", _) }
      case Some(forRepetition: MForRepetition)           => Try {
        if(forRepetition.getIterators().isEmpty()) ForAssignment("rows", TryExpr("Nil"))
        else {
          val assignments = forRepetition.getIterators().map{i => s"${Option(i.getAttribute).getOrElse("_")} <- (${i.getStartIndex()} to ${i.getEndIndex()})" }.mkString("\n  ")
          val yieldExpr = forRepetition.getIterators().map{i => s"${i.getAttribute()}.toString"}.mkString(",")      
          ForAssignment("rows", TryExpr(s"{ for {\n  $assignments} yield Seq($yieldExpr) }.toIterator"))
        }
      }
      case Some(forEachXPathRepetition: MForEachXPathRepetition) => 
        for{
          xmlResource      <- ResourceGenerator(forEachXPathRepetition.getXMLResource()).map{tryGen => ConnectTry(tryGen.withFlatMap(TryFnExpr("_.input")), "RepetitionXmlResourceInput", false)}
          xPathMappings    <- Try { ConcatGen(forEachXPathRepetition.getXPathMappings().map { x => ScalaExpr(s"""("${x.getXPath()}", "${x.getAttribute()}")""") }, ",", "Seq(", ")") }
          namspaceResource <- Option(forEachXPathRepetition.getNamespaceDefinition()).map {
            ResourceGenerator(_).map { _.withFlatMap(TryFnExpr("_.input")) }
          }.getOrElse { Try { TryExpr("Iterator[Seq[String]]()") } }
        } yield {
          val rowTryGen = new TryGen {
            def generate: Try[String] =
              for {
                xmlResourceStr   <- xmlResource.generate
                xPathMappingsStr <- xPathMappings.generate
                namespacesStr    <- namspaceResource.generate
              } yield 
              s"""for{
                xmlRowSource <- $xmlResourceStr
                namespace    <- $namespacesStr
              } yield {
                if (xmlRowSource.hasNext) {
                  val head = xmlRowSource.next
                  val userDefinedNs = namespace.toList.map {r => (r(0) -> r(1))}.toMap
                  implicit val nsContext = NamespaceContextImpl(head, userDefinedNs)
                  XPathRowSource($xPathMappingsStr, Iterator(head) ++ xmlRowSource).asDelimitedRowIterator
                } else
                  new Iterator[Seq[String]] with ColumnDefinitions {
                    def colDefs = Seq()
                    def hasNext = false
                    def next = throw new NoSuchElementException("next called on empty iterator.")
                  }
              }"""
          }
          ForAssignment("rows", rowTryGen)
        }
      case Some(includeFile:IncludeFile)                 => IncludeFileInstanceGenerator(includeFile)
      case Some(listener: MScenarioReportListener)       => for (tryGen <- ScenarioReportListenerGenerator(listener)) yield ForAssignment("scenarioReportListenerOutput", tryGen)
      case Some(somethingElse)                           => throw new Exception(s"Couldn't generate IterationObjectGenerator string for EObject: $somethingElse.")
      case None                                          => throw new Exception(s"Couldn't generate IterationObjectGenerator null EObject.")
    }
  }
}

object ValDefinitionGenerator {
  def apply(eObject:EObject)(implicit codeGenUtil: SaturnCodeGenUtil):Try[ValDefinition] = {
    import codeGenUtil.getWrapped
    
    Option(eObject) match {
      case Some(namedResource: MNamedResourceDefinition) => Try{ValDefinition(namedResource.getName(), ResourceGenerator.getMetaData(namedResource).get.abstractType)}
      case Some(attribute: MAttribute)                   => Try{ValDefinition(attribute.getName(), "String")}
      case Some(includeFile:IncludeFile)                 => Try{ValDefinition(includeFile.getName(), codeGenUtil.getIncludeFileSaturn(includeFile).getClassName)}
      case Some(somethingElse)                           => throw new Exception(s"Couldn't generate ValDefinitionGenerator string for EObject: $somethingElse.")
      case None                                          => throw new Exception(s"Couldn't generate ValDefinitionGenerator null EObject.")
    }
  }
}
