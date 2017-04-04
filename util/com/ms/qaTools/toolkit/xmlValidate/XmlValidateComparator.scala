package com.ms.qaTools.toolkit.xmlValidate

import java.io.File
import java.lang.Boolean
import scala.collection.JavaConversions._
import scala.collection.immutable.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.util.XMLProcessor
import org.eclipse.emf.ecore.xmi.XMLResource
import org.w3c.dom.Attr
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import com.ms.qaTools.complexValues.Resolver
import com.ms.qaTools.generated.xmlValidate.{ Mapper => MMapper }
import com.ms.qaTools.generated.xmlValidate.{ Matcher => MMatcher }
import com.ms.qaTools.generated.xmlValidate.{ Ignore => MIgnore }
import com.ms.qaTools.generated.xmlValidate.{ Validator => MValidator }
import com.ms.qaTools.generated.xmlValidate.{ Comparator => MComparator }
import com.ms.qaTools.generated.xmlValidate.DocumentRoot
import com.ms.qaTools.generated.xmlValidate.{ EnumValidator => MEnumValidator }
import com.ms.qaTools.generated.xmlValidate.{ ExistsValidator => MExistsValidator }
import com.ms.qaTools.generated.xmlValidate.{ ImplicitMapper => MImplicitMapper }
import com.ms.qaTools.generated.xmlValidate.{ KeyedMatcher => MKeyedMatcher }
import com.ms.qaTools.generated.xmlValidate.{ LinearMatcher => MLinearMatcher }
import com.ms.qaTools.generated.xmlValidate.{ NameMapper => MNameMapper }
import com.ms.qaTools.generated.xmlValidate.{ PatternValidator => MPatternValidator }
import com.ms.qaTools.generated.xmlValidate.XmlValidatePackage
import com.ms.qaTools.tree.validator.Comparator
import com.ms.qaTools.tree.validator.ComparatorWithKeys
import com.ms.qaTools.tree.validator.EnumValidator
import com.ms.qaTools.tree.validator.EnumValidator
import com.ms.qaTools.tree.validator.ExistsValidator
import com.ms.qaTools.tree.validator.ExistsValidator
import com.ms.qaTools.tree.validator.ImplicitMapper
import com.ms.qaTools.tree.validator.KeyedMatcher
import com.ms.qaTools.tree.validator.LinearMatcher
import com.ms.qaTools.tree.validator.Lookup
import com.ms.qaTools.tree.validator.Mapper
import com.ms.qaTools.tree.validator.Matcher
import com.ms.qaTools.tree.validator.NameMapper
import com.ms.qaTools.tree.validator.PatternValidator
import com.ms.qaTools.tree.validator.Validator
import com.ms.qaTools.tree.validator.XPathNodeLookup
import com.ms.qaTools.tree.validator.XPathNodeLookup
import com.ms.qaTools.tree._
import com.ms.qaTools.xml.xpath.XPath
import com.ms.qaTools.xml._
import javax.xml.namespace.NamespaceContext
import javax.xml.parsers.DocumentBuilder
import com.ms.qaTools.generated.complexValues.ComplexValue
import java.net.URL
import com.ms.qaTools.conversions.XPathConversions._
import com.ms.qaTools.generated.complexValues.ComplexValue
import com.ms.qaTools.tree.validator.string2XPathLookup
import scala.Array.canBuildFrom
import scala.Option.option2Iterable
import com.ms.qaTools.xml._

case class XmlValidateComparator(nsContext: NamespaceContext, comparator: Comparator[Node], keys: Seq[String])
extends ComparatorWithKeys[Node]

object XmlValidateComparator {
  private val NAMESPACE_URI: String = "http://www.ms.com/qaTools/xmlValidate/2010"

  private val packageInstance = XmlValidatePackage.eINSTANCE
  private val options: Map[_, _] = Map(
    XMLResource.OPTION_EXTENDED_META_DATA -> Boolean.TRUE,
    XMLResource.OPTION_LAX_FEATURE_PROCESSING -> Boolean.TRUE,
    XMLResource.OPTION_DOM_USE_NAMESPACES_IN_SCOPE -> Boolean.TRUE)

  private lazy val resolver = new Resolver
  implicit def resolve(value: ComplexValue) = resolver.resolve(value)

