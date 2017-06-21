package com.ms.qaTools.toolkit.pulsar
import com.ms.qaTools.extractors.XPathMapping
import com.ms.qaTools.extractors.XmlExtractor
import com.ms.qaTools.io.rowSource.JsonPathRowSource
import com.ms.qaTools.io.rowSource.JsonRowSource
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.xml.NamespaceContextImpl
import scala.util.Try

sealed trait Event
object Event {
  case object CACHE extends Event
  case object RECEIVE extends Event
  case object SEND extends Event
}

sealed trait Rule {
  def key(m: Message): Option[String]
  def matches(m: Message): Boolean
}

class Handler(matcher: Rule, keyer: Rule, actions: List[Action]) {
  def key(m: Message): Option[String] = keyer.key(m)
  def matches(m: Message): Boolean = matcher.matches(m)
  def modify(m: Message, e: Event) =
    actions.foldLeft(Option(m))((mOpt, a) => for(m0 <- mOpt; m1 <- a(m0, e)) yield m1)
  def modify(source: Message, target: Message, e: Event) = 
    actions.foldLeft(Option(target))((mOpt, a) => for(m0 <- mOpt; m1 <- a(source, m0, e)) yield m1)
}

case object Always extends Rule {
  def key(m: Message) = m match {
    case TextMessage(_) => None
    case RestRequest(method, path, _) => Some(s"${method.toString},$path")
    case RestReply(statusCode, statusLine, _) => Some(s"${statusCode.toString},$statusLine")}
  def matches(m: Message) = true
}

case class All(rules: List[Rule]) extends Rule {
  def key(m: Message) = Some(rules.flatMap(_.key(m)).mkString(""))
  def matches(m: Message) = rules.forall(_.matches(m))
}

case class Any(rules: List[Rule]) extends Rule {
  def key(m: Message) = rules.flatMap(_.key(m)).headOption
  def matches(m: Message) = rules.exists(_.matches(m))
}

case class Not(rule: Rule) extends Rule {
  def key(m: Message) = rule.key(m)
  def matches(m: Message) = ! rule.matches(m)
}

case class XmlRule(xpath: String) extends Rule {
  val name = "name"
  val extractor = XmlExtractor("???", Seq(XPathMapping(name, xpath, false)), NamespaceContextImpl(Map("prefix" -> "uri")))
  def key(m: Message) =
    extractor.extract(m.m.toDocument)(name) match {
      case m: Map[_, _] => m.asInstanceOf[Map[String, Option[String]]].get("_text").flatten}

  def matches(m: Message) = Try {
    extractor.extract(m.m.toDocument)(name) match {case m: Map[_, _] => m.nonEmpty}
  }.getOrElse(false)
}

case class JsonRule(jpath: String) extends Rule {
  def extract(s: String) = JsonPathRowSource(JsonRowSource(s), Seq((jpath, "???"))).asDelimitedRowIterator.toList
  def key(m: Message) = Try(extract(m.m) match {case List(Seq(v)) => v}).toOption
  def matches(m: Message) = Try(extract(m.m).nonEmpty).getOrElse(false)
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
