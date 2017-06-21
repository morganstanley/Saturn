package com.ms.qaTools.io.rowSource.internal

import java.io.File
import java.io.FileInputStream
import java.io.FilenameFilter
import java.io.InputStream

import org.apache.commons.io.IOUtils

import com.ms.qaTools.io.compress.Uncompress

trait RotationResolver {
  def resolve(): Option[RotatedFile]
}

class PatternRotationResolver(directory: File, pattern: String) extends RotationResolver {
  val patterns = pattern.split(File.separatorChar).toList

  def resolve(): Option[RotatedFile] = {
    def resolveFrom(location: Option[File], patterns: List[String]): Option[RotatedFile] = {
      patterns match {
        case Nil => location.map { RotatedFile(_) }
        case x :: xs => {
          location.flatMap { l =>
            val files = l.listFiles(new FilenameFilter() { def accept(dir: File, name: String) = name.matches(x) })
            val sorted = files sortWith { case (f1: File, f2: File) => f1.lastModified() < f2.lastModified() }
            resolveFrom(sorted.lastOption, xs)
          }
        }
      }
    }
    resolveFrom(Option(directory), patterns)
  }
}

case object NullRotationResolver extends RotationResolver { def resolve() = None }

case class RotatedFile(val file: File) extends Uncompress {
  def asStream: InputStream =
    if (isGzipped(new FileInputStream(file))) uncompress(new FileInputStream(file)) else new FileInputStream(file)

  def readFrom(pos: Long) = {
    val is = asStream
    is.skip(pos)
    IOUtils.toString(is, java.nio.charset.Charset.defaultCharset)
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
