package com.ms.qaTools.toolkit.cmdLine

import org.kohsuke.args4j.Option
import scala.collection.JavaConversions._
import com.ms.qaTools.tree.mappers.XmlNodeDeleteMapper
import com.ms.qaTools.tree.mappers.XmlNodeAddMapper
import com.ms.qaTools.tree.mappers.XmlNodeIntersectMapper
import com.ms.qaTools.tree.mappers.XmlNodeReplaceMapper
import com.ms.qaTools.tree.mappers.XmlNodeSelectMapper
import com.ms.qaTools.tree.mappers.XmlNodeShiftMapper
import com.ms.qaTools.tree.mappers.XmlNodeSplitMapper
import com.ms.qaTools.tree.mappers.XmlNodeTransformer
import com.ms.qaTools.tree.mappers.XmlNodeXPathFilter
import com.ms.qaTools.tree.mappers.XmlNodeXPathComparator

class XmlManipCmdLine(operationsMap: Map[String, () => OperationCmdLine[XmlNodeTransformer[_, _]]])
extends ExtendedCmdLine(operationsMap) with InputXmlFile with OutputXmlFile {
  @Option(name = "--ns", usage = "Namespace URI definition: prefix=uri")
  val namespaces: java.util.List[String] = new java.util.ArrayList()
}

class XmlManipAddCmdLine extends OperationCmdLine[XmlNodeAddMapper] {
  @Option(name = "--parentNode", required = true, usage = "Parent node XPath")
  val parentNode: String = null

  @Option(name = "--nodeName", usage = "Node name")
  val nodeName: String = null

  @Option(name = "--nodeValue", usage = "Node value")
  val nodeValue: String = ""

  @Option(name = "--isAttribute", usage = "If the new node is an attribute")
  val isAttribute: Boolean = false

  @Option(name = "--isCDATA", usage = "If the new node is a CDATA section")
  val isCDATA: Boolean = false

  @Option(name = "--isXml", usage = "If the new node is xml")
  val isXml: Boolean = false

  @Option(name = "--uri", usage = "Namespace URI of the node")
  val uri: String = null

  @Option(name = "--after", usage = "Add new node after this one.")
  val after: String = null

  @Option(name = "--before", usage = "Add new node before this one")
  val before: String = null

  val operationName = "XmlManip Add"
  def createOperation = {
    if (nodeName == null && (!isCDATA && !isXml)) throw new Error("XmlManip Add: the node name is required unless the new node is a CDATA section or an xml fragment.")
    XmlNodeAddMapper(nodeName, nodeValue, parentNode, before, after, isAttribute, uri, isCDATA, isXml)
  }
}

class XmlManipDeleteCmdLine extends OperationCmdLine[XmlNodeDeleteMapper] {
  @Option(name = "--xPaths", required = true, usage = "Nodes to delete that satisfy this XPath")
  val xPaths: java.util.List[String] = null

  val operationName = "XmlManip Delete"
  def createOperation = XmlNodeDeleteMapper(xPaths)
}

class XmlManipIntersectCmdLine extends OperationCmdLine[XmlNodeIntersectMapper] {
  @Option(name = "--fileName", required = true, usage = "Xml file to apply intersection")
  val fileName: String = null

  val operationName = "XmlManip Intersect"
  def createOperation = XmlNodeIntersectMapper(fileName)
}

class XmlManipReplaceCmdLine extends OperationCmdLine[XmlNodeReplaceMapper] {
  @Option(name = "--search", required = true, usage = "XPath to node to replace")
  val search: String = null

  @Option(name = "--with", required = true, usage = "XPath to new value. Relative to found node.")
  val withXPath: String = null

  @Option(name = "--isCDATA", usage = "If the new value should be a CDATA section")
  val isCDATA: Boolean = false

  val operationName = "XmlManip Replace"
  def createOperation = XmlNodeReplaceMapper(search, withXPath, isCDATA)
}

class XmlManipShiftCmdLine extends OperationCmdLine[XmlNodeShiftMapper] {
  @Option(name = "--shift", required = true, usage = "Number of documents to shift")
  val shift: Int = 1

  @Option(name = "--fileName", usage = "Output file name for the shift operation")
  val fileName: String = null

  @Option(name = "--keepShifted", usage = "Keep the shifted document for the next operations")
  val keepShifted: Boolean = false

  @Option(name = "--keepRemainder", usage = "Keep the remainder documents for the next operations")
  val keepRemainder: Boolean = false

  @Option(name = "--shiftedToFile", usage = "Output the shifted documents to the output file")
  val shiftedToFile: Boolean = false

  @Option(name = "--remainderToFile", usage = "Output the remainder documents to the output file")
  val remainderToFile: Boolean = false

  val operationName = "XmlManip Shift"
  def createOperation = XmlNodeShiftMapper(shift, fileName, keepShifted, keepRemainder, shiftedToFile, remainderToFile)
}

class XmlManipSortCmdLine extends OperationCmdLine[XmlNodeXPathComparator] {
  @Option(name = "--xPaths", required = true, usage = "Sorts XML messages according to a series of xpaths.\nThe order of the xpaths is important, since it determines the key orders.")
  val xPaths: java.util.List[String] = null

  val operationName = "XmlManip Sort"
  def createOperation = XmlNodeXPathComparator(xPaths)
}

class XmlManipSplitCmdLine extends OperationCmdLine[XmlNodeSplitMapper] {
  @Option(name = "--keys", required = true, usage = "Split the Xml document on these XPath.")
  val keys: java.util.List[String] = null

  @Option(name = "--outputDir", required = true, usage = "Output directory where to create files.")
  val outputDir: String = null

  val operationName = "XmlManip Split"
  def createOperation = XmlNodeSplitMapper(keys, outputDir)
}

class XmlManipWhereCmdLine extends OperationCmdLine[XmlNodeXPathFilter] {
  @Option(name = "--xPath", required = true, usage = "Select XML documents that match the XPath.")
  val xPath: String = null

  @Option(name = "--exclude", usage = "Filter out Xml document that match the XPath.")
  val exclude: Boolean = false

  val operationName = "XmlManip Where"
  def createOperation = XmlNodeXPathFilter(xPath, exclude)
}

class XmlManipSelectCmdLine extends OperationCmdLine[XmlNodeSelectMapper] {
  @Option(name = "--xPath", required = true, usage = "Select XML documents that match the XPath.")
  val xPath: String = null

  val operationName = "XmlManip Select"
  def createOperation = XmlNodeSelectMapper(xPath)
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
