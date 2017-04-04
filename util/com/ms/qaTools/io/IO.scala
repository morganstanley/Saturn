package com.ms.qaTools.io

import java.io.{ByteArrayInputStream => JByteArrayInputStream}
import java.io.Closeable
import java.io.{File => JFile}
import java.io.{FileInputStream => JFileInputStream}
import java.io.FileNotFoundException
import java.io.{FileOutputStream => JFileOutputStream}
import java.io.{FilenameFilter => JFilenameFilter}
import java.io.{InputStream => JInputStream}
import java.io.{InputStreamReader => JInputStreamReader}
import java.io.{OutputStream => JOutputStream}
import java.io.{OutputStreamWriter => JOutputStreamWriter}
import java.io.{Reader => JReader}
import java.io.{SequenceInputStream => JSequenceInputStream}
import java.io.{StringReader => JStringReader}
import java.io.{StringWriter => JStringWriter}
import java.io.{Writer => JWriter}
import java.util.zip.{GZIPInputStream => JGZIPInputStream}
import java.util.zip.{GZIPOutputStream => JGZIPOutputStream}

import scala.Array.canBuildFrom
import scala.collection.JavaConversions.asJavaEnumeration
import scala.collection.mutable.{Buffer, UnrolledBuffer}
import scala.util.Try

import scalaz.Monad

import org.apache.commons.io.FileUtils
import org.apache.commons.io.filefilter.{RegexFileFilter => JRegexFileFilter}
import org.apache.commons.io.input.{NullInputStream => JNullInputStream}
import org.apache.commons.io.input.{NullReader => JNullReader}
import org.apache.commons.io.output.{NullOutputStream => JNullOutputStream}
import org.apache.commons.io.output.{NullWriter => JNullWriter}
import org.apache.commons.io.output.{TeeOutputStream => JTeeOutputStream}
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.Workbook

import com.ms.qaTools.compare.AbstractDiff
import com.ms.qaTools.compare.CompareColDef
import com.ms.qaTools.compare.DiffCounter
import com.ms.qaTools.compare.writer.DiffSetWriter
import com.ms.qaTools.compare.writer.ExcelDiffSetRotateWriter
import com.ms.qaTools.compare.writer.ExcelDiffSetWriter
import com.ms.qaTools.compare.writer.Page
import com.ms.qaTools.io.rowSource.file.ExcelWorkBook
import com.ms.qaTools.io.rowSource.file.ByteArrayRowSource
import com.ms.qaTools.io.rowWriter.file.ByteArrayRowWriter

import javax.mail.internet.{MimeBodyPart => JMimeBodyPart}

@deprecated trait IO2[+I, +O] extends IO3[I, O, Unit] {
  def input: I
  def output: O
  def diffWriter =  throw new Exception("diffWriter not available") 
}

@deprecated trait IO3[+I, +O, +D] {
  def input: I
  def output: O
  def diffWriter: D
  def cleanup = {}
}

@deprecated trait IO2Try[+I, +O] extends IO3Try[I, O, Unit] {
  def input: Try[I]
  def output: Try[O]
  def diffWriter = Try{ throw new Exception("diffWriter not available") }
}

@deprecated trait IO3Try[+I, +O, +D] {
  def input: Try[I]
  def output: Try[O]
  def diffWriter: Try[D]
  def cleanup = {}
}

trait Input[+T] {
  def input: Try[T]
  def asOutput = Output.fromTry(input)
}

object Input {
  def fromTry[A](x: Try[A]) = new Input[A] {
    def input = x
  }

  implicit object InputMonad extends Monad[Input] {
    def bind[A, B](ma: Input[A])(f: A => Input[B]) = fromTry(ma.input.flatMap(f(_).input))
    def point[A](a: => A) = fromTry(Try(a))
  }
}

trait Output[+T] {
  def output: Try[T]
  def asInput = Input.fromTry(output)
}

object Output {
  def fromTry[A](x: Try[A]) = new Output[A] {
    def output = x
  }

  implicit object OutputMonad extends Monad[Output] {
    def bind[A, B](ma: Output[A])(f: A => Output[B]) = fromTry(ma.output.flatMap(f(_).output))
    def point[A](a: => A) = fromTry(Try(a))
  }
}

