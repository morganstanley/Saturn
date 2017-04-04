package com.ms.qaTools.saturn.kronus.runtime

import scala.util.Try

case class KronusFailure(results: Seq[Try[Any]],
                         message: Option[String],
                         cause: Option[Throwable]) extends Throwable(message.orNull, cause.orNull)

case class Rethrow(message: String, cause: Throwable) extends Throwable(message, cause)
