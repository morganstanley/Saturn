package com.ms.qaTools.saturn.codeGen.notifier

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.IteratorResult
import com.ms.qaTools.saturn.codeGen.PreIteratorResult
import com.ms.qaTools.saturn.codeGen.PreIterationResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext

trait Notifier[ResultType] {
  val runGroupType: String = "DefaultRunGroupType"
  def notifyBeforeIterator(name: String, result: PreIteratorResult[ResultType])(implicit sc: SaturnExecutionContext)
  def notifyAfterIterator(name: String, result:IteratorResult[ResultType])(implicit sc: SaturnExecutionContext)

  def notifyBeforeIteration(name: String, result: PreIterationResult[ResultType])(implicit sc: SaturnExecutionContext)
  def notifyAfterIteration(name: String, result: IterationResult[ResultType])(implicit sc: SaturnExecutionContext)
  
  def notifyException(name: String, t: Throwable)(implicit sc: SaturnExecutionContext)
}