package com.ms.qaTools.toolkit.pbManip

import java.io.File
import java.io.FileInputStream
import com.ms.qaTools.toolkit.ToolkitApp
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.OperationCmdLine
import com.ms.qaTools.io.rowSource.protobuf.ProtoBufRowSource
import com.ms.qaTools.protobuf.mappers.PBMessageManipulator



object PBManipApp extends ToolkitApp[PBManipResult] {
  override val APP_NAME = "ProtoBufManip"

  val operationsMap = Map[String, Function1[BasicCmdLine, OperationCmdLine]](
    "replace" -> ((cmdLine: BasicCmdLine) => new PBManipReplaceCmdLine),
    "sort" -> ((cmdLine: BasicCmdLine) => new PBManipSortCmdLine),
    "where" -> ((cmdLine: BasicCmdLine) => new PBManipWhereCmdLine))

  override val cmdLine = new ProtoBufManipCmdLine(operationsMap)

  parseArguments

  val operations = cmdLine.parseOperations(args).foldLeft(Seq[PBMessageManipulator[_, _]]()) {
    (manipulators, operation) =>
      operation match {
        case t: PBMessageManipulator[_, _] => manipulators :+ t
        case _ => manipulators
      }
  }

  val protoBufRowSource = cmdLine.pbRowSource
  val protoBufRowWriter = cmdLine.pbRowWriter
  val printMessage = cmdLine.print

  try {
    val pbManip = PBManip(protoBufRowSource, operations, protoBufRowWriter, printMessage)
    val result = pbManip.run
    exit(result)
  } catch {
    case t: Throwable => exitException(t)
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
