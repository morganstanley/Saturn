package com.ms.qaTools.toolkit.pluto

import org.apache.commons.io.FileUtils
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.xml.`package`.nodeList2List
import java.io.File
import java.io.FileWriter

class ExampleGen(plutoFile: String, location: String, properties: Map[String, String]) extends Runnable[PlutoResult] {
  override def run =
    (for (doc <- Pluto.openXmlDoc(plutoFile, properties)) yield {
      val topic = Pluto.FileWithoutExtension(plutoFile)
      val targetDir = FileUtils.getFile(location + "/" + topic + "/")
      FileUtils.forceMkdir(targetDir)

      for (f <- FileUtils.getFile(plutoFile).getCanonicalFile.getParentFile.listFiles.filterNot(_.toString matches s"$topic\\.pluto"))
        FileUtils.copyFileToDirectory(f, targetDir)

      for (node <- doc.getDocumentElement.getChildNodes)
        node match {
          case PlutoDoc.CommandNode(command, interpreter, fileName, _) => {
            val f = new File(targetDir, fileName)
            val fw = new FileWriter(f)
            fw.write(s"#!$interpreter\n" + command.split("\n").map(_.replaceAll("""^\s+""", "")).mkString("\n"))
            fw.close()
            f.setExecutable(true)
          }
          case _ => ()
        }
      PlutoResult(Passed())
    }).recover{case t: Throwable => PlutoResult(Failed(), Some(t))}
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
