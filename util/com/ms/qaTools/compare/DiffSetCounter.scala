package com.ms.qaTools.compare



class DiffSetCounter(
  var left: Int = 0,
  var right: Int = 0,
  var identical: Int = 0,
  var different: Int = 0,
  var inLeftOnly: Int = 0,
  var inRightOnly: Int = 0,
  var explained: Int = 0,
  var validationPassed: Int = 0,
  var validationFailed: Int = 0) {

  def incrementLeft = left += 1
  def decrementLeft = left -= 1

  def incrementRight = right += 1
  def decrementRigth = right -= 1

  def incrementIdentical = identical += 1
  def decrementIdentical = identical -= 1

  def incrementDifferent = different += 1
  def decrementDifferent = different -= 1

  def incrementInLeftOnly = inLeftOnly += 1
  def decrementInLeftOnly = inLeftOnly -= 1

  def incrementInRightOnly = inRightOnly += 1
  def decrementInRightOnly = inRightOnly -= 1

  def incrementExplained = explained += 1
  def decrementExplained = explained -= 1

  def incrementValidationPassed = validationPassed += 1
  def decrementValidationPassed = validationPassed -= 1

  def incrementValidationFailed = validationFailed += 1
  def decrementValidationFailed = validationFailed -= 1

  def addDiffCount(d: AbstractDiff) = d match {
    case d: InLeftOnly[_] => {
      if (d.isExplained) incrementExplained else incrementInLeftOnly
      incrementLeft
    }
    case d: InRightOnly[_] => {
      if (d.isExplained) incrementExplained else incrementInRightOnly
      incrementRight
    }
    case d: Different[_] => {
      if (d.isExplained) incrementExplained else incrementDifferent
      incrementLeft
      incrementRight
    }
    case _: Identical[_] => {
      incrementIdentical
      incrementLeft
      incrementRight
    }
    case _: ValidationPassed[_] => {
      incrementValidationPassed
      incrementLeft
      incrementRight
    }
    case _: ValidationFailed[_] => {
      incrementValidationFailed
      incrementLeft
      incrementRight
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
