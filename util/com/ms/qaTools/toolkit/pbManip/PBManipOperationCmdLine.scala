package com.ms.qaTools.toolkit.pbManip

import org.kohsuke.args4j.Option
import scala.collection.JavaConversions._
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.OperationCmdLine
import com.ms.qaTools.toolkit.cmdLine.ExtendedCmdLine
import com.ms.qaTools.toolkit.cmdLine.OutputProtoBufFile
import com.ms.qaTools.toolkit.cmdLine.InputProtoBufFile
import com.ms.qaTools.protobuf.mappers.PBFilterMapper
import com.ms.qaTools.protobuf.mappers.PBReplaceMapper
import com.ms.qaTools.protobuf.mappers.PBComparatorMapper



class ProtoBufManipCmdLine(operationsMap: Map[String, Function1[BasicCmdLine, OperationCmdLine]])
  extends ExtendedCmdLine(operationsMap) with InputProtoBufFile with OutputProtoBufFile {
}

class PBManipReplaceCmdLine extends OperationCmdLine {
  @Option(name = "--search", required = true, usage = "Message Field to replace")
  val search: String = null

  @Option(name = "--with", required = true, usage = "Ognl expression to new value. Relative to found field.")
  val withOgnlExp: String = null

  @Option(name = "--isOgnlExpression", required = false, usage = "Is replace value an Ognl expression. Default value is true.")
  val isOgnlExp: Boolean = false

  override val operationName = "ProtoBufManip Replace"
  def createOperation: Any = PBReplaceMapper(search, withOgnlExp, isOgnlExp)
}

class PBManipWhereCmdLine extends OperationCmdLine {

  @Option(name = "--where", required = true, usage = "Select messages that match the Ognl expression.")
  val where: String = null

  @Option(name = "--exclude", usage = "Filter out message that match the Ognl expression.")
  val exclude: Boolean = false

  override val operationName = "ProtoBufManip Where"
  def createOperation: Any = PBFilterMapper(where, exclude)
}

class PBManipSortCmdLine extends OperationCmdLine {

  @Option(name = "--fields", required = true, usage = "Sort.")
  val fields: java.util.List[String] = null

  override val operationName = "ProtoBufManip Sort"
  def createOperation: Any = PBComparatorMapper(fields)
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
