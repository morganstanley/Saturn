package com.ms.qaTools.compare.writer.tree

import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter
import java.io.StringWriter
import java.math.BigInteger
import java.util.Collections

import scala.collection.JavaConverters._

import org.apache.commons.io.IOUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.XMLResource

import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.HasResult
import com.ms.qaTools.compare.Identical
import com.ms.qaTools.generated.diffSet.{AbstractTreeDiff => JAbstractTreeDiff}
import com.ms.qaTools.generated.diffSet.{DiffSetFactory => JDiffSetFactory}
import com.ms.qaTools.generated.diffSet.{ValidationTreeDiff => JValidationTreeDiff}
import com.ms.qaTools.generated.diffSet.util.{DiffSetResourceImpl => JDiffSetResourceImpl}
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.io.rowSource.Utils.W3CDocumentUtil
import com.ms.qaTools.tree.validator._

class ECoreDiffSetWriter[D](file: File, omitIdentical: Boolean) extends TreeDiffSetWriter[D] {
  val resourceName = "treeValidate"
  val xslResource = resourceName + ".xsl"
  val cssResource = resourceName + ".css"
  val diffSet = JDiffSetFactory.eINSTANCE.createDiffSet
  val diffSetResource = new JDiffSetResourceImpl(URI.createFileURI(file.getAbsolutePath))
  diffSetResource.getContents.add(diffSet)

  def close = {
    diffSetResource.setEncoding("UTF-8")
    val s = new StringWriter
    diffSetResource.save(s, Collections.singletonMap(XMLResource.OPTION_EXTENDED_META_DATA, true))

    val doc = s.toString.toDocument
    doc.insertBefore(doc.createProcessingInstruction("xml-stylesheet", "href=\"" + xslResource + "\" type=\"text/xsl\""), doc.getFirstChild)
    val fw = new FileWriter(file)
    fw.write(doc.toXmlString)
    fw.close
    Seq(xslResource, cssResource).foreach {r =>
      Option(getClass.getClassLoader.getResourceAsStream("resources/" + r)).foreach(i =>
        IOUtils.copy(i, new FileOutputStream(Option(file.getParent).getOrElse(".") + File.separator + r))
      )
    }
  }

  def writeDiff(diff: AbstractDiff) = if (!(omitIdentical && diff.isInstanceOf[Identical[_]])) {
    val rowDiff = JDiffSetFactory.eINSTANCE.createTreeDiff
    rowDiff.setStatus(getStatus(diff))
    leftIndexedRepresentation(diff).foreach { l =>
      rowDiff.setLeftRow(l.prettyPrint)
      rowDiff.getLeftKeyColumns.addAll(l.colDefs.sortBy(_.index).map(_.name).asJava)
      rowDiff.getLeftKeyValues.addAll(l.indexed.asJava)
    }
    rightIndexedRepresentation(diff).foreach { r =>
      rowDiff.setRightRow(r.prettyPrint)
      rowDiff.getRightKeyColumns.addAll(r.colDefs.sortBy(_.index).map(_.name).asJava)
      rowDiff.getRightKeyValues.addAll(r.indexed.asJava)
    }
    val diffDetails = rowDiff.getDiffDetails()
    diff match {
      case h: HasResult[D] => createDiffDetails(h.result).foreach(diffDetails.add)
      case _ => ()
    }
    diffSet.getRows.add(rowDiff)
  }

  def createDiffDetails(result: TreeResult[D]): Iterator[JAbstractTreeDiff] = {
    def asValidationTreeDiff0(v: ValidationResult[_]): Option[JValidationTreeDiff] = {
      val atd = v match {
        case p: PatternValidationResult[_]   => Some(JDiffSetFactory.eINSTANCE.createPatternTreeDiff())
        case e: ExistenceValidationResult[_] => Some(JDiffSetFactory.eINSTANCE.createExistsTreeDiff())
        case e: EnumValidationResult[_]      => Some(JDiffSetFactory.eINSTANCE.createEnumTreeDiff())
        case _                               => None
      }

      for (a <- atd) yield {
        a.setName(v.meta.name)
        a.setRightPath(v.node.path(true))
        a.setStatus(if (v.result) "VP" else "VF")
        a.setResult(v.result)
        a.setValue(v.node.valueAsString)
        a
      }
    }

    def asCompareTreeDiff0(d: AbstractTreeNodeDiff): JAbstractTreeDiff = {
      val ctd = JDiffSetFactory.eINSTANCE.createCompareTreeDiff()
      ctd.setName(d.meta.name)
      d match {
        case a: HasActual[D] =>
          ctd.setActualNode(a.actual.valueAsString)
          ctd.setRightPath(a.actual.path(true))
        case _ =>
      }
      d match {
        case e: HasExpected[D] =>
          ctd.setExpectedNode(e.expected.valueAsString)
          ctd.setLeftPath(e.expected.path(true))
        case _ =>
      }
      ctd.setStatus(d.status)
      ctd
    }

    val stats = result.statistics
    (stats.different.toSeq.sorted.iterator ++
     stats.inLeftOnly.toSeq.sorted ++ stats.inRightOnly.toSeq.sorted).map(asCompareTreeDiff0) ++
    stats.validations.iterator.flatMap(asValidationTreeDiff0)
  }

  def writeSummary(counter: TreeNodeCounter) = {
    diffSet.setDifferent(BigInteger.valueOf(counter.different))
    diffSet.setExplained(BigInteger.valueOf(counter.explained))
    diffSet.setIdentical(BigInteger.valueOf(counter.identical))
    diffSet.setInLeft(BigInteger.valueOf(counter.inLeftOnly))
    diffSet.setInRight(BigInteger.valueOf(counter.inRightOnly))
    diffSet.setLeft(BigInteger.valueOf(counter.left))
    diffSet.setRight(BigInteger.valueOf(counter.right))
    diffSet.setValidatedFail(BigInteger.valueOf(counter.validatedFail))
    diffSet.setValidatedPass(BigInteger.valueOf(counter.validatedPass))
  }
  def writeNotes(notes: Seq[String] = Nil) = ()
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
