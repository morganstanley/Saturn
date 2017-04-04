package com.ms.qaTools.ldap

import javax.naming.directory.DirContext
import javax.naming.directory.DirContext
import javax.naming.directory.BasicAttribute
import javax.naming.directory.ModificationItem
import javax.naming.directory.SearchControls

package object mappers {

  trait LdapContentManipulator[InType, ReturnType] extends Function1[InType, ReturnType] {

    def getSearchControls(timeLimit: Int, scope: String): SearchControls = {
      val searchControls = new SearchControls
      scope match {
        case "OBJECT_SCOPE" => searchControls.setSearchScope(SearchControls.OBJECT_SCOPE)
        case "ONELEVEL_SCOPE" => searchControls.setSearchScope(SearchControls.ONELEVEL_SCOPE)
        case "SUBTREE_SCOPE" => searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE)
        case _ => searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE)
      }
      searchControls.setTimeLimit(timeLimit)
      searchControls
    }

    def modifyAttribute(ctx: DirContext, modOperation: Int, fullBindingName: String, attributeName: String, attributeValue: String = null) = {
      val mod = Some(attributeValue) match {
        case Some(x) => new ModificationItem(modOperation, new BasicAttribute(attributeName, attributeValue))
        case _ => new ModificationItem(modOperation, new BasicAttribute(attributeName))
      }
      ctx.modifyAttributes(fullBindingName, Array(mod))
    }
  }
  trait LdapContentAddAttributeMapper extends LdapContentManipulator[DirContext, DirContext]
  trait LdapContentReplaceAttributeMapper extends LdapContentManipulator[DirContext, DirContext]
  trait LdapContentRemoveAttributeMapper extends LdapContentManipulator[DirContext, DirContext]
  trait LdapContentAddSubContextMapper extends LdapContentManipulator[DirContext, DirContext]
  trait LdapContentDeleteSubContextMapper extends LdapContentManipulator[DirContext, DirContext]
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
