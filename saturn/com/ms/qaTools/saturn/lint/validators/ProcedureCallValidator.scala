package com.ms.qaTools.saturn.lint.validators

import scala.Option.option2Iterable
import scala.annotation.tailrec
import scala.collection.JavaConversions.asScalaBuffer
import scala.language.postfixOps

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.{ AbstractRunGroup => MAbstractRunGroup }
import com.ms.qaTools.saturn.{ AttributeParameter => MAttributeParameter }
import com.ms.qaTools.saturn.{ ProcedureCallStep => MProcedureCallStep }
import com.ms.qaTools.saturn.{ ResourceParameter => MResourceParameter }
import com.ms.qaTools.saturn.lint.ResultError
import com.ms.qaTools.saturn.lint.ResultOK
import com.ms.qaTools.saturn.lint.SaturnLintRuleResult
import com.ms.qaTools.saturn.modules.procedureCallModule.{ AttributeArgument => MAttributeArgument }
import com.ms.qaTools.saturn.modules.procedureCallModule.{ ResourceArgument => MResourceArgument }
import com.ms.qaTools.saturn.resources.referenceResource.{ ReferenceResource => MReferenceResource }
import com.ms.qaTools.saturn.types.{ ResourceDefinition => MResourceDefinition }
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper
import com.ms.qaTools.saturn.values.{ TextComplexValue => MTextComplexValue }

object ProcedureCallValidator extends LintValidator {
  val rule = "SAT-PROC-CALLS-000"
  val description = "Procedure call validation."
  def validate(eObject: EObject): Seq[SaturnLintRuleResult] =
    Seq(ProcedureCallNullConfigValidator,
      ProcedureCallReferentNameValidator,
      ProcedureCallReferentExistsValidator,
      ProcedureCallReferentParametersValidator,
      ProcedureOptionalParameterValidator) flatMap (_.validate(eObject))
}

object ProcedureCallNullConfigValidator extends LintValidator {
  val rule = "SAT-PROC-CALLS-001"
  val description = "Procedure call configuration is not defined properly."

  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = {
    val failures = for {
      procCall <- eObject.eAllContentsByType[MProcedureCallStep]().toSeq
      result <- if (!Option(procCall.getProcedureCallConfiguration()).isDefined)
        Seq(ResultError(rule, s"Procedure call configuration for '${procCall.getName}' is not defined.", Seq(procCall)))
      else
        Seq()
    } yield result
    if (failures.isEmpty)
      Seq(ResultOK(rule, "Procedure calls must have non null configurations."))
    else
      failures
  }

}

object ProcedureCallReferentNameValidator extends LintValidator {
  val rule: String = "SAT-PROC-CALLS-002"
  val description = "Procedure call referent names are invalid."

  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = {
    val procCalls = eObject.eAllContentsByType[MProcedureCallStep]().toSeq
    val failures = invalidProcNames(procCalls) ++ complexValueNames(procCalls)
    if (failures.isEmpty)
      Seq(ResultOK(rule, "Procedure calls must have valid text names.'^[A-Za-z0-9_]*\\.?[A-Za-z0-9_]+$'"))
    else
      failures
  }

  def invalidProcNames(procs: Seq[MProcedureCallStep]): Seq[SaturnLintRuleResult] =
    for {
      procCall <- procs
      config <- Option(procCall.getProcedureCallConfiguration())
      refNameCv <- Option(config.getRunGroup())
      name <- if (refNameCv.getMixed().forall(_.getValue().isInstanceOf[MTextComplexValue]))
        Option(refNameCv.getText().map(_.getText()).mkString)
      else
        None
      result <- if (!name.matches("""^[A-Za-z0-9_]*\.?[A-Za-z0-9_]+$"""))
        Option(ResultError(rule, s"Procedure call '${procCall.getName}' referent name does not match '^[A-Za-z0-9_]*\\.?[A-Za-z0-9_]+$$'.", Seq(procCall)))
      else
        None
    } yield result

  def complexValueNames(procs: Seq[MProcedureCallStep]): Seq[SaturnLintRuleResult] =
    for {
      procCall <- procs
      config <- Option(procCall.getProcedureCallConfiguration())
      referentName <- Option(config.getRunGroup())
      result <- if (!referentName.getMixed().forall(_.getValue().isInstanceOf[MTextComplexValue]))
        Option(ResultError(rule, s"Procedure call '${procCall.getName}' referent name is not text.", Seq(procCall)))
      else
        None
    } yield result

}

object ProcedureCallReferentExistsValidator extends LintValidator {
  val rule = "SAT-PROC-CALLS-003"
  val description = "Procedure call referent not found."

  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = {
    val failures = for {
      procCall <- eObject.eAllContentsByType[MProcedureCallStep]().toSeq
      config <- Option(procCall.getProcedureCallConfiguration())
      refNameCv <- Option(config.getRunGroup())
      refName <- if (refNameCv.getMixed().forall(_.getValue().isInstanceOf[MTextComplexValue]))
        Option(refNameCv.getText().map(_.getText()).mkString)
      else
        None
      result <- {
        val proc = eObject.eAllContentsByType[MAbstractRunGroup].find(p => p.isProcedure() && p.getName == refName)
        if (refName.matches("""[A-Za-z0-9_]+$"""))
          if (!proc.isDefined)
            Option(ResultError(rule, s"Procedure '${refName}' not found in proc call '${procCall.getName}'.", Seq(procCall)))
          else
            None
        //TODO check include files to see if procs exist
        else if (refName.matches("""^[A-Za-z0-9_]+\.[A-Za-z0-9_]+$"""))
          Option(ResultOK(rule, s"Procedure '${refName}' found in proc call '${procCall.getName}'."))
        else
          None
      }
    } yield result
    if (failures.isEmpty)
      Seq(ResultOK(rule, "Procedure call referents must exist."))
    else
      failures
  }

}

