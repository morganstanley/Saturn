package com.ms.qaTools.toolkit.cmdLine

import org.kohsuke.args4j.Option
import java.io.File
import java.net.URLClassLoader
import java.io.FileInputStream
import java.io.BufferedInputStream
import com.ms.qaTools.io.rowSource.protobuf.ProtoBufRowSource



trait PBComparisonFiles {
  @Option(name = "-a", aliases = Array("--actualFileName"), usage = "Specify actual buffer message fileName", required = true)
  val actualInFileName: String = null

  @Option(name = "-e", aliases = Array("--expectedFileName"), usage = "Specify expected buffer message fileName", required = true)
  val expectedInFileName: String = null

  @Option(name = "-j", aliases = Array("--inJarName"), usage = "Specify jar file name.", required = true)
  val inJarName: String = null

  @Option(name = "-c", aliases = Array("--inClass"), usage = "Specify the message class name.", required = true)
  val inClass: String = null

  @Option(name = "-d", aliases = Array("--readDelimited"), usage = "Is Protocol buffer data in delimited format.")
  val readDelimited: Boolean = false

  @Option(name = "-r", aliases = Array("--readEncoded"), usage = "Is Protocol buffer data in Encoded format.")
  val readEncoded: Boolean = false

  def actualRowSource = {
    if (readEncoded)
      ProtoBufRowSource(actualInFileName, inClass, new java.net.URLClassLoader(Array(new File(inJarName).toURI.toURL)), readDelimited, readEncoded)
    else
      ProtoBufRowSource(new BufferedInputStream(new FileInputStream(actualInFileName)), inClass, new java.net.URLClassLoader(Array(new File(inJarName).toURI.toURL)), readDelimited)
  }

  def expectedRowSource = {
    if (readEncoded)
      ProtoBufRowSource(expectedInFileName, inClass, new java.net.URLClassLoader(Array(new File(inJarName).toURI.toURL)), readDelimited, readEncoded)
    else
      ProtoBufRowSource(new BufferedInputStream(new FileInputStream(expectedInFileName)), inClass, new java.net.URLClassLoader(Array(new File(inJarName).toURI.toURL)), readDelimited)
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
