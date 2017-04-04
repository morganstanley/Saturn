package com.ms.qaTools.complexValues

import scala.collection.JavaConversions._
import com.ms.qaTools.generated.complexValues.{ ComplexValue => MComplexValue }
import com.ms.qaTools.generated.complexValues.ComplexValuesFactory
import com.ms.qaTools.generated.complexValues.InterpretersEnum

object ComplexValue {
  def apply(): MComplexValue = ComplexValuesFactory.eINSTANCE.createComplexValue()
  def apply(fmEntries: FMEntry*): MComplexValue = {
    val complexValue = ComplexValue()
    complexValue.getMixed().addAll(fmEntries)
    complexValue
  }

  //  def unapplySeq(c:MComplexValue):Option[Seq[FMEntry]]=Some(c.getMixed())
  def unapplySeq(c: MComplexValue): Option[Seq[Any]] = Some(c.getMixed().map { _.getValue() })
}

object Text {
  def apply(): Text = ComplexValuesFactory.eINSTANCE.createTextComplexValue()
  def apply(s: String): Text = {
    val t = Text()
    t.setText(s)
    t
  }

  def unapply(t: Text): Option[String] = if (t.getText() != null) Some(t.getText) else None
}

object Code {
  def apply(): Code = ComplexValuesFactory.eINSTANCE.createCodeComplexValue()
  def apply(fmEntries: FMEntry*): Code = {
    val complexValue = Code()
    complexValue.getMixed().addAll(fmEntries)
    complexValue
  }

  def apply(interpreter: InterpretersEnum, fmEntries: FMEntry*): Code = {
    val complexValue = Code()
    complexValue.setInterpreter(interpreter)
    complexValue.getMixed().addAll(fmEntries)
    complexValue
  }

  def unapply(c: Code): Option[(InterpretersEnum, Seq[Any])] = Some((c.getInterpreter(), c.getMixed().map { _.getValue() }))
}

object EnvVar {
  def apply(): EnvVar = ComplexValuesFactory.eINSTANCE.createEnvVarComplexValue()
  def apply(fmEntries: FMEntry*): EnvVar = {
    val complexValue = EnvVar()
    complexValue.getMixed().addAll(fmEntries)
    complexValue
  }
  def unapplySeq(c: EnvVar): Option[Seq[Any]] = Some(c.getMixed().map { _.getValue() })
}
object File {
  def apply(): File = ComplexValuesFactory.eINSTANCE.createFileComplexValue()
  def apply(fmEntries: FMEntry*): File = {
    val complexValue = File()
    complexValue.getMixed().addAll(fmEntries)
    complexValue
  }
  def unapplySeq(c: File): Option[Seq[Any]] = Some(c.getMixed().map { _.getValue() })
}

object Perl {
  def apply() = ???
  def apply(fmEntries: FMEntry*) = ???
}

object FMEntry {
  def apply(): FMEntry = null
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
