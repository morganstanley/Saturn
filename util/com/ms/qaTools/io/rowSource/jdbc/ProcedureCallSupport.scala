package com.ms.qaTools.io.rowSource.jdbc
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.jdbc.SQLTypeParameter
import java.io.Closeable
import java.sql.ParameterMetaData
import java.sql.PreparedStatement
import java.sql.ResultSet
import scala.annotation.tailrec
import scala.collection.AbstractIterator

trait ProcedureCallSupport {self: DatabaseConnection =>
  trait OutputParameters {
    def outputParameters: Seq[Any]
    def outputParametersAsDelimitedRowIterator: Iterator[Seq[String]]
  }

  protected def cardinality(procedure: String): Int
  
  protected def generateProcCall(procName: String): String =
    "{CALL " + procName + (1 to cardinality(procName)).map(_ => "?").mkString("(", ",", ")") + "}"

  protected def isProc(sql: String) = {
    val sqlUpper = sql.toUpperCase().trim()
    sqlUpper.startsWith("EXEC") || sqlUpper.startsWith("CALL")
  } 

  protected def parameterDefinitions(statement: PreparedStatement) = {
    val meta = statement.getParameterMetaData
    for (i <- 1 to meta.getParameterCount) yield (meta.getParameterMode(i), meta.getParameterType(i))
  }  

  def call(query: String, parameters: Iterator[Seq[String]] = Iterator.single(Seq())): Iterator[Iterator[ResultSetRowSource] with OutputParameters] with Closeable = {
    val dbConnection = getConnection
    new AbstractIterator[Iterator[ResultSetRowSource] with OutputParameters] with Closeable {
      val sql = if (isProc(query)) query else generateProcCall(query)
      private def isOut(pmode: Int) = pmode == ParameterMetaData.parameterModeInOut || pmode == ParameterMetaData.parameterModeOut
      def close = dbConnection.close
      def hasNext = parameters.hasNext
      def next = {
        val statement = dbConnection.prepareCall(sql)
        val row = parameters.next
        val definitions = parameterDefinitions(statement)
        for (i <- 0 until definitions.size) {
          val (pmode, ptype) = definitions(i)
          if (isOut(pmode))
            statement.registerOutParameter(i + 1, ptype)
          Option(if (i < row.size) row(i) else null) match {
            case None    => statement.setNull(i + 1, ptype)
            case Some(c) => SQLTypeParameter(ptype).set(i + 1, c, statement)
          }
        }
        statement.execute()
        new AbstractIterator[ResultSetRowSource] with OutputParameters {
          var cached: Option[ResultSet] = Option(statement.getResultSet()) // Can't wrap this on Iterator.continually ...
          var exhausted: Boolean = false

          @tailrec protected def nextResult(): Option[ResultSet] =
            if (exhausted) None
            else if (statement.getMoreResults()) Option(statement.getResultSet()).ensuring(_.nonEmpty)
            else if (statement.getUpdateCount() == -1) {exhausted = true; None}
            else nextResult()

          def hasNext = cached.nonEmpty || {
            cached = nextResult()
            cached.nonEmpty
          }

          def next = {
            val r = cached
            cached = None
            ResultSetRowSource(r.getOrElse(throw new Error("No resultset to return.")))
          }

          def outputParameters = definitions.zipWithIndex.collect{
            case ((pmode, ptype), i) if isOut(pmode) => SQLTypeParameter(ptype).get(i + 1, statement).orNull}

          def outputParametersAsDelimitedRowIterator: Iterator[Seq[String]] =
            Iterator.single(outputParameters.map{_.toString})
        }
      }
    }
  }
}

trait NoProcedureCallSupport extends ProcedureCallSupport {this: DatabaseConnection =>
  def cardinality(procedure: String): Int = ???
  override def call(query: String, parameters: Iterator[Seq[String]] = Iterator.single(Nil)) =
    throw new Exception("Procedure call not supported.")
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
