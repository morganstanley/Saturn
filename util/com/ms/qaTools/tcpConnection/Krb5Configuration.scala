package com.ms.qaTools.tcpConnection

import java.util.HashMap

import javax.security.auth.login.AppConfigurationEntry
import javax.security.auth.login.Configuration

class Krb5Configuration {
  val JAVA_KRB_CONFIG_PROPERTY             = "java.security.krb5.conf"
  val JAVA_KRB_DEBUG_PROPERTY              = "sun.security.krb5.debug"
  val JAVA_KRB_SUBJECT_CREDS_ONLY_PROPERTY = "javax.security.auth.useSubjectCredsOnly"
  val JAVA_KRB_LOGIN_MODULE                = "com.sun.security.auth.module.Krb5LoginModule"

  // http://docs.oracle.com/javase/8/docs/jre/api/security/jaas/spec/com/sun/security/auth/module/Krb5LoginModule.html
  val JAVA_KRB_OPT_DO_NOT_PROMPT           = "doNotPrompt"
  val JAVA_KRB_OPT_TICKET_CACHE            = "ticketCache"
  val JAVA_KRB_OPT_USE_TICKET_CACHE        = "useTicketCache"
  val JAVA_KRB_OPT_REFRESH_KRB5_CONFIG     = "refreshKrb5Config"

  val KRB5_CONFIG_ENV_VAR_NAME             = "KRB5_CONFIG"
  val KRB5_CRED_CACHE_ENV_VAR_NAME         = "KRB5CCNAME"
  val JAVA_KRB5_CRED_CACHE_ENV_VAR_NAME    = "JAVA_KRB5CCNAME" // remove?
  val MSLSA_CRED_CACHE_PREFIX              = "MSLSA:"

  val clientOptions                        = new HashMap[String, String]()

  /*
   * Configures the JGSS login module options for an initiator.
   * param debug: Whether to enable KRB5 debugging or not.
   */
  def setClientConfiguration(debug: Boolean) = {
    try {
      // This property is required false for the credential cache to work
      System.setProperty(JAVA_KRB_SUBJECT_CREDS_ONLY_PROPERTY, "false");
      if (debug) {
        System.setProperty(JAVA_KRB_DEBUG_PROPERTY, "true");
      }
    } catch {
      case e: Exception => println("Couldn't set JGSS properties");
    }

    // Setting JAAS configuration.
    setSunJGSSConfiguration();
  }

  /*
   * Helper method to set up the SunJGSS Kerberos libraries.
   */
  def setSunJGSSConfiguration() = {
    val ticketCache = if (null == System.getenv(JAVA_KRB5_CRED_CACHE_ENV_VAR_NAME)) {
      System.getenv(KRB5_CRED_CACHE_ENV_VAR_NAME)
    } else {
      System.getenv(JAVA_KRB5_CRED_CACHE_ENV_VAR_NAME)
    }

    synchronized {
      if (null != ticketCache) {
        // If our cache is specified to be using the Microsoft Local Security Authority,
        // then we do not need to set this property.
        if (false == ticketCache.startsWith(MSLSA_CRED_CACHE_PREFIX)) {
          clientOptions.put(JAVA_KRB_OPT_TICKET_CACHE, ticketCache);
        }
        clientOptions.put(JAVA_KRB_OPT_USE_TICKET_CACHE, "true");
        clientOptions.put(JAVA_KRB_OPT_REFRESH_KRB5_CONFIG, "true");

        // Set the kerberos configuration file, if not specified
        if (null == System.getProperty(JAVA_KRB_CONFIG_PROPERTY)) {
          val kerberosConfiguration: String = System.getenv(KRB5_CONFIG_ENV_VAR_NAME);
          if (null != kerberosConfiguration) {
            System.setProperty(JAVA_KRB_CONFIG_PROPERTY, kerberosConfiguration);
          }
        }
      }
    }

    val conf = new Configuration() {
      def getAppConfigurationEntry(name: String): Array[AppConfigurationEntry] = {
        var options: HashMap[String, String] = null
        synchronized {
          options = clientOptions
        }
        // "useTicketCache" and "doNotPrompt" both are true. This combination results into
        // checking the default cache for TGT and populate the Subject with the principal
        // and TGT. If the TGT is not available, do not prompt the user, instead fail the
        // authentication.
        options.put(JAVA_KRB_OPT_DO_NOT_PROMPT, "true")

        // This class represents a single LoginModule entry configured for the application.
        // Each respective AppConfigurationEntry contains a LoginModule name, a control flag
        // and LoginModule-specific options.
        val configurations = new Array[AppConfigurationEntry](1)
        configurations.update(0, new AppConfigurationEntry(JAVA_KRB_LOGIN_MODULE, AppConfigurationEntry.LoginModuleControlFlag.REQUIRED, options))
        configurations
      }
    }

    Configuration.setConfiguration(conf)
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