object ProcedureCallReferentParametersValidator extends LintValidator {
  val rule = "SAT-PROC-CALLS-004"
  val description = "Procedure call referent parameters are invalid."

  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = {
    val failures = for {
      procCall <- eObject.eAllContentsByType[MProcedureCallStep]().toSeq
      config <- Option(procCall.getProcedureCallConfiguration()).toSeq
      refNameCv <- Option(config.getRunGroup()).toSeq
      refName <- if (refNameCv.getMixed().forall(_.getValue().isInstanceOf[MTextComplexValue]))
        Option(refNameCv.getText().map(_.getText()).mkString).toSeq
      else
        None.toSeq
      //TODO check include files for the proc also
      proc <- eObject.eAllContentsByType[MAbstractRunGroup].find(p => p.isProcedure && p.getName == refName).toSeq
      result <- {
        val procArgs = proc.getParameters()
        val procCallArgs = config.getArguments()

        val missingParams = procArgs.filter(_.isIsMandatory()) map (a => (a.getName(), procCallArgs.exists(_.getName() == a.getName()))) filter (!_._2)
        val extraParams = procCallArgs map (a => (a.getName(), procArgs.exists(_.getName() == a.getName()))) filter (!_._2)
        val wrongTypes = procCallArgs filter (a => procArgs.exists(_.getName() == a.getName)) map { a =>
          (a.getName, procArgs find (_.getName() == a.getName()) exists { p =>
            p match {
              case aParam: MAttributeParameter => a.isInstanceOf[MAttributeArgument]
              case rParam: MResourceParameter => a match {
                case rArg: MResourceArgument =>
                  val assignable = for {
                    p <- resourceClass(rParam.getDefaultResource)
                    a <- resourceClass(rArg.getResource)
                  } yield p.isAssignableFrom(a)
                  assignable.getOrElse(true)
                case _ => false
              }
            }
          }
          )
        } filter (!_._2)
        (missingParams map (p => ResultError(rule, s"Procedure call '${procCall.getName}' does not have mandatory parameter '${p._1}'.", Seq(procCall)))) ++
          (extraParams map (p => ResultError(rule, s"Procedure call '${procCall.getName}' has extra parameter '${p._1}'.", Seq(procCall)))) ++
          (wrongTypes map (p => ResultError(rule, s"Procedure call '${procCall.getName}' parameter '${p._1}' is the wrong type.", Seq(procCall))))
      }
    } yield result
    if (failures.isEmpty)
      Seq(ResultOK(rule, "Procedures must have valid parameters."))
    else
      failures
  }

  def resourceClass(x: MResourceDefinition, chain: Seq[String] = Nil): Option[Class[_]] = x match {
    case null                    => None
    case ref: MReferenceResource => {
      require(! chain.contains(ref.getResource), "Default resource value references itself: " + (ref.getResource +: chain).mkString("[", " -> ", "]"))
      referencedType(ref, chain :+ ref.getResource)}
    case _                       => Some(x.getClass)
  }

  protected def referencedType(ref: MReferenceResource, chain: Seq[String]): Option[Class[_]] =
    if (Option(ref.getIncludeFile).map(_.nonEmpty).getOrElse(false)) None
    else ref.containingRunGroup.flatMap(referencedType(ref.getResource, _, chain))

  @tailrec protected def referencedType(name: String, rg: MAbstractRunGroup, chain: Seq[String]): Option[Class[_]] = {
    import scala.language.postfixOps
    val rDef = rg.getResources collectFirst { case r if r.getName == name => resourceClass(r, chain) } flatten
    lazy val rParam = if (rg.isProcedure)
      rg.getParameters collectFirst {
        case r: MResourceParameter if r.getName == name => resourceClass(r.getDefaultResource, chain)
      } flatten
    else
      None
    rDef orElse rParam match {
      case None => rg.containingRunGroups.toSeq.tail.headOption match {
        case Some(parent) => referencedType(name, parent, Nil)
        case None         => None
      }
      case t => t
    }
  }
}

object ProcedureOptionalParameterValidator extends LintValidator {
  val rule: String = "SAT-PROC-CALLS-005"
  val description = "Procedure call default values for optional parameters are invalid."

  def validate(eObject: EObject): Seq[SaturnLintRuleResult] = {
    val failures = for {
      proc <- eObject.eAllContentsByType[MAbstractRunGroup].toSeq.filter(_.isProcedure())
      parameter <- proc.getParameters().filter(!_.isIsMandatory())
      result <- {
        parameter match {
          case _: MAttributeParameter => None
          case r: MResourceParameter => if (!Option(r.getDefaultResource()).isDefined)
            Option(ResultError(rule, s"Procedure '${proc.getName}' optional parameter '${parameter.getName}' default value not specified.", Seq(proc)))
          else
            None
          case _ => throw new Exception(s"Parameter type ${parameter.getClass} is invalid.")
        }
      }
    } yield result
    if (failures.isEmpty)
      Seq(ResultOK(rule, "Procedures must have default values for optional parameters."))
    else
      failures
  }

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
