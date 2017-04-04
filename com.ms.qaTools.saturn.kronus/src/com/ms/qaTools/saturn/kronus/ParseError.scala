package com.ms.qaTools.saturn.kronus

import java.net.URI

import org.eclipse.xtext.validation.Issue

case class ParseError(uri: URI, lnum: Int, cnum: Int, msg: String, line: String) extends Exception(msg) {
  require(lnum > 0)
  require(cnum >= 0)
  override def getMessage = s"$uri: line $lnum: $msg\n$line\n${" " * cnum}^"
}

object ParseError {
  def apply(issue: Issue, uri: URI, text: String): ParseError = {
    val offset: Int = issue.getOffset
    val (lbegin, lend) = lineRange(text, offset)
    apply(uri, issue.getLineNumber, offset - lbegin, issue.getMessage, text.substring(lbegin, lend))
  }

  def lineRange(text: String, offset: Int): (Int, Int) = {
    var lbegin = offset - 1
    while (lbegin >= 0 && text(lbegin) != '\n') lbegin -= 1
    lbegin += 1
    var lend = lbegin
    while (lend < text.length && text(lend) != '\n') lend += 1
    if (text(lend - 1) == '\r') lend -= 1
    (lbegin, lend)
  }
}

case class ParseErrors(errors: Seq[ParseError]) extends Exception(s"${errors.size} error(s) found") {
  override def getMessage = super.getMessage +: errors.map(_.getMessage) mkString "\n\n"
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
