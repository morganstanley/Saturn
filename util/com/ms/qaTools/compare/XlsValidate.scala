package com.ms.qaTools.compare

import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.util.CellReference

import com.ms.qaTools.Isomorphism
import com.ms.qaTools.{compare => C}
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitions

object XlsValidate {
  def apply(sheet: Sheet): XlsValidate = new XlsValidate(new XlsExtract(sheet))

  case class Key(reference: CellReference, attribute: XlsExtract.Attribute)

  case class Diff(key: Key, diff: C.Diff[String]) extends AbstractDiff {
    val explanation = diff.explanation
    def explain(explanation: String) = copy(diff = diff.explain(explanation))

    def toDelimitedDiff: C.Diff[Seq[String]] = {
      val ks = Vector(key.reference.formatAsString, IsoAttributeString.to(key.attribute))
      val expected = diff match {
        case d: HasLeft[_] => d.left
        case _             => null
      }
      val actual = diff match {
        case d: HasRight[_] => d.right
        case _              => null
      }
      val left = ks :+ expected
      val right = ks :+ actual
      diff match {
        case d: Identical[_]   => DelimitedIdentical(left, right, d.explanation)
        case d: Different[_]   => DelimitedDifferent(left, right, DiffColDefs, ColDefs, explanation = d.explanation)
        case d: InLeftOnly[_]  => DelimitedInLeftOnly(left, CompareColDefs, explanation = d.explanation)
        case d: InRightOnly[_] => DelimitedInRightOnly(right, CompareColDefs, explanation = d.explanation)
        case _                 => throw new IllegalStateException("Bad nested diff: " + diff)
      }
    }
  }

  object ColumnNames {
    def CellReference = "Cell Address"
    def Type = "Parameter Type"
    def Expected = "Expected"
    def Actual = "Actual"
  }

  val CompareColDefs = {
    val columns = Seq(
      ColumnDefinition(ColumnNames.CellReference, Some(1), 0),
      ColumnDefinition(ColumnNames.Type, Some(2), 1),
      ColumnDefinition(ColumnNames.Expected, None, 2))
    Seq(
      CompareColDef(columns(0), columns(0), false),
      CompareColDef(columns(1), columns(1), false),
      CompareColDef(columns(2), columns(2).copy(name = ColumnNames.Actual), false))}
  val ColDefs = CompareColDefs.map(_.left)
  val DiffColDefs = CompareColDefs.filterNot(_.left.isKey)

  val IsoAttributeString = Isomorphism[XlsExtract.Attribute, String](XlsExtract.Value           -> "Value",
                                                                     XlsExtract.Formula         -> "Formula",
                                                                     XlsExtract.FirstName       -> "Defined Name",
                                                                     XlsExtract.FontName        -> "Font Name",
                                                                     XlsExtract.FontColor       -> "Font Color",
                                                                     XlsExtract.FontSize        -> "Font Size",
                                                                     XlsExtract.BackgroundColor -> "Background Color")

  def expectedValuesFromTable(input: Iterator[Seq[String]] with ColumnDefinitions): Iterator[(Key, String)] = {
    val refIdx      = input.colDefs.toMapBy(_.name)(ColumnNames.CellReference).index
    val typeIdx     = input.colDefs.toMapBy(_.name)(ColumnNames.Type).index
    val expectedIdx = input.colDefs.toMapBy(_.name)(ColumnNames.Expected).index
    input.map { row =>
      val refStr = row(refIdx)
      val expected = row(expectedIdx)
      val attr = IsoAttributeString.from(row(typeIdx))
      Key(new CellReference(refStr), attr) -> expected
    }
  }
}

class XlsValidate(extract: XlsExtract) {
  import XlsValidate._

  def compare(key: Key, expected: String): Diff = {
    val actual = extract.get(key.reference, key.attribute).orNull
    Diff(key, C.Diff(expected, actual))
  }

  def toDelimitedDiffs(input: Iterator[Seq[String]] with ColumnDefinitions): Iterator[C.Diff[Seq[String]]] =
    for ((k, e) <- expectedValuesFromTable(input)) yield compare(k, e).toDelimitedDiff
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
