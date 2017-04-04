package com.ms.qaTools.io.rowSource.rest

import java.net.URI

import scala.collection.JavaConversions.asScalaIterator

import org.apache.http.NameValuePair
import org.apache.http.client.methods.HttpDelete
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.methods.HttpPut
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.DefaultHttpClient
import org.apache.http.message.BasicNameValuePair
import org.codehaus.jettison.json.JSONObject

import com.ms.qaTools.io.objectToNameValuePair



/**
 * Extractors JSON to URI
 */
class JSON2UriRowSource(
  inputJSONObject: JSONObject,
  uri: URI) extends GenericUriTransf {

  def generatePairs(inputJSONObject: JSONObject): Seq[Object] = {
    val qparams: java.util.List[NameValuePair] = new java.util.ArrayList[NameValuePair]()
    
    val jsonObjectKeysIterator = inputJSONObject.keys()
    val parameters = (for(jsonObjectKey <- jsonObjectKeysIterator) yield {
      val innerJsonValue = inputJSONObject.get(jsonObjectKey.toString)
      if (innerJsonValue.isInstanceOf[JSONObject]) {
        generatePairs(inputJSONObject.getJSONObject(jsonObjectKey.toString))
      } else {
        new BasicNameValuePair(jsonObjectKey.toString, innerJsonValue.toString())
      }
    })
    parameters.toSeq
  }
  
  val uriFormatted = generateUri(generatePairs(inputJSONObject), uri)
  val uriUnformatted = generateUri(generatePairs(inputJSONObject), uri, false)
}

object JSON2UriRowSource {
  def apply(inputJSONObject: JSONObject, uri: URI) = {
    new JSON2UriRowSource(inputJSONObject, uri)
  }
}

/**
 * Put class operation definition for a json input
 */
class RestPutJSON(
  httpPutObject: HttpPut,
  inputRowSourceInfo: JSONObject,
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpPut] {

  val httpPutObjectFormatted = {
    httpPutObject.setHeader("Accept", acceptHeader)
    httpPutObject.setHeader("Content-Type", contentType)
    httpPutObject.setEntity(new StringEntity(inputRowSourceInfo.toString()))
    httpPutObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpPutObject) }
}

object RestPutJSON {
  def apply(httpPutObject: HttpPut, inputRowSourceInfo: JSONObject, acceptHeader: String = "application/json", contentType: String = "application/json; charset=UTF-8") = {
    new RestPutJSON(httpPutObject, inputRowSourceInfo, acceptHeader, contentType)
  }
}

/**
 * Post class operation definition for a json input
 */
class RestPostJSON(
  httpPostObject: HttpPost,
  inputRowSourceInfo: JSONObject,
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpPost] {

  val httpPostObjectFormatted = {
    httpPostObject.setHeader("Accept", acceptHeader)
    httpPostObject.setHeader("Content-Type", contentType)
    httpPostObject.setEntity(new StringEntity(inputRowSourceInfo.toString()))
    httpPostObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpPostObject) }
}

object RestPostJSON {
  def apply(httpPostObject: HttpPost, inputRowSourceInfo: JSONObject, acceptHeader: String = "application/json", contentType: String = "application/json; charset=UTF-8") = {
    new RestPostJSON(httpPostObject, inputRowSourceInfo, acceptHeader, contentType)
  }
}

/**
 * Get class operation definition for a json input
 */
class RestGetJSON(
  httpGetObject: HttpGet,
  inputRowSourceInfo: JSONObject,
  acceptHeader: String,
  contentType: String,
  encodeURI: Boolean) extends RestOperation[HttpGet] {

  val httpGetObjectFormatted = {
    httpGetObject.setHeader("Accept", acceptHeader)
    httpGetObject.setHeader("Content-Type", contentType)
    val jsonURIRowSource = JSON2UriRowSource(inputRowSourceInfo, httpGetObject.getURI())
    val uri = if(encodeURI) jsonURIRowSource.uriFormatted else jsonURIRowSource.uriUnformatted
    httpGetObject.setURI(uri)
    httpGetObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpGetObject) }
}

object RestGetJSON {
  def apply(httpGetObject: HttpGet, inputRowSourceInfo: JSONObject, acceptHeader: String = "application/json", contentType: String = "application/json; charset=UTF-8", encodeURI: Boolean = true) = {
    new RestGetJSON(httpGetObject, inputRowSourceInfo, acceptHeader, contentType, encodeURI)
  }
}

/**
 * Delete class operation definition for a json input
 */
class RestDeleteJSON(
  httpDeleteObject: HttpDelete,
  inputRowSourceInfo: JSONObject,
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpDelete] {

  val httpGetObjectFormatted = {
    httpDeleteObject.setHeader("Accept", acceptHeader)
    httpDeleteObject.setHeader("Content-Type", contentType)
    httpDeleteObject.setURI(JSON2UriRowSource(inputRowSourceInfo, httpDeleteObject.getURI()).uriFormatted)
    httpDeleteObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpDeleteObject) }
}

object RestDeleteJSON {
  def apply(httpDeleteObject: HttpDelete, inputRowSourceInfo: JSONObject, acceptHeader: String = "application/json", contentType: String = "application/json; charset=UTF-8") = {
    new RestDeleteJSON(httpDeleteObject, inputRowSourceInfo, acceptHeader, contentType)
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
