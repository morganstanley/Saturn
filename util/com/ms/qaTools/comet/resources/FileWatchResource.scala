package com.ms.qaTools.comet.resources

import java.io.File
import java.nio.file.Path
import scala.util.Try
import java.nio.file.StandardWatchEventKinds
import java.nio.file.WatchEvent
import scala.annotation.switch
import scala.collection.mutable.Queue
import com.ms.qaTools.io.rowSource.BufferedBlockingRowSource
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.BlockingQueue
import scala.volatile
import org.apache.commons.vfs2.VFS
import org.apache.commons.vfs2.impl.DefaultFileMonitor
import org.apache.commons.vfs2.FileListener
import org.apache.commons.vfs2.FileChangeEvent
import org.apache.commons.vfs2.FileObject
import org.apache.commons.vfs2.FileType

object FileWatchResource {

  sealed trait FileChangeEventType {val file: FileObject}
  case class FileCreated(file: FileObject) extends FileChangeEventType
  case class FileChanged(file: FileObject) extends FileChangeEventType
  case class FileDeleted(file: FileObject) extends FileChangeEventType

  val manager = VFS.getManager

  def apply(name: String, directoryPaths: Seq[String], create: Boolean, modify: Boolean, delete: Boolean, recursive: Boolean = true, delay: Long = 1000) = {
    val buffer = new BufferedBlockingRowSource[FileChangeEventType]()
    val listener = new FileListener {
      def fileChanged(e: FileChangeEvent) = if (modify) buffer.put(FileChanged(e.getFile))
      def fileCreated(e: FileChangeEvent) = if (create) buffer.put(FileCreated(e.getFile))
      def fileDeleted(e: FileChangeEvent) = if (delete) buffer.put(FileDeleted(e.getFile))
    }
    val monitor = new DefaultFileMonitor(listener)
    monitor.setDelay(delay)
    monitor.setRecursive(recursive)
    directoryPaths.foreach { d =>
      val listenDir = manager.resolveFile(d)
      require(listenDir.getType == FileType.FOLDER && listenDir.isReadable(), s"$d is not a directory or not readable.")
      monitor.addFile(listenDir)
    }
    monitor.start
    new WrappedResource(name, buffer)
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
