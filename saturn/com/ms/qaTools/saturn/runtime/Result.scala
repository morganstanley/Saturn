package com.ms.qaTools.saturn.runtime

import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.NotRun
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Status

@deprecated("Use com.ms.qaTools.saturn.codeGen.RunGroupResult", "")
class RunGroupResult(override val status:Status, val runGroups:Seq[RunGroupIteratorResult], val depth:Option[Int] = None) extends Result with Function1[String,Option[RunGroupIteratorResult]]{
  val runGroupByName = runGroups.map{r => (r.name, r)}.toMap
  def apply(runGroupName:String) = runGroupByName.get(runGroupName)
  
  def &&(that:RunGroupResult):RunGroupResult = (this.status, that.status) match {
    case (Passed(),Passed()) => (this.depth,that.depth) match {
      case(Some(l),Some(r)) => if(l < r) this else that
      case _ => throw new Exception("Passing RunGroup Results should have a depth.")
    }
    case (Failed(),_) => this
    case (_,Failed()) => that
    case(_,NotRun())  => this
    case(NotRun(), _) => that
  }
  
  def ||(that:RunGroupResult):RunGroupResult = (this.status, that.status) match {
    case (Passed(),Passed()) => (this.depth,that.depth) match {
      case(Some(l),Some(r)) => if(l < r) this else that
      case _ => throw new Exception("Passing RunGroup Results should have a depth.")
    }
    case (Passed(),_) => this
    case (_,Passed()) => that
    case(_,NotRun())  => this
    case(NotRun(), _) => that
  }  
  
  override def toString() = "RunGroup(\n" + 
  "  status=" + status + "\n" + 
  "  runGroups=[" + runGroups.mkString(",\n  ") + "])"
}

case class TerminalResult(runGroupStatus:Option[Status], break:Boolean) extends Result

case class PassedRunGroupResult(override val runGroups:Seq[RunGroupIteratorResult] = Nil, override val depth:Option[Int] = None) extends RunGroupResult(Passed(), runGroups)
case class FailedRunGroupResult(override val runGroups:Seq[RunGroupIteratorResult] = Nil, override val depth:Option[Int] = None) extends RunGroupResult(Failed(), runGroups)

class SaturnResult(override val status:Status, runGroups:Seq[RunGroupIteratorResult]) extends RunGroupResult(status, runGroups, Option(0))
case class PassedSaturnResult(override val runGroups:Seq[RunGroupIteratorResult] = Nil) extends SaturnResult(Passed(), runGroups)
case class FailedSaturnResult(override val runGroups:Seq[RunGroupIteratorResult] = Nil) extends SaturnResult(Failed(), runGroups)

trait ObjectResult extends Result {
  val name:String
  override val status = exception match {
    case Some(e) => Failed()
    case None    => Passed()
  }
}

case class AttributeResult   (name:String, value: Option[String] = None, override val exception:Option[Throwable]=None) extends ObjectResult {
  override def toString = "AttributeResult(name=%s, value=%s, status=%s, exception=%s)".format(name, value, exception)
}
case class ResourceResult[ResourceType]    (name:String, override val exception:Option[Throwable]=None, resource: ResourceType) extends ObjectResult {
  override def toString = "ResourceResult(name="+ name + ", status=" + status + ", exception=" + exception + ")"
}
case class ComplexValueResult(name:String, value: Option[String] = None, override val exception:Option[Throwable]=None) extends ObjectResult {
  override def toString = "ComplexValueResult(name=%s, value=%s, status=%s, exception=%s)".format(name, value, exception)
}
case class IncludeResult     (name:String, override val exception:Option[Throwable]=None) extends ObjectResult {
  override def toString = "IncludeResult(name="+ name + ", status=" + status + ", exception=" + exception + ")"
}

trait AbstractRunGroupResult extends Result {
  val name:String
  val attributes:Seq[AttributeResult]       = Nil
  val resources:Seq[ResourceResult[_]]      = Nil
  val complexValues:Seq[ComplexValueResult] = Nil
  val includes:Seq[IncludeResult]           = Nil
  val graphDepth:Option[Int]                = None
  val iterationNo:Option[Int]               = None
  val startTime: Option[Long]               = None
  val endTime: Option[Long]                 = None
  val resultContext: SaturnResultContext
  
  override def toString = 
    "AbstractRunGroupResult(\n" + 
    "  name=" + name + "\n" +
    "  status=" + status.toString +"\n" +
    {exception match { 
      case Some(e) => "  exception=" + exception.toString +"\n"
      case None => ""
    }} +
    {attributes match {
      case Nil => ""
      case xs  => "  attributes=[" + attributes.mkString(",") + "]" +"\n"
    }} +
    {resources match {
      case Nil => ""                     
      case xs  => "  resources=[" + resources.mkString(",") + "]" +"\n" 
    }} +
    {complexValues match {
      case Nil => ""                     
      case xs  => "  complexValues=[" + complexValues.mkString(",") + "]" +"\n" 
    }} +
    {includes match {
      case Nil => ""                     
      case xs  => "  includes=[" + includes.mkString(",") + "]" +"\n" 
    }} + ")"
}

