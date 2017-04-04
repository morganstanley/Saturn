package com.ms.qaTools.toolkit.tcpClient;

import scala.util.Try
import com.ms.qaTools.TryUtil

import com.ms.qaTools.io.rowSource.file.ByteArrayRowSource
import com.ms.qaTools.io.rowSource.tcp.TCPRowSource
import com.ms.qaTools.io.rowWriter.file.ByteArrayRowWriter
import com.ms.qaTools.io.rowWriter.tcp.TCPRowWriter
import com.ms.qaTools.tcpConnection.TCPConnection
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.Status

case class TCPClientResult(override val status: Status,
                           override val exception: Option[Throwable] = None) extends Result

class TCPClient(tcpConnection: TCPConnection, byteArrayRowSource: ByteArrayRowSource, byteArrayRowWriter: ByteArrayRowWriter) extends Runnable[TCPClientResult] {

  def run = (for {
    tcpRowWriter <- Try { TCPRowWriter(tcpConnection) }.rethrow("An exception occurred while setting up tcp client send.")
    count <- Try { tcpRowWriter.write(byteArrayRowSource) }.rethrow("An exception occurred while sending tcp data.")
    tcpRowSource <- Try { TCPRowSource(tcpConnection) }.rethrow("An exception occurred while setting up tcp client receive.")
    writeCount <- Try { byteArrayRowWriter.write(tcpRowSource) }.rethrow("An exception occurred while receiving tcp data.")
  } yield TCPClientResult(Passed()).ensuring(writeCount > 0, "TCP Client failed to send/receive message.")).recover { case t: Throwable => TCPClientResult(Failed(), Option(t)) }

}

object TCPClient {
  def apply(tcpConnectionTry: TCPConnection, byteArrayRowSource: ByteArrayRowSource, byteArrayRowWriter: ByteArrayRowWriter) = {
    new TCPClient(tcpConnectionTry, byteArrayRowSource, byteArrayRowWriter)
  }
}/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
