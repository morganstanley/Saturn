package com.ms.qaTools.io.rowSource.rest

import java.io.Closeable

import scala.collection.JavaConversions._
import scala.util.Try

import org.apache.http.HttpEntity
import org.apache.http.HttpStatus
import org.apache.http.client.methods.{HttpGet, HttpPost, HttpPut, HttpDelete}
import org.apache.http.client.methods.HttpUriRequest
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.util.EntityUtils
import org.w3c.dom.Document

import com.fasterxml.jackson.databind.JsonNode
import com.ms.qaTools.io.rowSource.Utils._
import com.ms.qaTools.io.transports.HTTP

class RestRowSource[A: MediaType](http: HTTP, requests: Iterator[A])
    extends Iterator[( Int    // Status code
                     , String // Status line
                     , Try[A] // Parsed response
                     )]
    with Closeable {
  protected val reqTypeEv = implicitly[MediaType[A]]
  protected lazy val client = HttpClientBuilder.create.build()

  def close() = client.close()

  def hasNext = requests.hasNext

  def next = {
    val res = client.execute(request(requests.next))
    val status = res.getStatusLine
    (status.getStatusCode, status.toString, Try(reqTypeEv.fromEntity(res.getEntity)))
  }

  def dropStatus: Iterator[A] = map {
    case (HttpStatus.SC_OK, _, x) => x.get
    case (_,                s, x) => throw new Error(s"Status: $s, Response: $x")
  }

  protected def request(payload: A): HttpUriRequest = {
    import HTTP._
    val req = http match {
      case HTTP(uri, Get, _, _) =>
        new HttpGet(uri)
      case HTTP(uri, Post, _, _) =>
        val p = new HttpPost(uri)
        p.setEntity(reqTypeEv.toEntity(payload))
        p
      case HTTP(uri, Put, _, _) =>
        val p = new HttpPut(uri)
        p.setEntity(reqTypeEv.toEntity(payload))
        p
      case HTTP(uri, Delete, _, _) =>
        new HttpDelete(uri)
    }
    req.setHeader("Accept", reqTypeEv.mime)
    req.setHeader("Content-Type", reqTypeEv.mime)
    for ((k, v) <- http.headers) req.setHeader(k, v)
    req
  }
}

object RestRowSource {
  def apply[A: MediaType](http: HTTP, requests: Iterator[A]) = new RestRowSource(http, requests)

  implicit object TextMediaType extends MediaType[String] {
    val mime = com.google.common.net.MediaType.PLAIN_TEXT_UTF_8.toString
    def toEntity(x: String) = new StringEntity(x)
    def fromEntity(e: HttpEntity) = EntityUtils.toString(e)
  }

  implicit object JsonMediaType extends MediaType[JsonNode] {
    val mime = com.google.common.net.MediaType.JSON_UTF_8.toString
    def toEntity(x: JsonNode) = new StringEntity(x.toString)
    def fromEntity(e: HttpEntity) = EntityUtils.toString(e).toJsonNode
  }

  implicit object XmlMediaType extends MediaType[Document] {
    val mime = com.google.common.net.MediaType.XML_UTF_8.toString
    def toEntity(x: Document) = new StringEntity(x.toXmlString)
    def fromEntity(e: HttpEntity) = EntityUtils.toString(e).toDocument
  }
}

abstract class MediaType[A] {
  def mime: String
  def toEntity(x: A): HttpEntity
  def fromEntity(e: HttpEntity): A
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
