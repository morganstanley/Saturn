package com.ms.qaTools.tree.extraction

import com.ms.qaTools.tree.TreeNode



trait Step[T] {
  def getText(): String
  def hasPredicates: Boolean
  def resolve(context: TreeNode[T]): Seq[TreeNode[T]]
}

trait ColumnMapping[T] {
  val step: Step[T]
  val mapping: Option[Index]
  val children: Seq[ColumnMapping[T]]
  def +(that: ColumnMapping[T]): ColumnMapping[T]
  val sf = { (a: ColumnMapping[T], b: ColumnMapping[T]) => a.step.getText() < b.step.getText() }
  val cf = { (a: ColumnMapping[T], b: ColumnMapping[T]) => a.step.getText().compareTo(b.step.getText()) }
  val mf = { p: (Option[ColumnMapping[T]], Option[ColumnMapping[T]]) =>
    p match {
      case (Some(a), Some(b)) => a + b
      case (Some(a), None)    => a
      case (None, Some(b))    => b
      case (None, None)       => throw new Error("You've reached unreachable code.")
    }
  }
  override def toString = mapping match {
    case Some(m) => step + " -> " + m.index
    case None => step + " -> None" 
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
