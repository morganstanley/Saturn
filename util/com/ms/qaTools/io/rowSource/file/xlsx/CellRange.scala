package com.ms.qaTools.io.rowSource.file.xlsx

import java.io.InputStream
import javax.xml.stream.XMLInputFactory
import javax.xml.stream.XMLStreamConstants
import scala.annotation.tailrec
import org.apache.poi.ss.util.CellReference




case class CellRange(startColumn: Int, startRow: Int, endColumn: Int, endRow: Int) {
  def isInRange(cell: Cell): Boolean = isInRange(cell.columnIndex, cell.rowIndex)
  def isInRange(col: Int, row: Int): Boolean = col >= startColumn && col <= endColumn && row >= startRow && row <= endRow
  def columnLength: Int = endColumn - startColumn + 1
  def rowLength: Int = endRow - startRow + 1
}

object CellRange {
  def apply(excelRange: String): CellRange = {
    val Array(start, end) = excelRange.split(':').map(new CellReference(_))
    CellRange(start.getCol, start.getRow, end.getCol, end.getRow)
  }
}

object CellRanges {
  def apply(stream: InputStream): Seq[CellRange] = {
    val reader = XMLInputFactory.newInstance().createXMLStreamReader(stream)
      @tailrec def getCellRanges0(ranges: Seq[CellRange] = Seq[CellRange]()): Seq[CellRange] = {
        if (reader.hasNext()) {
          reader.next()
          reader.getEventType() match {
            case XMLStreamConstants.START_ELEMENT => {
              reader.getLocalName() match {
                case "mergeCell" => {
                  val att = {
                    val count = reader.getAttributeCount()
                    Seq.range(0, count).map(i => {
                      reader.getAttributeLocalName(i) -> reader.getAttributeValue(i)
                    }).toMap
                  }
                  val excelRange = att.getOrElse("ref", throw new Error("No ref in the mergeCell"))
                  getCellRanges0(ranges :+ CellRange(excelRange))
                }
                case _ => getCellRanges0(ranges)
              }
            }
            case _ => getCellRanges0(ranges)
          }
        }
        else ranges
      }
    getCellRanges0()
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
