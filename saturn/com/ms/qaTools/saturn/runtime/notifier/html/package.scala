package com.ms.qaTools.saturn.runtime.notifier

import org.jsoup.nodes.Element
import com.ms.qaTools.saturn.runtime.DEBUG
import com.ms.qaTools.saturn.runtime.VerbosityLevel
import com.ms.qaTools.saturn.runtime.NORMAL
import org.apache.commons.lang.StringEscapeUtils
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.exceptions.AggregateException
import org.apache.commons.lang.exception.ExceptionUtils

trait HTMLColorizedString {
  val s: String
  def redHtml = "<font color=\"red\">%s</font>".format(s)
  def greenHtml = "<font color=\"green\">%s</font>".format(s)
  def yellowHtml = "<font color=\"yellow\">%s</font>".format(s)
  def blueHtml = "<font color=\"blue\">%s</font>".format(s)
  def boldHtml = "<b>%s</b>".format(s)
}

package object html {

  def htmlSpaces(i: Int, space: String = "&nbsp;&nbsp;") = Array.fill(i)(space).mkString
  def string2Html(s: String) = StringEscapeUtils.escapeHtml(s).replaceAll("\n", "<br/>").replaceAll(" ", "&nbsp;")
  implicit def stringToHtmlColorizedString(str: String) = new HTMLColorizedString { override val s: String = str }
  def appendException(parentElement: Element, exception: Throwable, indent: Int = 0)(implicit outputVerbosity: VerbosityLevel = NORMAL()) = {

      def appendMessageStack(e: Throwable, indentLevel: Int = 0): Unit = {
        val newMsg = e match {
          case ae: AggregateException => {
            parentElement.append(htmlSpaces(indentLevel) + (e.getClass.getName + ": ").redHtml.boldHtml + e.getMessage.redHtml + "<br/>")
            ae.exceptions.foreach(e => {
              parentElement.append(htmlSpaces(indentLevel + 1) + (e.getClass.getName + ": ").redHtml.boldHtml + e.getMessage.redHtml + "<br/>")
              outputVerbosity match {
                case TRACE() => parentElement.append(htmlSpaces(indentLevel + 2) + "Trace:".redHtml.boldHtml + "<br/>" + htmlSpaces(indentLevel + 3) + e.getStackTraceString.replaceAll("\n", "<br/>" + htmlSpaces(indentLevel + 3)).redHtml + "<br/>")
                case _       =>
              }
              if (e.getCause != null) appendMessageStack(e.getCause, indentLevel + 2)
            })
          }
          case _ => {
            parentElement.append(htmlSpaces(indentLevel) + (e.getClass.getName + ": ").redHtml.boldHtml + e.getMessage.redHtml + "<br/>")
          }
        }

        e.getCause() match {
          case t: Throwable => appendMessageStack(t, indentLevel + 1)
          case _            =>
        }
      }

    parentElement.append(htmlSpaces(indent) + "ErrorMessage:".redHtml.boldHtml + "<br/>")
    appendMessageStack(exception, indent + 1)

    val exStackString = outputVerbosity match {
      case TRACE() => parentElement.append(htmlSpaces(indent + 1) + "Trace:".redHtml + "<br/>" + ExceptionUtils.getStackTrace(exception) + "<br/>")
      case _       =>
    }
  }

}/*
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
