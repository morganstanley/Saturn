package com.ms.qaTools.io.rowSource.mongodb
import com.mongodb.DBCursor
import com.mongodb.DBObject
import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import java.io.Closeable
import scala.collection.JavaConversions.asScalaSet

class MongoDBRowSource(val cursor: DBCursor) extends Iterator[DBObject] with ColumnDefinitions with Closeable {
  val columns = cursor.getQuery.keySet.toSeq
  override val colDefs = columns.zipWithIndex.map{case (n, i) => ColumnDefinition(name = n, index = i)}
  def hasNext = cursor.hasNext
  def next = cursor.next
  def close = cursor.close
}

object MongoDBRowSource {
  def apply(connection: MongoDBConnection, collectionName: String) =
    new MongoDBRowSource(connection.db.getCollection(collectionName).find)

  def apply(connection: MongoDBConnection, collectionName: String, query: Option[DBObject] = None,
            fields: Option[DBObject] = None, orderBy: Option[DBObject] = None) = {
    val collection = connection.db.getCollection(collectionName)
    val cursor = query.fold(collection.find){q => fields.fold(collection.find(q)) {collection.find(q, _)}}
    new MongoDBRowSource(orderBy.fold(cursor){cursor.sort})
  }

  def apply(connection: MongoDBConnection, collectionName: String, query: DBObject, keys: DBObject) =
    new MongoDBRowSource(connection.db.getCollection(collectionName).find(query, keys))
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
