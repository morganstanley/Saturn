package com.ms.qaTools.compare



class DifferenceCharacterization(val name: String, val isAcceptable: Boolean, val order: Int) {

  def goNoGo: String = {
    if (isAcceptable) "PASS" else "FAIL"
  }
  override def toString = List(name, if (isAcceptable) "PASS" else "FAIL", order).toString

  override def equals(that: Any) = that match {
    case other: DifferenceCharacterization => name.equals(other.name)
    case _ => false
  }
}
object DifferenceCharacterization {
  val UNCHARACTERIZED = new DifferenceCharacterization("uncharacterized", false, 0)
  val SHOWSTOPPER = new DifferenceCharacterization("showstopper", false, 1)
  val MAJORBLOCKER = new DifferenceCharacterization("major", false, 2)
  val MINORBLOCKER = new DifferenceCharacterization("minor", false, 3)
  val MAJORIMPROVEMENT = new DifferenceCharacterization("major improvement", true, 4)
  val MINORIMPROVEMENT = new DifferenceCharacterization("minor improvement", true, 5)
  val EXPECTED = new DifferenceCharacterization("expected", true, 6)
  val DERIVED = new DifferenceCharacterization("derived", false, 7)
  val INSIGNIFICANT = new DifferenceCharacterization("insignificant", true, 8)
  val ALL = Seq(UNCHARACTERIZED,
    SHOWSTOPPER,
    MAJORBLOCKER,
    MINORBLOCKER,
    MAJORIMPROVEMENT,
    MINORIMPROVEMENT,
    EXPECTED,
    DERIVED,
    INSIGNIFICANT)
  def apply(name: String): DifferenceCharacterization = {
    ALL.find(_.name.equalsIgnoreCase(name)).get
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
