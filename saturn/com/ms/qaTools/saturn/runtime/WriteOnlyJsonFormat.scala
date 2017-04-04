package com.ms.qaTools.saturn.runtime

import spray.json.{JsonFormat, JsonWriter}
import spray.json.JsValue

abstract class WriteOnlyJsonFormat[A] extends JsonFormat[A] {
  def read(json: JsValue) = throw new UnsupportedOperationException
}

object WriteOnlyJsonFormat {
  def apply[A](writer: JsonWriter[A]) = new WriteOnlyJsonFormat[A] {
    def write(obj: A) = writer.write(obj)
  }
}
