package com.ms.qaTools.io.rowSource.rest

import java.net.URI

import org.apache.http.NameValuePair
import org.apache.http.client.methods.HttpDelete
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.methods.HttpPut
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.DefaultHttpClient
import org.apache.http.message.BasicNameValuePair
import org.w3c.dom.Document

import com.ms.qaTools.io.rowSource.Utils._
import com.ms.qaTools.io.rowSource.file.XPathRowSource
import com.ms.qaTools.io.rowSource.file.XmlBufferRowSource
import com.ms.qaTools.tree.extraction.DetachNever
import com.ms.qaTools.xml.XmlExtractor
import com.ms.qaTools.xml.NamespaceContextImpl

import javax.xml.namespace.NamespaceContext



/**
 * Extractors XML to URI
 */
class XML2UriRowSource(
  inputXMLObject: Document,
  xPathMappings: Seq[(String, String)],
  uri: URI) extends GenericUriTransf {

  def generatePairs: Seq[NameValuePair] = {

    implicit val nsContext: NamespaceContext = NamespaceContextImpl()
    val rows = XPathRowSource(xPathMappings, List(inputXMLObject).iterator, false)
    val requestNames = rows.colNames

    val xmlExtractorResult = XmlExtractor(XmlBufferRowSource(inputXMLObject.toXmlString), xPathMappings, detachNodes = DetachNever())
    val qparams = (for (xmlValues <- xmlExtractorResult) yield {
      val innerComplexParams = (for ((requestValue, counter) <- xmlValues.zipWithIndex) yield {
        (new BasicNameValuePair(requestNames(counter), requestValue))
      })
      innerComplexParams
    })
    val responseParams = for (xs <- qparams; x <- xs) yield x
    responseParams.toSeq
  }

  val uriFormatted = generateUri(generatePairs, uri)
}

object XML2UriRowSource {
  def apply(inputXMLObject: Document, xPathMappings: Seq[(String, String)], uri: URI) = {
    new XML2UriRowSource(inputXMLObject, xPathMappings, uri)
  }
}

/**
 * Put class operation definition for a xml input
 */
class RestPutXML(
  httpPutObject: HttpPut,
  inputRowSourceInfo: Document,
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpPut] {

  val httpPutObjectFormatted = {
    httpPutObject.setHeader("Accept", acceptHeader)
    httpPutObject.setHeader("Content-Type", contentType)
    httpPutObject.setEntity(new StringEntity(inputRowSourceInfo.toXmlString))
    httpPutObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpPutObject) }
}

object RestPutXML {
  def apply(httpPutObject: HttpPut, inputRowSourceInfo: Document, acceptHeader: String = "text/xml", contentType: String = "text/xml; charset=UTF-8") = {
    new RestPutXML(httpPutObject, inputRowSourceInfo, acceptHeader, contentType)
  }
}

/**
 * Post class operation definition for a xml input
 */
class RestPostXML(
  httpPostObject: HttpPost,
  inputRowSourceInfo: Document,
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpPost] {

  val httpPostObjectFormatted = {
    httpPostObject.setHeader("Accept", acceptHeader)
    httpPostObject.setHeader("Content-Type", contentType)
    httpPostObject.setEntity(new StringEntity(inputRowSourceInfo.toXmlString))
    httpPostObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpPostObject) }
}

object RestPostXML {
  def apply(httpPostObject: HttpPost, inputRowSourceInfo: Document, acceptHeader: String = "text/xml", contentType: String = "text/xml; charset=UTF-8") = {
    new RestPostXML(httpPostObject, inputRowSourceInfo, acceptHeader, contentType)
  }
}

/**
 * Get class operation definition for a xml input
 */
class RestGetXML(
  httpGetObject: HttpGet,
  inputRowSourceInfo: Document,
  xPathMappings: Seq[(String, String)],
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpGet] {

  val httpGetObjectFormatted = {
    httpGetObject.setHeader("Accept", acceptHeader)
    httpGetObject.setHeader("Content-Type", contentType)
    httpGetObject.setURI(XML2UriRowSource(inputRowSourceInfo, xPathMappings, httpGetObject.getURI()).uriFormatted)
    httpGetObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpGetObject) }
}

object RestGetXML {
  def apply(httpGetObject: HttpGet, inputRowSourceInfo: Document, xPathMappings: Seq[(String, String)], acceptHeader: String = "text/xml", contentType: String = "text/xml; charset=UTF-8") = {
    new RestGetXML(httpGetObject, inputRowSourceInfo, xPathMappings, acceptHeader, contentType)
  }
}

/**
 * Delete class operation definition for a xml input
 */
class RestDeleteXML(
  httpDeleteObject: HttpDelete,
  inputRowSourceInfo: Document,
  xPathMappings: Seq[(String, String)],
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpDelete] {

  val httpPostObjectFormatted = {
    httpDeleteObject.setHeader("Accept", acceptHeader)
    httpDeleteObject.setHeader("Content-Type", contentType)
    httpDeleteObject.setURI(XML2UriRowSource(inputRowSourceInfo, xPathMappings, httpDeleteObject.getURI()).uriFormatted)
    httpDeleteObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpDeleteObject) }
}

object RestDeleteXML {
  def apply(httpDeleteObject: HttpDelete, inputRowSourceInfo: Document, xPathMappings: Seq[(String, String)], acceptHeader: String = "text/xml", contentType: String = "text/xml; charset=UTF-8") = {
    new RestDeleteXML(httpDeleteObject, inputRowSourceInfo, xPathMappings, acceptHeader, contentType)
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
