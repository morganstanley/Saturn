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
