package com.ms.qaTools.io.rowWriter.file

import java.io.{Writer => JWriter}

import scalaz.State
import scalaz.Scalaz._

import org.jsoup.nodes.DataNode
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.parser.Tag

import com.ms.qaTools.io.ColDefAwareWriter
import com.ms.qaTools.io.rowSource.{ColumnDefinition, ColumnDefinitions}

class HtmlTableRowWriter(writer: JWriter, config: HtmlTableRowWriter.Config) extends ColDefAwareWriter[Iterator[Seq[String]]] {
  def write(xss: Iterator[Seq[String]], colDefs: Option[Seq[ColumnDefinition]]) = {
    val (count, t) = table(xss, colDefs)(0)
    val html = Document.createShell(baseUri)
    html.head.appendChild(newElement("style").appendChild(new DataNode(config.style, baseUri)))
    html.body.appendChild(t)
    writer.write(html.outerHtml)
    count
  }

  def close() = writer.close()

  protected def table(xss: Iterator[Seq[String]], colDefs: Option[Seq[ColumnDefinition]]): WithCount[Element] = {
    val t = newElement("table")
    config.caption.foreach(text => t.appendChild(newElement("caption").appendText(text)))
    header(xss, colDefs).foreach(t.appendChild)
    for (_ <- xss.toStream.traverseS_(xs => row(xs, false).map(t.appendChild))) yield t
  }

  protected def header(xss: Iterator[Seq[String]], colDefs: Option[Seq[ColumnDefinition]]): Option[Element] = {
    Option(xss) collect {
      case header: ColumnDefinitions => header.colDefs
    } orElse colDefs map { xs =>
      val (_, th) = row(xs.map(_.name), true)(0)
      th
    }
  }

  protected def row(xs: Seq[String], isHeader: Boolean): WithCount[Element] = State { count =>
    val tr = newElement("tr")
    xs.zipWithIndex foreach {
      case (x, i) =>
        val col = newElement(if (isHeader) "th" else "td")
        if (!isHeader && config.htmlColumns(i)) col.append(x)
        else                                    col.appendText(x)
        tr.appendChild(col)
    }
    (count + 1, tr)
  }

  protected val baseUri = ""
  protected type WithCount[A] = State[Int, A]
  protected def newElement(tagName: String) = new Element(Tag.valueOf(tagName), baseUri)
}

object HtmlTableRowWriter {
  def apply(writer: JWriter, config: Config = Config()): HtmlTableRowWriter = new HtmlTableRowWriter(writer, config)

  case class Config(style: String           = defaultStyle,
                    caption: Option[String] = None,
                    htmlColumns: Set[Int]   = Set.empty)

  private val defaultStyle = "table, th, td {border: 1px solid}"
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
