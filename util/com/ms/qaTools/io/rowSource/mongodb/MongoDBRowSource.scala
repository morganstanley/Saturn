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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
