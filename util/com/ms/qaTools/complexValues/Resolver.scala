package com.ms.qaTools.complexValues

import org.slf4j.{ LoggerFactory }
import scala.sys.process._
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl
import org.eclipse.emf.ecore.util.FeatureMap
import com.ms.qaTools.generated.complexValues.{ComplexValue => MComplexValue}
import com.ms.qaTools.generated.complexValues.{TextComplexValue => MTextComplexValue}
import com.ms.qaTools.generated.complexValues.{EnvVarComplexValue => MEnvVarComplexValue}
import com.ms.qaTools.generated.complexValues.{CodeComplexValue => MCodeComplexValue}
import com.ms.qaTools.generated.complexValues.{FileComplexValue => MFileComplexValue}
import org.apache.commons.lang.NotImplementedException
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.IOException



class Resolver{
  val logger = LoggerFactory.getLogger(getClass)
  
  type ContainmentUpdating = EStructuralFeatureImpl.ContainmentUpdatingFeatureMapEntry
  type Simple = EStructuralFeatureImpl.SimpleFeatureMapEntry

  def resolve(value: MComplexValue): String = _resolve(value)
  def resolve(value: MTextComplexValue): String = _resolve(value)

  private def _resolve(v: Any): String = {
    v match {
      case tcv: MTextComplexValue => tcv.getText() //(if (tcv.getText() != null) tcv.getText() else "") + resolve0(tcv.getMixed())
      case ev: MEnvVarComplexValue => {
        val envVar = _resolve(ev.getMixed())
        val value = System.getenv(envVar)
        if (value != null) { value } else { "" }
      }
      case cv: MCodeComplexValue => {
        try { _resolve(cv.getMixed()).!! }
        catch {
          case io: IOException => { println(io); "" }
          case e: Exception => { println(e); "" }
          case _ => { "" }
        }

      }
      case fv: MFileComplexValue => scala.io.Source.fromFile(_resolve(fv.getMixed())).mkString
      case v: MComplexValue => _resolve(v.getMixed())
      case fm: FeatureMap => {
        val buffer = new StringBuffer
        for (m <- fm.toArray()) {
          val rep: String = m match {
            case e: ContainmentUpdating => _resolve(e.getValue())
            case s: Simple => s.getValue().toString()
          }
          buffer.append(rep)
        }
        buffer.toString()
      }
      case _ => null
    }
  }
}

object Resolver {
  def apply(): Resolver = new Resolver
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
