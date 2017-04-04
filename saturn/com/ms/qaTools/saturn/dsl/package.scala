package com.ms.qaTools.saturn
import com.ms.qaTools.saturn.modules.runcmdsModule.{ Command => MRunCmdsCommand }
import com.ms.qaTools.saturn.values.{ ComplexValue => MComplexValue }
import com.ms.qaTools.saturn.{ Attribute => MAttribute }
import com.ms.qaTools.saturn.resources.fileResource.{ CSVFile => MCSVFile }

package object dsl {
  implicit def tuple2ToAttribute(t: (String, MComplexValue)): MAttribute = ???
  implicit def stringToRunCmdsCommand(c: String): MRunCmdsCommand = ???
  implicit def stringToCsvResource(c: String): MCSVFile = ???

  class JTuple2[A, B](_1: A, _2: B) {
    def get_1() = _1
    def get_2() = _2
  }

  implicit def queryResourceToResultSetRowSource(q: QueryResource) = q.sqlRowSource
}