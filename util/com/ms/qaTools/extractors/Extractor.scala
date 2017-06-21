package com.ms.qaTools.extractors

import scala.Array.canBuildFrom
import scala.util.Try
import scala.util.matching.Regex

import org.w3c.dom.Document
import org.w3c.dom.Node

import com.ms.qaTools.comet.UnknownInputException
import com.ms.qaTools.comet.resources.FileWatchResource.FileChanged
import com.ms.qaTools.comet.resources.FileWatchResource.FileCreated
import com.ms.qaTools.comet.resources.FileWatchResource.FileDeleted
import com.ms.qaTools.io.rowSource.Utils.ByteArrayUtil
import com.ms.qaTools.io.rowSource.Utils.JmsMessageUtil
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.io.rowSource.Utils.jmsMessageToString
import com.ms.qaTools.tree.XmlNode
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.xpath.XPath
import javax.jms.Message

import com.ms.qaTools.xml._
import javax.xml.xpath.XPathExpressionException

trait Extractor[Input, Evaluated, M <: Mapping] {
  val name: String
  val mappings: Iterable[M]

  def prepare(input: Any): Try[Input]

  def evaluate(input: Input, mapping: M): Iterable[Evaluated]

  def valueOf(e: Evaluated): Option[String]

  def extract(input: Any): Map[String, Any] = {
    val prepared = prepare(input)
    mappings.foldLeft(Map[String, Any]()) {
      (p: Map[String, Any], m: M) =>
        {
          val resolved = prepared map { evaluate(_, m) } getOrElse (Nil)
          val extracted =
            for (r <- resolved)
              yield Map("_text" -> valueOf(r)) ++ m.extractors.foldLeft(Map[String, Any]()) { (p, e) => p ++ (e.extract(r)) }
          p ++ Map(m.name -> (if (!m.isList) extracted.headOption.getOrElse(Map()) else extracted))
        }
    }
  }
}

case class ColumnExtractor(name: String, mappings: Iterable[ColumnMapping], nullMarker: Option[String] = None) extends Extractor[Map[String, String], String, ColumnMapping] {
  def prepare(input: Any): Try[Map[String, String]] = Try {
    input match {
      case list: Iterable[_] => list.asInstanceOf[Iterable[(String, String)]].toMap
      case _ => throw new UnknownInputException(input.getClass(), Seq(classOf[Iterable[(String, String)]]))
    }
  }

  def valueOf(i: String): Option[String] = Option(i).orElse(nullMarker)

  def evaluate(input: Map[String, String], mapping: ColumnMapping): Iterable[String] =
    input.get(mapping.column).toList
}

class XmlExtractor(val name: String, val mappings: Iterable[XPathMapping], nsContext: NamespaceContextImpl, nullMarker: Option[String] = None) extends Extractor[Node, Node, XPathMapping] {
  protected lazy val dummyDocument = DocumentBuilderTL. get.newDocument()
  protected def supportedInput: Seq[Class[_ <: Object]] = Seq(classOf[Document], classOf[Node], classOf[String], classOf[Message])

  def prepare(input: Any): Try[Node] = Try {
    input match {
      case d: Document        => d.getDocumentElement()
      case n: Node            => n
      case a: Array[Byte]     => a.toDocument.getDocumentElement()
      case s: String          => s.toDocument.getDocumentElement()
      case mqMsg: Message     => mqMsg.toDocument.getDocumentElement()
      case _                  => throw new UnknownInputException(input.getClass(), supportedInput)
    }
  }

  private def docFromNode(n: Node) = n match { case d: Document => d; case _ => n.getOwnerDocument() }

  def valueOf(i: Node): Option[String] =
    XmlNode(i)(NamespaceContextImpl(docFromNode(i))).value.orElse(nullMarker)

  def evaluate(input: Node, mapping: XPathMapping): Iterable[Node] = {
    val xPath = XPath(mapping.xPath, input)(NamespaceContextImpl(docFromNode(input)) + nsContext)
    try xPath.asNodes()
    catch {
      case x: XPathExpressionException => Seq(dummyDocument.createTextNode(xPath.asString()))
    }
  }
}

object XmlExtractor {
  def apply(name: String, mappings: Iterable[XPathMapping], nsContext: NamespaceContextImpl, nullMarker: Option[String] = None) =
    new XmlExtractor(name, mappings, nsContext, nullMarker)
}

