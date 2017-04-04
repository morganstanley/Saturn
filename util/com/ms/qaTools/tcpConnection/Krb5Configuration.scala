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

    val conf: Configuration = new Configuration() {
      def getAppConfigurationEntry(name: String): Array[AppConfigurationEntry] = {
        var options: HashMap[String, String] = new HashMap[String, String];
        synchronized {
          options = clientOptions;
        }
        // "useTicketCache" and "doNotPrompt" both are true. This combination results into
        // checking the default cache for TGT and populate the Subject with the principal
        // and TGT. If the TGT is not available, do not prompt the user, instead fail the
        // authentication.
        options.put(JAVA_KRB_OPT_DO_NOT_PROMPT, "true");

        // This class represents a single LoginModule entry configured for the application.
        // Each respective AppConfigurationEntry contains a LoginModule name, a control flag
        // and LoginModule-specific options.
        var configurations: Array[AppConfigurationEntry] = new Array[AppConfigurationEntry](1)
        configurations.update(0, new AppConfigurationEntry(JAVA_KRB_LOGIN_MODULE, AppConfigurationEntry.LoginModuleControlFlag.REQUIRED, options))
        configurations;
      }
    }

    Configuration.setConfiguration(conf);
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