trait DiffWriter {
  def diffWriter: Try[(Seq[com.ms.qaTools.compare.CompareColDef], Map[Page, String], Seq[Page]) => DiffSetWriter]
}

trait DeviceIO {
  def reader:       Try[JReader] = inputStream.map{is => new JInputStreamReader(is) }
  def writer:       Try[JWriter] = outputStream.map{os => new JOutputStreamWriter(os) }
  def inputStream:  Try[JInputStream] = inputStreams.map{iss => new JSequenceInputStream(iss)}
  def outputStream: Try[JOutputStream] = outputStreams.map{oss => oss.reduceLeft((soFar,os) => new JTeeOutputStream(os,soFar))}
  
  def readers:       Try[Iterator[JReader]] = inputStreams.map{iss => iss.map{is => new JInputStreamReader(is)}}
  def writers:       Try[Iterator[JWriter]] = outputStreams.map{oss => oss.map{os => new JOutputStreamWriter(os)}}
  def inputStreams:  Try[Iterator[JInputStream]]
  def outputStreams: Try[Iterator[JOutputStream]]
}

abstract class BaseFileIO(val fileName:String) extends DeviceIO with Closeable {
  protected val streams: Buffer[Closeable] = UnrolledBuffer.empty

  protected def trace[A <: Closeable](s: A): A = {
    streams += s
    s
  }

  def close() = {
    streams.foreach(_.close())
    streams.clear()
  }

  def parentDirIO:Try[DirIO] = file.map{file => Option(file.getAbsoluteFile().getParent) match {
    case Some(parentDir) => DirIO(parentDir)
    case None            => throw new FileNotFoundException(s"$fileName has no parent directory.")
    }
  }

  def mkParentDirs:Try[DirIO] = parentDirIO.flatMap{dirIO => dirIO.mkDirs}
  def delete:Unit = file.map{_.delete}
  
  def file:Try[JFile]         = Try{ new JFile(fileName) }
  def files:Try[Seq[JFile]]   = file.map{file => Seq(file)}
  
  def fileExists = file.map{file => if(!file.exists) throw new FileNotFoundException(fileName);  file}
  def filesExist = files.map{files => files.foreach{file => if(!file.exists) throw new FileNotFoundException(fileName)}; files }
  
  val append                 = false
  def inputStreams           = filesExist.map{files => files.iterator.map{file => trace(new JFileInputStream(file)) } }
  def outputStreams          = files.map{files => files.iterator.map{file => trace(new JFileOutputStream(file, append)) } }
}

case class FileIO(override val fileName:String, override val append: Boolean = false) extends BaseFileIO(fileName)
case class DirIO(override val fileName:String, filterPattern:String=".*") extends BaseFileIO(fileName) with DiffWriter {
  def mkDirs = file.map{file => if(file.mkdirs) this else throw new Exception(s"Could not create directory: '$fileName'.") }
  override def delete = file.map{dir => FileUtils.deleteDirectory(dir)}
  
  override def files:Try[Seq[JFile]] = file.map{dir =>
    val filter:JFilenameFilter = new JRegexFileFilter(filterPattern)
    val files:Seq[JFile] = Option(dir.listFiles(filter)) match {
      case Some(files) => files
      case None        => Nil
    }
    files
  }
  
  override def filesExist:Try[Seq[JFile]] = fileExists.map{dir =>
    val filter:JFilenameFilter = new JRegexFileFilter(filterPattern)
    val files:Seq[JFile] = Option(dir.listFiles(filter)) match {
      case Some(files) => files
      case None        => Nil
    }
    files
  }
  
  def +(that:FileIO):FileIO = FileIO(fileName + JFile.separator + that.fileName)
  def +(that:DirIO):DirIO = DirIO(fileName + JFile.separator + that.fileName)

  def diffWriter = file map { f =>
    (colDefs: Seq[CompareColDef], pageNames: Map[Page, String], omittedPages: Seq[Page]) =>
      val conf = ExcelDiffSetRotateWriter.Config(pageNames = pageNames, omittedPages = omittedPages)
      ExcelDiffSetRotateWriter(f, colDefs,
                               conf.copy(prefix = if (filterPattern != ".*") filterPattern else conf.prefix))
  }
}

