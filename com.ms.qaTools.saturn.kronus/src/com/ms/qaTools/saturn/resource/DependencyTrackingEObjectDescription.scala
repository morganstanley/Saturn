package com.ms.qaTools.saturn.resource

import scala.collection.JavaConverters._
import scala.collection.mutable

import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription

import com.ms.qaTools.saturn.kronus.IncludeDef

object DependencyTrackingEObjectDescription {
  object Adapter {
    def attach(obj: EObject, ref: EReference, dependencies: Seq[IncludeDef]): Unit =
      obj.eAdapters.asScala.collectFirst { case x: Adapter => x }.getOrElse {
        val x = new Adapter(obj)
        obj.eAdapters.add(x)
        x
      }.featureToDependencies(ref) = dependencies
  }

  class Adapter(target: Notifier) extends org.eclipse.emf.common.notify.Adapter {
    protected val featureToDependencies = mutable.Map.empty[EReference, Seq[IncludeDef]]

    def dependencies(ref: EReference): Seq[IncludeDef] = featureToDependencies(ref)

    def getTarget = target
    def setTarget(newTarget: Notifier) = require(newTarget eq target)
    def notifyChanged(notification: Notification) = ()

    def isAdapterForType(typ: AnyRef) = typ match {
      case typ: Class[_] => getClass.isAssignableFrom(typ)
      case _             => false
    }
  }
}

class DependencyTrackingEObjectDescription(delegate: IEObjectDescription, dependencies: Seq[IncludeDef])
extends AliasedEObjectDescription(delegate.getName, delegate) {
  import DependencyTrackingEObjectDescription._

  def attach(obj: EObject, ref: EReference): Unit = Adapter.attach(obj, ref, dependencies)
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
