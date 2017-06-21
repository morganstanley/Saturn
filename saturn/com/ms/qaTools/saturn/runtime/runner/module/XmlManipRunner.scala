package com.ms.qaTools.saturn.runtime.runner.module

import scala.util.Try
import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.io.DirIO
import com.ms.qaTools.io.definition.XmlIO
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.saturn.codeGen.Utils.connectTry
import com.ms.qaTools.toolkit.XmlManip
import com.ms.qaTools.tree.mappers.XmlNodeAddMapper
import com.ms.qaTools.tree.mappers.XmlNodeDeleteMapper
import com.ms.qaTools.tree.mappers.XmlNodeReplaceMapper
import com.ms.qaTools.tree.mappers.XmlNodeSelectMapper
import com.ms.qaTools.tree.mappers.XmlNodeSplitMapper
import com.ms.qaTools.tree.mappers.XmlNodeTransformer
import com.ms.qaTools.tree.mappers.XmlNodeXPathFilter
import com.ms.qaTools.saturn.modules.xmlManipModule.AddPositionTypeEnum

object XmlManipRunner {
  def apply(context: Context,
            inputTry: Try[XmlIO],
            outputTry: Try[XmlIO],
            namespaceTry: Seq[(Try[String], Try[String])],
            transformersTry: Seq[Try[XmlNodeTransformer[_, _]]]): Try[XmlManip] =
    for {
      namespaces <- namespaceTry.map {
        case (prefixTry, urlTry) => prefixTry flatMap (prefix => urlTry map (url => (prefix, url)))
      }.toTrySeq.rethrow("An exception occurred while generating namespace map.")
      xmlManip <- XmlManip(inputTry.flatMap(input => connectTry(context, input.input, "Input", false)),
                           outputTry.flatMap(output => connectTry(context, output.output, "Output", false)),
                           namespaceTry,
                           transformersTry)
    } yield {
      context.appendMetaDataContext("Namespaces", namespaces.toMap.mkString("\n"))
      xmlManip
    }
}

object XmlAddMapper {
  def apply(context: Context,
            nodeNameTry: Try[String],
            valueTry: Try[String],
            parentTry: Option[Try[String]],
            uriTry: Option[Try[String]],
            isAttribute: Boolean,
            isCData: Boolean,
            isXml: Boolean,
            relativePos: String,
            relativeXPathTry: Option[Try[String]]): Try[XmlNodeAddMapper] =
    for {
      nodeName <- nodeNameTry.rethrow("An exception occurred while generating XmlManip Add nodeName.")
      value <- valueTry.rethrow("An exception occurred while generating XmlManip Add value.")
      parent <- parentTry.map(t => t.map(parent => Option(parent))).getOrElse(Try(None)).rethrow("An exception occurred while generating XmlManip Add parent.")
      uri <- uriTry.map(t => t.map(uri => Option(uri))).getOrElse(Try(None)).rethrow("An exception occurred while generating XmlManip Add uri.")
      relativeXPath <- relativeXPathTry.map(t => t.map(xpath => Option(xpath))).getOrElse(Try(None)).rethrow("An exception occurred while generating XmlManip relative XPath uri.")
    } yield {
      val addContext = context.appendMetaDataContext("AddOperation", "AddOperation")
      addContext.appendMetaDataContext("Nodename", Option(nodeName))
      addContext.appendMetaDataContext("Value", Option(value))
      addContext.appendMetaDataContext("Parent", parent)
      addContext.appendMetaDataContext("Uri", uri)
      val (relBefore, relAfter) = relativePos match {
        case "BEFORE" => (relativeXPath.orNull, null)
        case "AFTER" => (null, relativeXPath.orNull)
        case "NONE" => (null,null)
      }
      XmlNodeAddMapper(nodeName, value, parent.orNull, relBefore, relAfter, isAttribute, uri.orNull, isCData, isXml)
    }
}

object XmlDeleteMapper {
  def apply(context: Context,
            xPathsTry: Seq[Try[String]]): Try[XmlNodeDeleteMapper] =
    for {
      xPaths <- xPathsTry.toTrySeq.rethrow("An exception occurred while generating XmlManip Delete xPaths.")
    } yield {
      val deleteContext = context.appendMetaDataContext("DeleteOperation", "DeleteOperation")
      deleteContext.appendMetaDataContext("XPaths", Option(xPaths.mkString("\n")))
      XmlNodeDeleteMapper(xPaths)
    }
}

object XmlReplaceMapper {
  def apply(context: Context,
            searchTry: Try[String],
            replaceTry: Try[String]): Try[XmlNodeReplaceMapper] =
    for {
      search <- searchTry.rethrow("An exception occurred while generating XmlManip Replace search.")
      replace <- replaceTry.rethrow("An exception occurred while generating XmlManip Replace replace.")
    } yield {
      val replaceContext = context.appendMetaDataContext("ReplaceOperation", "ReplaceOperation")
      replaceContext.appendMetaDataContext("Search", Option(search))
      replaceContext.appendMetaDataContext("Replace", Option(replace))
      XmlNodeReplaceMapper(search, replace)
    }
}

object XmlExtractMapper {
  def apply(context: Context,
            xPathTry: Try[String]): Try[XmlNodeSelectMapper] =
    for {
      xPath <- xPathTry.rethrow("An exception occurred while generating XmlManip Extract xPath.")
    } yield {
      val extractContext = context.appendMetaDataContext("ExtractOperation", "ExtractOperation")
      extractContext.appendMetaDataContext("XPath", Option(xPath))
      XmlNodeSelectMapper(xPath)
    }
}

object XmlSplitMapper {
  def apply(context: Context,
            keysTry: Seq[Try[String]],
            outputTry: Try[DirIO]): Try[XmlNodeSplitMapper] =
    for {
      keys <- keysTry.toTrySeq.rethrow("An exception occurred while generating XmlManip Split keys.")
      outputIO <- outputTry.rethrow("An exception occurred while connecting XmlManip Split output.")
      output <- outputIO.mkDirs.rethrow("An exception occurred while creating DirIO directory.")
    } yield {
      val splitContext = context.appendMetaDataContext("SplitOperation", "SplitOperation")
      splitContext.appendMetaDataContext("Keys", Option(keys))
      splitContext.metaDataContexts += (("Output", context.metaDataContexts("SplitOutput")))
      XmlNodeSplitMapper(keys, output.fileName)
    }
}

object XmlWhereMapper {
  def apply(context: Context,
            xPathTry: Try[String],
            isExclude: Boolean): Try[XmlNodeXPathFilter] =
    for {
      xPath <- xPathTry.rethrow("An exception occurred while generating XmlManip Where xPath.")
    } yield {
      val whereContext = context.appendMetaDataContext("WhereOperation", "WhereOperation")
      whereContext.appendMetaDataContext("XPath", Option(xPath))
      XmlNodeXPathFilter(xPath, isExclude)
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
