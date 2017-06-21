package com.ms.qaTools.io

import java.io.{InputStream, OutputStream}
import java.io.Closeable
import java.io.FilterInputStream
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Promise
import scala.sys.process.ProcessBuilder
import scala.util.Try

case class ProcessIO(builder: ProcessBuilder, timeout: Long = 2000) extends DeviceIO with Closeable {
  protected val outputPromise = Promise[OutputStream]()
  protected val inputPromise  = Promise[InputStream]()
  protected var closed = false
  protected val sleepInterval = 100

  def copyAvailable(in: InputStream, out: OutputStream) = {
    val n = in.available
    if (n > 0) {
      val buf = Array.ofDim[Byte](n)
      in.read(buf)
      out.write(buf)
      out.flush()
    }
  }

  def processError(err: InputStream) {
    try while (!closed) {
      copyAvailable(err, System.err)
      Thread.sleep(sleepInterval)
    } finally err.close()
  }

  val process = builder.run(new scala.sys.process.ProcessIO(
    outputPromise.success _,
    (in: InputStream) => inputPromise.success(new TimeoutInputStream(in, timeout, sleepInterval)),
    processError))
  val input  = Try(Await.result(inputPromise.future,  Duration.Inf))
  val output = Try(Await.result(outputPromise.future, Duration.Inf))

  def inputStreams  = input.map(Iterator(_))
  def outputStreams = output.map(Iterator(_))

  def close() = {
    closed = true
    process.destroy()
    input.foreach(_.close())
    output.foreach(_.close())
  }
}

class TimeoutInputStream(in: InputStream, timeout: Long, interval: Long) extends FilterInputStream(in) {
  val pool = Executors.newCachedThreadPool

  def cancelWhenTimeout[A](f: => A) = {
    val future = pool submit {
      new Callable[A] {
        def call() = f
      }
    }
    try future.get(timeout, TimeUnit.MILLISECONDS) catch {
      case e: TimeoutException =>
        future.cancel(true)
        throw e
    }
  }

  def ensureAvailable[A](f: => A) = synchronized {
    cancelWhenTimeout {
      while (available <= 0) Thread.sleep(interval)
      f
    }
  }

  override def read()                                    = ensureAvailable(super.read())
  override def read(bs: Array[Byte], off: Int, len: Int) = ensureAvailable(super.read(bs, off, len))

  override def close() {
    super.close()
    pool.shutdownNow()
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
