package com.ms.qaTools.saturn.runtime

import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.Logger
import org.eclipse.emf.ecore.EObject

trait Notifier[IterationResultType <: Result,
               IteratorResultType <: RunGroupIteratorResult,
               IteratorType <: RunGroupIterator[IteratorResultType]] {
  def notifyBeforeIterator(iter:IteratorType)
  def notifyAfterIterator(iter:IteratorType, result:IteratorResultType)

  def notifyBeforeIteration(iter:IteratorType, iterationNo: Int)
  def notifyAfterIteration(iter:IteratorType, result: RunGroupIterationResult[IterationResultType], iterationNo: Int)
}

case class LoggerNotifier[IterationResultType <: Result,
                          IteratorResultType <: RunGroupIteratorResult,
                          IteratorType <: RunGroupIterator[IteratorResultType]](implicit logger:Logger)
extends Notifier[IterationResultType, IteratorResultType, IteratorType] {
  def notifyBeforeIterator(iter:IteratorType)                           = {logger.info("Starting: " + iter.fullName)}
  def notifyAfterIterator(iter:IteratorType, result:IteratorResultType) = {logger.info("Ending: " + iter.fullName)}

  def notifyBeforeIteration(iter:IteratorType, iterationNo: Int)                                                      = {logger.info("Starting %s[%d]: ".format(iter.fullName, iterationNo))}
  def notifyAfterIteration(iter:IteratorType, result: RunGroupIterationResult[IterationResultType], iterationNo: Int) = {logger.info("Ending %s[%d]: ".format(iter.fullName, iterationNo))}
}

abstract class EObjectNotifier[IterationResultType <: Result,
                               IteratorResultType <: RunGroupIteratorResult,
                               IteratorType <: RunGroupIterator[IteratorResultType]](eObject:EObject)
extends Notifier[IterationResultType, IteratorResultType, IteratorType]

case class EObjectXMLNotifier[IterationResultType <: Result,
                              IteratorResultType <: RunGroupIteratorResult,
                              IteratorType <: RunGroupIterator[IteratorResultType]](eObject:EObject)
extends EObjectNotifier[IterationResultType,IteratorResultType, IteratorType](eObject) {
  
  def notifyBeforeIterator(iter:IteratorType)                            = println("Starting: " + iter.fullName)
  def notifyAfterIterator(iter:IteratorType, result: IteratorResultType) = println("Ending: " + iter.fullName)
  def notifyBeforeIteration(iter:IteratorType, iterationNo: Int)                            = println("Starting %s[%s]".format(iter.fullName, iterationNo))
  def notifyAfterIteration(iter:IteratorType, result: RunGroupIterationResult[IterationResultType], iterationNo: Int) = println("Ending %s[%s]".format(iter.fullName, iterationNo))
}