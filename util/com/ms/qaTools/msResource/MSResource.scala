package com.ms.qaTools.msResource

import java.util.Properties
import com.ms.qaTools.Logger

object MSResource {

  val logger = Logger(this.getClass())

    // Defaults to resource.properties
	def apply(resourceName:String = "resources/resource.properties") = {
		val msResource = new MSResource(new Properties)
		msResource.loadResourceProperties(resourceName)
		msResource
	}
}

class MSResource(resourceProperties: Properties) {
  
  	def loadResourceProperties(resourceName: String) = {
	  
		val classLoader = Thread.currentThread().getContextClassLoader()
		val resourceInputStream = classLoader.getResourceAsStream(resourceName)		
		
		try {
			resourceProperties.load(resourceInputStream)
		} catch {
			case e: Exception => MSResource.logger.warn("Unable to load resource " + resourceName + ": " + e) // Just a warning, will result in empty properties
		}
	}

  	// System property will override resource property
  	def getMSProperty(propertyName: String):Option[String] = {

  	  val systemProperties = System.getProperties
  	  val systemProperty = Option(systemProperties.getProperty(propertyName))
  	  systemProperty.orElse(Option(resourceProperties.getProperty(propertyName)))
  	}
  	
  	def getProperties():Properties = resourceProperties
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
