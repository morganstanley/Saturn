package com.ms.qaTools.saturn.dsl

import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{IncludeFile  => MIncludeFile}
import com.ms.qaTools.saturn.{Saturn       => MSaturn}
import com.ms.qaTools.saturn.{Attribute    => MAttribute}
import com.ms.qaTools.saturn.types.{NamedResourceDefinition => MNamedResourceDefinition}
import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.io.rowSource.jdbc.ResultSetRowSource
import scala.language.implicitConversions

class EObjectUtil(e:EObject) {
    def name:String = e match {
        case r:MAbstractRunGroup        => r.getName()
        case a:MAttribute               => a.getName()
        case r:MNamedResourceDefinition => r.getName()
        case i:MIncludeFile             => i.getName()
        case _                          => "XXX"
    }

    def eClassName = e.eClass().getName()
}

object EObjectUtil {
  implicit def eObjectToEObjectUtil(e:EObject) = new EObjectUtil(e)
}

abstract class QueryResource {
  val sqlRowSource: ResultSetRowSource
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
