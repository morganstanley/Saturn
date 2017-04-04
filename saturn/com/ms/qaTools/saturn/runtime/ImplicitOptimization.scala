package com.ms.qaTools.saturn.runtime

import scala.util.Try

import com.ms.qaTools._

// Function versions of implicit class methods to improve compilation performance
object ImplicitOptimization {
  def rethrow[A](x: Try[A], msg: String) = x.rethrow(msg)
  def toTrySeq[A](ts: Seq[Try[A]]) = ts.toTrySeq
}
