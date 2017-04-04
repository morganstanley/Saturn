package com.ms.qaTools.saturn.runtime

import scala.util.Try

import org.specs2.execute.{Error => Specs2Error}
import org.specs2.matcher.Matcher
import org.specs2.mutable.Specification
import org.specs2.specification.Fragments

import com.ms.qaTools.saturn.codeGen.{IteratorResult, IterationResult}
import com.ms.qaTools.saturn.codeGen.Utils._
import com.ms.qaTools.saturn.dsl.annotation.{ScenarioAnnotation, OnFailResultStatus}

abstract class JUnitReportSpecification(root: Try[IteratorResult[com.ms.qaTools.saturn.codeGen.RunGroupResult]],
                                        rootName: String) extends Specification {
  protected def iterationsWithMessages(path: String, itr: IteratorResult[Any]): Seq[Try[(String, IterationResult[_], Option[String])]] = {
    expandResult(path -> itr).map {
      _.map {
        case (p, itn) =>
          val msg = Seq(itn, itr).map {
            _.metaData.collectFirst {
              case sa: ScenarioAnnotation if sa.onStatus == OnFailResultStatus => sa.title
            }.flatten
          }.reduceLeft(_ orElse _)
          (p, itn, msg)
      }
    }
  }

  def pass(msg: Option[String]): Matcher[IterationResult[Any]] = { itn: IterationResult[Any] =>
    (itn.passed, msg.getOrElse("Fail to pass"))
  }

  def iterationsPass(relativeName: Seq[String]): Fragments = {
    for {
      root <- root
      itrs <- extractResults(root, rootName, relativeName)
      itns <- itrs.flatMap((iterationsWithMessages _).tupled).toTrySeq
    } yield (Fragments() /: itns) {
      case (frag, (p, itn, msg)) => frag.append(s"$p should pass" ! (itn must pass(msg)))
    }
  }.recover {
    case t: Throwable =>
      val fn = rootName +: relativeName mkString "."
      (s"Fail to get iteration results of $fn" ! Specs2Error(t)): Fragments
  }.get
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
