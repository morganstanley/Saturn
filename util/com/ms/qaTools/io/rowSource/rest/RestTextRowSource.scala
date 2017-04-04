package com.ms.qaTools.io.rowSource.rest

import java.net.URI

import org.apache.http.NameValuePair
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.methods.HttpPut
import org.apache.http.client.methods.HttpDelete
import org.apache.http.entity.StringEntity
import org.apache.http.message.BasicNameValuePair
import org.apache.http.impl.client.DefaultHttpClient



/**
 * Extractor Text to URI
 */
class Text2UriRowSource(
  inputTextObject: Seq[(String, String)],
  uri: URI) extends GenericUriTransf {

  def generatePairs: Seq[NameValuePair] = {

    val qparams = (for (tupleValues <- inputTextObject) yield {
      new BasicNameValuePair(tupleValues._1, tupleValues._2)
    })
    qparams.toSeq
  }

  val uriFormatted = generateUri(generatePairs, uri)
}

object Text2UriRowSource {
  def apply(inputTextObject: Seq[(String, String)], uri: URI) = {
    new Text2UriRowSource(inputTextObject, uri)
  }
}

/**
 * Put class operation definition for a text input
 */
class RestPutText(
  httpPutObject: HttpPut,
  inputRowSourceInfo: Seq[(String, String)],
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpPut] {

  val httpPutObjectFormatted = {
    httpPutObject.setHeader("Accept", acceptHeader)
    httpPutObject.setHeader("Content-Type", contentType)
    httpPutObject.setURI(Text2UriRowSource(inputRowSourceInfo, httpPutObject.getURI()).uriFormatted)
    httpPutObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpPutObject) }
}

object RestPutText {
  def apply(httpPutObject: HttpPut, inputRowSourceInfo: Seq[(String, String)], acceptHeader: String = "text/plain", contentType: String = "text/plain; charset=UTF-8") = {
    new RestPutText(httpPutObject, inputRowSourceInfo, acceptHeader, contentType)
  }
}

/**
 * Post class operation definition for a text input
 */
class RestPostText(
  httpPostObject: HttpPost,
  inputRowSourceInfo: Seq[(String, String)], 
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpPost] {

  val httpPostObjectFormatted = {
    httpPostObject.setHeader("Accept", acceptHeader)
    httpPostObject.setHeader("Content-Type", contentType)
    httpPostObject.setURI(Text2UriRowSource(inputRowSourceInfo, httpPostObject.getURI()).uriFormatted)
    httpPostObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpPostObject) }
}

object RestPostText {
  def apply(httpPostObject: HttpPost, inputRowSourceInfo: Seq[(String, String)], acceptHeader: String = "text/plain", contentType: String = "text/plain; charset=UTF-8") = {
    new RestPostText(httpPostObject, inputRowSourceInfo, acceptHeader, contentType)
  }
}

/**
 * Get class operation definition for a text input
 */
class RestGetText(
  httpGetObject: HttpGet,
  inputRowSourceInfo: Seq[(String, String)],
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpGet] {

  val httpGetObjectFormatted = {
    httpGetObject.setHeader("Accept", acceptHeader)
    httpGetObject.setHeader("Content-Type", contentType)
    httpGetObject.setURI(Text2UriRowSource(inputRowSourceInfo, httpGetObject.getURI()).uriFormatted)
    httpGetObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpGetObject) }
}

object RestGetText {
  def apply(httpGetObject: HttpGet, inputRowSourceInfo: Seq[(String, String)], acceptHeader: String = "text/plain", contentType: String = "text/plain; charset=UTF-8") = {
    new RestGetText(httpGetObject, inputRowSourceInfo, acceptHeader, contentType)
  }
}

/**
 * Delete class operation definition for a text input
 */
class RestDeleteText(
  httpDeleteObject: HttpDelete,
  inputRowSourceInfo: Seq[(String, String)],
  acceptHeader: String,
  contentType: String) extends RestOperation[HttpDelete] {

  val httpDeleteObjectFormatted = {
    httpDeleteObject.setHeader("Accept", acceptHeader)
    httpDeleteObject.setHeader("Content-Type", contentType)
    httpDeleteObject.setURI(Text2UriRowSource(inputRowSourceInfo, httpDeleteObject.getURI()).uriFormatted)
    httpDeleteObject
  }

  def execute(client: DefaultHttpClient): String = { execute(client, httpDeleteObject) }
}

object RestDeleteText {
  def apply(httpDeleteObject: HttpDelete, inputRowSourceInfo: Seq[(String, String)], acceptHeader: String = "text/plain", contentType: String = "text/plain; charset=UTF-8") = {
    new RestDeleteText(httpDeleteObject, inputRowSourceInfo, acceptHeader, contentType)
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
