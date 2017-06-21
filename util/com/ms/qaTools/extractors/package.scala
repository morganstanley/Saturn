package com.ms.qaTools

package object extractors {
  val textKey = "_text"

  def toExtractorMap(m: Map[String, Any]): Map[String, Any] =
    m.map {
      case (k, v: String)    => (k, Map(textKey -> Option(v)))
      case (k, o: Map[_, _]) => (k, toExtractorMap(o.asInstanceOf[Map[String, Any]]))
      case _ => ???
    }

  def toSimplifiedMap(m: Map[String, Any], noInterimText: Boolean = false): Map[String, Any] = {
    def valueOf0(m: Map[String, Any]): Option[Any] = {
      def textValue0 = m.get(textKey).map { case Some(text) => text.toString; case None => null }
      if (m.isEmpty) None
      else if ((m - textKey).isEmpty) textValue0
      else Option((if (!noInterimText) Map(textKey -> textValue0.getOrElse(null)) else Map()) ++ toSimplifiedMap(m - textKey, noInterimText))
    }
    m.flatMap {
      case (k, v: Seq[_]) =>
        Option((k -> (v.flatMap(m => valueOf0(m.asInstanceOf[Map[String, Any]])))))
      case (k, m: Map[_, _]) =>
        valueOf0(m.asInstanceOf[Map[String, Any]]).map { v => (k -> v) }
      case _ => ???
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
