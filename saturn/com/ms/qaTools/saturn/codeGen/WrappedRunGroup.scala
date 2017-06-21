package com.ms.qaTools.saturn.codeGen
import com.ms.qaTools.saturn.{AbstractLink => MAbstractLink}
import com.ms.qaTools.saturn.{AbstractParameter => MAbstractParameter}
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{AbstractStep => MStep}
import com.ms.qaTools.saturn.AbstractTerminal
import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportConfiguration
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebConfiguration
import com.ms.qaTools.saturn.annotations.saturnWeb.SingleValueEnvVarTargetDefinition
import com.ms.qaTools.saturn.CometStep
import com.ms.qaTools.saturn.{CustomLink => MCustomLink}
import com.ms.qaTools.saturn.FailTerminal
import com.ms.qaTools.saturn.{IncludeFile => MIncludeFile}
import com.ms.qaTools.saturn.MailStep
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage
import com.ms.qaTools.saturn.MQStep
import com.ms.qaTools.saturn.PassTerminal
import com.ms.qaTools.saturn.RunCmdsStep
import com.ms.qaTools.saturn.{RunGroup => MRunGroup}
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.SQLStep
import com.ms.qaTools.saturn.types.InterpretersEnum
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper
import com.ms.qaTools.saturn.Xml2CsvStep
import java.util.{List => JList}
import org.eclipse.emf.ecore.EObject
import scala.annotation.tailrec
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.JavaConversions.seqAsJavaList
import scala.Option.option2Iterable

class JTuple2[A, B](_1: A, _2: B) {
  def get_1() = _1
  def get_2() = _2
}

abstract class DependencyOperator(operands:Seq[MAbstractLink])
case class AndDependencyOperator(operands:Seq[MAbstractLink]) extends DependencyOperator(operands)
case class OrDependencyOperator(operands:Seq[MAbstractLink]) extends DependencyOperator(operands)

case class WrappedRunGroup(override val runGroup:MRunGroup,
                           override val canRunYieldExpression:String,
                           override val allLinks:Seq[MAbstractLink],
                           override val includeFileMap:Map[MIncludeFile,(MSaturn, String)])
extends WrappedAbstractRunGroup(runGroup,allLinks,includeFileMap) {
  override def getRunGroups:Seq[MAbstractRunGroup] = runGroup.getRunGroups().filter{!_.isProcedure()}
  override def getProcedures:Seq[MAbstractRunGroup] = runGroup.getRunGroups().filter{_.isProcedure()}
  def getSortedRunGroups:Seq[MAbstractRunGroup] = getRunGroups.sortWith((a:MAbstractRunGroup, b:MAbstractRunGroup) => false)

  def getLinks:Seq[MAbstractLink] = allLinks.filter{l =>
    val runGroups = getRunGroups
    runGroups.contains(l.getSource()) || runGroups.contains(l.getTarget())
  }

  override def getRunGroup(name:String):Option[MAbstractRunGroup] = runGroup.getRunGroups().find(_.getName() == name)
  override def getCustomLinks:Seq[MCustomLink] = getLinks.toSeq.collect{case l:MCustomLink => l}
  override def getTerminals:Seq[AbstractTerminal] = getRunGroups.collect{case t:AbstractTerminal => t}
  override def getPassFailTerminals:Seq[AbstractTerminal] = getRunGroups.collect {
    case p:PassTerminal => p
    case f:FailTerminal => f
  }

  def getRunGroupsWithIndex():Seq[JTuple2[MAbstractRunGroup, Int]] = runGroup.getRunGroups().zipWithIndex
                                                                                            .filter{ case (r,i) => !r.isProcedure()}
                                                                                            .map(x => new JTuple2[MAbstractRunGroup, Int](x._1, x._2))
  def getProceduresWithIndex():Seq[JTuple2[MAbstractRunGroup, Int]] = runGroup.getRunGroups().zipWithIndex
                                                                                             .filter{ case (r,i) => r.isProcedure()}
                                                                                             .map(x => new JTuple2[MAbstractRunGroup, Int](x._1, x._2))

}

