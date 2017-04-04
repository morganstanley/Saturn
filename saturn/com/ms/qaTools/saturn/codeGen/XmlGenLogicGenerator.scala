package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.saturn.{XmlGenStep => MXmlGenStep}

object XmlGenLogicGenerator {
  implicit val appendOptions = ContextAppendOptions(true)

  def apply(xmlGen: MXmlGenStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = for {
    cfg <- Try { val c = xmlGen.getXmlGenConfiguration; if (c == null) throw new NullPointerException(s"Configuration for RunCmds Step: $xmlGen cannot be null.") else c }
    templateGen <- ResourceGenerator(cfg.getTemplateFile())
    outputGen <- ResourceGenerator(cfg.getOutputResource())
    inputGen <- Try {
      val dataSets = cfg.getDataSets()
      if (dataSets.length != 1) throw new Exception("XmlGen should have exactly one dataSet.")
      val dataSet = dataSets.get(0)
      dataSet.getFile()
    }.flatMap(dataSet => ResourceGenerator(dataSet))
  } yield StepLogicGenerator.modifierGen(new ScalaGen {
    override def generate(): Try[String] = for {
      templateStr <- templateGen.generate
      outputStr <- outputGen.generate
      inputStr <- inputGen.generate
    } yield s"""XmlGenRunner(context, 
                             $templateStr,
                             $outputStr,
                             $inputStr,
                             ${cfg.isLegacyMode})"""
  }, xmlGen, "XmlGen")
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
