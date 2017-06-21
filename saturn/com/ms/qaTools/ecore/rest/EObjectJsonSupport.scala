package com.ms.qaTools.ecore.rest

import scala.collection.JavaConversions._

import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore._
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.FeatureMap
import org.eclipse.emf.ecore.util.FeatureMapUtil

import spray.json._
import spray.json.DefaultJsonProtocol._

object EObjectJsonSupport {
  def resolveAllCurrentDocumentProxies(root: EObject): Unit = {
    for ((proxy, settings) <- EcoreUtil.UnresolvedProxyCrossReferencer.find(root)) {
      val uri = proxy.asInstanceOf[InternalEObject].eProxyURI
      if (uri.isCurrentDocumentReference) {
        val resolved = EcoreUtil.getEObject(root, uri.fragment)
        settings.foreach(EcoreUtil.replace(_, proxy, resolved))
      }
    }
  }

  def findPath(e: EObject): Seq[String] =
    (Iterator.iterate(e)(_.eContainer).takeWhile(_.eContainingFeature != null) :\ List.empty[String]) { (e, soFar) =>
      e.eContainingFeature match {
        case f if f.isMany =>
          val i = e.eContainer.eGet(f).asInstanceOf[EList[_]].indexOf(e)
          f.getName :: i.toString :: soFar
        case f =>
          f.getName :: soFar
      }
    }

  implicit class EDataTypeUtils(protected val e: EDataType) extends AnyVal {
    def isNumber = isJMathBigDecimal || isJMathBigInteger || isDouble || isInt || isShort || isLong
    def isBoolean = Set(classOf[Boolean], classOf[java.lang.Boolean]).contains(e.getInstanceClass)
    def isString = Set(classOf[java.lang.String]).contains(e.getInstanceClass)
    def isJMathBigInteger = Set(classOf[java.math.BigInteger]).contains(e.getInstanceClass)
    def isJMathBigDecimal = Set(classOf[java.math.BigDecimal]).contains(e.getInstanceClass)
    def isDouble = Set(classOf[Double], classOf[java.lang.Double]).contains(e.getInstanceClass)
    def isInt = Set(classOf[Int], classOf[java.lang.Integer]).contains(e.getInstanceClass)
    def isShort = Set(classOf[Short], classOf[java.lang.Short]).contains(e.getInstanceClass)
    def isLong = Set(classOf[Long], classOf[java.lang.Long]).contains(e.getInstanceClass)
  }

  implicit class EObjectJsValueUtils(protected val value: JsValue) extends AnyVal {
    def to(classifier: EClassifier)(implicit eObjectReader: JsonReader[EObject],
                                             eListReader: JsonReader[EList[EObject]]): Any = {
      (value, classifier) match {
        case (o: JsObject, _) => o.convertTo[EObject]
        case (a: JsArray, _) => a.convertTo[EList[EObject]]
        case (JsString(s), d: EEnum) => d.getEEnumLiteralByLiteral(s).getInstance
        case (JsNull, _) => null
        case (_, d: EDataType) if (d.isBoolean) => BooleanJsonFormat.read(value)
        case (_, d: EDataType) if (d.isString) => StringJsonFormat.read(value)
        case (_, d: EDataType) if (d.isInt) => IntJsonFormat.read(value)
        case (_, d: EDataType) if (d.isDouble) => DoubleJsonFormat.read(value)
        case (_, d: EDataType) if (d.isLong) => LongJsonFormat.read(value)
        case (_, d: EDataType) if (d.isJMathBigInteger) => new java.math.BigInteger(BigIntJsonFormat.read(value).toString)
        case (_, d: EDataType) if (d.isJMathBigDecimal) => new java.math.BigDecimal(BigDecimalJsonFormat.read(value).toString)
        case _            => throw new Exception(s"Could not create from $value")
      }
    }
  }
}

trait EObjectJsonSupport {
  import EObjectJsonSupport._

  def ePackages: Set[EPackage]

  def featuresToWrite(eObject: EObject): Seq[EStructuralFeature] = eObject.eClass.getEAllStructuralFeatures

  lazy val ePackagesByURI: Map[String, EPackage] = ePackages.map(p => p.getNsURI -> p).toMap

  case class EObjectMetaData(eClass: EClass, path: Option[String], eAttrs: Option[Seq[String]], eRefs: Option[Seq[String]]) {
    def this(e: EObject, path: Seq[String]) =
      this(e.eClass(), Option(path.mkString("/")), Option(e.eClass().getEAllAttributes.map {_.getName}), Option(e.eClass().getEAllReferences.map {_.getName}))      
  }

  protected def newEMeta(e: EObject, path: Seq[String]): EObjectMetaData = new EObjectMetaData(e, path)

  implicit val eListObjectJsonProtocolFormat: RootJsonFormat[EList[EObject]] = new RootJsonFormat[EList[EObject]] {
    def write(e: EList[EObject]) = JsArray(e.map {eObjectJsonProtocolFormat.write(_)}.toVector)
    def read(v: JsValue) = v match {
      case JsArray(a) => new BasicEList[EObject](a.map { eObjectJsonProtocolFormat.read(_) })
      case _ => throw new Exception(s"$v is not a JsArray")
    }
  }

