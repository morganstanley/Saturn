package com.ms.qaTools.exceptions
import com.ms.qaTools.ThrowableUtil

class QAToolsException(reason: String, cause: Throwable) extends Exception(reason, cause) {
  def this(reason: String) = this(reason, null)
  def this(cause: Throwable) = this("", cause)
}

case class CodeComplexValueException() extends QAToolsException("Code nodes aren't supported.")
case class UnknownCPSProtocolException(protocol: String) extends QAToolsException("Protocol '" + protocol + "' isn't supported.")
case class ExhaustedResourceException() extends QAToolsException("Calling next on a resource that is exhausted.")

case class JdbcException(reason: String, cause: Throwable = null) extends QAToolsException(reason, cause)

class AggregateException(val message: String, val exceptions: Seq[Throwable], val cause: Throwable = null)
extends Throwable(message, cause) {
  override def getMessage: String = s"\n$message\n${exceptions map (_.getCauseStackString) mkString("\n")}"

  // If we only override printStackTrace, when the exception gets printed as cause, it will use non-overridable method(s)
  // and omit all the children.
  override def toString = {
    val buf = new java.io.StringWriter
    val w = new java.io.PrintWriter(buf)
    w.println(super.toString)
    w.println()
    exceptions.foreach { e =>
      w.print("Child exception: ")
      e.printStackTrace(w)
    }
    buf.toString
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
