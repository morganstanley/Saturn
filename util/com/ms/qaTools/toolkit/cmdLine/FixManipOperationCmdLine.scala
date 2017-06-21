package com.ms.qaTools.toolkit.cmdLine

import com.ms.qaTools.fix.mappers.FixXmlNodeAddMapper
import com.ms.qaTools.fix.mappers.FixXmlNodeDeleteMapper
import com.ms.qaTools.fix.mappers.FixXmlNodeReplaceMapper
import com.ms.qaTools.tree.mappers.XmlNodeMapper
import org.kohsuke.args4j.{Option => A4JOption}
import quickfix.DataDictionary
import scala.collection.JavaConversions.asScalaBuffer

class FixManipCmdLine extends ExtendedCmdLine(Map.empty) with OutputFixFile  {
  @A4JOption(name = "--outFmt", usage = "Out file format: FIX or XML.")
  val outFmt: String = "FIX"
}

class FixManipOperationCmdLine(operationsMap: Map[String, () => OperationCmdLine[XmlNodeMapper]])
extends ExtendedCmdLine(operationsMap)

class FixManipAddCmdLine(dictionary: DataDictionary) extends OperationCmdLine[FixXmlNodeAddMapper] {
  @A4JOption(name = "--parentTag", usage = "Parent group tag. If not specified, the new tag will be at the main group level.")
  val parentTag: String = null

  @A4JOption(name = "--before", usage = "Add new tag before this specified tag.")
  val beforeTag: String = null

  @A4JOption(name = "--after", usage = "Add new tag after this specified tag.")
  val afterTag: String = null

  @A4JOption(name = "--tag", required = true, usage = "Tag id")
  val tag: String = null

  @A4JOption(name = "--value", required = true, usage = "Value of the new tag")
  val value: String = null

  val operationName = "FixManip Add"
  def createOperation = FixXmlNodeAddMapper(
    tag,
    value,
    Option(parentTag),
    Option((Option(parentTag), Option(beforeTag)) match {
      case (Some(p), Some(b)) => s"$p/$b"
      case _ => beforeTag
    }),
    Option((Option(parentTag), Option(afterTag)) match {
      case (Some(p), Some(a)) => s"$p/$a"
      case _ => afterTag
    }),
    dictionary)
}

class FixManipDeleteCmdLine(dictionary: DataDictionary) extends OperationCmdLine[FixXmlNodeDeleteMapper] {
  @A4JOption(name = "--tags", required = true, usage = "Tags/Groups to delete from FIX message.")
  val tags: java.util.List[String] = null

  val operationName = "FixManip Delete"

  def createOperation = FixXmlNodeDeleteMapper(tags, dictionary)
}

// Do we want to support a replace with a relative xPath?
class FixManipReplaceCmdLine(dictionary: DataDictionary) extends OperationCmdLine[FixXmlNodeReplaceMapper] {
  @A4JOption(name = "--tag", required = true, usage = "FixPath tag to replace.")
  val tag: String = null

  @A4JOption(name = "--value", required = true, usage = "New tag value.")
  val value: String = null

  val operationName = "FixManip Replace"
  def createOperation = FixXmlNodeReplaceMapper(tag, value, dictionary)
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
