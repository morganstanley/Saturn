package com.ms.qaTools.toolkit.dsCompare

import com.ms.qaTools.compare.NWayCompareColDefMatching
import com.ms.qaTools.compare.NWayRowComparator
import com.ms.qaTools.io.rowSource.ColumnOrdering
import com.ms.qaTools.io.rowSource.ExternalSort._
import com.ms.qaTools.{toolkit => tk}

object NWayCompareApp extends tk.ToolkitApp[tk.Result] {
  val APP_NAME = "NWayCompare"
  val cmdLine = new NWayCompareCmdLine

  exit {
    util.Try {
      parseArguments
      val colDefs = cmdLine.colDefs
      val keyCols = colDefs.collect {
        case c: NWayCompareColDefMatching if c.keyOrder.nonEmpty => c
      }.sortBy(_.keyOrder).toIndexedSeq
      val sources = if (keyCols.isEmpty) cmdLine.inRowSources else {
        cmdLine.inRowSources.zipWithIndex.par.map { case (source, i) =>
          source.sortExternal(new ColumnOrdering(keyCols.map(c => c.nameAndIndices(i)._2 -> c.colType)))
        }.seq
      }
      val counter = NWayRowComparator.ICounter(sources.length)
      val writer = cmdLine.writer
      try {
        new NWayRowComparator(sources.map(_.buffered), colDefs).map(cmdLine.explainer).foreach { d =>
          counter.count(d)
          writer.writeDiff(d)
        }
        writer.writeSummary(counter)
      } finally writer.close()
      println(s"Identical: ${counter.identical}")
      println(s"Different: ${counter.different}")
      println(s"Explained: ${counter.explained}")
      new tk.Result {
        def status = if (counter.different == 0) tk.Passed else tk.Failed
        val exception = None
      }
    }
  }

  override def printMessages(r: tk.Result) = ()
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