case class WrappedStep(override val runGroup:MStep,
                       override val canRunYieldExpression:String,
                       override val allLinks:Seq[MAbstractLink],
                       override val includeFileMap:Map[MIncludeFile,(MSaturn, String)]) extends WrappedAbstractRunGroup(runGroup,allLinks,includeFileMap)

abstract class WrappedAbstractRunGroup(protected val runGroup:MAbstractRunGroup,
                                       protected val allLinks:Seq[MAbstractLink],
                                       protected val includeFileMap:Map[MIncludeFile,(MSaturn, String)]) {

  val dependencies = allLinks.filter{_.getTarget() == runGroup}
  val dependencyRunGroups:Seq[MAbstractRunGroup] = dependencies.map{_.getSource()}.distinct

  val hasDependencies = !dependencies.isEmpty()
  lazy val hasAllOnPassDependencies   = false
  lazy val hasAllOnFailDependencies   = false
  lazy val hasAllOnFinishDependencies = false

  val getDependencies:Seq[MAbstractLink] = dependencies
  val getDependencyRunGroups:Seq[MAbstractRunGroup] = dependencyRunGroups

  def getRunGroups:Seq[MAbstractRunGroup]=Nil
  def getProcedures:Seq[MAbstractRunGroup]=Nil
  def getCustomLinks:Seq[MCustomLink]=Nil
  def getTerminals:Seq[AbstractTerminal]=Nil
  def getPassFailTerminals:Seq[AbstractTerminal]=Nil
  def getRunGroup(name:String):Option[MAbstractRunGroup]=None

  def canRunYieldExpression:String

  def getParent = runGroup.eContainer()
  def getParentRunGroup(eObject:Option[EObject]):Option[MRunGroup] = eObject match {
    case Some(rg:MRunGroup) => Some(rg)
    case Some(eObject:EObject)      => getParentRunGroup(Option(eObject.eContainer()))
    case _                          => None
  }

  def getFullName(rgo:Option[MAbstractRunGroup] = Some(runGroup),soFar:List[String]=Nil):String = {
    rgo match {
      case Some(rg) => getFullName(getParentRunGroup(Option(rg.eContainer())), rg.getName()::soFar)
      case None     => soFar.mkString(".")
    }
  }

  def getRunGroupOrThrow(name:String):MAbstractRunGroup = getRunGroup(name) match {
    case Some(r) => r
    case None => throw new Exception(s"RunGroup: ${getRunGroupName} did not contain child runGroup: $name")
  }

  def getParameter(name:String) = runGroup.getParameters().find{_.getName() == name}
  def getParameterOrThrow(name:String) = getParameter(name) match {
    case Some(r) => r
    case None => throw new Exception("RunGroup: " + getRunGroupName + " did not contain parameter: " + name)
  }

  val resultClassNameMap = Map(
                               SaturnPackage.eINSTANCE.getCometStep()              -> "CometWaitResult",
                               SaturnPackage.eINSTANCE.getCpsStep()                -> "CpsResult",
                               SaturnPackage.eINSTANCE.getDataCompareStep()        -> "DsCompareResult",
//                               SaturnPackage.eINSTANCE.getDataCompareSummaryStep() -> "",
//                               SaturnPackage.eINSTANCE.getDocumentumStep()         -> "",
                               SaturnPackage.eINSTANCE.getDSConvertStep()          -> "DsConvertResult",
//                               SaturnPackage.eINSTANCE.getDSValidatorStep()        -> "",
//                               SaturnPackage.eINSTANCE.getEnvValidatorStep()       -> "",
//                               SaturnPackage.eINSTANCE.getExtractDDLStep()         -> "",
                               SaturnPackage.eINSTANCE.getFailTerminal()           -> "TerminalResult",
//                               SaturnPackage.eINSTANCE.getFixManipStep()           -> "",
//                               SaturnPackage.eINSTANCE.getJiraStep()               -> "",
                               SaturnPackage.eINSTANCE.getKronusStep()             -> "KronusResult",
                               SaturnPackage.eINSTANCE.getMailStep()               -> "MailResult",
//                               SaturnPackage.eINSTANCE.getMQStep()                 -> "",
                               SaturnPackage.eINSTANCE.getNoopTerminal()           -> "TerminalResult",
//                               SaturnPackage.eINSTANCE.getP4Step()                 -> "",
                               SaturnPackage.eINSTANCE.getPassTerminal()           -> "TerminalResult",
                               SaturnPackage.eINSTANCE.getProcedureCallStep()      -> "ProcedureCallResult",
//                               SaturnPackage.eINSTANCE.getPsManagerStep()          -> "",
//                               SaturnPackage.eINSTANCE.getReferenceStep()          -> "",
//                               SaturnPackage.eINSTANCE.getRunCmdsStep()            -> "",
                               SaturnPackage.eINSTANCE.getRunGroup()               -> "RunGroupResult",
                               SaturnPackage.eINSTANCE.getSaturn()                 -> "RunGroupResult",
//                               SaturnPackage.eINSTANCE.getSingularityStep()        -> "",
                               SaturnPackage.eINSTANCE.getSoapIOStep()             -> "SoapResult",
//                               SaturnPackage.eINSTANCE.getSQLStep()                -> "",
//                               SaturnPackage.eINSTANCE.getVmsStep()                -> "",
                               SaturnPackage.eINSTANCE.getXml2CsvStep()            -> "Result",
//                               SaturnPackage.eINSTANCE.getXmlDiffStep()            -> "",
                               SaturnPackage.eINSTANCE.getXmlGenStep()             -> "XmlGenResult",
                               SaturnPackage.eINSTANCE.getXmlManipStep()           -> "Result",
//                               SaturnPackage.eINSTANCE.getXmlValidatorStep()       -> "",
                               SaturnPackage.eINSTANCE.getXSplitStep()             -> "") withDefaultValue("Result")

  val runCmdsResultClassNameMap = Map(InterpretersEnum.DML    -> "RunCmdsResult[NullInterpreterResult]",
                                      InterpretersEnum.GROOVY -> "RunCmdsResult[GroovyInterpreterResult]",
                                      InterpretersEnum.PERL   -> "RunCmdsResult[CommandExecutorResult[_]]",
                                      InterpretersEnum.SCALA  -> "RunCmdsResult[CommandExecutorResult[_]]",
                                      InterpretersEnum.SHELL  -> "RunCmdsResult[ShellInterpreterResult]"
                                     )

  val mqActionsResultClassNameMap = Map(MqModulePackage.Literals.MQ_CLEAR_OPERATION  -> "MQClearResult",
                                        MqModulePackage.Literals.MQ_GET_OPERATION    -> "MQGetResult",
                                        MqModulePackage.Literals.MQ_PUT_OPERATION    -> "MQPutResult",
                                        MqModulePackage.Literals.MQ_REPORT_OPERATION -> "MQReportResult",
                                        MqModulePackage.Literals.MQ_WAIT_OPERATION   -> "MQWaitResult")

  val sqlActionsResultClassNameMap = Map(SqlModulePackage.Literals.SQL_CALL_OPERATION    -> "SQLCallResult",
                                         SqlModulePackage.Literals.SQL_CLEAR_OPERATION   -> "SQLClearResult",
                                         SqlModulePackage.Literals.SQL_EXECUTE_OPERATION -> "SQLExecuteResult",
                                         SqlModulePackage.Literals.SQL_FETCH_OPERATION   -> "SQLFetchResult",
                                         SqlModulePackage.Literals.SQL_LOAD_OPERATION    -> "SQLLoadResult")

  def getClassName:String = runGroup.getName
  def getIterationClassName():String = getClassName + "_iteration"
  def getAppClassName():String = runGroup.getName() + "App"
  def getSpecsClassName():String = runGroup.getName() + "Specs"
  def getJUnitReportClassName: String = runGroup.getName + "JUnitReport"
  def getResultClassName():String = {
    if(runGroup.isEnabled())
      runGroup match {
        case runCmds:RunCmdsStep => Option(runCmds.getRunCmdsConfiguration()) match {
          case Some(cfg) => runCmdsResultClassNameMap(cfg.getInterpreter())
          case None      => throw new Exception("")
        }
        case mq:MQStep => Option(mq.getMQConfiguration().getOperation()) match {
          case Some(op) => mqActionsResultClassNameMap(op.eClass())
          case None => throw new Exception("Unable to get operation for MQ step.")
        }
        case sql:SQLStep => Option(sql.getSQLConfiguration().getOperation()) match {
          case Some(op) => sqlActionsResultClassNameMap(op.eClass())
          case None => throw new Exception("Unable to get operation for SQL step.")
        }
        case mail:MailStep => resultClassNameMap(mail.eClass())
        case comet:CometStep => resultClassNameMap(comet.eClass())
        case xml2csv:Xml2CsvStep => resultClassNameMap(xml2csv.eClass())
        case _           => resultClassNameMap(runGroup.eClass())
      }
    else
      "TerminalResult"
  }

  def getNotifierBaseClassName(): String = {
    if(runGroup.isEnabled())
      runGroup match {
        case runCmds:RunCmdsStep => Option(runCmds.getRunCmdsConfiguration()) match {
          case Some(cfg) => "RunCmds" + cfg.getInterpreter.getName.toLowerCase.capitalize
          case None      => throw new Exception("Can't generate the base class name for an RunCmds step.")
        }
        case mq: MQStep => {
          val notifierName = for {
            configuration <- Option(mq.getMQConfiguration)
            operation <- Option(configuration.getOperation)
          } yield operation.eClass().getName()
          notifierName.getOrElse(throw new Exception("Can't generate the base class name for an MQ step."))
        }
        case sql: SQLStep => {
          val notifierName = for {
            conf <- Option(sql.getSQLConfiguration)
            operation <- Option(conf.getOperation)
          } yield operation.eClass().getName()
          notifierName.getOrElse(throw new Exception("Can't generate the base class name for an SQL step."))
        }
        case _ => runGroup.eClass().getName
      }
    else
      "NoopTerminal"
  }

  def getCmdLineClassName():String = getRunGroupName(runGroup) + "CmdLine"
  def getRunGroupName:String = getRunGroupName(runGroup)
  def getRunGroupName(r:MAbstractRunGroup):String = r.getName()
  def getRunGroupResultName(r:MAbstractRunGroup):String = getRunGroupName(r) + "Result"
  def getLinkSatisfied(l:MAbstractLink) = CanRunExpressionGenerator.getLinkSatisfied(l)

  def getWebAnnotations:JList[SaturnWebConfiguration] = runGroup.eAllContents().collect{case sw:SaturnWebConfiguration => sw}.toList

  def getWebAnnotationValues = getWebAnnotations.flatMap{_.getValues()}
  def getWebAnnotationEnvVars:JList[String] = getWebAnnotationValues.flatMap{v => (v.getSource(),v.getTarget()) match {
    case (_,null) => throw new Exception()
    case (null,_) => throw new Exception()
    case (_,t:SingleValueEnvVarTargetDefinition) => Some("(\"" + t.getEnvVar() + "\", " + t.getEnvVar() + ")")
    case _ => None
  }}
  def getJUnitAnnotations: Iterator[SaturnReportConfiguration] = runGroup.getAnnotations.iterator.collect {
    case a: SaturnReportConfiguration if a.isIsScenario => a
  }

  val dependencyExtractor = DependencyExtractor(runGroup)
  def getPreIterationObjects:JList[EObject] = dependencyExtractor.preRepetitionDependencies
  def getPreIterationObjectsWithRepetitionHandler:JList[EObject] = Option(runGroup.getRepetitionHandler()) match {
    case Some(repetitionHandler) => dependencyExtractor.preRepetitionDependencies :+ repetitionHandler
    case None                    => dependencyExtractor.preRepetitionDependencies
  }
  def getPostIterationObjects:JList[EObject] = dependencyExtractor.postRepetitionDependencies

  lazy val typeInferencer = ParameterTypeInferencer(runGroup,includeFileMap)
}
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