  def apply(): XmlValidateComparator = XmlValidateComparator(NamespaceContextImpl(), new Comparator[Node](), Seq[String]())

  def apply(configFileName: String): XmlValidateComparator = apply(new File(configFileName))

  def apply(configFile: File): XmlValidateComparator = {
    require(configFile.exists(), "File doesn't exist.")
    val dBuilder: DocumentBuilder = DocumentBuilderTL()
    val configDoc: Document = dBuilder.parse(configFile)
    val processor = new XMLProcessor(URI.createURI(configFile.getAbsolutePath()))
    _buildFromConfig(configDoc, processor)
  }

  def apply(inputURL: URL): XmlValidateComparator = {
    val inputStream = inputURL.openStream()
    val dBuilder: DocumentBuilder = DocumentBuilderTL()
    val configDoc: Document = dBuilder.parse(inputStream)
    val uri = URI.createPlatformResourceURI(inputURL.toString(), false)
    val processor = new XMLProcessor(uri)
    _buildFromConfig(configDoc, processor)
  }

  private def getDocumentKeys(document: Document)(implicit nsContext: NamespaceContext): Seq[String] = {
    val keys: String = XPath("@v:keys", document.getDocumentElement())
    if (keys.isEmpty) Seq() else keys.split(",")
  }

  private def _buildFromConfig(document: Document, processor: XMLProcessor): XmlValidateComparator = {
    val node: Node = document.getDocumentElement()
    implicit val documentNs: NamespaceContextImpl = NamespaceContextImpl(document, Map("v" -> NAMESPACE_URI))
    val ns: Seq[Node] = XPath("//v:Namespaces", node)
    val userDefined: Map[String, String] = ns.map { n: Node => (XPath("@prefix", n) asString (), XPath("@uri", n) asString ()) }.toMap
    implicit val namespaceContext: NamespaceContext = documentNs + userDefined

    XmlValidateComparator(namespaceContext, createComparator(node, processor, Nil), getDocumentKeys(document))
  }

  private def createComparator(node: Node, processor: XMLProcessor, globalMatchers: Iterable[Matcher[Node]])(implicit nsContext: NamespaceContext): Comparator[Node] = {
    val children: Seq[Node] = node.getChildNodes()
      .filter(n => n.getNamespaceURI() != NAMESPACE_URI && n.isInstanceOf[Element])
    val attributes = node.getAttributes().filter(n => n.getNamespaceURI() == NAMESPACE_URI).map {n => (n.getLocalName(), n.getTextContent())}.toMap
    val explicitMatchers = processMatchers(node, processor)
    val globals = explicitMatchers.filter { _.global }
    val matchers = children.map { c => createMatcher(c, processor, globalMatchers ++ globals) } ++ explicitMatchers
    val validators = processImplicitTextValidators(node) ++ processExplicitValidators(node, processor)
    val ignoreXPaths = processExplicitIgnores(node, processor)
    val ignoreInLeftOnly = Boolean.valueOf(attributes.getOrElse("ignoreInLeftOnly", "false"))
    val ignoreInRightOnly = Boolean.valueOf(attributes.getOrElse("ignoreInRightOnly", "false"))
    new Comparator(matchers = matchers, validators = validators, explainer = None, ignores = ignoreXPaths, ignoreInLeftOnly = ignoreInLeftOnly, ignoreInRightOnly = ignoreInRightOnly)
  }

  private def processImplicitTextValidators(node: Node)(implicit nsContext: NamespaceContext): Option[EnumValidator[Node]] = {
    val xmlNode = XmlNode(node)
    if (xmlNode.hasValue)
      Some(EnumValidator(Array(xmlNode.toString)))
    else
      None
  }

  private def processExplicitIgnores(node: Node, processor: XMLProcessor)(implicit nsContext: NamespaceContext): Iterable[Lookup[Node]] = {
    val ignores: Seq[Node] = XPath("v:Ignores", node)
    val explicitIgnores = ignores.flatMap {
      i: Node =>
        {
          val resource = processor.load(i, options)
          require(resource.getContents().size() > 0, "Could not deserialize the ignore.")
          config2Ignore(resource.getContents().get(0).asInstanceOf[DocumentRoot].getIgnores())
        }
    }
    val ignoreAttribute = Option(node.getAttributes().getNamedItemNS(NAMESPACE_URI, "ignore"))
    ignoreAttribute.filter {_.getNodeValue().toBoolean}.map { n => XPathNodeLookup(".") }.toSeq ++ explicitIgnores
  }

