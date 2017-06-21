package com.ms.qaTools.tree.validator

import com.ms.qaTools.compare.Counter
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.InLeftOnly
import com.ms.qaTools.compare.InRightOnly
import com.ms.qaTools.compare.Different
import com.ms.qaTools.compare.Identical
import com.ms.qaTools.compare.ValidationPassed
import com.ms.qaTools.compare.ValidationFailed

trait TreeNodeCounter extends Counter[AbstractDiff, TreeNodeCounter] {
  val validatedPass: Int
  val validatedFail: Int
  def failures = different + inLeftOnly + inRightOnly + validatedFail
}

case class TreeNodeDiffCounter(left: Int = 0, right: Int = 0, identical: Int = 0, different: Int = 0, inLeftOnly: Int = 0, inRightOnly: Int = 0, explained: Int = 0, validatedPass: Int = 0, validatedFail: Int = 0) extends TreeNodeCounter {
  def +(t: AbstractDiff) =
    t match {
      case d: Identical[_]                           => copy(left = left + 1, right = right + 1, identical = identical + 1)
      case d: Different[_] if (d.isExplained)        => copy(left = left + 1, right = right + 1, explained = explained + 1)
      case d: Different[_]                           => copy(left = left + 1, right = right + 1, different = different + 1)
      case d: InLeftOnly[_] if (d.isExplained)       => copy(left = left + 1, explained = explained + 1)
      case d: InLeftOnly[_]                          => copy(left = left + 1, inLeftOnly = inLeftOnly + 1)
      case d: InRightOnly[_] if (d.isExplained)      => copy(right = right + 1, explained = explained + 1)
      case d: InRightOnly[_]                         => copy(right = right + 1, inRightOnly = inRightOnly + 1)
      case d: ValidationFailed[_] if (d.isExplained) => copy(left = left + 1, right = right + 1, explained = explained + 1)
      case d: ValidationFailed[_]                    => copy(left = left + 1, right = right + 1, validatedFail = validatedFail + 1)
      case d: ValidationPassed[_] if (d.isExplained) => copy(right = right + 1, left = left + 1, explained = explained + 1)
      case d: ValidationPassed[_]                    => copy(right = right + 1, left = left + 1, validatedPass = validatedPass + 1)
      case _                                         => this
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
