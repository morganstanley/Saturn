package com.ms.qaTools.toolkit.cmdLine

import java.io.Closeable
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

import org.kohsuke.args4j.{Option => A4JOption}

import com.ms.qaTools.Injector
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.toolkit.DbConnectionFactory

trait InputDatabase {
  @A4JOption(name = "--inDBServer", usage = "Database server")
  val inDBServer: String = null

  @A4JOption(name = "--inDBQualifier", usage = "Database qualifier")
  val inDBQualifier: String = null

  @A4JOption(name = "--inDBLogin", usage = "Database login")
  val inDBLogin: String = null

  @A4JOption(name = "--inDBPassword", usage = "Database password")
  val inDBPassword: String = null

  @A4JOption(name = "--inDBQuery", usage = "Database query executed to get input data set")
  val inDBQuery: String = null

  def inDatabaseRowSource(inFmt: String): Iterator[Seq[String]] with ColumnDefinitions with Closeable = {
    import com.ms.qaTools.io.rowSource.Utils._
    Option(inDBServer).getOrElse(throw new Exception("The database server is not specified"))
    Option(inDBQualifier).getOrElse(throw new Exception("The database qualifier is not specified"))
    val conn = Injector.getInstance[DbConnectionFactory].create(inFmt, inDBServer, inDBQualifier, inDBLogin, inDBPassword)
    val rows = conn.fetch(inDBQuery).toSeqStringIterator
    val handler = new InvocationHandler {
      def invoke(proxy: AnyRef, method: Method, args: Array[AnyRef]) = {
        val ret = method.invoke(rows, args: _*)
        if (method.getName == "close" && args == null) conn.close()
        ret
      }
    }
    trait I extends Iterator[Seq[String]] with ColumnDefinitions with Closeable
    java.lang.reflect.Proxy.newProxyInstance(classOf[I].getClassLoader, Array(classOf[I]), handler).asInstanceOf[I]
  }
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
