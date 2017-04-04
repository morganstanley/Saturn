package com.ms.qaTools.compare.writer.tree
import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.DiffCounter
import com.ms.qaTools.compare.HasLeft
import com.ms.qaTools.compare.HasResult
import com.ms.qaTools.compare.HasRight
import com.ms.qaTools.generated.diffSet.{AbstractTreeDiff => JAbstractTreeDiff}
import com.ms.qaTools.generated.diffSet.{DiffSet => JDiffSet}
import com.ms.qaTools.generated.diffSet.{DiffSetFactory => JDiffSetFactory}
import com.ms.qaTools.generated.diffSet.util.{DiffSetResourceImpl => JDiffSetResourceImpl}
import com.ms.qaTools.generated.diffSet.{ValidationTreeDiff => JValidationTreeDiff}
import com.ms.qaTools.io.rowSource.IndexedRepresentation
import com.ms.qaTools.io.rowSource.Utils.StringUtil
import com.ms.qaTools.io.rowSource.Utils.W3CDocumentUtil
import com.ms.qaTools.tree.validator._
import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter
import java.io.StringWriter
import java.lang.Boolean
import org.apache.commons.io.IOUtils
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.XMLResource
import scala.collection.JavaConversions.mapAsJavaMap
import scala.collection.JavaConversions.seqAsJavaList
import scala.Option.option2Iterable

class ECoreDiffSetWriter[D](file: File, val serializer: D => String) extends TreeDiffSetWriter[D] {
  val resourceName = "treeValidate"
  val xslResource = resourceName + ".xsl"
  val cssResource = resourceName + ".css"
  val diffSetResource = new JDiffSetResourceImpl(URI.createFileURI(file.getAbsolutePath))
  diffSetResource.getContents.add(JDiffSetFactory.eINSTANCE.createDiffSet)

  def close = {
    diffSetResource.setEncoding("UTF-8")
    val s = new StringWriter
    diffSetResource.save(s, Map(XMLResource.OPTION_EXTENDED_META_DATA -> Boolean.TRUE))

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

  def writeDiff(diff: AbstractDiff) = {
    val rowDiff = JDiffSetFactory.eINSTANCE.createTreeDiff
    val status = getStatus(diff)
    rowDiff.setStatus(status)
    diff match {
      case i: HasLeft[IndexedRepresentation[D]] => rowDiff.setLeftRow(serializer(i.left.representation))
      case _                                    =>
    }
    diff match {
      case r: HasRight[IndexedRepresentation[D]] => rowDiff.setRightRow(serializer(r.right.representation))
      case _                                     =>
    }
    val diffDetails = rowDiff.getDiffDetails()
    diff match {
      case h: HasResult[D] => diffDetails.addAll(createDiffDetails(h.result))
      case _               =>
    }
    diffSetResource.getContents.get(0).asInstanceOf[JDiffSet].getRows.add(rowDiff)
  }

  def createDiffDetails(result: TreeResult[D]): Seq[JAbstractTreeDiff] = {
    val stats = result.statistics
    val expectedDiffs = stats.expectedDiffs
    val actualDiffs = stats.actualDiffs
    val validation = stats.validation
    val distinct = (expectedDiffs ++ actualDiffs).filter(_ != null).toSeq.distinct
    val (d, il, ir, vp, vf) = buildLists(distinct)

    def asValidationTreeDiff0(v: ValidationResult[_]): Option[JValidationTreeDiff] = {
      val atd = v match {
        case p: PatternValidationResult[_]   => Some(JDiffSetFactory.eINSTANCE.createPatternTreeDiff())
        case e: ExistenceValidationResult[_] => Some(JDiffSetFactory.eINSTANCE.createExistsTreeDiff())
        case e: EnumValidationResult[_]      => Some(JDiffSetFactory.eINSTANCE.createEnumTreeDiff())
        case _                               => None
      }

      for (a <- atd) yield {
        a.setName(v.meta.name)
        a.setRightPath(v.node.path)
        a.setStatus(if (v.result) "VP" else "VF")
        a.setResult(v.result)
        a.setValue(v.node.valueAsString)
        a
      }
    }

    def asCompareTreeDiff0(d: AbstractTreeNodeDiff, status: String): JAbstractTreeDiff = {
      val ctd = JDiffSetFactory.eINSTANCE.createCompareTreeDiff()
      ctd.setName(d.meta.name)
      d match {
        case a: HasActual[D] =>
          ctd.setActualNode(a.actual.valueAsString)
          ctd.setRightPath(a.actual.path)
        case _ =>
      }
      d match {
        case e: HasExpected[D] =>
          ctd.setExpectedNode(e.expected.valueAsString)
          ctd.setLeftPath(e.expected.path)
        case _ =>
      }
      ctd.setStatus(status)
      ctd
    }
    d.sortWith(sort).map { asCompareTreeDiff0(_, "D") } ++
      il.sortWith(sort).map { asCompareTreeDiff0(_, "IL") } ++
      ir.sortWith(sort).map { asCompareTreeDiff0(_, "IR") } ++
      validation.flatMap { asValidationTreeDiff0 }
  }

  def writeSummary(counter: DiffCounter) = ()
  def writeNotes(notes: Seq[String] = Nil) = ()
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
