package com.ms.qaTools.toolkit.ldapManip

import org.kohsuke.args4j.Option
import org.kohsuke.args4j.spi.StringArrayOptionHandler
import com.ms.qaTools.ldap.mappers._
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.ExtendedCmdLine
import com.ms.qaTools.toolkit.cmdLine.InputLdap
import com.ms.qaTools.toolkit.cmdLine.OperationCmdLine



class LdapManipCmdLine(operationsMap: Map[String, Function1[BasicCmdLine, OperationCmdLine]])
  extends ExtendedCmdLine(operationsMap) with InputLdap {
}

class LdapManipAddAttributeCmdLine extends OperationCmdLine {
  @Option(name = "--timeLimit", required = false, usage = "Sets the time limit of SearchControls in milliseconds.")
  val timeLimit: Int = 1000

  @Option(name = "--scope", required = false, usage = "Set the search scope to one of OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE.")
  val scope: String = "SUBTREE_SCOPE"

  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object or * for all object.")
  val distinctName: String = null

  @Option(name = "--attributeName", required = true, usage = "Attribute Name to be added.")
  val attributeName: String = null

  @Option(name = "--attributeValue", required = true, usage = "Attribute Value to be added.")
  val attributeValue: String = null

  override val operationName = "LdapManip Add New Attribute"
  def createOperation: Any = LdapAddAttributeMapper(contextName, distinctName, attributeName, attributeValue, timeLimit, scope)
}

class LdapManipReplaceAttributeCmdLine extends OperationCmdLine {
  @Option(name = "--timeLimit", required = false, usage = "Sets the time limit of SearchControls in milliseconds.")
  val timeLimit: Int = 1000

  @Option(name = "--scope", required = false, usage = "Set the search scope to one of OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE")
  val scope: String = "SUBTREE_SCOPE"  

  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object or * for all object.")
  val distinctName: String = null

  @Option(name = "--attributeName", required = true, usage = "Attribute Name.")
  val attributeName: String = null

  @Option(name = "--attributeValue", required = true, usage = "Attribute Value to be replaced.")
  val attributeValue: String = null

  override val operationName = "LdapManip Modify Attribute"
  def createOperation: Any = LdapReplaceAttributeMapper(contextName, distinctName, attributeName, attributeValue, timeLimit, scope)
}

class LdapManipRemoveAttributeCmdLine extends OperationCmdLine {
  @Option(name = "--timeLimit", required = false, usage = "Sets the time limit of SearchControls in milliseconds.")
  val timeLimit: Int = 1000

  @Option(name = "--scope", required = false, usage = "Set the search scope to one of OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE")
  val scope: String = "SUBTREE_SCOPE"
  
  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object or * for all object.")
  val distinctName: String = null

  @Option(name = "--attributeName", required = true, usage = "Attribute to be removed.")
  val attributeName: String = null

  @Option(name = "--attributeValue", required = false, usage = "Attribute to be removed.")
  val attributeValue: String = null

  override val operationName = "LdapManip Modify Attribute"
  def createOperation: Any = LdapRemoveAttributeMapper(contextName, distinctName, attributeName, attributeValue, timeLimit, scope)
}

class LdapManipAddSubContextCmdLine extends OperationCmdLine {
  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object.")
  val distinctName: String = null

  @Option(name = "-v", aliases = Array("--attributeNameValue"), usage = "Attribute Values to be added.", handler = classOf[StringArrayOptionHandler])
  val attributeNamesValues: java.util.List[String] = new java.util.ArrayList[String]()

  @Option(name = "--seperator", required = false, usage = "Attribute Name Value seperator.")
  val seperator: String = ":"

  override val operationName = "LdapManip Add Sub-Context"
  def createOperation: Any = LdapAddSubContextMapper(contextName, distinctName, attributeNamesValues, seperator)
}

class LdapManipDeleteSubContextCmdLine extends OperationCmdLine {
  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object.")
  val distinctName: String = null

  override val operationName = "LdapManip Delete Sub-Context"
  def createOperation: Any = LdapDeleteSubContextMapper(contextName, distinctName)
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
