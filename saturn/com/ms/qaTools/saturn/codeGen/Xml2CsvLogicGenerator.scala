package com.ms.qaTools.saturn.codeGen

import scala.util.Try

import com.ms.qaTools.TryUtil
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.OptionExpr
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.saturn.{Xml2CsvStep => MXml2CsvStep}

object Xml2CsvLogicGenerator {
  def apply(xml2csv: MXml2CsvStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    implicit val appendOptions = ContextAppendOptions(true)
    for {
      cfg <- Try { val c = xml2csv.getXml2CsvConfiguration(); if (c == null) throw new NullPointerException(s"Configuration for Xml2Csv Step: $xml2csv cannot be null.") else c }
      inputGen <- ResourceGenerator(cfg.getXMLFile()).rethrow(s"An exception occurred while generating code for input resource in Xml2Csv step $xml2csv.")
      outputGen <- ResourceGenerator(cfg.getCSVFile()).rethrow(s"An exception occurred while generating code for output resource in Xml2Csv step $xml2csv.")
      nsFileGen <- {
        val nsFile = Option(cfg.getNamespaceFile())
        nsFile match {
          case Some(f) => ResourceGenerator(f).map(OptionExpr(_)).rethrow(s"An exception occurred while generating code for namespace resource in Xml2Csv step $xml2csv.")
          case None    => Try { ScalaExpr("None") }
        }
      }
      configGen <- ResourceGenerator(cfg.getConfigFile()).rethrow(s"An exception occurred while generating code for config resource in Xml2Csv step $xml2csv.")
      nullMarkerStr = if (cfg.isRemoveNulls) "\"\"" else "null"
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        inputStr <- inputGen.generate
        outputStr <- outputGen.generate
        configStr <- configGen.generate
        nsStr <- nsFileGen.generate
      } yield s"""Xml2CsvRunner(context, 
                                $inputStr,
                                $outputStr,
                                $configStr,
                                $nsStr,
                                ${cfg.isAddHeader()},
                                ${cfg.isDetachNodes()},
                                $nullMarkerStr)"""
    }, xml2csv, "Xml2Csv")
  }
}/*
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
