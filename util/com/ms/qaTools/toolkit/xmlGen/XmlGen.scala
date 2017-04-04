package com.ms.qaTools.toolkit.xmlGen

import scala.util.Try

import org.w3c.dom.Document

import com.ms.qaTools.TryUtil
import com.ms.qaTools.io.DelimitedIterator
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Result
import com.ms.qaTools.toolkit.Runnable
import com.ms.qaTools.toolkit.Status
import com.ms.qaTools.xml.generator.XmlGenerator

class XmlGenResult(override val status: Status) extends Result
case class PassedXmlGenResult() extends XmlGenResult(Passed())
case class FailedXmlGenResult(override val exception: Option[Throwable]) extends XmlGenResult(Failed())

case class XmlGen(xmlGenerator: XmlGenerator, xmlRowWriter: Writer[Iterator[Document]])
    extends Runnable[XmlGenResult] {
  require(xmlRowWriter != null, "Null xml row writer in XmlGen")

  override def run = (for {
    count <- Try { xmlRowWriter.write(xmlGenerator) }.rethrow("An exception occurred while running XmlGen.")
  } yield PassedXmlGenResult()).recover { case t: Throwable => FailedXmlGenResult(Some(t)) }
}

object XmlGen {
  def apply(template: Document, rowSource: DelimitedIterator, xmlRowWriter: Writer[Iterator[Document]], isLegacyMode: Boolean = false) = {
    val xmlGenerator = XmlGenerator(template, rowSource, isLegacyMode)
    new XmlGen(xmlGenerator, xmlRowWriter)
  }

  //apply method for Saturn Runtime
  def apply[TEMPLATE_TYPE](templateTry: Try[Iterator[TEMPLATE_TYPE]],
    outputTry: Try[Writer[Iterator[Document]]],
    inputTry: Try[Iterator[Seq[String]] with ColumnDefinitions],
    isLegacy: Boolean)(implicit templateTypeToSeqString: Iterator[TEMPLATE_TYPE] => Iterator[Document]): Try[XmlGen] =
    {
      for {
        templateRs <- templateTry.rethrow("An exception occurred while connecting template resource.")
        template <- Try { if (templateRs.hasNext) templateTypeToSeqString(templateRs).next else throw new Exception("XmlGen template cannot be empty.") }.rethrow("An exception occurred while reading the xml template resource.")
        output <- outputTry.rethrow("An exception occurred while connecting output resource.")
        input <- inputTry.rethrow("An exception occurred while connecting input resource.")
      } yield XmlGen(template, input, output, isLegacy)
    }.rethrow("An exception occurred while setting up XmlGen.")
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
