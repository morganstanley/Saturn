package com.ms.qaTools.io.rowSource.mongodb
import com.mongodb.{ MongoClient => MMongoClient }
import com.mongodb.ServerAddress
import com.mongodb.MongoClientOptions
import com.mongodb.MongoCredential
import com.mongodb.DBCursor
import com.mongodb.DB
import scala.collection.JavaConversions._
import java.io.Closeable

object MongoClient {
  def apply(host: String, port: Int, credential: MongoCredential, connectTimeout: Int = 1000, socketTimeout: Int = 0): MMongoClient = {
    val options = new MongoClientOptions.Builder().connectTimeout(connectTimeout).socketTimeout(socketTimeout).build
    MongoClient(new ServerAddress(host, port), Seq(credential), options)
  }

  def apply(serverAddress: ServerAddress, credentials: Seq[MongoCredential], options: MongoClientOptions) =
    new MMongoClient(serverAddress, credentials, options)

  def apply(host: String, port: Int) =
    new MMongoClient(new ServerAddress(host, port))
}

object MongoDBKerberizedConnection {
  def apply(host: String, port: Int, dbName: String, connectTimeout: Int = 10000, socketTimeout: Int = 0) = {
    val credential = MongoCredential.createGSSAPICredential(System.getProperty("user.name"))
    val client = MongoClient(host, port, credential, connectTimeout, socketTimeout)
    new MongoDBConnection(client, dbName)
  }
}

object MongoDBConnection {
  def apply(host: String, port: Int, dbName: String, user: String, password: String, connectTimeout: Int = 10000, socketTimeout: Int = 0) = {
    val credential = MongoCredential.createMongoCRCredential(user, dbName, password.toCharArray)
    val client = MongoClient(host, port, credential, connectTimeout, socketTimeout)
    new MongoDBConnection(client, dbName)
  }

  def apply(host: String, port: Int, dbName: String) =
    new MongoDBConnection(MongoClient(host, port), dbName)
}

class MongoDBConnection(val client: MMongoClient, val dbName: String) extends Closeable {
  val db = client.getDB(dbName)
  def getCollection(collection: String) = db.getCollection(collection)
  def dropDatabase = client.dropDatabase(dbName)
  def close = client.close
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
