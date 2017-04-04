package com.ms.qaTools.protobuf.mappers

import com.google.protobuf.Message
import com.ms.qaTools.protobuf.getField
import com.google.protobuf.Descriptors.EnumValueDescriptor
import com.google.protobuf.Descriptors.FieldDescriptor.JavaType



case class PBComparatorMapper(
  field: Seq[String])
  extends PBMessageComparatorMapper {
  override def apply(options: (Message, Message)): Boolean = {
    val (inMessage1, inMessage2) = (options._1, options._2)

    val aValues = field.map(x => {
      val field1 = getField(x, inMessage1.toBuilder())
      field1._2.getJavaType() match {
        case JavaType.DOUBLE => {
          val value = field1._3.asInstanceOf[Double]
          value
        }
        case JavaType.ENUM => {
          val value = field1._3.asInstanceOf[EnumValueDescriptor].getIndex()
          value
        }
        case JavaType.FLOAT => {
          val value = field1._3.asInstanceOf[Float]
          value
        }
        case JavaType.INT => {
          val value = field1._3.asInstanceOf[Int]
          value
        }
        case JavaType.LONG => {
          val value = field1._3.asInstanceOf[Long]
          value
        }
      }
    })

    val bValues = field.map(x => {
      val field1 = getField(x, inMessage2.toBuilder())
      field1._2.getJavaType() match {
        case JavaType.DOUBLE => {
          val value = field1._3.asInstanceOf[Double]
          value
        }
        case JavaType.ENUM => {
          val value = field1._3.asInstanceOf[EnumValueDescriptor].getIndex()
          value
        }
        case JavaType.FLOAT => {
          val value = field1._3.asInstanceOf[Float]
          value
        }
        case JavaType.INT => {
          val value = field1._3.asInstanceOf[Int]
          value
        }
        case JavaType.LONG => {
          val value = field1._3.asInstanceOf[Long]
          value
        }
      }
    })

    val compares = aValues.zip(bValues).map {
      case (x, y) => x.compareTo(y)
    }

    compares.find(_ != 0) match {
      case None => false
      case Some(value) => value < 0
    }
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
