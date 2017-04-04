package com.ms.qaTools.saturn.codeGen
import scala.Option.option2Iterable
import scala.annotation.tailrec
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator
import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{Attribute => MAttribute}
import com.ms.qaTools.saturn.repetition.ForEachRepetition
import com.ms.qaTools.saturn.repetition.ForEachXPathRepetition
import com.ms.qaTools.saturn.repetition.ForRepetition
import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResource
import com.ms.qaTools.saturn.types.AbstractRepetitionHandler
import com.ms.qaTools.saturn.types.NamedResourceDefinition
import com.ms.qaTools.saturn.values.ReferenceComplexValue

case class DependencyExtractor(preRepetitionDependencies:Seq[EObject],
                               postRepetitionDependencies:Seq[EObject],
                               repetitionHandler:Option[AbstractRepetitionHandler]) {
  import DependencyExtractor.dumpEObject
  override def toString:String = "pre: [" + preRepetitionDependencies.map{dumpEObject(_)}.mkString(",") + "]\npost:[" + postRepetitionDependencies.map{dumpEObject(_)}.mkString(",") + "]"
}

object DependencyExtractor {
  implicit def eObject2EObjectSeq(e:EObject):Seq[EObject] = if(e == null) Nil else Seq(e)

  trait Dump[-A] {
    def dump(x: A): String
  }
  def dump[A: Dump](x: A) = implicitly[Dump[A]].dump(x)

  def dumpEObject(e:EObject):String = e match {
    case a:MAttribute                => "A(" + a.getName() + ")"
    case r:NamedResourceDefinition   => "R(" + r.getName() + ")"
    case r:AbstractRepetitionHandler => "REPETITION(" + r.eClass().getName() + ")"
    case _                           => e.toString()
  }

  implicit object DumpString extends Dump[String] {
    def dump(x: String) = x
  }

  implicit object DumpEObject extends Dump[EObject] {
    def dump(x: EObject) = dumpEObject(x)
  }

  implicit def DumpSet[A: Dump] = new Dump[Set[A]] {
    def dump(xs: Set[A]) = s"[${xs.map(implicitly[Dump[A]].dump).mkString(",")}]"
  }

  implicit def DumpMap[K: Dump, A: Dump] = new Dump[Map[K, A]] {
    def dump(kvs: Map[K, A]) = kvs map {
      case (k, v) => implicitly[Dump[K]].dump(k) + " => " + implicitly[Dump[A]].dump(v)
    } mkString "\n"
  }

  def apply(runGroup:MAbstractRunGroup):DependencyExtractor = {
    val attributeMap:Map[String,EObject] = {runGroup.getAttributes.map{a => (a.getName, a)} ++ repetitionHandlerDependencyPairs(Option(runGroup.getRepetitionHandler))}.toMap
    val resourceMap = runGroup.getResources().filter(_.isEnabled()).map{a => (a.getName(),a)}.toMap
    val roots:Seq[EObject] = runGroup.getAttributes() ++ runGroup.getResources().filter(_.isEnabled())

    val rootPairs:Seq[(EObject,Set[EObject])] = roots.map{eObject => (eObject, (eObject :: eObject.eAllContents().toList)
                                                                            .flatMap{node => node match {
                                                                              case ref:ReferenceResource     => resourceMap.get(ref.getResource())
                                                                              case ref:ReferenceComplexValue => attributeMap.get(ref.getUserAttribute).orElse(resourceMap.get(ref.getUserAttribute))
                                                                              case _                         => None
                                                                            }}.toSet) }

    val depMap = rootPairs.toMap


    @tailrec
    def extractDependencies(depMap:Map[EObject,Set[EObject]], repetitionHandler:Option[AbstractRepetitionHandler], deps:List[EObject]=Nil):Seq[EObject] = {
      val newDeps:List[EObject] = depMap.filter{pair => pair._2.isEmpty }.map{_._1}.toList
      if(newDeps.isEmpty) repetitionHandler match {
        case Some(r) => extractDependencies(depMap.map{p => (p._1, p._2 - r)}.toMap, None, deps ::: List(r))
        case None if depMap.nonEmpty => throw new Error("Attribute or Resource references to itself: " + dump(depMap))
        case None    => deps
      }
      else extractDependencies(depMap.filter{p => !p._2.isEmpty}.map{p => (p._1, p._2 -- newDeps)}.toMap, repetitionHandler, deps ::: newDeps)
    }

    val deps = extractDependencies(depMap, Option(runGroup.getRepetitionHandler))
    val repIdx = deps.indexWhere(_.isInstanceOf[AbstractRepetitionHandler])
    val (pre, post) = if(repIdx >= 0) {
      val(a, b) = deps.splitAt(repIdx)
      (a, b.tail)
    }
    else (deps, Nil)
    new DependencyExtractor(pre, post, Option(runGroup.getRepetitionHandler))
  }

  def repetitionHandlerDependencyPairs(repetitionHandler:Option[AbstractRepetitionHandler]) = repetitionHandler match {
      case Some(r:ForRepetition)          => r.getIterators().map{     i => (i.getAttribute(), r)}
      case Some(r:ForEachRepetition)      => r.getColumnMappings().map{m => (m.getAttribute(), r)}
      case Some(r:ForEachXPathRepetition) => r.getXPathMappings().map{ m => (m.getAttribute(), r)}
      case None                           => Nil
      case r                              => throw new Exception(s"Unknown repetition handler: $r")
  }
}
