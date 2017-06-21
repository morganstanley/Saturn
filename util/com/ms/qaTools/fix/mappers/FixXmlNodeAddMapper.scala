package com.ms.qaTools.fix.mappers

import com.ms.qaTools.tree.mappers.XmlNodeMapper
import com.ms.qaTools.tree.XmlNode
import quickfix.DataDictionary
import com.ms.qaTools.tree.mappers.XmlNodeAddMapper
import com.ms.qaTools.tree.mappers.XmlNodeDeleteMapper
import com.ms.qaTools.xml.xpath.FixPath
import com.ms.qaTools.xml.xpath.XPathAware

case class FixXmlNodeAddMapper(tag: String, value: String, parentTag: Option[String] = None, before: Option[String] = None, after: Option[String] = None, implicit val dictionary: DataDictionary)
    extends XmlNodeMapper {
  def apply(optionNode: Option[XmlNode]) = optionNode match {
    case None => optionNode
    case Some(xmlNode) =>
      val messageType = getMessageType(xmlNode)

      def getXPath(fixPathStr: String) =
        ((new FixPath(fixPathStr) with XPathAware).asXPath(messageType)).xPathString

      val parentTagXPathStr = parentTag.map(getXPath(_)).getOrElse("/message/body")
      val beforeTagXPathStr = before.map(getXPath(_)).getOrElse(null)
      val afterTagXPathStr = after.map(getXPath(_)).getOrElse(null)

      val randomId = util.Random.nextInt().toString // use a random id to identify the new node
      val transformers = Seq(
        XmlNodeAddMapper("field", randomId, parentTagXPathStr, beforeTagXPathStr, afterTagXPathStr, false, null, false),
        XmlNodeAddMapper("id", randomId, parentTagXPathStr + "/field[text() = '" + randomId + "']", null, null, true, null),
        XmlNodeDeleteMapper(Seq(parentTagXPathStr + "/field[text() = '" + randomId + "']/text()")),
        XmlNodeAddMapper("tag", tag, parentTagXPathStr + "/field[@id = '" + randomId + "']", null, null, true, null),
        XmlNodeAddMapper(name = null, value = value, parent = parentTagXPathStr + "/field[@id = '" + randomId + "']", isCDATA = true),
        XmlNodeDeleteMapper(Seq(parentTagXPathStr + "/field/@id")))

      transformers.foldLeft(Option(xmlNode))((transformedXml, transformer) =>
        transformer.apply(transformedXml))
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
