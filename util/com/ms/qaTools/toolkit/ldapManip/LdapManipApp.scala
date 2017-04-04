package com.ms.qaTools.toolkit.ldapManip

import com.ms.qaTools.ldap.Ldap
import com.ms.qaTools.ldap.mappers._
import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine
import com.ms.qaTools.toolkit.cmdLine.OperationCmdLine
import com.ms.qaTools.toolkit.ToolkitApp
import scala.util.Failure
import scala.util.Success
import scala.util.Try

object LdapManipApp extends ToolkitApp[LdapManipResult] {

  override val APP_NAME = "LdapManip"

  val operationsMap = Map[String, Function1[BasicCmdLine, OperationCmdLine]](
    "addAttribute" -> ((cmdLine: BasicCmdLine) => new LdapManipAddAttributeCmdLine),
    "replaceAttribute" -> ((cmdLine: BasicCmdLine) => new LdapManipReplaceAttributeCmdLine),
    "removeAttribute" -> ((cmdLine: BasicCmdLine) => new LdapManipRemoveAttributeCmdLine),
    "addSubContext" -> ((cmdLine: BasicCmdLine) => new LdapManipAddSubContextCmdLine),
    "deleteSubContext" -> ((cmdLine: BasicCmdLine) => new LdapManipDeleteSubContextCmdLine))

  override val cmdLine = new LdapManipCmdLine(operationsMap)

  parseArguments

  val operations = cmdLine.parseOperations(args).foldLeft(Seq[LdapContentManipulator[_, _]]()) {
    (manipulators, operation) =>
      operation match {
        case t: LdapContentManipulator[_, _] => {
          manipulators :+ t
        }
        case _ => manipulators
      }
  }

  val authenticationType = cmdLine.authenticationType
  val providerURL: String = cmdLine.providerURL
  val securityPrincipal: String = cmdLine.securityPrincipal
  val securityCredentials: String = cmdLine.securityCredentials

  val ldapManipResult: Try[LdapManipResult] = for {
    ldapInstance <- Try { Ldap(authenticationType, providerURL, securityPrincipal, securityCredentials) }
    ldapManip <- Try { LdapManip(ldapInstance, operations) }
    result <- ldapManip.run
  } yield result

  ldapManipResult match {
    case Success(r) => exit(r)
    case Failure(e) => exitException(e)
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
