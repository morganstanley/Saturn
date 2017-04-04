package com.ms.qaTools.io.rest.client

import org.apache.http.client.methods.HttpDelete
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.methods.HttpPut
import org.codehaus.jettison.json.JSONObject

import com.ms.qaTools.io.rowSource.rest.RestDeleteJSON
import com.ms.qaTools.io.rowSource.rest.RestGetJSON
import com.ms.qaTools.io.rowSource.rest.RestPostJSON
import com.ms.qaTools.io.rowSource.rest.RestPutJSON



/**
 * JSON Rest Client definition
 */
object RestJSONClient {
  // Put operation for a json input
  def apply(httpPutObject: HttpPut, requestInput: JSONObject, acceptHeader: String, contentType: String) = {
    RestPutJSON(httpPutObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpPutObject: HttpPut, requestInput: JSONObject) = {
    RestPutJSON(httpPutObject, requestInput)
  }
  // Get operation for a json input
  def apply(httpGetObject: HttpGet, requestInput: JSONObject, acceptHeader: String, contentType: String) = {
    RestGetJSON(httpGetObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpGetObject: HttpGet, requestInput: JSONObject) = {
    RestGetJSON(httpGetObject, requestInput)
  }
  // Post operation for a json input
  def apply(httpPostObject: HttpPost, requestInput: JSONObject, acceptHeader: String, contentType: String) = {
    RestPostJSON(httpPostObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpPostObject: HttpPost, requestInput: JSONObject) = {
    RestPostJSON(httpPostObject, requestInput)
  }
  // Delete operation for a json input
  def apply(httpDeleteObject: HttpDelete, requestInput: JSONObject, acceptHeader: String, contentType: String) = {
    RestDeleteJSON(httpDeleteObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpDeleteObject: HttpDelete, requestInput: JSONObject) = {
    RestDeleteJSON(httpDeleteObject, requestInput)
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
