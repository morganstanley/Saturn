package com.ms.qaTools.saturn.kronus.runtime

import java.util.concurrent.atomic.AtomicLong

import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.util.{Try, Success, Failure}

object ConstellationEntity {
  sealed trait Status
  case object Running   extends Status
  case object Completed extends Status
  case object Exception extends Status
}

class ConstellationEntity protected (val name: String, val parent: Option[ConstellationEntity], val sequenceNo: Long)
                                    (implicit val client: IConstellationClient, executor: ExecutionContext) {
  def this(name: String)(implicit client: IConstellationClient, executor: ExecutionContext) = this(name, None, 0)

  protected[runtime] var status: ConstellationEntity.Status = ConstellationEntity.Running
  protected val numOfChildren = new AtomicLong

  val id: Future[Long] = {
    val id = client.createEntity(this)
    id.onFailure {
      case t => new RuntimeException(s"Fail to get entity ID for $name", t).printStackTrace()
    }
    id
  }

  def newChild(name: String) = new ConstellationEntity(name, Some(this), numOfChildren.getAndIncrement())

  def complete[A: ConstellationDecoration.From](result: Try[A], annotations: Seq[DynamicAnnotation]): Unit = {
    val (newStatus, decoration) = result match {
      case Success(x) => (ConstellationEntity.Completed, ConstellationDecoration.from(x))
      case Failure(t) => (ConstellationEntity.Exception, ConstellationDecoration.from(t))
    }
    status = newStatus
    client.updateEntityStatus(this, status)
    decoration.foreach(client.attachDecoration(this, _))
    annotations.foreach(ConstellationDecoration.from(_).foreach(client.attachDecoration(this, _)))
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
