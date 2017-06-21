package com.ms.qaTools.toolkit

sealed trait Status {
  @deprecated("Match on type instead", "qaTools/util/2.1.80") def passed: Boolean = false
  @deprecated("Match on type instead", "qaTools/util/2.1.80") def failed: Boolean = false
  @deprecated("Match on type instead", "qaTools/util/2.1.80") def notRun: Boolean = false
  def apply(): this.type = this
}

case object Passed extends Status {@deprecated("Match on type instead", "qaTools/util/2.1.80") override def passed = true}
case object Failed extends Status {@deprecated("Match on type instead", "qaTools/util/2.1.80") override def failed = true}
case object NotRun extends Status {@deprecated("Match on type instead", "qaTools/util/2.1.80") override def notRun = true}

case class Timings(startDate: Option[Long] = None, endDate: Option[Long] = None) {
  def start = Timings(Some(System.currentTimeMillis))
  def stop = Timings(startDate, Some(System.currentTimeMillis))

  def duration: Option[Long] =
    for (s <- startDate; e <- endDate) yield e - s
}

trait Result {
  def status: Status
  @deprecated("Match on value of `.status` instead", "qaTools/util/2.1.80")
  def passed: Boolean = status == Passed
  @deprecated("Match on value of `.status` instead", "qaTools/util/2.1.80")
  def failed: Boolean = status == Failed
  @deprecated("Match on value of `.status` instead", "qaTools/util/2.1.80")
  def notRun: Boolean = status == NotRun
  @deprecated("Match on value of `.status` instead", "qaTools/util/2.1.80")
  def finished: Boolean = !notRun

  def timings: Timings = Timings()
  def duration = timings.duration

  val exception: Option[Throwable]
  def errorMessage: Option[String] = exception.map(_.getMessage)
  def rethrow(message: String): this.type = (exception, status) match {
    case (Some(e), _) => throw e
    case (_, Failed)  => sys.error(message)
    case _ => this}
}

object Result {
  def apply(s: Status, e: Option[Throwable] = None): Result =
    new Result{val status = s; val exception = e}
}

object Pass {
  @deprecated("Use `Result(Passed [, exception])` instead", "qaTools/util/2.1.80")
  def apply(e: Option[Throwable] = None): Result = new Result() {
    val status = Passed
    val exception = e
  }

  @deprecated("Match against object `Passed` instead", "qaTools/util/2.1.80")
  def unapply(r: Result): Boolean = {
    r.passed
  }
}

object Fail {
  @deprecated("Use `Result(Failed [, exception])` directly instead", "qaTools/util/2.1.80")
  def apply(e: Option[Throwable] = None): Result = new Result() {
    val status: Status = Failed
    val exception: Option[Throwable] = e
  }

  @deprecated("Match against object `Failed` instead", "qaTools/util/2.1.80")
  def unapply(r: Result): Boolean = r.failed
}

object NotRan {
  @deprecated("Match against object `NotRun` instead", "qaTools/util/2.1.80")
  def unapply(r: Result): Boolean = r.notRun
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
