package com.ms.qaTools.jdbc

import com.ms.qaTools.AnyUtil
import java.io.StringReader
import java.math.BigDecimal
import java.sql.Blob
import java.sql.Clob
import java.sql.Date
import java.sql.Time
import java.sql.Timestamp
import java.sql.CallableStatement
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLXML
import java.sql.{Types, JDBCType}
import scala.util.Try
import scalaz._
import Scalaz._

object SQLTypeParameter {

  sealed abstract class SQLParameterGetSet[T >: Null <: AnyRef] {
    import scala.language.reflectiveCalls

    def optGetter(nulled: {def wasNull(): Boolean}, t: T): Option[T] = (! nulled.wasNull) option t
    protected def _set(i: Int, value: String, s: PreparedStatement): Unit
    def get(i: Int, s: CallableStatement): Option[T]
    def get(i: Int, s: ResultSet): Option[T]

    def set(i: Int, value: String, s: PreparedStatement) {
      if (value == null) s.setNull(i, Types.VARCHAR) else _set(i, value, s)
    }
  }

  case object SQLBlobParameterGetSet extends SQLParameterGetSet[Blob] {    
    def _set(i: Int, value: String, s: PreparedStatement) = ???
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getBlob(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getBlob(i))
  }

  case object SQLBooleanParameterGetSet extends SQLParameterGetSet[java.lang.Boolean] {
    def _set(i: Int, value: String, s: PreparedStatement) = {
      val parameterValue = Option(value).map(_.toUpperCase) match {
        case Some("TRUE")  | Some("1") => true
        case Some("FALSE") | Some("0") => false
        case Some(x) => throw new IllegalArgumentException(s"Expected a boolean or bit, but got: $value")
        case None => throw new NullPointerException
      }
      s.setBoolean(i, parameterValue)
    }
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getBoolean(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getBoolean(i))
  }

  case object SQLByteParameterGetSet extends SQLParameterGetSet[java.lang.Byte] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setByte(i, value.toByte)
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getByte(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getByte(i))
  }

  case object SQLBytesParameterGetSet extends SQLParameterGetSet[Array[Byte]] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setBytes(i, value.getBytes)
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getBytes(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getBytes(i))
  }

  case object SQLClobParameterGetSet extends SQLParameterGetSet[Clob] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setClob(i, new StringReader(value))
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getClob(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getClob(i))
  }

  case object SQLDateParameterGetSet extends SQLParameterGetSet[Date] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setDate(i, Date.valueOf(value))
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getDate(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getDate(i))
  }

  case object SQLDoubleParameterGetSet extends SQLParameterGetSet[java.lang.Double] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setDouble(i, value.toDouble)
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getDouble(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getDouble(i))
  }

  case object SQLFloatParameterGetSet extends SQLParameterGetSet[java.lang.Float] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setFloat(i, value.toFloat)
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getFloat(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getFloat(i))
  }

  case object SQLBigDecimalParameterGetSet extends SQLParameterGetSet[BigDecimal] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setBigDecimal(i, new BigDecimal(value))
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getBigDecimal(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getBigDecimal(i))
  }

  case object SQLNullParameterGetSet extends SQLParameterGetSet[Null] {
    def _set(i: Int, value: String, s: PreparedStatement) = {
      require(value == null, s"Attempt to assign `$value' to NULL type column")
      s.setNull(i, java.sql.Types.NULL)
    }
    def get(i: Int, s: CallableStatement) = None
    def get(i: Int, r: ResultSet) = None
  }

  case object SQLIntegerParameterGetSet extends SQLParameterGetSet[java.lang.Integer] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setInt(i, value.toInt)
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getInt(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getInt(i))
  }

  case object SQLShortParameterGetSet extends SQLParameterGetSet[java.lang.Short] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setShort(i, value.toShort)
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getShort(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getShort(i))
  }

  case object SQLStringParameterGetSet extends SQLParameterGetSet[String] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setString(i, value)
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getString(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getString(i))
  }

  case object SQLTimeParameterGetSet extends SQLParameterGetSet[Time] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setTime(i, Time.valueOf(value))
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getTime(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getTime(i))
  }

  case object SQLTimestampParameterGetSet extends SQLParameterGetSet[Timestamp] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setTimestamp(i, Timestamp.valueOf(value))
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getTimestamp(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getTimestamp(i))
  }

  case object SQLXmlParameterGetSet extends SQLParameterGetSet[SQLXML] {
    def _set(i: Int, value: String, s: PreparedStatement) =
      s.setSQLXML(i, s.getConnection.createSQLXML.withSideEffect(_.setString(value)))
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getSQLXML(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getSQLXML(i))
  }

  case object SQLBigIntegerParameterGetSet extends SQLParameterGetSet[BigInt] {
    def _set(i: Int, value: String, s: PreparedStatement) = s.setLong(i, value.toLong)
    def get(i: Int, s: CallableStatement) = optGetter(s, s.getLong(i))
    def get(i: Int, r: ResultSet) = optGetter(r, r.getLong(i))  
  }

  def apply(sqlType: Int): SQLParameterGetSet[_ >: Null <: AnyRef] = sqlType match {
    case java.sql.Types.BIGINT        => SQLBigIntegerParameterGetSet
    case java.sql.Types.BINARY        => SQLBytesParameterGetSet
    case java.sql.Types.BIT           => SQLBooleanParameterGetSet
    case java.sql.Types.BLOB          => SQLBlobParameterGetSet
    case java.sql.Types.BOOLEAN       => SQLBooleanParameterGetSet
    case java.sql.Types.CHAR          => SQLStringParameterGetSet
    case java.sql.Types.CLOB          => SQLClobParameterGetSet
    case java.sql.Types.DATE          => SQLDateParameterGetSet
    case java.sql.Types.DECIMAL       => SQLBigDecimalParameterGetSet
    case java.sql.Types.DOUBLE        => SQLDoubleParameterGetSet
    case java.sql.Types.FLOAT         => SQLFloatParameterGetSet
    case java.sql.Types.INTEGER       => SQLIntegerParameterGetSet
    case java.sql.Types.LONGNVARCHAR  => SQLStringParameterGetSet
    case java.sql.Types.LONGVARBINARY => SQLBytesParameterGetSet
    case java.sql.Types.LONGVARCHAR   => SQLStringParameterGetSet
    case java.sql.Types.NCHAR         => SQLStringParameterGetSet
    case java.sql.Types.NCLOB         => SQLClobParameterGetSet
    case java.sql.Types.NULL          => SQLNullParameterGetSet
    case java.sql.Types.NUMERIC       => SQLBigDecimalParameterGetSet
    case java.sql.Types.NVARCHAR      => SQLStringParameterGetSet
    case java.sql.Types.REAL          => SQLFloatParameterGetSet
    case java.sql.Types.SMALLINT      => SQLShortParameterGetSet
    case java.sql.Types.SQLXML        => SQLXmlParameterGetSet
    case java.sql.Types.TIME          => SQLTimeParameterGetSet
    case java.sql.Types.TIMESTAMP     => SQLTimestampParameterGetSet
    case java.sql.Types.TINYINT       => SQLByteParameterGetSet
    case java.sql.Types.VARBINARY     => SQLBytesParameterGetSet
    case java.sql.Types.VARCHAR       => SQLStringParameterGetSet
    case other                        => throw new IllegalArgumentException(JDBCType.valueOf(other).getName)
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
