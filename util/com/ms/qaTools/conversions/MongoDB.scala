package com.ms.qaTools.conversions

import scala.collection.JavaConversions.mapAsJavaMap
import scala.collection.JavaConversions.seqAsJavaList
import scala.collection.JavaConverters.asScalaSetConverter
import scala.util.parsing.json.JSONObject

import com.mongodb.BasicDBObject
import com.mongodb.BasicDBObjectBuilder
import com.mongodb.DBObject
import com.mongodb.util.JSON.parse
import com.ms.qaTools.AnyUtil

object MongoDB {
  implicit def stringToDBObject(query: String): DBObject = try {
    parse(query).asInstanceOf[DBObject]
  } catch {
    case t: Throwable => throw new Exception("Can't create DBObject from string: %s.".format(query), t)
  }

  implicit def dbObjectToSeqString(dbObject: DBObject): Seq[String] = dbObject.keySet.asScala.toSeq.map(k => dbObject.get(k).toString)
  implicit def dbObjectToStringMap(dbObject: DBObject): Map[String, String] = dbObject.keySet.asScala.map(k => k -> dbObject.get(k).toString).toMap
  implicit def dbObjectToMap(dbObject: DBObject): Map[String, Any] = 
    dbObject.keySet.asScala.foldLeft(Map[String,Any]()) {
      (m,k) =>
        Option(dbObject.get(k)) match {
          case Some(d: DBObject) => m ++ Map(k -> dbObjectToMap(d))
          case Some(o: Any) => m ++ Map(k -> o.toString)
        }
    }
  implicit def jsonToDBObject(o: JSONObject): DBObject = new BasicDBObject(o.obj)

  implicit def mapToDBObject(m: Map[String, Any]): DBObject = {
    def valueOf(a: Any): Any = a match {
      case m: Map[String, Any] => mapToDBObject(m)
      case s: Traversable[_] => s.map {valueOf(_)}.toList :java.util.List[Any]
      case _ => a
    }
    m.foldLeft(new BasicDBObject){case (o, (key, value)) => o.put(key, valueOf(value)); o}
  }
  
  implicit class AugmentedBuilder(builder: BasicDBObjectBuilder) {
    def addOption[X](name: String, o: Option[X]) = builder.withSideEffect { b => o.foreach {b.add(name, _)} }
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
