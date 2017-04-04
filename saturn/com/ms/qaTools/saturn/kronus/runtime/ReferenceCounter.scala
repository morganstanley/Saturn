package com.ms.qaTools.saturn.kronus.runtime

import java.io.Closeable

import scala.collection.mutable
import scala.util.DynamicVariable

object ReferenceCounter {
  val debug = new DynamicVariable(false)
}

class ReferenceCounter {
  import ReferenceCounter._

  protected val counter: mutable.Map[Closeable, (Int, Seq[Closeable])] = mutable.HashMap.empty

  def inc(x: Closeable): Unit = withDebug(s"inc $x") {
    val (n, cs) = counter(x)
    counter(x) = (n + 1, cs)
  }

  protected def dec(x: Closeable): (Int, Seq[Closeable]) = withDebug(s"dec $x") {
    val (n, cs) = counter(x)
    assert(n > 0)
    val v = (n - 1, cs)
    counter(x) = v
    v
  }

  def addNew(x: Closeable, deps: Seq[Closeable]): Unit = withDebug(s"+ $x -> $deps") {
    require(!counter.contains(x))
    deps.foreach(inc)
    counter += x -> (1, deps)
  }

  def remove(x: Closeable, keep: Option[Any]): Unit = withDebug(s"- $x") {
    val (n, cs) = dec(x)
    if (keep.forall(x != _) && n <= 0) {
      x.close()
      counter -= x
      cs.foreach(remove(_, keep))
    }
  }

  def withDebug[A](msg: String)(body: => A): A = counter.synchronized {
    if (debug.value) println(msg)
    val x = debug.withValue(false)(body)
    if (debug.value) {
      if (counter.isEmpty) println("<empty>")
      else for ((k, v) <- counter) println(s"$k -> $v")
      println()
    }
    x
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
