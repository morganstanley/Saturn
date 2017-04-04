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
    IOUtils.toString(is)
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