case class StandardIO(useStdErr:Boolean=false) extends DeviceIO {
  def inputStreams  = Try{Iterator(StdIn)}
  def outputStreams = Try{Iterator(if (useStdErr) StdErr else StdOut)}
}

object StdIn extends JInputStream with Proxy {
  val self = System.in
  def read() = self.read()
  override def close() {}
}

class UncloseableOutputStream(val self: JOutputStream) extends JOutputStream with Proxy {
  def write(b: Int) {self.write(b)}
  override def close() {self.flush()}
  override def flush() {self.flush()}
}

object StdOut extends UncloseableOutputStream(System.out)
object StdErr extends UncloseableOutputStream(System.err)

case class ExcelIO(override val fileName: String, isXlsx: Boolean = false)
extends BaseFileIO(fileName) with Input[Workbook] with Output[ExcelWorkBook] with DiffWriter{
  def input = inputStream.map(ExcelWorkBook(_))
  def output = outputStream.map(ExcelWorkBook(_, isXlsx))
  def diffWriter =
    output.map(wb =>
      (colDefs: Seq[com.ms.qaTools.compare.CompareColDef], pageNames: Map[Page, String], omittedPages: Seq[Page]) =>
        ExcelDiffSetWriter(wb, colDefs, pageNames, omittedPages))
  def worksheetNames = input.map{wb => (0 until wb.getNumberOfSheets).map{wb.getSheetName}.toIterator}
  def worksheets     = input.map{wb => (0 until wb.getNumberOfSheets).map{wb.getSheetAt}.toIterator}
}

case class StringIO(contents:String) extends DeviceIO {
  override def reader  = Try { new JStringReader(contents) }
  override def readers = reader.map { reader => Iterator(reader) }
  override def writers = Try{ Iterator(new JStringWriter()) }
  
  override def inputStream = Try{ new JByteArrayInputStream(contents.toCharArray().map{c => c.toByte}) }
  def inputStreams         = inputStream.map{inputStream => Iterator(inputStream) }
  def outputStreams        = NullIO.outputStreams
}

case class StringIteratorIO(iterator:Iterator[String]) extends DeviceIO {
  override def readers       = Try{ iterator.map{string => new JStringReader(string)} }
  override def inputStreams  = Try{ iterator.map{contents => new JByteArrayInputStream(contents.toCharArray().map{c => c.toByte})} }
  override def outputStreams = NullIO.outputStreams  
}

object ByteIO {
  def apply(contents:Array[Byte]) = ByteArrayIteratorIO(Iterator(contents))
}

case class ByteArrayIteratorIO(iterator:Iterator[Array[Byte]]) extends DeviceIO {
  override def inputStreams  = Try{ iterator.map{contents => new JByteArrayInputStream(contents)} }
  override def outputStreams = NullIO.outputStreams  
}

object NullIO extends DeviceIO with Input[ByteArrayRowSource] with Output[ByteArrayRowWriter] with DiffWriter {
  override def readers = Try{ Iterator(new JNullReader(0)) }
  override def writers = Try{ Iterator(new JNullWriter()) }
  def inputStreams     = Try{ Iterator(new JNullInputStream(0)) }
  def outputStreams    = Try{ Iterator(new JNullOutputStream()) }
  def input = inputStream.map(ByteArrayRowSource(_))
  def output = outputStream.map(ByteArrayRowWriter(_))
  def diffWriter =
    Try{(colDefs: Seq[com.ms.qaTools.compare.CompareColDef], pageNames: Map[Page, String], omittedPages: Seq[Page]) =>
      new NullWriter with DiffSetWriter {
        def writeDiff(diff: AbstractDiff) = ()
        def writeSummary(counter: DiffCounter) = ()
        def writeNotes(notes: Seq[String] = Nil) = ()
        def createViews = ()}}
}

object GZipIO {
  def apply(device: DeviceIO): DeviceIO = new DeviceIO {
    def inputStreams  = device.inputStreams .map{iss => iss.map{is => new JGZIPInputStream(is)}}
    def outputStreams = device.outputStreams.map{oss => oss.map{os => new JGZIPOutputStream(os)}}
  }
}

trait NetworkIO[A] extends Input[Iterator[A]] with Output[Writer[Iterator[A]]] {
  def syncInput(requests: Iterator[A]): Try[Iterator[A]]
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
