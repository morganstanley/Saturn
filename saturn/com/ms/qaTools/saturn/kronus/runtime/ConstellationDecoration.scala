package com.ms.qaTools.saturn.kronus.runtime

import scala.annotation.implicitNotFound
import scala.util.Try

import spray.json._

trait ConstellationDecoration {
  def decorationType: ConstellationDecoration.Type
  def decorationValue: JsValue
}

object ConstellationDecoration {
  case class Type(name: String)
  object UnknownType extends Type("Common.Unknown")
  object GenericJson extends Type("Common.JSON")
  object ExceptionType extends Type("Common.Exception")
  object AnnotationType extends Type("Meta.Annotation")

  def apply(typ: ConstellationDecoration.Type, value: JsValue) = new ConstellationDecoration {
    def decorationType = typ
    def decorationValue = value
  }

  def from[A: From](x: A): Option[ConstellationDecoration] = implicitly[From[A]].from(x)

  @implicitNotFound("Fail to convert ${A} to ConstellationDecoration")
  trait From[A] {
    def from(x: A): Option[ConstellationDecoration]
  }

  object From extends FallBackFromImplicits {
    implicit object ThrowableJsonWriter extends JsonWriter[Throwable] {
      def write(t: Throwable) = {
        val cause = Option(t.getCause).map(c => "cause" -> c.toJson)
        JsObject(Map("message" -> JsString(t.getMessage)) ++ cause)
      }
    }

    implicit object ThrowableIsConstellationDecoration extends From[Throwable] {
      def from(t: Throwable) = Some(ConstellationDecoration(ExceptionType, t.toJson))
    }

    // No need to upload aggregated results since the individual ones are already uploaded as ValDefs
    implicit object SeqTryAnyIsNotConstellationDecoration extends NotFrom[Seq[Try[Any]]]
  }

  class NotFrom[A] extends From[A] {
    def from(x: A) = None
  }

  trait HighPriorityFromImplicits extends DefaultJsonProtocol {
    implicit object NothingIsNotConstellationDecoration extends NotFrom[Nothing]

    implicit def jsonWriterIsConstellationDecoration[A: JsonWriter] = new From[A] {
      def from(x: A) = x match {
        case () | null => None
        case _         => Some(ConstellationDecoration(GenericJson, implicitly[JsonWriter[A]].write(x)))
      }
    }
  }

  trait FallBackFromImplicits {
    // Need this dummy type class to de-prioritize the implicit From[Any]
    class FromAny[A]
    object FromAny {
      implicit def AnyIsFromAny[A <: Any] = new FromAny[A]
    }

    implicit def anyIsConstellationDecoration[A: FromAny] = new From[A] {
      def from(x: A) = x match {
        case cd: ConstellationDecoration => Some(cd)
        case _ => Some(ConstellationDecoration(ConstellationDecoration.UnknownType, JsString(x.toString)))
      }
    }
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
