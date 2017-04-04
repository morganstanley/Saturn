package com.ms.qaTools.compare
import com.ms.qaTools.interpreter.ScalaInterpreter
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.NumericColumnDefinition
import com.ms.qaTools.toolkit.Result

trait Explainable {
  val explanation: Option[String]
  def isExplained = explanation.isDefined
  def explain(explanation: String): Explainable
}

trait Explainer[E <: AbstractDiff] extends PartialFunction[E, E] {
  val explain: E => E
  val contextObject: ExplainerContextObject = new ExplainerContextObject

  def apply(x: E) = explain(x)
  def isDefinedAt(x: E) = explain match {
    case f: PartialFunction[_, _] => f.isDefinedAt(x)
    case _                        => true
  }
}

case class CodedExplainer[E <: AbstractDiff](explain: E => E) extends Explainer[E]

case object IdentityExplainer extends Explainer[AbstractDiff]{val explain = identity[AbstractDiff] _}

case class StringExplainer[E <: AbstractDiff](code: String, debug: Boolean = false, imports: Iterable[String] = Nil) extends Explainer[E] {
  lazy val explain = {
    val baseImports = Seq("io.rowSource._", "compare._", "tree.validator._", "io._").map("com.ms.qaTools." + _)
    ScalaInterpreter(debug, imports ++ baseImports).run(s"(expl: Explainable) => {$code}") match {
      case r: Result if r.failed => throw new Error("Could not interpret explainer: " +
          Seq(r.errorMessage, r.exception.map(_.getMessage)).flatten.mkString(", "))
      case r: Result if r.passed => r.resultObj match {
        case Some(e: Function1[E, E]) => e
        case Some(_) => throw new Error("Scala explainer code didn't return an object which takes an Explainable and returns an Explainable.")
        case None => throw new Error("Scala interpreter didn't return a result object.")
      }
    }
  }
}

class ExplainerContextObject {
  var value: Any = null
}

class NumericThresholdExplainer(columns: Either[Seq[(Int, Double)], Seq[(String, Double)]]) extends Explainer[AbstractDiff] {
  def inThreshold[T <: Either[Int, String]](id: ColumnDefinition => T, errStr: String, lookup: T)(d: DelimitedDifferent, threshold: Double) =
    d.compareColDefs.find(id(_) == lookup) match {
      case Some(NumericColumnDefinition(c: CompareColDef)) => {
        val l = d.left(c.leftIndex).toDouble
        val r = d.right(c.rightIndex).toDouble
        if (math.abs(l - r) <= threshold) Some(id(c) -> ("Numeric column within threshold: " + threshold))
        else None
      }
      case None => None
      case _    => throw new Error(errStr.format(lookup.merge) + ": not numeric")
    }

  val explain: AbstractDiff => AbstractDiff = {
    case d: DelimitedDifferent => {
      (columns match {
        case Left(columns) => columns.toList.flatMap {
          case (index, threshold) => {
            require(index > -1, "index must be greater than -1 to explain a column")
            inThreshold(c => Left(c.index), "Column at index %s", Left(index))(d, threshold)}}
        case Right(columns) => columns.toList.flatMap {
          case (name, threshold) =>
            inThreshold(c => Right(c.name), "Column %s", Right(name))(d, threshold)}
      }) match {
        case c @ ((Right(_), _) :: _) => d.explainColumnsByName(c.map{case (Right(r), s) => (r, s)}: _*)
        case c @ ((Left(_), _) :: _)  => d.explainColumnsByIdx(c.map{case (Left(i), s) => (i, s)}: _*)
        case Nil                      => d
      }
    }
    case e => e
  }
}

case class IdxNumericThresholdExplainer(columns: Seq[(Int, Double)]) extends NumericThresholdExplainer(Left(columns))
case class NameNumericThresholdExplainer(columns: Seq[(String, Double)]) extends NumericThresholdExplainer(Right(columns))
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