trait RunGroupIteratorResult extends AbstractRunGroupResult
trait RunGroupIterationResult[ResultType <: Result] extends AbstractRunGroupResult {
  val result:Option[ResultType] = None
  
  override def toString = 
    "RunGroupIterationResult(\n" +
    "  name=" + name + "\n" +
    "  status=" + status.toString +"\n" +
    {result match { 
      case Some(r) => "  result=" + r +"\n"
      case None => "N/A!\n"
    }} +
    {exception match { 
      case Some(e) => "  exception=" + exception.toString +"\n"
      case None => ""
    }} +
    {attributes match {
      case Nil => ""
      case xs  => "  attributes=[" + attributes.mkString(",") + "]" +"\n"
    }} +
    {resources match {
      case Nil => ""                     
      case xs  => "  resources=[" + resources.mkString(",") + "]" +"\n" 
    }} +
    {complexValues match {
      case Nil => ""                     
      case xs  => "  complexValues=[" + complexValues.mkString(",") + "]" +"\n" 
    }} +
    {includes match {
      case Nil => ""                     
      case xs  => "  includes=[" + includes.mkString(",") + "]" +"\n" 
    }} + ")"                          
} 

object RunGroupIterationResult {
  def apply[ResultType <: Result](_name:String,
                                  _result:Option[ResultType],
                                  _iterationNo: Option[Int] = None,
                                  _attributes:Seq[AttributeResult]=Nil,
                                  _resources:Seq[ResourceResult[_]]=Nil,
                                  _complexValues:Seq[ComplexValueResult]=Nil,
                                  _includes:Seq[IncludeResult]=Nil,
                                  _startTime: Option[Long] = None,
                                  _endTime: Option[Long] = None
                                )(implicit rc: SaturnResultContext) = new RunGroupIterationResult[ResultType]() {
    override val name:String = _name 
    override val result:Option[ResultType] = _result
    override val status = result match {
      case Some(r) => r.status
      case None    => NotRun()
    }
    
    override val attributes:Seq[AttributeResult]=_attributes
    override val resources:Seq[ResourceResult[_]]=_resources
    override val complexValues:Seq[ComplexValueResult]=_complexValues
    override val includes:Seq[IncludeResult]=_includes
    override val iterationNo:Option[Int] = _iterationNo
    override val startTime: Option[Long] = _startTime
    override val endTime: Option[Long] = _endTime
    override val resultContext = rc
    override val exception = result match {
      case Some(r) => r.exception match {
        case Some(e) => Some(new Exception("%s failed.".format(_name), e))
        case None => None
      }
      case None => None
    }
  } 
}

object FailedRunGroupIterationResult {
  def apply[ResultType <: Result](_name:String,_exception:Throwable, _startTime: Option[Long] = None, _endTime: Option[Long] = None)(implicit rc: SaturnResultContext) = new RunGroupIterationResult[ResultType]() {
    override val name = _name
    override val status = Failed()
    override val exception = Some(_exception)
    override val startTime = _startTime
    override val endTime = _endTime
    override val resultContext = rc
  }  
}

object ScalarRunGroupIteratorResult {
  def unapply[ResultType <: Result](result:ScalarRunGroupIteratorResult[ResultType]):Option[RunGroupIterationResult[ResultType]] = result.iterationResult
  def apply[ResultType <: Result](_name:String,
                                  _status:Status, 
                                  _result:RunGroupIterationResult[ResultType], 
                                  _iterator:ScalarRunGroupIterator[ResultType],
                                  _startTime: Option[Long] = None,
                                  _endTime: Option[Long] = None)(implicit rc: SaturnResultContext) = new ScalarRunGroupIteratorResult[ResultType]() {
    override val name = _name
    override val status = _status
    override val iterationResult = Some(_result)
    override val iterator:ScalarRunGroupIterator[ResultType] = _iterator
    override val startTime: Option[Long] = _startTime
    override val endTime: Option[Long] = _endTime
    override val resultContext = rc
    override val exception = _result.exception
  }
}

object PassedScalarRunGroupIteratorResult {
  def apply[ResultType <: Result](_name:String, _result:RunGroupIterationResult[ResultType], _iterator:ScalarRunGroupIterator[ResultType], _startTime: Option[Long] = None, _endTime: Option[Long] = None)(implicit rc: SaturnResultContext) = new ScalarRunGroupIteratorResult[ResultType]() {
    override val name = _name
    override val status = Passed()
    override val iterationResult = Some(_result)
    override val startTime: Option[Long] = _startTime
    override val endTime: Option[Long] = _endTime
    override val resultContext = rc
    override val iterator = _iterator
  }
}

object FailedScalarRunGroupIteratorResult {
  def apply[ResultType <: Result](_name:String, _exception:Throwable, _iterator:ScalarRunGroupIterator[ResultType], _startTime: Option[Long] = None, _endTime: Option[Long] = None)(implicit rc: SaturnResultContext) = new ScalarRunGroupIteratorResult[ResultType]() {
    override val name = _name
    override val status = Failed()
    override val exception = Some(_exception)
    override val startTime: Option[Long] = _startTime
    override val endTime: Option[Long] = _endTime
    override val resultContext = rc
    override val iterator = _iterator
  }
}

