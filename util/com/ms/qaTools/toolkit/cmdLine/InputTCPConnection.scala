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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
