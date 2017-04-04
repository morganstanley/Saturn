package com.ms.qaTools.io.rowSource
import com.ms.qaTools.io.rowSource.Utils._
import java.text.NumberFormat
import java.util.Locale
import java.util.{Map => JMap}
import scala.collection.JavaConversions._
import scala.runtime.ScalaRunTime

trait LocaleFormatting {
  implicit val locale: Locale
}

trait ColumnType {
  def compare(leftValue: String, rightValue: String): Int
}

trait FixedWidth {self: ColumnDefinition =>
  val width: Int
  val caseCondition: Option[String]
}

object JustificationEnum extends Enumeration {
  type Justification = Value
  val LEFT_JUSTIFIED, RIGHT_JUSTIFIED = Value
}

case class StringColumnType() extends ColumnType {
  def compare(leftValue: String, rightValue: String): Int = {
    if (leftValue == null && rightValue == null) 0
    else if (leftValue == null && rightValue != null) -1
    else if (leftValue != null && rightValue == null) 1
    else leftValue compareTo rightValue
  }

  override def toString = "STR"
}

case class NumericColumnType/*(defaultValue: Double = 0.0)*/(implicit val locale: Locale) extends ColumnType /*with LocaleFormatting*/ {
  def compare(leftValue: String, rightValue: String): Int = {
    if ((leftValue == null || leftValue.isEmpty) && (rightValue == null || rightValue.isEmpty)) 0
    else if ((leftValue == null || leftValue.isEmpty) && (rightValue != null && !rightValue.isEmpty)) -1
    else if ((leftValue != null && !leftValue.isEmpty) && (rightValue == null || rightValue.isEmpty)) 1
    else {
      /*
       * Number formats are generally not synchronized.
       * It is recommended to create separate format instances for each thread. If multiple threads access a format concurrently, it must be synchronized externally.
       */
      val format: NumberFormat = NumberFormat.getInstance(locale)
      val l = try {
        val number = format.parse(leftValue)
        number.doubleValue()
      } catch {
        case t: Throwable => {
          throw new Exception("Cannot compare left numeric value: " + leftValue, t)
        }
      }

      val r = try {
        val number = format.parse(rightValue)
        number.doubleValue()
      } catch {
        case t: Throwable => {
          throw new Exception("Cannot compare right numeric value: " + rightValue, t)
        }
      }

      l compareTo r
    }
  }

  override def toString = "NUM"
}

object ColumnType {
  def apply(typeStr:String)(implicit locale: Locale):ColumnType = typeStr.toUpperCase() match {
    case "STR" | "STRING" => StringColumnType()
    case "NUM" => NumericColumnType()
    case _     => throw new Exception("Invalid column type string: '" + typeStr + "'")
  }
  def unapply(c:ColumnDefinition,t:ColumnType):Boolean = c.colType == t
}

class ColumnDefinition(val name: String,
                       val keyOrder: Option[Int],
                       val index: Int = -1,
                       val colType: ColumnType = StringColumnType()) extends Product {
  require(keyOrder.fold(true)(_ > 0), s"Key order must be greater than 0: $this")

  def update(name: String          = this.name,
             keyOrder: Option[Int] = this.keyOrder,
             index: Int            = this.index,
             colType: ColumnType   = this.colType) = ColumnDefinition(name, keyOrder, index, colType)

  // This method is for interop with Groovy, so that you can use this in Groovy:
  //     colDef.update(name: "NEW_NAME")
  def update(attrs: JMap[String, Any]) = ColumnDefinition(
    name     = attrs.getOrElse("name", name).asInstanceOf[String],
    keyOrder = attrs.getOrElse("keyOrder", keyOrder).asInstanceOf[Option[Int]],
    index    = attrs.getOrElse("index", index).asInstanceOf[Int],
    colType  = attrs.getOrElse("colType", colType).asInstanceOf[ColumnType]
  )

  def compare(leftRow: Seq[String], rightRow: Seq[String]): Int = colType.compare(leftRow(index), rightRow(index))
  def isKey = keyOrder.isDefined

  def canEqual(that: Any)    = that.isInstanceOf[ColumnDefinition]
  val productArity           = 4
  def productElement(n: Int) = Array(name, keyOrder, index, colType).apply(n)
  override val productPrefix = getClass.getSimpleName

  override def equals(that: Any) = ScalaRunTime._equals(this, that)
  override def hashCode          = ScalaRunTime._hashCode(this)
  override def toString          = ScalaRunTime._toString(this)
}

object ColumnDefinition {
  def apply(name: String,
            keyOrder: Option[Int] = None,
            index: Int = -1,
            colType: ColumnType = StringColumnType()) = new ColumnDefinition(name, keyOrder, index, colType)

  def fromColumnNames(colNames: Seq[String]): Seq[ColumnDefinition] = colNames.zipWithIndex.map{c => val(name, index) = c; ColumnDefinition(name = name, index = index)}
  def colNameExists(colName: String, colDefs: Seq[ColumnDefinition]) = colDefs.exists(colDef => colDef.name == colName)

  def toDataSets(columns: Seq[ColumnDefinition]): Iterator[Seq[String]] with ColumnDefinitions = {
    import Utils._
    columns.iterator.map { c =>
      Seq(c.name, c.keyOrder.map(_.toString).orNull, c.index.toString, c.colType.toString)
    }.withColumnNames("NAME", "KEY_ORDER", "INDEX", "TYPE")
  }

  def fromDataSets(data: Iterator[Seq[String]] with ColumnDefinitions)(implicit locale: Locale): Seq[ColumnDefinition] = {
    data.toRowMaps.zipWithIndex.map {
      case (r, i) =>
        ColumnDefinition(r("NAME").get,
                         r.get("KEY_ORDER").flatten.map(_.toInt),
                         r.get("INDEX").flatten.map(_.toInt).getOrElse(i),
                         r.get("TYPE").flatten.map(ColumnType(_)).getOrElse(StringColumnType()))
    }.toSeq
  }
}

object NumericColumnDefinition {
  def unapply[T <: ColumnDefinition](c:Option[T]):Option[T] = c match {
    case Some(x) => unapply(x)
    case None => None
  }
  def unapply[T <: ColumnDefinition](c:T):Option[T] = {
    c.colType match {
      case _: NumericColumnType => Some(c)
      case _ => None
    }
  }
}

object StringColumnDefinition {
  def unapply(c:ColumnDefinition):Boolean = c.colType == StringColumnType()
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
