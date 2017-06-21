package com.ms.qaTools.io.rowSource.internal

import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.Reader
import java.util.concurrent.locks.ReentrantLock

import scala.annotation.tailrec
import scala.util.Try

import org.slf4j.LoggerFactory

/**
 * This is an extension of the Java Reader, not a RowSource.
 *
 * This might've looked better as a Java class actually.
 */

sealed trait TailLocation
case object Beginning extends TailLocation
case object End extends TailLocation

class BufferedFileTailerReader(
  file: File,
  resolver: RotationResolver,
  location: TailLocation = End,
  throwIfNotFound: Boolean = false) extends Reader {

  val logger = LoggerFactory.getLogger(getClass)
  protected val buffer = new StringBuilder()
  protected val bufferLock = new ReentrantLock
  protected val bufferNonEmpty = bufferLock.newCondition
  @volatile protected var closed: Boolean = false

  val underlying = new Thread(toString) {
    private[this] var reader: Option[Reader] = None
    private[this] var lastPosition: Long = 0

    setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler {
      def uncaughtException(t: Thread, e: Throwable) = logger.error("uncaught exception", e)
    })

    def onFileNotFound() =
      if (throwIfNotFound) throw new FileNotFoundException(file.getAbsolutePath()) else Thread.sleep(500)

    @tailrec def position: Long =
      location match {
        case End if file.exists()  => file.length()
        case End if !file.exists() => { onFileNotFound; position }
        case Beginning             => 0
      }

    @tailrec def obtainReader: Option[Reader] = {
      if (!file.exists()) {
        onFileNotFound
        obtainReader
      }
      else {
        if (lastPosition > file.length()) {
          // file may have been rotated, new file started.
          logger.warn("File rotation detected")
          resolver.resolve().foreach { f =>
            def retryToAppend(n: Int): Try[StringBuilder] =
              Try {
                bufferLock.lock()
                try {
                  val s = f.readFrom(position)
                  if (s.nonEmpty) {
                    buffer.appendAll(s)
                    bufferNonEmpty.signal()
                  }
                  buffer
                } finally bufferLock.unlock()
              } recoverWith { case _: Throwable if (n > 0) => retryToAppend(n - 1) }
            retryToAppend(10)
          }
          lastPosition = 0
          Option(new FileReader(file))
        }
        else {
          reader.orElse {
            Option {
              val r = new FileReader(file)
              val p = position
              r.skip(p)
              logger.info("jump to {} in {}", p, r)
              r
            }
          }
        }
      }
    }

    override def run() = {
      val b = new Array[Char](1024)
      while (!closed) {
        reader = obtainReader
        reader.foreach { r =>
          var readMore = true
          while (readMore) {
            val read = r.read(b)
            logger.trace("read {} characters from {}", read, r)
            if (read > 0) {
              bufferLock.lock()
              try {
                buffer.appendAll(b, 0, read)
                bufferNonEmpty.signal()
              } finally bufferLock.unlock()
              lastPosition += read
            } else readMore = false
          }
          Thread.sleep(500)
        }
      }
      reader.foreach { _.close() }
    }
  }

  underlying.start()

  def close = closed = true

  def read(buf: Array[Char], offset: Int, len: Int): Int = {
    bufferLock.lockInterruptibly()
    try {
      while (buffer.isEmpty) bufferNonEmpty.await()
      val n = buffer.length.min(len).min(buf.length - offset)
      buffer.copyToArray(buf, offset, len)
      buffer.delete(0, n)
      n
    } finally bufferLock.unlock()
  }
}

object BufferedFileTailerReader {
  def apply(file: File, resolver: RotationResolver, location: TailLocation): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver, location = location)
  def apply(file: File, resolver: RotationResolver, location: TailLocation, throwIfNotFound: Boolean): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver, location = location, throwIfNotFound = throwIfNotFound)
  def apply(file: File, resolver: RotationResolver, location: TailLocation, throwIfNotFound: Boolean, delay: Long): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver, location = location, throwIfNotFound = throwIfNotFound)
  def apply(file: File, resolver: RotationResolver, throwIfNotFound: Boolean): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver, throwIfNotFound = throwIfNotFound)
  def apply(file: File, resolver: RotationResolver): BufferedFileTailerReader = new BufferedFileTailerReader(file, resolver)
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
