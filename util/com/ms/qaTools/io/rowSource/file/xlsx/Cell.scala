package com.ms.qaTools.io.rowSource.file.xlsx

import org.apache.poi.ss.usermodel.BuiltinFormats
import org.apache.poi.ss.usermodel.DataFormatter
import org.apache.poi.ss.util.CellReference
import org.apache.poi.xssf.model.SharedStringsTable
import org.apache.poi.xssf.model.StylesTable
import org.apache.poi.xssf.usermodel.XSSFRichTextString



trait XSSFDataType
case class BOOL_XSSFDataType() extends XSSFDataType
case class ERROR_XSSFDataType() extends XSSFDataType
case class FORMULA_XSSFDataType() extends XSSFDataType
case class INLINE_STRXSSFDataType() extends XSSFDataType
case class SSTINDEX_XSSFDataType() extends XSSFDataType
case class NUMBER_XSSFDataType() extends XSSFDataType

case class Cell(
  excelColumnIndex: String = "@0",
  dataType: XSSFDataType = NUMBER_XSSFDataType(),
  formatIndex: Int = -1,
  formatString: Option[String] = None) {
  private val _value: StringBuffer = new StringBuffer
  private val formatter: DataFormatter = new DataFormatter
  private[this] var dirtyBuffer = false
  val index = new CellReference(excelColumnIndex)
  val columnIndex: Int = index.getCol
  val rowIndex: Int = index.getRow

  def appendToValue(s: String) = { _value.append(s); dirtyBuffer = true }
  def value(sharedStringsTable: SharedStringsTable): String = {
    if (!dirtyBuffer && _value.toString().isEmpty()) null
    else dataType match {
      case BOOL_XSSFDataType()      => if (_value.charAt(0) == '0') "false" else "true"
      case ERROR_XSSFDataType()     => "\"ERROR:" + _value.toString() + '"'
      case FORMULA_XSSFDataType()   => _value.toString()
      case INLINE_STRXSSFDataType() => new XSSFRichTextString(_value.toString()).toString()
      case SSTINDEX_XSSFDataType() => {
        val sstIndex = _value.toString
        try {
          val idx = Integer.parseInt(sstIndex)
          val rtss = new XSSFRichTextString(sharedStringsTable.getEntryAt(idx))
          rtss.toString()
        }
        catch {
          case t: Throwable => null
        }
      }
      case NUMBER_XSSFDataType() => {
        val n = _value.toString()
        formatString match {
          case Some(f) => formatter.formatRawCellContents(n.toDouble, formatIndex, f)
          case None    => n
        }
      }
      case _ => "(TODO: Unexpected type: " + dataType + ")"
    }
  }
  def reset = _value.setLength(0)
}

object Cell {
  def apply(attributes: Map[String, String], current: Cell, stylesTable: StylesTable): Cell = {
    val columnIndex = attributes.getOrElse("r", current.excelColumnIndex)
    val cellType = attributes.getOrElse("t", null)
    val cellStyleStr = attributes.getOrElse("s", null)
    val (dataType: XSSFDataType, isNew: Boolean) = cellType match {
      case "b"         => (BOOL_XSSFDataType(), true)
      case "e"         => (ERROR_XSSFDataType(), true)
      case "s"         => (SSTINDEX_XSSFDataType(), true)
      case "inlineStr" => (INLINE_STRXSSFDataType(), true)
      case "str"       => (FORMULA_XSSFDataType(), true)
      case null        => (NUMBER_XSSFDataType(), true)
    }
    if (cellStyleStr != null) {
      val style = stylesTable.getStyleAt(Integer.parseInt(cellStyleStr))
      val formatIndex = style.getDataFormat
      val formatString = Option(style.getDataFormatString).getOrElse(BuiltinFormats.getBuiltinFormat(formatIndex))
      Cell(columnIndex, dataType, formatIndex, Some(formatString))
    }
    else Cell(columnIndex, dataType)
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
