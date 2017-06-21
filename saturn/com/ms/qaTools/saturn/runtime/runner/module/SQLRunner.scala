package com.ms.qaTools.saturn.runtime.runner.module

import scala.language.reflectiveCalls
import scala.util.Try

import com.ms.qaTools.io.DeviceIO
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.io.Input
import com.ms.qaTools.io.Output
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.io.rowSource.jdbc.ProcedureCallSupport
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.saturn.codeGen.Utils.connectTry
import com.ms.qaTools.toolkit.SQLCall
import com.ms.qaTools.toolkit.SQLClear
import com.ms.qaTools.toolkit.SQLExecute
import com.ms.qaTools.toolkit.SQLFetch
import com.ms.qaTools.toolkit.SQLLoad

object SQLCallRunner {
  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection with ProcedureCallSupport],
            sqlExprsTry: Seq[Try[String]],
            outputs: Seq[Try[String => Try[Writer[Iterator[Seq[String]]]]]],
            parameterIOsTry: Seq[Option[Try[Input[Iterator[Seq[String]]]]]]): Try[SQLCall] =
    SQLCall(dbResourceTry,
      sqlExprsTry,
      outputs,
      parameterIOsTry.zipWithIndex.map {
        case (option, i) =>
          option.map(_.flatMap(input => connectTry(context, input.input, s"ParameterFile_$i", false)))
      }).rethrow("An exception occurred while running SQLCall.")
}

object SQLClearRunner {
  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection],
            tables: Seq[Try[String]]): Try[SQLClear] = SQLClear(dbResourceTry, tables).rethrow("An exception occurred while running SQLClear.")
}

object SQLExecuteRunner {
  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection],
            sqlExprsTry: Seq[Try[String]],
            parameterIOsTry: Seq[Option[Try[Input[Iterator[Seq[String]]]]]]): Try[SQLExecute] =
    SQLExecute(dbResourceTry,
      sqlExprsTry,
      parameterIOsTry.zipWithIndex.map {
        case (option, i) =>
                   option.map(_.flatMap(input => connectTry(context, input.input, s"ParameterFile_$i", false)))
      }).rethrow("An exception occurred while running SQLExecute.")
}

object SQLFetchRunner {
  type DeviceContainer = {
    def device: DeviceIO
  }

  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection],
            sqlExprsTry: Seq[Try[String]],
            outputsTry: Seq[Try[Output[Writer[Iterator[Seq[String]]]]]],
            parametersTry: Seq[Option[Try[Input[Iterator[Seq[String]] with ColumnDefinitions]]]]): Try[SQLFetch] = {

    val parameters = (parametersTry.zip(outputsTry)).zipWithIndex.map {
      case ((option, output), i) => option.map { opt =>
        (opt.flatMap(input => connectTry(context, input.input, s"ParameterFile_$i", false)),
          output.map(_.asInstanceOf[DeviceContainer].device.asInstanceOf[FileIO].fileName))
      }
    }
    SQLFetch(dbResourceTry,
      sqlExprsTry,
      outputsTry.zipWithIndex.map {
        case (outTry, i) =>
                 outTry.flatMap(output => connectTry(context, output.output, s"Output_$i", false))
      },
      parameters)
  }.rethrow("An exception occurred while running SQLFetch.")
}

object SQLLoadRunner {
  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection],
            tablesTry: Seq[Try[(String, Input[Iterator[Seq[String]] with ColumnDefinitions], Boolean)]]): Try[SQLLoad] = { for {
    dbResource <- dbResourceTry.rethrow("An exception occurred while connection database resource.")
    tables <- tablesTry.toTrySeq.rethrow("An exception occurred while generating table strings.")
    inputs <- tables.zipWithIndex.map {
      case ((name, input, cleanLoad), i) => connectTry(context, input.input, s"Input_$i", false).map(SQLLoad.Input(name, _, cleanLoad)).rethrow("An exception occurred while connecting input resources.")
    }.toTrySeq
  } yield {
    SQLLoad(dbResource, inputs)
  }}.rethrow("An exception occurred while running SQLLoad.")
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
