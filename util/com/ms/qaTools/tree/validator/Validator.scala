package com.ms.qaTools.tree.validator

import scala.util.matching.Regex
import com.ms.qaTools.tree._



trait Validator[NodeType] {
  val name: Option[String]
  val lookups: Seq[Lookup[NodeType]]
  def validate(actual: TreeNode[NodeType]): TreeResult[NodeType]
}

case class PatternValidator[NodeType](regex: Regex, lookups: Seq[Lookup[NodeType]] = Nil, name: Option[String] = None)  
  extends Validator[NodeType] {
  def getName: String = name.getOrElse("Pattern(" + regex + ", %s)".format(lookups.map {l => l.asPath}.mkString(", ")))
  def validate(actual: TreeNode[NodeType]): TreeResult[NodeType] = {
    if (lookups.isEmpty) {
      TreeResult[NodeType]() +# Result[NodeType](actual, validation = Set(PatternValidationResult(actual, regex, DiffMetaData(getName), regex.findFirstIn(actual.valueAsString).isDefined)))
    } else {
      lookups.foldLeft(TreeResult[NodeType]()) {
        (results, lookup) =>
          val nodes = lookup.getNodes(actual)
          nodes.foldLeft(results) {
            (r, n) => r +# Result[NodeType](n, validation = Set(PatternValidationResult(n, regex, DiffMetaData(getName), regex.findFirstIn(n.valueAsString).isDefined)))
          }
      }
    }
  }
}

case class ExistsValidator[NodeType](lookups: Seq[Lookup[NodeType]] = Nil, name: Option[String] = None)
  extends Validator[NodeType] {
  def getName: String = name.getOrElse("Exists(%s)".format(lookups.map {l => l.asPath}.mkString(", ")))
  def validate(actual: TreeNode[NodeType]): TreeResult[NodeType] = {
    if (lookups.isEmpty) {
      TreeResult[NodeType]() +# Result[NodeType](actual, validation = Set(ExistenceValidationResult(actual, DiffMetaData(getName), true)))
    } else {
      lookups.foldLeft(TreeResult[NodeType]()) {
        (results, lookup) =>
          val nodes = lookup.getNodes(actual)
          if (nodes.isEmpty) {
            val nonExistentNode = new TreeNode[NodeType] {
              lazy val node: NodeType = throw new Error("No node here!")
              val path: String = actual.path + "/" + lookup.asPath
              lazy val name: String = throw new Error("No name here!")
              lazy val attributes = Nil
              def children(f: (NodeType) => Boolean) = Nil 
              lazy val children: Seq[TreeNode[NodeType]] = Nil
              lazy val value = throw new Error("No value here!")
            }
            results +# Result[NodeType](nonExistentNode, validation = Set(ExistenceValidationResult[NodeType](nonExistentNode, DiffMetaData(getName), false)))
          } else
            nodes.foldLeft(results) {
              (r, n) => r +# Result[NodeType](n, validation = Set(ExistenceValidationResult(n, DiffMetaData(getName), true)))
            }
      }
    }
  }
}

case class EnumValidator[NodeType](enums: Seq[String], lookups: Seq[Lookup[NodeType]] = Nil, name: Option[String] = None)
  extends Validator[NodeType] {
  def getName: String = name.getOrElse("Enum(" + enums.mkString(", ") + ", %s)".format(lookups.map {l => l.asPath}.mkString(", ")))
  def validate(actual: TreeNode[NodeType]): TreeResult[NodeType] = {
    if (lookups.isEmpty) {
      TreeResult[NodeType]() +# Result[NodeType](actual, validation = Set(EnumValidationResult(actual, DiffMetaData(getName), enums.toList.contains(actual.valueAsString))))
    } else {
      lookups.foldLeft(TreeResult[NodeType]()) {
        (results, lookup) =>
          val nodes = lookup.getNodes(actual)
          nodes.foldLeft(results) {
            (r, n) => r +# Result[NodeType](n, validation = Set(EnumValidationResult(n, DiffMetaData(getName), enums.toList.contains(n.valueAsString))))
          }
      }
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
