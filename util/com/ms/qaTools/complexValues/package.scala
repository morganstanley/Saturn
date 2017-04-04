package com.ms.qaTools
import com.ms.qaTools.generated.complexValues.ComplexValue
import com.ms.qaTools.generated.complexValues.{ ComplexValuesPackage => ValuesPackage }
import com.ms.qaTools.io.rowSource.file.XmlRowSource
import com.ms.qaTools.xml.NamespaceContextImpl
import com.ms.qaTools.xml.nodeListToString
import com.ms.qaTools.xml.nodeToString
import com.ms.qaTools.xml.xpath.XPath
import javax.xml.namespace.QName
import javax.xml.xpath.XPathConstants
import org.eclipse.emf.ecore.util.FeatureMapUtil
import org.w3c.dom.Document

package object complexValues {
  type Text = com.ms.qaTools.generated.complexValues.TextComplexValue
  type Code = com.ms.qaTools.generated.complexValues.CodeComplexValue
  type EnvVar = com.ms.qaTools.generated.complexValues.EnvVarComplexValue
  type File = com.ms.qaTools.generated.complexValues.FileComplexValue
  type Complex = com.ms.qaTools.generated.complexValues.ComplexValue
  type FMEntry = org.eclipse.emf.ecore.util.FeatureMap.Entry

  implicit def fromStringToText(s: String): Text = Text(s)
  implicit def fromStringToFeatureMapEntry(s: String): FMEntry = FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_Text(), Text(s))
  implicit def fromTextToFeatureMapEntry(t: Text): FMEntry = FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_Text(), t)
  implicit def fromCodeToFeatureMapEntry(c: Code): FMEntry = FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_Code(), c)
  implicit def fromEnvVarToFeatureMapEntry(e: EnvVar): FMEntry = FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_EnvVar(), e)
  implicit def fromFileToFeatureMapEntry(f: File): FMEntry = FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_File(), f)
  implicit def fromStringToComplexValue(s: String): ComplexValue = ComplexValue(s)

  def getXPathValue(xmlRowSource: Iterator[Document],
                    nsContext: NamespaceContextImpl,
                    xPath: String,
                    row: Int,
                    isFragment: Boolean = true,
                    returnType: QName = XPathConstants.NODESET): String = {
    val xPathEval = XPath(xPath, xmlRowSource(row))(nsContext + (xmlRowSource match {
      case rs: XmlRowSource => rs.namespaceContext
      case _ => NamespaceContextImpl()}))
    returnType match {
      case XPathConstants.NODE | XPathConstants.NODESET =>
        xPathEval.asNodes().map(a =>
          if (isFragment) nodeListToString(a.getChildNodes) else nodeToString(a)
        ).mkString("\n").trim
      case _ => xPathEval.as(returnType).toString
    }
  }
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