object NotRunScalarRunGroupIteratorResult {
  def apply[ResultType <: Result](_name:String, _iterator:ScalarRunGroupIterator[ResultType])(implicit rc: SaturnResultContext) = new ScalarRunGroupIteratorResult[ResultType]() {
    override val name = _name
    override val status = NotRun()
    override val resultContext = rc
    override val iterator = _iterator
  }
}

trait ScalarRunGroupIteratorResult[ResultType <: Result] extends RunGroupIteratorResult {
  val iterationResult:Option[RunGroupIterationResult[ResultType]] = None
  val iterator:ScalarRunGroupIterator[ResultType] = null
                            
  override def toString = 
    "ScalarRunGroupIteratorResult(\n"+
    "  name=" + name + "\n" +
    "  status=" + status.toString +"\n" +
    {iterationResult match { 
      case Some(r) => "  iterationResult=" + r +"\n"
      case None => "N/A!\n"
    }} +
    {exception match { 
      case Some(e) => "  exception=" + exception.toString +"\n"
      case None => ""
    }} +
    {attributes match {
      case Nil => ""
      case xs  => "  attributes=[" + attributes.mkString(",") + "]" +"\n"
    }} +
    {resources match {
      case Nil => ""                     
      case xs  => "  resources=[" + resources.mkString(",") + "]" +"\n" 
    }} +
    {complexValues match {
      case Nil => ""                     
      case xs  => "  complexValues=[" + complexValues.mkString(",") + "]" +"\n" 
    }} +
    {includes match {
      case Nil => ""                     
      case xs  => "  includes=[" + includes.mkString(",") + "]" +"\n" 
    }} + ")"                             
}

trait RowSourceRunGroupIteratorResult[ResultType <: Result] extends RunGroupIteratorResult /* with Function1[Integer,RunGroupIterationResult[ResultType]] */ {
  val iterationResults:Seq[RunGroupIterationResult[ResultType]]
  val iterator:RowSourceRunGroupIterator[ResultType] = null
                            
  override def toString = 
    "RowSourceRunGroupIteratorResult(\n" + 
    "  name=" + name + "\n" +
    "  status=" + status.toString +"\n" +
    {iterationResults match { 
      case Nil => ""
      case xs => "  iterationResults=[" + iterationResults.mkString(",\n") +"]\n"
    }} +
    {exception match { 
      case Some(e) => "  exception=" + exception.toString +"\n"
      case None => ""
    }} +
    {attributes match {
      case Nil => ""
      case xs  => "  attributes=[" + attributes.mkString(",") + "]" +"\n"
    }} +
    {resources match {
      case Nil => ""                     
      case xs  => "  resources=[" + resources.mkString(",") + "]" +"\n" 
    }} +
    {complexValues match {
      case Nil => ""                     
      case xs  => "  complexValues=[" + complexValues.mkString(",") + "]" +"\n" 
    }} +
    {includes match {
      case Nil => ""                     
      case xs  => "  includes=[" + includes.mkString(",") + "]" +"\n" 
    }} + ")"                               
}

object RowSourceRunGroupIteratorResult {
  def unapplySeq[ResultType <: Result](result:RowSourceRunGroupIteratorResult[ResultType]):Seq[RunGroupIterationResult[ResultType]] = result.iterationResults
  def apply[ResultType <: Result](_name:String, 
                                  _status:Status, 
                                  _results:Seq[RunGroupIterationResult[ResultType]],
                                  _iterator: RowSourceRunGroupIterator[ResultType],
                                  _startTime: Option[Long] = None,
                                  _endTime: Option[Long] = None)(implicit rc: SaturnResultContext) = new RowSourceRunGroupIteratorResult[ResultType]() {
    override val name = _name
    override val status = _status
    override val iterationResults = _results
    override val iterator = _iterator
    override val startTime: Option[Long] = _startTime
    override val endTime: Option[Long] = _endTime
    override val resultContext = rc
  } 
}

trait DisabledRunGroupIteratorResult extends RunGroupIteratorResult
                                                                     
object PassedEmptyRunGroupIteratorResult {
  def apply(_name:String)(implicit rc: SaturnResultContext) = new RunGroupIteratorResult {
    override val name = _name
    override val status:Status = Passed()
    override val resultContext = rc

  }
}

object FailedEmptyRunGroupIteratorResult {
  def apply(_name:String)(implicit rc: SaturnResultContext) = new RunGroupIteratorResult() {
    override val name = _name
    override val status:Status = Failed()
    override val resultContext = rc
  }
}

object NotRunEmptyRunGroupIteratorResult {
  def apply(_name:String)(implicit rc: SaturnResultContext) = new RunGroupIteratorResult {
    override val name = _name
    override val status:Status = NotRun()
    override val resultContext = rc
  }
}  