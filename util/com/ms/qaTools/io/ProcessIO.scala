package com.ms.qaTools.io

import java.io.{InputStream, OutputStream}
import java.io.Closeable
import java.io.FilterInputStream
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.TimeoutException

import scala.concurrent.Promise
import scala.sys.process.ProcessBuilder

abstract class ProcessIO extends DeviceIO with Closeable

object ProcessIO {
  def apply(builder: ProcessBuilder, timeout: Long = 2000): ProcessIO = new ProcessIOImpl(builder, timeout)

  def copyAvailable(in: InputStream, out: OutputStream) {
    val n = in.available
    if (n > 0) {
      val buf = Array.ofDim[Byte](n)
      in.read(buf)
      out.write(buf)
      out.flush()
    }
  }

  val sleepInterval = 100
}

class ProcessIOImpl(builder: ProcessBuilder, timeout: Long) extends ProcessIO {
  import ProcessIO._

  protected val outputPromise = Promise[OutputStream]()
  protected val inputPromise  = Promise[InputStream]()
  protected var closed = false

  def writeInput(out: OutputStream) {
    outputPromise.success(out)
  }

  def processOutput(in: InputStream) {
    inputPromise.success(new TimeoutInputStream(in, timeout, sleepInterval))
  }

  def processError(err: InputStream) {
    try while (!closed) {
      copyAvailable(err, System.err)
      Thread.sleep(sleepInterval)
    } finally err.close()
  }

  val process = builder.run(new scala.sys.process.ProcessIO(writeInput, processOutput, processError))
  while (!(inputPromise.isCompleted && outputPromise.isCompleted)) Thread.sleep(sleepInterval)
  val input  = inputPromise.future.value.get
  val output = outputPromise.future.value.get

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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
