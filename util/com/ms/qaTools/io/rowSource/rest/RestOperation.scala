package com.ms.qaTools.io.rowSource.rest

import java.net.URI

import scala.collection.JavaConversions.seqAsJavaList

import org.apache.http.NameValuePair
import org.apache.http.client.methods.HttpUriRequest
import org.apache.http.client.utils.URLEncodedUtils
import org.apache.http.impl.client.DefaultHttpClient
import org.apache.http.util.EntityUtils

import javax.ws.rs.core.UriBuilder



/**
 * Rest Operation generic definition, it will be used for the concrete operations
 * to execute the call of the rest service
 */
trait RestOperation[T <: HttpUriRequest] {

  val HTTP_OK = 200

  def execute(client: DefaultHttpClient, inputHttpObject: T) = {
    val response = client.execute(inputHttpObject)
    val statusCode = response.getStatusLine().getStatusCode()
    if (statusCode == HTTP_OK)
      EntityUtils.toString(response.getEntity()).toString
    else
      throw new Exception("Status code: " + statusCode +
        "Reason: " + response.getStatusLine().getReasonPhrase() +
        "Response: " + EntityUtils.toString(response.getEntity()).toString)
  }
}

/**
 * Generic trait to implement the methods to construct an uri for the different
 * types of clients
 */
trait GenericUriTransf {

  def generateUri(params: Seq[NameValuePair], uri: URI, encodeURL: Boolean = true, parameterSeparator: String = "&", nameValueSeparator: String = "=") = {
    // Encoding the parameters
    val query: String = if(encodeURL) URLEncodedUtils.format(params, "utf-8") 
                        else params.map(n => n.getName() + nameValueSeparator + n.getValue()).mkString(parameterSeparator)
    // Constructing the uri based on the parameters from the request
    val localUri: URI = UriBuilder.fromUri(uri)
      .replaceQuery(query)
      .build()
    localUri
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
