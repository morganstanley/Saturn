package com.ms.qaTools.io.rowSource

import java.sql.ResultSet

import scala.annotation.implicitNotFound

import org.w3c.dom.Document

import com.fasterxml.jackson.databind.JsonNode
import com.ms.qaTools.xml.NamespaceContextImpl

@implicitNotFound(msg = "Unable to convert ${A} to ${B}")
abstract class Convert[-A, +B] {
  def convert(x: A): B
}

object Convert extends DefaultConverts

trait DefaultConverts extends LowPriorityConverts {
  import Utils._

  implicit def identityConvert[A] = new Convert[A, A] {
    def convert(x: A) = x
  }

  implicit object ConvertStringToBytes extends Convert[String, Array[Byte]] {
    def convert(s: String) = s.getBytes
  }

  implicit object ConvertBytesToString extends Convert[Array[Byte], String] {
    def convert(bs: Array[Byte]) = new String(bs)
  }

  implicit object ByteArrayToDocument extends ToW3cDocument[Array[Byte]] {
    def convert(bs: Array[Byte]) = bs.toDocument
  }

  implicit object ResultSetToBytes extends Convert[ResultSet, Array[Byte]] {
    def convert(a: ResultSet) = a.toSeqString.mkString.getBytes
  }

  implicit object DataSetsToStringPairs extends ToStringPairs[Iterator[Seq[String]] with ColumnDefinitions] {
    def convert(ds: Iterator[Seq[String]] with ColumnDefinitions) = ds.toExtractorMappings
  }

  implicit def StringPairsToNamespaceContext[A: ToStringPairs] = new ToNamespaceContext[A] {
    def convert(x: A) = NamespaceContextImpl(implicitly[ToStringPairs[A]].convert(x).toMap)
  }

  implicit object W3cDocumentsToExtractRows extends ToExtractRows[Iterator[Document]] {
    def convert(xs: Iterator[Document]) = new W3CDocumentIteratorUtil(xs)
  }

  implicit object JsonsToExtractRows extends ToExtractRows[Iterator[JsonNode]] {
    def convert(xs: Iterator[JsonNode]) = new JsonIteratorUtil(xs)
  }
}

trait LowPriorityConverts {
  implicit def iteratorConvert[A, B](implicit conv: Convert[A, B]) = new Convert[Iterator[A], Iterator[B]] {
    def convert(xs: Iterator[A]) = xs.map(conv.convert)
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
