package com.ms.qaTools.interpreter
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.toolkit.{Status, Passed, Failed}
import scala.util.{Try, Success, Failure}

//case class SqlInterpreterResult(override val status: Status, command: sql.Command, resultObj: Option[Any] = None, override val exception: Option[Throwable] = None)
case class SqlInterpreterResult(override val status: Status, command: String, resultObj: Option[Any] = None, override val exception: Option[Throwable] = None)
extends InterpreterResult
/*
object sql {
  sealed trait Command
  case class Clear(table: String) extends Command
  case class Execute(stmt: String, parameters: Iterator[Seq[String]]) extends Command
  case class Call(proc: String, parameters: Iterator[Seq[String]]) extends Command
}
*/

//case class SqlInterpreter(database: DatabaseConnection) extends Interpreter[sql.Command, SqlInterpreterResult] {
case class SqlInterpreter(database: DatabaseConnection) extends Interpreter[String, SqlInterpreterResult] {
//  import sql._
//  def run(command: Command) = Try(command match {
  def run(command: String) = Try(command match {
//    case Clear(table)              => database.clear(table)
//    case Execute(stmt, parameters) => database.execute(stmt, parameters)
//    case Call(proc, parameters)    => database.call(proc, parameters)
    case stmt                      => database.execute(stmt)
  }) match {
    case Success(r) => SqlInterpreterResult(Passed(), command, Option(r))
    case Failure(t) => SqlInterpreterResult(Failed(), command, exception = Option(t))
  }
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
