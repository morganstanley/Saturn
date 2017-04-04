package com.ms.qaTools.xml.generator

import org.w3c.dom.Document

import com.ms.qaTools.io.DelimitedRow
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.tree.generator.ColContext
import com.ms.qaTools.tree.generator.ColMap

object XmlGeneratorMapper {
  def apply(creator: XmlDocumentCreator, colNames: Seq[String]): (DelimitedRow) => Document = {
    (data: DelimitedRow) =>
      {
        val context = ColContext(creator.extractColQueries)
        val colMap = ColMap(colNames)
        creator.create(data)(colMap, context)
      }
  }
}

class XmlGenerator(creator: XmlDocumentCreator, rowSource: Iterator[Seq[String]] with ColumnDefinitions) extends Iterator[Document] {
  private val generator = XmlGeneratorMapper(creator, rowSource.colNames)
  private[this] var cached: Iterator[Document] = Iterator.empty

  def next = {
    if (cached.hasNext)
      cached.next
    else {
      if (rowSource.hasNext) {
        cached = rowSource.take(Runtime.getRuntime().availableProcessors()).toList.par.map {generator}.iterator
        next
      }
      else null
    }
  }
  def hasNext = rowSource.hasNext || cached.hasNext
}

object XmlGenerator {
  def apply(template: Document, rowSource: Iterator[Seq[String]] with ColumnDefinitions, isLegacyMode: Boolean = false) = {
    val creator = XmlDocumentCreator(template, isLegacyMode)
    new XmlGenerator(creator, rowSource)
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
