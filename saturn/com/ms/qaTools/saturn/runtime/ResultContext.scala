package com.ms.qaTools.saturn.runtime

import scala.collection.immutable.ListMap
import com.ms.qaTools.saturn.dsl.annotation.ScenarioAnnotation

// TODO Rename to ResultBuilder

trait ResultContext {
  def appendAttribute(a:AttributeResult)
  def appendComplexValue(c:ComplexValueResult)
  def appendResourceContext(name:String, resourceType:String):ResourceResultContext
}

case object NullResultContext extends ResultContext {
  def appendAttribute(a:AttributeResult) = Unit
  def appendComplexValue(c:ComplexValueResult) = Unit
  def appendResourceContext(name:String, resourceType:String):ResourceResultContext = null
}

trait SaturnResultContext extends ResultContext {
  var attributes:List[AttributeResult] = Nil
  var resourceContexts:Map[String, ResourceResultContext] = ListMap()
  var complexValues:List[ComplexValueResult] = Nil
  var metaDataContexts: Map[String, MetaDataResultContext] = ListMap()
  var scenarioAnnotations: List[ScenarioAnnotation] = Nil
  
  def appendAttribute(a:AttributeResult)        = attributes = a :: attributes
  def appendComplexValue(c:ComplexValueResult)     = complexValues = c :: complexValues
  def appendMetaDataContext[T](name: String, metaData: Option[T]) = {
    val metaDataContext = new MetaDataResultContext(name,metaData)
    metaDataContexts = metaDataContexts + ((name, metaDataContext))
    metaDataContext
  }
  
  def appendResourceContext(name:String, resourceType:String):ResourceResultContext = {
    val resourceContext = new ResourceResultContext(name,resourceType)
    resourceContexts = resourceContexts + ((name, resourceContext)) 
    resourceContext
  }  
  
  def appendScenarioAnnotation(s: ScenarioAnnotation) = scenarioAnnotations = scenarioAnnotations :+ s
}

class IteratorResultContext() extends SaturnResultContext {
  var iterationContexts:List[IterationResultContext] = Nil
  def appendIterationContext() = {
    val iterationContext = new IterationResultContext()
    iterationContexts = iterationContext :: iterationContexts 
    iterationContext
  }
  
  override def toString = "IteratorResultContext(resources=[" + resourceContexts.map{_.toString}.mkString("\n") + "],\n" +
                          "                      complexValues=[" + complexValues.map{_.toString}.mkString("\n")+"],\n" +
                          "                      attributes=[" + attributes.map{_.toString}.mkString("\n")+"],\n" +
                          "                      iterationContexts=" +iterationContexts.map{_.toString}.mkString("\n") + ")"
}

class IterationResultContext() extends SaturnResultContext {
  var iteratorContexts:List[IteratorResultContext] = Nil
  def appendIteratorContext() = {
    val iteratorContext = new IteratorResultContext()
    iteratorContexts = iteratorContext :: iteratorContexts 
    iteratorContext
  }
  
  override def toString = "IterationResultContext(resources=[" + resourceContexts.map{_.toString}.mkString("\n") + "],\n" +
                          "                       complexValues=[" + complexValues.map{_.toString}.mkString("\n")+"],\n" +
                          "                       attributes=[" + attributes.map{_.toString}.mkString("\n")+"],\n" +
                          "                       iteratorContexts=" +iteratorContexts.map{_.toString}.mkString("\n") + ")"
}

class ResourceResultContext(val name:String, val resourceType:String) extends SaturnResultContext {
  override def toString = "ResourceResultContext(name=" + name + ",\n" +
                          "                      resourceType=" + resourceType + ",\n" +
                          "                      resources=[" + resourceContexts.map{_.toString}.mkString("\n") + "],\n" +
                          "                      metaDataContexts=[" + metaDataContexts.map{_.toString}.mkString("\n") + "],\n" +
                          "                      complexValues=[" + complexValues.map{_.toString}.mkString("\n")+"],\n" +
                          "                      attributes=[" + attributes.map{_.toString}.mkString("\n")+"])" 
}

class MetaDataResultContext(val name: String, val metaData: Option[Any] = None) extends SaturnResultContext {
  override def toString = "MetaDataResultContext(name=" + name + ",\n" +
                          "                      metaData=" + metaData + ",\n" +
                          "                      metaDataContexts=[" + metaDataContexts.map{_.toString}.mkString("\n") + "])"
}
object MetaDataResultContext {
  def apply(name: String, metaData: Option[Any] = None) = new MetaDataResultContext(name, metaData)
}

object IteratorResultContext {
  def apply() = new IteratorResultContext()
  def apply(parentContext:IterationResultContext) = parentContext.appendIteratorContext()
}

object IterationResultContext {
  def apply() = new IterationResultContext()
  def apply(parentContext:IteratorResultContext) = parentContext.appendIterationContext()
}