package com.ms.qaTools.saturn.runtime.runner.module

import scala.util.Try

import com.ms.qaTools.compare.Diff
import com.ms.qaTools.compare.Explainer
import com.ms.qaTools.compare.writer.DelimitedDiffSetWriter
import com.ms.qaTools.compare.writer.Page
import com.ms.qaTools.io.DiffWriter
import com.ms.qaTools.io.Input
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.ColumnType
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.saturn.codeGen.Utils.connectTry
import com.ms.qaTools.saturn.modules.datacompareModule.SortType
import com.ms.qaTools.toolkit.dsCompare.DsCompare

object DataCompareRunner {
  def apply(context: Context,
            leftIOTry: Try[Input[Iterator[Seq[String]] with ColumnDefinitions]],
            rightIOTry: Try[Input[Iterator[Seq[String]] with ColumnDefinitions]],
            keys: Map[String, Int],
            ignore: Seq[String],
            map: Map[String, String],
            typ: Map[String, ColumnType],
            ignoreExtra: Boolean,
            ignoreMissing: Boolean,
            outputIOTry: Try[DiffWriter[DelimitedDiffSetWriter]],
            sort: SortType,
            explainers: Seq[Explainer[Diff[Seq[String]]]],
            matcher: Option[Function3[String, String, String, Double]],
            pageNames: Map[Page, String],
            omitted: Seq[Page]): Try[DsCompare] =
    DsCompare(leftIOTry.flatMap(io => connectTry(context, io.input, "Left input", false)),
              rightIOTry.flatMap(io => connectTry(context, io.input, "Right input", false)),
              keys,
              ignore,
              map,
              typ,
              ignoreExtra,
              ignoreMissing,
              outputIOTry,
              sort.getLiteral,
              explainers,
              matcher,
              pageNames,
              omitted).rethrow("An exception occurred while running DsCompare.")
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