  private def processExplicitValidators(node: Node, processor: XMLProcessor)(implicit nsContext: NamespaceContext): Iterable[Validator[Node]] = {
    val attributes: List[Attr] = List(
      node.getAttributes().getNamedItemNS(NAMESPACE_URI, "enum"),
      node.getAttributes().getNamedItemNS(NAMESPACE_URI, "pattern"),
      node.getAttributes().getNamedItemNS(NAMESPACE_URI, "exists")).filter(_ != null).asInstanceOf[List[Attr]]

    val fromAttributes = attributes.map {
      a: Attr =>
        a.getLocalName() match {
          case "enum" => EnumValidator[Node](a.getValue().split(","))
          case "exists" => ExistsValidator[Node]()
          case "pattern" => PatternValidator[Node](a.getNodeValue().r)
        }
    }

    val validators: Seq[Node] = XPath("v:Validators", node)
    val fromElements = validators.map {
      v =>
        val resource = processor.load(v, options)
        require(resource.getContents().size() > 0, "Could not deserialize the validator.")
        config2Validator(resource.getContents().get(0).asInstanceOf[DocumentRoot].getValidators())
    }
    fromAttributes ++ fromElements
  }

  private def createMatcher(node: Node, processor: XMLProcessor, globalMatchers: Iterable[Matcher[Node]])(implicit nsContext: NamespaceContext): Matcher[Node] = {
    val xPathKeysAttr = node.getAttributes().getNamedItemNS(NAMESPACE_URI, "xPathKeys")
    val expectedXPathKeysAttr = node.getAttributes().getNamedItemNS(NAMESPACE_URI, "expectedXPathKeys")
    val actualXPathKeysAttr = node.getAttributes().getNamedItemNS(NAMESPACE_URI, "actualXPathKeys")
    val leftXPathKeysAttr = node.getAttributes().getNamedItemNS(NAMESPACE_URI, "leftXPathKeys")
    val rightXPathKeysAttr = node.getAttributes().getNamedItemNS(NAMESPACE_URI, "rightXPathKeys")
    val mapperAttr = node.getAttributes().getNamedItemNS(NAMESPACE_URI, "mapper")
    val keyLookups: (Seq[Lookup[Node]], Seq[Lookup[Node]]) =
      if (xPathKeysAttr != null) {
        val xPathLookups = xPathKeysAttr.getNodeValue().split(",").map(v => XPathNodeLookup(v))
        (xPathLookups, xPathLookups)
      } else if (expectedXPathKeysAttr != null || actualXPathKeysAttr != null) {
        val expectedXPathLookups = expectedXPathKeysAttr.getNodeValue().split(",").map(v => XPathNodeLookup(v))
        val actualXPathLookups = actualXPathKeysAttr.getNodeValue().split(",").map(v => XPathNodeLookup(v))
        (expectedXPathLookups, actualXPathLookups)
      } else if (leftXPathKeysAttr != null || rightXPathKeysAttr != null) {
        val expectedXPathLookups = leftXPathKeysAttr.getNodeValue().split(",").map(v => XPathNodeLookup(v))
        val actualXPathLookups = rightXPathKeysAttr.getNodeValue().split(",").map(v => XPathNodeLookup(v))
        (expectedXPathLookups, actualXPathLookups)
      } else (Nil, Nil)

    val mapper: Mapper[Node] =
      if (mapperAttr != null) NameMapper(node.getNodeName(), mapperAttr.getNodeValue()) else ImplicitMapper(node.getNodeName())
    val comparator = Some(createComparator(node, processor, globalMatchers))

    if (keyLookups._1.isEmpty)
      LinearMatcher(mapper, comparator)
    else
      KeyedMatcher(mapper, keyLookups._1, keyLookups._2, comparator, false)
  }

