package com.ms.qaTools.io.rowWriter.mongodb

import com.mongodb.DBObject
import com.ms.qaTools.conversions.MongoDB.mapToDBObject
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.mongodb.MongoDBConnection
import java.io.Closeable
import com.mongodb.WriteResult

abstract class MongoDBRowWriter(connection: MongoDBConnection, collectionName: String) extends Writer[Iterator[DBObject]] with Closeable {
  private val db = connection.db
  def collection = db.getCollection(collectionName)
  def create(options: Map[String, Any]) = if (!exists) db.createCollection(collectionName, options) else collectionExists
  def drop: Long = if (exists) {val c = count; collection.drop; c} else collectionDoesNotExist
  def count: Long = if (exists) collection.count else collectionDoesNotExist
  def exists = db.collectionExists(collectionName)
  def close = connection.close
  
  protected def collectionDoesNotExist = throw new Error("Collection '%s' does not exist".format(collectionName))
  protected def collectionExists = throw new Error("Collection '%s' already exists".format(collectionName))
  protected def writeActionResult(w: WriteResult): Int = Option(w.getError()) map {_ => 0} getOrElse 1
}

class MongoDBInsertRowWriter(connection: MongoDBConnection, collectionName: String) extends MongoDBRowWriter(connection, collectionName) {
  override def write(source: Iterator[DBObject]) = {
    source.foldLeft(0)((count, o) => {
      count + writeActionResult(collection.insert(o))
    })
  }

  def upsert(source: Iterator[(Option[DBObject], DBObject)]) = {
    source.foldLeft(0) {
      case (count, (query, obj)) => {
        count + query.map(q => writeActionResult(collection.update(q, obj, true, false))).getOrElse(writeActionResult(collection.insert(obj)))
      }
    }
  }
}

class MongoDBRemoveRowWriter(connection: MongoDBConnection, collectionName: String) extends MongoDBRowWriter(connection, collectionName) {
  override def write(source: Iterator[DBObject]) = {
    source.foldLeft(0)((count, o) => {      
      count + writeActionResult(collection.remove(o))
    })
  }
}

class MongoDBSaveRowWriter(connection: MongoDBConnection, collectionName: String) extends MongoDBRowWriter(connection, collectionName) {
  override def write(source: Iterator[DBObject]) = {
    source.foldLeft(0)((count, o) => {      
      count + writeActionResult(collection.save(o))
    })
  }
}

object MongoDBSaveRowWriter {
  def apply(connection: MongoDBConnection, collectionName: String) = new MongoDBSaveRowWriter(connection, collectionName)
}

object MongoDBInsertRowWriter {
  def apply(connection: MongoDBConnection, collectionName: String) = new MongoDBInsertRowWriter(connection, collectionName)
}

object MongoDBRemoveRowWriter {
  def apply(connection: MongoDBConnection, collectionName: String) = new MongoDBRemoveRowWriter(connection, collectionName)
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
