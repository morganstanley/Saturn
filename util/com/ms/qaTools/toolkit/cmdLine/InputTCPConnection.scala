package com.ms.qaTools.toolkit.cmdLine
import org.kohsuke.args4j.Option
import com.ms.qaTools.tcpConnection.TCPConnection

trait InputTCPConnection {
  @Option(name = "--host", usage = "Specify the host name.", required = true)
  val host: String = null

  @Option(name = "--port", usage = "Specify the port number.", required = true)
  val port: Int = 0

  @Option(name = "--serviceName", usage = "Specify the service name.", required = true)
  val serviceName: String = null

  @Option(name = "--kerberos", usage = "Is the connection Kerberiozed.")
  val isKerberos: Boolean = false

  @Option(name = "--bufferLength", usage = "Specify the buffer length.")
  val bufferLength: Int = 1024

  @Option(name = "--oid", usage = "Specify the Universal Object Identifiers.")
  val oid: String = "1.2.840.113554.1.2.2" // Kerberos V5 (ISOIEC-8824 / ISOIEC-8825)

  @Option(name = "--timeOut", usage = "Specify the timeout period for read socket channel in milliseconds.")
  val soTimeOut: Int = 3600000

  def tcpConnection: TCPConnection =
    TCPConnection(host, port, serviceName, isKerberos, oid, bufferLength, soTimeOut)
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
