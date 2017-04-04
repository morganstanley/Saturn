package com.ms.qaTools.toolkit.pluto
import com.ms.qaTools.Logger
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.xml.`package`.nodeList2List
import org.apache.commons.io.FileUtils
import scala.util.Try
import sys.process._

class Validation(plutoFile: String, location: String, path: Option[String], properties: Map[String, String]) extends Runnable[PlutoResult] {
  val logger = Logger(this.getClass)

  override def run = {
    val dir = FileUtils.getFile(location + "/" + Pluto.FileWithoutExtension(plutoFile) + "/")

    for {
      _ <- (new ExampleGen(plutoFile, location, properties)).run
      doc <- Pluto.openXmlDoc(plutoFile, properties)
      l <- Try{ for (node <- doc.getDocumentElement.getChildNodes) yield {
        node match {
          case PlutoDoc.CommandNode(_, _, file, _) =>
            Process(Seq(s"./$file"), dir, ("PATH", sys.env("PATH") + path.map(":" + _).getOrElse(""))).! == 0 // TODO logger.debug(stdout/stderr)
            //  "ls" ! ProcessLogger(l => println("out: " + l), l => println("err: " + l)), then with var stdout, var stderr, etc.
          case _ => true
        }
      }}} yield PlutoResult(if (l.forall(i => i)) Passed() else Failed())
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
