package com.ms.qaTools.toolkit.cmdLine

import org.kohsuke.args4j.Option
import com.ms.qaTools.ldap._

class LdapManipCmdLine(operationsMap: Map[String, () => OperationCmdLine[LdapContentManipulator]]) extends ExtendedCmdLine(operationsMap) {
  @Option(name = "--authenticationType", usage = "Security Authentication.", required = true)
  val authenticationType: String = "Simple"

  @Option(name = "--providerURL", usage = "Specify the provider URL.", required = true)
  val providerURL: String = null

  @Option(name = "--securityPrincipal", usage = "Specify Security Principal.", required = true)
  val securityPrincipal: String = null

  @Option(name = "--securityCredentials", usage = "Specify the Security Credentials.", required = true)
  val securityCredentials: String = null
}

class LdapManipAddAttributeCmdLine extends OperationCmdLine[LdapAddAttributeMapper] {
  @Option(name = "--timeLimit", usage = "Sets the time limit of SearchControls in milliseconds.")
  val timeLimit: Int = 1000

  @Option(name = "--scope", usage = "Set the search scope to one of OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE.")
  val scope: String = "SUBTREE_SCOPE"

  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object or * for all object.")
  val distinctName: String = null

  @Option(name = "--attributeName", required = true, usage = "Attribute Name to be added.")
  val attributeName: String = null

  @Option(name = "--attributeValue", required = true, usage = "Attribute Value to be added.")
  val attributeValue: String = null

  val operationName = "LdapManip Add New Attribute"
  def createOperation = LdapAddAttributeMapper(contextName, distinctName, attributeName, attributeValue, timeLimit, scope)
}

class LdapManipReplaceAttributeCmdLine extends OperationCmdLine[LdapReplaceAttributeMapper] {
  @Option(name = "--timeLimit", usage = "Sets the time limit of SearchControls in milliseconds.")
  val timeLimit: Int = 1000

  @Option(name = "--scope", usage = "Set the search scope to one of OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE")
  val scope: String = "SUBTREE_SCOPE"

  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object or * for all object.")
  val distinctName: String = null

  @Option(name = "--attributeName", required = true, usage = "Attribute Name.")
  val attributeName: String = null

  @Option(name = "--attributeValue", required = true, usage = "Attribute Value to be replaced.")
  val attributeValue: String = null

  val operationName = "LdapManip Modify Attribute"
  def createOperation = LdapReplaceAttributeMapper(contextName, distinctName, attributeName, attributeValue, timeLimit, scope)
}

class LdapManipRemoveAttributeCmdLine extends OperationCmdLine[LdapRemoveAttributeMapper] {
  @Option(name = "--timeLimit", usage = "Sets the time limit of SearchControls in milliseconds.")
  val timeLimit: Int = 1000

  @Option(name = "--scope", usage = "Set the search scope to one of OBJECT_SCOPE, ONELEVEL_SCOPE, SUBTREE_SCOPE")
  val scope: String = "SUBTREE_SCOPE"

  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object or * for all object.")
  val distinctName: String = null

  @Option(name = "--attributeName", required = true, usage = "Attribute to be removed.")
  val attributeName: String = null

  @Option(name = "--attributeValue", usage = "Attribute to be removed.")
  val attributeValue: String = null

  val operationName = "LdapManip Modify Attribute"
  def createOperation = LdapRemoveAttributeMapper(contextName, distinctName, attributeName, attributeValue, timeLimit, scope)
}

class LdapManipAddSubContextCmdLine extends OperationCmdLine[LdapAddSubContextMapper] {
  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object.")
  val distinctName: String = null

  @Option(name = "-v", aliases = Array("--attributeNameValue"), usage = "Attribute Values to be added.", handler = classOf[QuotedStringArrayOptionHandler])
  val attributeNamesValues: java.util.List[String] = new java.util.ArrayList[String]()

  @Option(name = "--seperator", usage = "Attribute Name Value seperator.")
  val seperator: String = ":"

  val operationName = "LdapManip Add Sub-Context"
  def createOperation = LdapAddSubContextMapper(contextName, distinctName, attributeNamesValues, seperator)
}

class LdapManipDeleteSubContextCmdLine extends OperationCmdLine[LdapDeleteSubContextMapper] {
  @Option(name = "--contextName", required = true, usage = "Name of the context or object to search.")
  val contextName: String = null

  @Option(name = "--distinctName", required = true, usage = "Relatively Distinct Name of the object.")
  val distinctName: String = null

  val operationName = "LdapManip Delete Sub-Context"
  def createOperation = LdapDeleteSubContextMapper(contextName, distinctName)
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
