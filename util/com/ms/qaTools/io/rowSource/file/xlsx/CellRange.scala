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
