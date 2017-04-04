package com.ms.qaTools.protobuf.generator

import com.google.protobuf.Message.Builder
import com.google.protobuf.DynamicMessage
import com.ms.qaTools.io.DelimitedRow
import com.ms.qaTools.tree.generator.ColContext
import com.ms.qaTools.tree.generator.Lookupable
import com.ms.qaTools.tree.generator.NodeCreator
import com.ms.qaTools.protobuf.setField
import com.google.protobuf.Descriptors



class PBMessageCreator(val field: String, val childCreators: List[NodeCreator[Builder, Builder]] = Nil) extends PBInnerNodeCreator {
  override val isLocal: Boolean = false
  override def create(row: DelimitedRow)(implicit colMap: Lookupable, colContext: ColContext, builder: Builder): Builder = {
    val cLocalIterators = this.adjustedIterators

    if (cLocalIterators.isEmpty) {
      implicit val subBuilder: Builder = if (!field.isEmpty() && builder.getDescriptorForType.findFieldByName(field).getType == Descriptors.FieldDescriptor.Type.MESSAGE) {
        val fieldDescriptor = builder.getDescriptorForType.findFieldByName(field)
        val descriptor = fieldDescriptor.getMessageType()
        val dynamicMessage = DynamicMessage.getDefaultInstance(descriptor).toBuilder()
        dynamicMessage
      } else {
        builder
      }

      val innerMsgBuilder = childCreators.foldLeft(subBuilder) { (m, c) => c.create(row)(colMap, colContext, m) }
      if (!field.isEmpty()) {
        val fieldDescriptor = builder.getDescriptorForType.findFieldByName(field)
        if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE) {
          setField(field, innerMsgBuilder.build, builder)
        }
      }
    } else {
      for (iterator <- cLocalIterators.toSeq.reverse) colContext.nextIndex(iterator)
      while (cLocalIterators.forall(!colContext.iteratorIsFinished(_, row))) {
        val fieldDescriptor = builder.getDescriptorForType().findFieldByName(field)
        val descriptor = fieldDescriptor.getMessageType()
        val dynamicMessage = DynamicMessage.getDefaultInstance(descriptor).toBuilder()
        val innerMsgBuilder = childCreators.foldLeft[Builder](dynamicMessage) { (m, c) => { c.create(row)(colMap, colContext, m) } }
        setField(field, innerMsgBuilder.build, builder)
        for (iterator <- cLocalIterators) colContext.nextIndex(iterator)
      }
    }
    builder
  }

  override def creators: Seq[NodeCreator[Builder, Builder]] = childCreators.toSeq
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
