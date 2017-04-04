package com.ms.qaTools.saturn.lint

import scala.util.Try

import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.codeGen.SaturnCodeGenUtil
import com.ms.qaTools.saturn.lint.validators.DeprecatedValidator
import com.ms.qaTools.saturn.lint.validators.LintValidator
import com.ms.qaTools.saturn.lint.validators.NameValidator
import com.ms.qaTools.saturn.lint.validators.ProcedureCallValidator
import com.ms.qaTools.saturn.lint.validators.ReferenceValidator
import com.ms.qaTools.saturn.lint.validators.RepetitionValidator
import com.ms.qaTools.saturn.lint.validators.SaturnValidator
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Runnable



/*
 * *** ERROR ***
 * Object names must be unique within a given scope
 * Object names must be well formed
 *  Attributes, Resources, RunGroups, ColumnMappings, ForIterators, ProcedureParameters
 *  
 * Deprecated features and deprecated classes
 * 
 * Device resources may only be used in the following places:
 *  AbstractRunGroup Resources
 *  Procedure Call Parameters
 *  Procedure Parameter default values
 *  DataSetResource deviceResource
 *  SQLModule
 *  MQModule
 *  CPSModule
 *  SoapIOModule
 * 
 * Procedures
 *   Non-mandatory arguments must have a default value
 * 
 * ProcedureCall
 *  The runGroup parameter of a procedure call, although a complexValue, must be non-empty and must contain only text elements
 *  Arguments must match the called procedure's parameters
 *  
 * Module specific resource type checking
 * 
 * Steps with no configuration objects should warn and be converted to NOOPS
 * 
 * Optimizations
 *   Non-reference resource duplication of resources should be referenced. 
 */

// SAT-{OBJECT}-{CATEGORY}-{NUMBER}

object SaturnLintDefaults {
  def defaultValidators = Seq(NameValidator,
                              DeprecatedValidator,
                              RepetitionValidator,
                              SaturnValidator,
                              ReferenceValidator,
                              ProcedureCallValidator)
}

class SaturnLintRunner(val saturn: MSaturn, val validators: Seq[LintValidator]) extends Runnable[SaturnLintResult] {
  override def run: Try[SaturnLintResult] = Try {
    val validationResults = validators.flatMap{validator => validator.validate(saturn)}
    val status = if(validationResults.exists{r => r.isError}) Failed() else Passed()
    SaturnLintResult(status, validationResults)
  }
}

object SaturnLintRunner {
  def apply(saturnCodeGenUtil: SaturnCodeGenUtil, validators: Seq[LintValidator]): SaturnLintRunner =
    apply(saturnCodeGenUtil.saturn, validators)

  def apply(saturnCodeGenUtil: SaturnCodeGenUtil): SaturnLintRunner =
    apply(saturnCodeGenUtil, SaturnLintDefaults.defaultValidators)

  def apply(saturn: MSaturn, validators: Seq[LintValidator]): SaturnLintRunner =
    new SaturnLintRunner(saturn, validators)

  def apply(saturn: MSaturn): SaturnLintRunner = apply(saturn, SaturnLintDefaults.defaultValidators)
}