  private def processComparator(node: Node, processor: XMLProcessor)(implicit nsContext: NamespaceContext): Comparator[Node] = {
    val comparators: Seq[Node] = XPath("v:Comparator", node)
    require(comparators.size <= 1, "Can't have more than one comparator on a node.")
    if (comparators.size > 0) {
      val comparator = comparators(0)
      val resource = processor.load(comparator, options)
      require(resource.getContents().size() > 0, "Could not deserialize the matcher.")
      config2Comparator(resource.getContents().get(0).asInstanceOf[DocumentRoot].getComparator())
    } else null
  }

  private def config2Ignore(ignore: MIgnore)(implicit nsContext: NamespaceContext): Iterable[Lookup[Node]] = ignore.getXPaths().map {s => XPathNodeLookup(s: String)}

  private def config2Validator(validator: MValidator)(implicit nsContext: NamespaceContext): Validator[Node] = {
    val xPaths = for (xpath <- validator.getXPaths()) yield XPathNodeLookup(xpath)
    validator match {
      case e: MEnumValidator    => EnumValidator(for (enum <- e.getEnums()) yield enum: String, xPaths)
      case e: MExistsValidator  => ExistsValidator(xPaths)
      case p: MPatternValidator => PatternValidator((p.getPattern(): String).r, xPaths)
    }
  }

  private def config2Comparator(comparator: MComparator)(implicit nsContext: NamespaceContext): Comparator[Node] = {
    val explainers = comparator.getExplainers()
    val matchers = for (m <- comparator.getMatchers()) yield config2Matcher(m)
    val validators = for (v <- comparator.getValidators()) yield config2Validator(v)
    val ignores = for (i <- comparator.getIgnores()) yield config2Ignore(i)
    new Comparator[Node](name = Option(comparator.getName()).getOrElse("Comparator()"), matchers = matchers, validators = validators, ignores = ignores.flatten, ignoreInLeftOnly = comparator.isIgnoreInLeftOnly(), ignoreInRightOnly = comparator.isIgnoreInRightOnly())
  }

  private def config2Matcher(matcher: MMatcher)(implicit nsContext: NamespaceContext): Matcher[Node] = {
    def config2Mapper0(mapper: MMapper): Mapper[Node] = {
      mapper match {
        case n: MNameMapper => NameMapper(n.getLeftXPathMapping(): String, n.getRightXPathMapping(): String)
        case i: MImplicitMapper => ImplicitMapper(i.getXPathMapping(): String)
      }
    }
    val mapper = config2Mapper0(matcher.getMapper())
    val comparator = if (matcher.getComparator() != null) Some(config2Comparator(matcher.getComparator())) else None
    matcher match {
      case k: MKeyedMatcher => {
        val keys: (Seq[ComplexValue], Seq[ComplexValue]) =
          if (k.getXPathKeys() != null)
            (k.getXPathKeys(), k.getXPathKeys())
          else if (k.getExpectedXPathKeys() != null || k.getActualXPathKeys() != null)
            (if (k.getExpectedXPathKeys() == null) Nil else k.getExpectedXPathKeys(),
              if (k.getActualXPathKeys() == null) Nil else k.getActualXPathKeys())
          else if (k.getLeftXPathKeys() != null || k.getRightXPathKeys() != null)
            (if (k.getLeftXPathKeys() == null) Nil else k.getLeftXPathKeys(),
              if (k.getRightXPathKeys() == null) Nil else k.getRightXPathKeys())
          else throw new Error("Unknown key configuration.")
        KeyedMatcher(
          mapper,
          keys._1.map { x => XPathNodeLookup(x) },
          keys._2.map { x => XPathNodeLookup(x) },
          comparator,
          matcher.isGlobal())
      }
      case l: MLinearMatcher => LinearMatcher(mapper, comparator = comparator, global = l.isGlobal())
    }
  }

  private def processMatchers(node: Node, processor: XMLProcessor)(implicit nsContext: NamespaceContext): Iterable[Matcher[Node]] = {
    val matchers: Seq[Node] = XPath("v:Matchers", node)
    matchers.map {
      m: Node =>
        {
          val resource = processor.load(m, options)
          require(resource.getContents().size() > 0, "Could not deserialize the matcher.")
          config2Matcher(resource.getContents().get(0).asInstanceOf[DocumentRoot].getMatchers())
        }
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
