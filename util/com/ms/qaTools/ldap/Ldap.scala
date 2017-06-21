package com.ms.qaTools.ldap
import com.ms.qaTools.AnyUtil
import javax.naming.Context
import javax.naming.{directory => d}
import scala.collection.JavaConverters._

class Ldap(authentication: String, providerURL: String, securityPrincipal: String, securityCredentials: String) extends java.io.Closeable {
  val dirContext: d.DirContext = new d.InitialDirContext((new java.util.Hashtable[String, String]).withSideEffect{t =>
    t.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory")
    t.put(Context.SECURITY_AUTHENTICATION, authentication)
    t.put(Context.PROVIDER_URL, providerURL)
    t.put(Context.SECURITY_PRINCIPAL, securityPrincipal)
    t.put(Context.SECURITY_CREDENTIALS, securityCredentials)})

  def manipulate(manipulators: TraversableOnce[LdapContentManipulator]): Unit =
    manipulators.foreach(_.apply(dirContext))

  def close() = dirContext.close
}

sealed trait LdapContentManipulator extends Function1[d.DirContext, Unit] {
  def getSearchControls(timeLimit: Int, scope: String) =
    (new d.SearchControls).withSideEffect{c =>
      c.setSearchScope(scope match {
        case "OBJECT_SCOPE"   => d.SearchControls.OBJECT_SCOPE
        case "ONELEVEL_SCOPE" => d.SearchControls.ONELEVEL_SCOPE
        case "SUBTREE_SCOPE"  => d.SearchControls.SUBTREE_SCOPE
        case _                => d.SearchControls.SUBTREE_SCOPE})
      c.setTimeLimit(timeLimit)}

  def modifyAttribute(ctx: d.DirContext, modOperation: Int, fullBindingName: String, name: String, value: String = null) =
    ctx.modifyAttributes(fullBindingName, Array(
      new d.ModificationItem(modOperation, if(value != null) new d.BasicAttribute(name, value) else new d.BasicAttribute(name))))

  def iterate[A](e: javax.naming.NamingEnumeration[A]) =
    Iterator.continually(if (e.hasMore) Some(e.next) else None).takeWhile(_.nonEmpty).flatten
}

case class LdapAddAttributeMapper(contextName: String, distinctName: String, attributeName: String, attributeValue: String, timeLimit: Int, scope: String) extends LdapContentManipulator {
  def apply(ctx: d.DirContext) =
    iterate(ctx.search(contextName, "(objectClass=*)", getSearchControls(timeLimit, scope))).filter(_.getName.nonEmpty).foreach{result =>
      if (Seq("*", result.getName).contains(distinctName))
        modifyAttribute(ctx, d.DirContext.ADD_ATTRIBUTE, result.getNameInNamespace, attributeName, attributeValue)}
}

case class LdapAddSubContextMapper(contextName: String, distinctName: String, attributeNamesValues: java.util.List[String], separator: String) extends LdapContentManipulator {
  def apply(ctx: d.DirContext) = ctx.createSubcontext(
    distinctName + "," + contextName,
    (new d.BasicAttributes()).withSideEffect(attributes =>
      attributeNamesValues.asScala.foreach(attr => attr.split(separator) match {
        case Array(k, v) => attributes.put(k, v)
        case _ => require(false, s"Wrong format for attribute: expected `key${separator}value` got `$attr`")})))
}

case class LdapDeleteSubContextMapper(contextName: String, distinctName: String) extends LdapContentManipulator {
  def apply(ctx: d.DirContext) = util.Try(ctx.destroySubcontext(distinctName + "," + contextName))
}

case class LdapReplaceAttributeMapper(contextName: String, distinctName: String, attributeName: String, attributeValue: String, timeLimit: Int, scope: String) extends LdapContentManipulator {
  def apply(ctx: d.DirContext) =
    iterate(ctx.search(contextName, "(objectClass=*)", getSearchControls(timeLimit, scope))).filter(_.getName.nonEmpty).foreach{result =>
      if (Seq("*", result.getName).contains(distinctName))
        if (result.getName.split("=").head == attributeName && distinctName != "*")
          ctx.rename(result.getNameInNamespace, attributeName + "=" + attributeValue + "," + contextName)
        else
          modifyAttribute(ctx, d.DirContext.REPLACE_ATTRIBUTE, result.getNameInNamespace, attributeName, attributeValue)}
}

case class LdapRemoveAttributeMapper(contextName: String, distinctName: String, attributeName: String, attributeValue: String, timeLimit: Int, scope: String) extends LdapContentManipulator {
  def apply(ctx: d.DirContext) =
    iterate(ctx.search(contextName, "(objectClass=*)", getSearchControls(timeLimit, scope))).filter(_.getName.nonEmpty).foreach{result =>
      if (distinctName == "*" || (distinctName == result.getName && attributeValue == null))
        modifyAttribute(ctx, d.DirContext.REMOVE_ATTRIBUTE, result.getNameInNamespace, attributeName)
      else if(distinctName == result.getName)
        iterate(result.getAttributes.get(attributeName).getAll).foreach{v =>
          if (attributeValue == v) modifyAttribute(ctx, d.DirContext.REMOVE_ATTRIBUTE, result.getNameInNamespace, attributeName, attributeValue)}
    }
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
