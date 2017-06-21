package com.ms.qaTools.slick

import scala.slick.driver.PostgresDriver._
import org.postgresql.util.PGobject
import com.ms.qaTools._
import _root_.spray.json._
import scala.util.Try
import _root_.spray.json._
import _root_.spray.json.DefaultJsonProtocol
import _root_.spray.json.DefaultJsonProtocol._

package object utils {
  implicit val t = new DriverJdbcType[PGobject] {
    override def hasLiteralForm = false
    def getValue(r: java.sql.ResultSet, idx: Int): org.postgresql.util.PGobject = {
      val value = r.getObject(idx)
      if (r.wasNull) null.asInstanceOf[PGobject] else value.asInstanceOf[PGobject]
    }
    override def sqlTypeName: String = "json"
    def setValue(v: org.postgresql.util.PGobject, p: java.sql.PreparedStatement, idx: Int): Unit = p.setObject(idx, v)
    def sqlType: Int = Integer.MAX_VALUE // this is a hack.
    def updateValue(v: org.postgresql.util.PGobject, r: java.sql.ResultSet, idx: Int): Unit = r.updateObject(idx, v)
  }

  import com.ms.qaTools.spray.utils._
  implicit val mapStringAnyTypedType = MappedJdbcType.base[Map[String,Any], PGobject](
    {s: Map[String,Any] => {
      new PGobject().withSideEffect {o =>
        o.setType("json")
        o.setValue(mapFormat[String, Any].write(s).toString)
      }}
    },
    {s: PGobject => mapFormat[String, Any].read(s.getValue.parseJson)}
  )
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
