package com.ms.qaTools.compare.writer

import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.Utils._

sealed trait Page
object SummaryPage extends Page
object NotesPage extends Page
object DifferencesPage extends Page
object ExplainedPage extends Page
object InLeftOnlyPage extends Page
object InRightOnlyPage extends Page
object IdenticalPage extends Page
object LeftPage extends Page
object RightPage extends Page

object PageNames {
  val order = List(SummaryPage, NotesPage, DifferencesPage, ExplainedPage, InLeftOnlyPage, InRightOnlyPage, IdenticalPage, LeftPage, RightPage)
  implicit def ordering :Ordering[Page] = Ordering.by(order.indexOf(_))

  def apply(): Map[Page, String] = collection.immutable.TreeMap(
    SummaryPage -> "summary",
    NotesPage -> "notes",
    DifferencesPage -> "differences",
    ExplainedPage -> "explained",
    InLeftOnlyPage -> "inLeftOnly",
    InRightOnlyPage -> "inRightOnly",
    IdenticalPage -> "identical",
    LeftPage -> "left",
    RightPage -> "right")
}

case class PageConfig(names: Map[Page, String] = PageNames(), omitted: Seq[Page] = Nil)

object PageConfig {
  def fromData(data: Iterator[Seq[String]] with ColumnDefinitions): PageConfig = {
    val name2page = PageNames().map(_.swap).toMap
    (PageConfig() /: data.toRowMaps) {
      case (PageConfig(names, omitted), r) =>
        val p = name2page(r("PAGE").get)
        val n = r.get("NAME").flatten.map(p -> _)
        val o = r.get("OMITTED").flatten.map(_.toBoolean).getOrElse(false)
        val ns = n match {
          case Some(n) => names + n
          case None    => names
        }
        val os = if (o) p +: omitted else omitted
        PageConfig(ns, os)
    }
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