  implicit object EClassJsonFormat extends JsonFormat[EClass] {
    case class EClassRepr(name: String, `package`: String)

    object EClassRepr {
      implicit val JsonFormat = jsonFormat2(apply)
      def apply(eClass: EClass): EClassRepr = apply(eClass.getName, eClass.getEPackage.getNsURI)
    }

    def read(json: JsValue) = {
      val repr = json.convertTo[EClassRepr]
      ePackagesByURI(repr.`package`).getEClassifier(repr.name).asInstanceOf[EClass]
    }

    def write(obj: EClass) = EClassRepr(obj).toJson
  }

  object EObjectMetaData {
    implicit val eObjectMetaDataJsonFormat = jsonFormat4(apply)
  }

  private def getEMeta(e: Map[String,JsValue]): EObjectMetaData = {
    e.getOrElse("_eMeta", throw new NoSuchElementException(e + " doesn't contain any EObject meta-information.")).convertTo[EObjectMetaData]
  }

  case class EProxy(uri: URI, `type`: EClass) {
    def toEObject: EObject = {
      val proxy = EcoreUtil.create(`type`).asInstanceOf[InternalEObject]
      proxy.eSetProxyURI(uri)
      proxy
    }
  }

  object EProxy {
    implicit object URIJsonFormat extends JsonFormat[URI] {
      def read(json: JsValue) = json match {
        case JsString(s) => URI.createURI(s)
        case _           => deserializationError("Expected JsString, but got " + json)
      }

      def write(obj: URI) = obj.toString.toJson
    }

    implicit val JsonFormat = jsonFormat2(apply)
  }

  case class FeatureMapEntry(featureName: String, value: EObject) {
    def toFeatureMapEntry(eClass: EClass) = {
      val feature = eClass.getEStructuralFeature(featureName)
      assert(feature != null, s"fail to find feature $featureName in ${eClass.getEPackage.getName}.${eClass.getName}")
      FeatureMapUtil.createEntry(feature, value)
    }
  }

  object FeatureMapEntry {
    implicit val JsonFormat = jsonFormat2(apply)
    def apply(entry: FeatureMap.Entry): FeatureMapEntry = apply(entry.getEStructuralFeature.getName,
                                                                entry.getValue.asInstanceOf[EObject])
  }

  protected def writeWithPath(e0: EObject, path: Seq[String]): JsObject = e0 match {
    case e: EObject => {
      val features = featuresToWrite(e)
      val json = features.foldLeft(Map[String,JsValue]()) ({
        case (map,f) if !f.isTransient && e.eIsSet(f) => f match {
          case f: EReference if !f.isContainment =>
            val x = e.eGet(f).asInstanceOf[EObject]
            if (x == null) map else {
              val root = EcoreUtil.getRootContainer(e)
              val uri =
                if (EcoreUtil.isAncestor(root, x))
                  URI.createHierarchicalURI(null, null, EcoreUtil.getRelativeURIFragmentPath(root, x))
                else EcoreUtil.getURI(x)
              map + (f.getName -> EProxy(uri, x.eClass).toJson)
            }
          case _ => e.eGet(f) match {
            case e: EObject    => map + (f.getName -> writeWithPath(e, path :+ f.getName))
            case e: FeatureMap => map + (f.getName -> (e: Seq[FeatureMap.Entry]).map(FeatureMapEntry.apply).toJson)
            case e: EList[_] => map + (f.getName -> JsArray(e.zipWithIndex.map { case (e: EObject, idx: Int) => writeWithPath(e, path :+ f.getName :+ idx.toString) }.toVector)) 
            case e: Any if (e != null) => {
              val datatype = f.asInstanceOf[EAttribute].getEAttributeType
              if (datatype.isNumber)
                map + (f.getName -> JsNumber(datatype.getEPackage.getEFactoryInstance.convertToString(datatype, e)))
              else if (datatype.isBoolean)
                map + (f.getName -> JsBoolean(datatype.getEPackage.getEFactoryInstance.convertToString(datatype, e).toBoolean))
              else
                map + (f.getName -> datatype.getEPackage.getEFactoryInstance.convertToString(datatype, e).toJson)
            }
            case _ => map
          }
        }
        case (map, _) => map
      })
      JsObject(json + ("_eMeta" -> newEMeta(e, path).toJson))
    }
    case _ => throw new Exception(s"Don't know what to do with $e0")
  }

  implicit val eObjectJsonProtocolFormat: RootJsonFormat[EObject] = new RootJsonFormat[EObject] {
    def write(e: EObject) = writeWithPath(e, findPath(e).toVector)

    def read(value: JsValue) = value match {
      case JsObject(contents: Map[String, JsValue]) => {
        val eClass = getEMeta(contents).eClass
        val eObject = EcoreUtil.create(eClass)
        contents.foreach {
          case (feature, value) =>
            Option(eClass.getEStructuralFeature(feature)).foreach {
              case f: EAttribute if (f.getUpperBound == -1) => {
                eObject.eGet(f) match {
                  case fm: FeatureMap => value.convertTo[Seq[FeatureMapEntry]].foreach { entry =>
                    fm.add(entry.toFeatureMapEntry(eClass))
                  }
                  case _ => sys.error(s"Don't know what to do with ${f.getName}")
                }
              }
              case f: EAttribute => eObject.eSet(f, value.to(f.getEType))
              case f: EReference =>
                eObject.eSet(f, if (f.isContainment) value.to(f.getEType) else value.convertTo[EProxy].toEObject)
            }
        }
        eObject
      }
      case _ => throw new Exception(s"Need a JsObject to produce an EObject.  Got: $value")
    }
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
