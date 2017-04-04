package com.ms.qaTools.ecore.utils

import java.lang.Boolean
import java.net.URL
import scala.collection.JavaConversions.mapAsJavaMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.URIConverter
import org.eclipse.emf.ecore.xmi.XMLResource
import scala.util.Try
import org.w3c.dom.Document

trait ECoreXmlDeserializer[ObjectType <: EObject] {
  val packageInstance: EPackage
  val rootFeature: EStructuralFeature
  val resourceFactory: Resource.Factory

  //  Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("pmc", new XMIResourceFactoryImpl)
  //  Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl)

  val options = Map(XMLResource.OPTION_EXTENDED_META_DATA -> Boolean.TRUE,
    XMLResource.OPTION_LAX_FEATURE_PROCESSING -> Boolean.TRUE)

  def newXmlResource = resourceFactory.createResource(URI.createFileURI("xml")).asInstanceOf[XMLResource]

  def resourceFrom(doc: Document): Try[Resource] = Try {
    val r = newXmlResource
    r.load(doc, options)
    r
  }

  def resourceFrom(uri: URI): Try[Resource] = Try {
    val r = resourceFactory.createResource(uri)
    r.load(options)
    r
  }

  def resourceFrom(s: String): Try[Resource] = Try {
    val r = newXmlResource
    r.load(new URIConverter.ReadableInputStream(s), options)
    r
  }

  def deserialize(doc: Document): Try[ObjectType] = resourceFrom(doc).flatMap(deserialize)
  def deserialize(uri: URI): Try[ObjectType] = resourceFrom(uri).flatMap(deserialize)
  def deserialize(url: URL): Try[ObjectType] = deserialize(URI.createURI(url.toString()))

  def deserialize(resource: Resource) = {
    for {
      eObject <- Try { resource.getContents().get(0) }
      eGetResult <- ECoreGetTry[ObjectType](eObject, rootFeature).recoverWith { case t: Throwable => throw new Exception(s"Something bad happened while deserializing: ${resource.getURI()}.", t) }
    } yield eGetResult
  }

 def deserializeFromString(data: String): Try[ObjectType] = resourceFrom(data).flatMap(deserialize)

  def serialize(uri: URI, model: ObjectType): Unit = {
    val resourceSet = new ResourceSetImpl()
    val extMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
    extMap.put("*", resourceFactory)
    //    resourceSet.getPackageRegistry().put(packageInstance.getNsURI(),packageInstance)

    val resource = resourceSet.createResource(uri)
    resource.getContents().add(model)

    resource.save(null)
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
