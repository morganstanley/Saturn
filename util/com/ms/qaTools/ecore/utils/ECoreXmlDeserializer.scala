package com.ms.qaTools.ecore.utils

import com.ms.qaTools.AnyUtil
import com.ms.qaTools.TryUtil
import java.io.OutputStream
import java.io.StringWriter
import java.lang.Boolean
import java.net.URL
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.URIConverter
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.XMLResource
import org.w3c.dom.Document
import scala.collection.JavaConversions.mapAsJavaMap
import scala.util.Try

trait ECoreXmlDeserializer[ObjectType <: EObject] {
  val packageInstance: EPackage
  val rootFeature: EStructuralFeature
  val resourceFactory: Resource.Factory

  val options = Map(
    XMLResource.OPTION_EXTENDED_META_DATA     -> Boolean.TRUE,
    XMLResource.OPTION_LAX_FEATURE_PROCESSING -> Boolean.TRUE)

  def newXmlResource = resourceFactory.createResource(URI.createFileURI("xml")).asInstanceOf[XMLResource]

  def resourceFrom(doc: Document): Resource =
    newXmlResource.withSideEffect(_.load(doc, options))

  def resourceFrom(uri: URI): Resource =
    resourceFactory.createResource(uri).withSideEffect(_.load(options))

  def resourceFrom(s: String): Resource =
    newXmlResource.withSideEffect(_.load(new URIConverter.ReadableInputStream(s), options))

  def deserialize(doc: Document): ObjectType = deserialize(resourceFrom(doc))
  def deserialize(uri: URI): ObjectType = deserialize(resourceFrom(uri))
  def deserialize(url: URL): ObjectType = deserialize(URI.createURI(url.toString))
  def deserialize(resource: Resource): ObjectType = resource.getContents.get(0).eGet(rootFeature).asInstanceOf[ObjectType]

  def deserializeFromString(data: String): ObjectType = deserialize(resourceFrom(data))

  protected def serialize(os: OutputStream, resource: Resource, model: EObject): Unit = {
    val resourceSet = new ResourceSetImpl()
    val extMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
    extMap.put("*", resourceFactory)
    //val resource = uriOrResource.fold({resourceSet.createResource(_)}, {r => r})
    resource.getContents().add(model)
    resource.save(os, null)
  }

  def serialize(uri: URI, model: ObjectType): Unit = serialize(URIConverter.INSTANCE.createOutputStream(uri), model.eResource, EcoreUtil.getRootContainer(model))

  def serialize(model: ObjectType): String =
    (new StringWriter).withSideEffect(w =>
      serialize(new URIConverter.WriteableOutputStream(w, System.getProperty("file.encoding")), model.eResource, EcoreUtil.getRootContainer(model))).toString
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
