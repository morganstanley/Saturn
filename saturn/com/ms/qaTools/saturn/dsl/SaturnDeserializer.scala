package com.ms.qaTools.saturn.dsl
import com.ms.qaTools.ecore.utils.ECoreStringUtils
import com.ms.qaTools.ecore.utils.ECoreXmlDeserializer
import com.ms.qaTools.saturn.IncludeFile
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.util.SaturnResourceFactoryImpl
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils.SaturnEObjectHelper
import com.ms.qaTools.TryUtil
import java.io.File
import org.eclipse.emf.ecore.EObject
import scala.collection.JavaConversions.asScalaIterator
import scala.collection.mutable
import scala.util.Try

object SaturnDeserializer extends ECoreXmlDeserializer[MSaturn] {
  val packageInstance = SaturnPackage.eINSTANCE
  val rootFeature = SaturnPackage.eINSTANCE.getDocumentRoot_Saturn()
  val resourceFactory = new SaturnResourceFactoryImpl()

  def extractAllIncludeFiles(eObject: EObject) =
    eObject.eAllContents.collect{case v: IncludeFile => v}.toList

  def extractPath(fileName: String, path: Option[String] = None) =
    Some(concatPaths(fileName, path).reverse.dropWhile(_ != File.separatorChar).reverse)

  protected def concatPaths(fileName: String, path: Option[String]) =
    Seq(path.filter(_.nonEmpty), Option(fileName)).flatten.mkString("/")

  def genIncludeFileMap(includeFiles: List[IncludeFile], path: Option[String]): Try[Map[IncludeFile, (MSaturn, String)]] = {
    def _genIncludeFileMap(files: List[IncludeFile], path: Option[String], m: Map[String, (MSaturn, List[IncludeFile])]): Map[String, (MSaturn, List[IncludeFile])] = files match {
      case Nil => m
      case f :: files =>
        assert(f.getMixed.size == 1 || f.getText.size == 1, s"could not open includeFile: ${f.getName}, fileName must contain only text.")
        val relative = f.getText.get(0).getText
        val absolute = new File(if (relative.head != File.separatorChar) concatPaths(relative, path) else relative).getAbsolutePath
        val newMap = m.get(absolute) match {
          case Some((saturn, includes)) => m.updated(absolute, (saturn, f :: includes))
          case None =>
            val saturn = SaturnDeserializer.deserialize(absolute.toUri)
            _genIncludeFileMap(extractAllIncludeFiles(saturn), extractPath(absolute), m.updated(absolute, (saturn, List(f))))}
        _genIncludeFileMap(files, path, newMap)
    }

    Try(_genIncludeFileMap(includeFiles, path, Map.empty)).map(_.flatMap {
      case (path, (saturn, includes)) => includes.map(i => (i -> ((saturn, path))))}.toMap)
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
