package com.ms.qaTools.dml
import java.io.StringReader
import org.apache.commons.lang.StringEscapeUtils
import scala.util.parsing.combinator.JavaTokenParsers
import scala.util.parsing.combinator.Parsers

class DmlEval protected () extends JavaTokenParsers {
  def parse(dmlStr: String) = parseAll(dmlExpr, dmlStr) match {
    case Success(d, n)   => d
    case Failure(msg, n) => throw new Exception("An exception occurred while parsing DML expression: '" + dmlStr + "'.  " + msg)
    case Error(msg, n)   => throw new Exception("An exception occurred while parsing DML expression: '" + dmlStr + "'.  " + msg)
  }

  def dmlExpr: Parser[Date] = dmlMethod ~ dmlOperations ^^ {
    case (dd~oo)  => oo.foldLeft(dd){ (acc: Date, dur: Duration) => acc + dur }
  }

  def operator: Parser[String] = "+" | "-"
  def durationIdent = "y" | "m" | "w" | "d" | "BD" | "H" | "M" | "S"

  def dmlOperations = compoundOps

  def simpleOp: Parser[Duration] = operator ~ wholeNumber ~ durationIdent ^^ {
    case (op~num~"y")  => Years(if(op == "-")        -num.toInt else num.toInt)
    case (op~num~"m")  => Months(if(op == "-")       -num.toInt else num.toInt)
    case (op~num~"w")  => Weeks(if(op == "-")        -num.toInt else num.toInt)
    case (op~num~"d")  => Days(if(op == "-")         -num.toInt else num.toInt)
    case (op~num~"H")  => Hours(if(op == "-")        -num.toInt else num.toInt)
    case (op~num~"M")  => Minutes(if(op == "-")      -num.toInt else num.toInt)
    case (op~num~"S")  => Seconds(if(op == "-")      -num.toInt else num.toInt)
  }

  def compoundOps: Parser[List[Duration]] = compoundOps0 ^^ {(ops) => ops.flatten}
  def compoundOps0 = compoundOp.*
  def compoundOp: Parser[List[Duration]] = operator ~ "(" ~ compoundOps ~ ")" ^^ { case (op~_~ops~_) => if(op == "-") ops.map{_.negate} else ops } |
                                           simpleOp                           ^^ { (simple) => List(simple) }

  def dmlMethod: Parser[Date]  = dmlDate ~ methodCalls ^^ {
    case(baseDate~calls) => calls.foldLeft(baseDate)(callMethod)
  }

  def callMethod(d: Date, c: (String, String)): Date = c match {
    case ("toFirst", "DoW")         => d.toFirstDoW
    case ("toFirst", "DoM")         => d.toFirstDoM
    case ("toFirst", "DoY")         => d.toFirstDoY
    case ("toLast",  "DoW")         => d.toLastDoW
    case ("toLast",  "DoM")         => d.toLastDoM
    case ("toLast",  "DoY")         => d.toLastDoY
    case ("formatDate", dateFmt)    => d.formatDate(dateFmt)
    case ("formatISODate", dateFmt) => d.formatISODate(dateFmt)
    case ("setBusCal", busCal)      => d.setBusCal(busCal)
    case ("addBusCal", busCal)      => d.addBusCals(busCal)
    case ("toTimeZone", tz)         => d.toTimeZone(tz)
    case (m, t) => throw new Exception(s"Invalid DML method: '$m($t)', expected: ('toFirst', 'toLast', 'formatDate', 'setBusCal', 'addBusCal')")
  }

  def methodCalls: Parser[List[(String,String)]] = methodCall.*
  def methodCall: Parser[(String,String)] = "." ~> ident ~ methodParmsList ^^ { case (i~p) => (i,p) }
  def methodParmsList: Parser[String] = "(" ~> (unescapedStringLiteral | ident) <~ ")"

  def dmlDate: Parser[Date]   = userDate | nowDate | tDate | "(" ~> dmlExpr <~ ")"
  def userDate: Parser[Date]  = "DATE" ~ "(" ~> unescapedStringLiteral <~ ")" ^^ { str: String => Date(str) }
  def tDate: Parser[Date]     = "T" ^^ { _ => Now() }
  def nowDate: Parser[Date]   = "NOW" ~ "(" ~> unescapedStringLiteral.? <~ ")" ^^ { 
    case Some(zone) => Now(zone)
    case None => Now()
  }

  def unescapedStringLiteral: Parser[String] = stringLiteral ^^ { rawStr: String => StringEscapeUtils.unescapeJava(rawStr.substring(1, rawStr.length() - 1)) }
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
