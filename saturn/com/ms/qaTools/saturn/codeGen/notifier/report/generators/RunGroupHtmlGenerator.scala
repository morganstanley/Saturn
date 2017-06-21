package com.ms.qaTools.saturn.codeGen.notifier.report.generators

import scala.util.Failure
import scala.util.Success

import org.jsoup.nodes.Element

import com.ms.qaTools.saturn.codeGen.IterationResult
import com.ms.qaTools.saturn.codeGen.RunGroupResult
import com.ms.qaTools.saturn.runtime.SaturnExecutionContext

class RunGroupHtmlGenerator(implicit sc: SaturnExecutionContext) extends BasicHtmlGenerator {
  override def generateIterationResult(name: String, fullName: String, result: IterationResult[Any], parentElement: Element, asScenario: Boolean = false, displayIterationNo: Boolean = true): Unit = {
    val childResults = result.moduleResult match {
      case r: RunGroupResult => r.runGroups
      case r => throw new Exception(s"Not a RunGroupResult: $r")
    }
    for ((fullName, childResultTry) <- childResults) childResultTry match {
      case Success(r) => {
        val htmlGeneratorOption = r.metaData.collect { case h: HtmlGenerator => h }.headOption
        htmlGeneratorOption.map(_.generateIteratorResult(fullName.split("\\.").lastOption.getOrElse(fullName), fullName, r, parentElement, false))
      }
      case Failure(e) => {
        //TODO
        throw new Exception("To implement: Failure output of child results in a RunGroupResult in RunGroupHtmlGenerator!")
      }
    }
  }

  override def runGroupIconClassName: String = "runGroupIcon"
  override def runGroupType: String = "RunGroup"

}

object RunGroupHtmlGenerator {
  def apply()(implicit sc: SaturnExecutionContext) = new RunGroupHtmlGenerator()
}

class SaturnHtmlGenerator(implicit sc: SaturnExecutionContext) extends RunGroupHtmlGenerator {
  override def runGroupType: String = "Saturn"
}

object SaturnHtmlGenerator {
  def apply()(implicit sc: SaturnExecutionContext) = new SaturnHtmlGenerator
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