case class LogExtractor(name: String, mappings: Iterable[PatternMapping], nullMarker: Option[String] = None) extends Extractor[String, String, PatternMapping] {
  def prepare(input: Any): Try[String] = Try {
    input match {
      case xmlNode: Node  => xmlNode.getTextContent()
      case mqMsg: Message => mqMsg
      case text: String   => text
      case _              => throw new UnknownInputException(input.getClass(), Seq(classOf[Node], classOf[String], classOf[Message]))
    }
  }

  def evaluate(input: String, mapping: PatternMapping): Iterable[String] = {
    val regex = mapping.regex
    if (mapping.isList || mapping.repeating) {
      val matches = regex.findAllIn(input)
      matches.matchData.foldLeft(List[String]())((l, m) => {
        m match {
          case regex(value) => l :+ value
          case _            => l :+ ""
        }
      })
    } else {
      mapping.regex.findFirstIn(input) match {
        case Some(regex(value)) => List(value)
        case None               => Nil
      }
    }
  }

  def valueOf(i: String): Option[String] = Option(i).orElse(nullMarker)
}

case class DelimitedPropertiesExtractor(name: String, mappings: Iterable[ColumnMapping], delimiter: Char = ';', assignment: Char = '=', nullMarker: Option[String] = None) extends Extractor[Map[String, String], String, ColumnMapping] {
  def prepare(input: Any): Try[Map[String, String]] = Try {
    def parseEntry0(delimitedEntry: String) = {
      val f: Array[String] => (String, String) = {
        a: Array[String] =>
          a.toList match {
            case Nil      => throw new Exception("No data!")
            case x :: Nil => (a(0), nullMarker.getOrElse(null))
            case _        => (a(0), a(1))
          }
      }
      delimitedEntry.split(delimiter).map { d => d.split(assignment.toString, 2) }.map(f).toMap
    }

    input match {
      case delimitedEntry: String => parseEntry0(delimitedEntry)
      case xmlNode: Node          => parseEntry0(xmlNode.getTextContent())
      case mqMsg: Message         => parseEntry0(mqMsg: String)
      case _                      => throw new UnknownInputException(input.getClass(), Seq(classOf[Node], classOf[String], classOf[Message]))
    }
  }

  def valueOf(i: String): Option[String] = Option(i)

  def evaluate(input: Map[String, String], mapping: ColumnMapping): Iterable[String] =
    input.get(mapping.column).orElse(nullMarker).toList
}

case object WatchEventExtractor extends Extractor[Map[String,Any], Option[Any], FileAttrMapping] {
  val mappings: Iterable[FileAttrMapping] =
    Seq(FileAttrMapping("event"), FileAttrMapping("fileName"),FileAttrMapping("lastModifiedTime"))
  val nullMarker: Option[String] = None
  val name = "WatchEventExtractor"

  def prepare(input: Any): Try[Map[String,Any]] = Try {
    input match {
      case FileChanged(f) => Map("event" -> "modify", "fileName" -> f.getName.getPath(), "lastModifiedTime" -> f.getContent.getLastModifiedTime)
      case FileCreated(f) => Map("event" -> "create", "fileName" -> f.getName.getPath(), "lastModifiedTime" -> f.getContent.getLastModifiedTime)
      case FileDeleted(f) => Map("event" -> "delete", "fileName" -> f.getName.getPath())
      case _              => throw new UnknownInputException(input.getClass(), Seq(classOf[FileChanged],classOf[FileCreated],classOf[FileDeleted]))
    }
  }

  def evaluate(input: Map[String,Any], mapping: FileAttrMapping): Iterable[Option[Any]] = Seq(input.get(mapping.name))

  def valueOf(i: Option[Any]): Option[String] = i map {_.toString}
}

sealed trait Mapping {
  val name: String
  val isList: Boolean
  val extractors: Iterable[Extractor[_, _, _]]
}
case class FileAttrMapping(name: String) extends Mapping {
  val isList = false
  val extractors = Nil
}
case class ColumnMapping(name: String, column: String, isList: Boolean = false, extractors: Iterable[Extractor[_, _, _]] = Nil) extends Mapping
case class XPathMapping(name: String, xPath: String, isList: Boolean, extractors: Iterable[Extractor[_, _, _]] = Nil) extends Mapping
case class PatternMapping(name: String, start: String, end: String, inclStart: Boolean = false, inclEnd: Boolean = false, multiLine: Boolean = false, repeating: Boolean = false, greedy: Boolean = false, isList: Boolean = false, extractors: Iterable[Extractor[_, _, _]] = Nil) extends Mapping {
  val regex: Regex = {
    (if (multiLine) "(?s)(?m)" else "") +
      (if (inclStart) "(" + start + ".+" else start + "(.+") +
      (if (greedy) "" else "?") +
      (if (inclEnd) end + ")" else ")" + end)
  }.r
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
