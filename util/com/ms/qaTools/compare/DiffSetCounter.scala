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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
