package com.ms.qaTools.io.rest.client

import org.apache.http.client.methods.HttpDelete
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.client.methods.HttpPut
import org.w3c.dom.Document

import com.ms.qaTools.io.rowSource.rest.RestDeleteXML
import com.ms.qaTools.io.rowSource.rest.RestGetXML
import com.ms.qaTools.io.rowSource.rest.RestPostXML
import com.ms.qaTools.io.rowSource.rest.RestPutXML



/**
 * XML Rest Client definition
 */
object RestXMLClient {
  // Put operation for a xml input
  def apply(httpPutObject: HttpPut, requestInput: Document, acceptHeader: String, contentType: String) = {
    RestPutXML(httpPutObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpPutObject: HttpPut, requestInput: Document) = {
    RestPutXML(httpPutObject, requestInput)
  }
  // Get operation for a xml input
  def apply(httpGetObject: HttpGet, requestInput: Document, mappings: Seq[(String, String)], acceptHeader: String, contentType: String) = {
    RestGetXML(httpGetObject, requestInput, mappings, acceptHeader, contentType)
  }
  def apply(httpGetObject: HttpGet, requestInput: Document, mappings: Seq[(String, String)]) = {
    RestGetXML(httpGetObject, requestInput, mappings)
  }
  // Post operation for a xml input
  def apply(httpPostObject: HttpPost, requestInput: Document, acceptHeader: String, contentType: String) = {
    RestPostXML(httpPostObject, requestInput, acceptHeader, contentType)
  }
  def apply(httpPostObject: HttpPost, requestInput: Document) = {
    RestPostXML(httpPostObject, requestInput)
  }
  // Delete operation for a xml input
  def apply(httpDeleteObject: HttpDelete, requestInput: Document, mappings: Seq[(String, String)], acceptHeader: String, contentType: String) = {
    RestDeleteXML(httpDeleteObject, requestInput, mappings, acceptHeader, contentType)
  }
  def apply(httpDeleteObject: HttpDelete, requestInput: Document, mappings: Seq[(String, String)]) = {
    RestDeleteXML(httpDeleteObject, requestInput, mappings)
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
