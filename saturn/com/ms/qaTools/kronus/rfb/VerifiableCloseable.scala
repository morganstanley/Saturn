package com.ms.qaTools.kronus.rfb

import java.io.Closeable
import java.util.Collection
import java.util.concurrent.ConcurrentLinkedQueue

import scala.collection.JavaConverters._

import com.ms.qaTools.saturn.kronus.runtime.Scope

object VerifiableCloseable {
  object Registry {
    implicit val global = new Registry(new ConcurrentLinkedQueue)
  }

  class Registry(val self: Collection[VerifiableCloseable]) {
    def verifyAllClosed(): Unit = for (c <- self.asScala) assert(c.closed, s"$c is not closed")
  }
}

class VerifiableCloseable(scope: Scope)(implicit registry: VerifiableCloseable.Registry) extends Closeable {
  registry.self.add(this)
  var closed = false
  def close() = closed = true
  override def toString = scope.fullName
}

trait InheritedCloseable extends Closeable {
  def parent: VerifiableCloseable
}

class ProxyCloseable(scope: Scope, self: VerifiableCloseable)(implicit registry: VerifiableCloseable.Registry)
    extends VerifiableCloseable(scope) with InheritedCloseable {
  def parent = self

  override def close() = {
    super.close()
    parent.close()
  }
}

class TeeCloseable(scope: Scope, origin: VerifiableCloseable)(implicit registry: VerifiableCloseable.Registry)
    extends VerifiableCloseable(scope) with InheritedCloseable {
  def parent = origin
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
