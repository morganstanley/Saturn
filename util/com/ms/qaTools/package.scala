package com.ms

import java.io.ByteArrayOutputStream
import java.io.File
import java.io.IOException
import java.io.PrintStream
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Collections
import java.util.{Map => JMap}

import scala.annotation.switch
import scala.annotation.tailrec
import scala.collection.JavaConversions._
import scala.collection.immutable.Queue
import scala.util.{Try, Success, Failure}

import org.apache.commons.io.output.TeeOutputStream

import com.ms.qaTools.exceptions.AggregateException


package object qaTools {
  val dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
  def printTime = println(dateFormat.format(Calendar.getInstance().getTime()))

  def time[R](message: String, block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block    // call-by-name
    val t1 = System.currentTimeMillis()
    println(message + " - [elapsed time: " + (t1 - t0) + "ms]")
    result
  }

  def createTempDir(dirName: String) = {
    val tempDirPath = new File(System.getProperty("java.io.tmpdir"))
    if (!tempDirPath.exists) tempDirPath.mkdirs
    val outputDir = File.createTempFile(dirName, "", tempDirPath)

    if (!(outputDir.delete())) {
      throw new IOException("Could not delete output file: " + outputDir.getAbsolutePath());
    }

    if (!(outputDir.mkdir())) {
      throw new IOException("Could not create output directory: " + outputDir.getAbsolutePath());
    }

    outputDir
  }

  def withCloseable[A <: {def close(): Unit}, B](closeable: A)(f: A => B): B = try {
    f(closeable)
  } finally {
    Option(closeable).foreach(_.close())
  }

  /** Change the environment while the process is running is very dangerous.  Use this function with extreme caution.
   *  Normally it should only be used in tests.
   */
  def updateEnv(update: Map[String, String] => Map[String, String]) {
    val newEnv = update(sys.env)
    val procEnv = Class.forName("java.lang.ProcessEnvironment")
    def setEnv(cls: Class[_], field: String, obj: Any) {
      val f = cls.getDeclaredField(field)
      f.setAccessible(true)
      val m = f.get(obj).asInstanceOf[JMap[String, String]]
      m.clear()
      m.putAll(newEnv)
    }
    try {
      Seq("theEnvironment", "theCaseInsensitiveEnvironment") foreach (setEnv(procEnv, _, null))
    } catch {
      case e: NoSuchFieldException =>
        for (c <- classOf[Collections].getDeclaredClasses if c.getName == "java.util.Collections$UnmodifiableMap")
          setEnv(c, "m", System.getenv)
    }
  }

  def stdOutDuring(action: => Unit): String = {
    val oldSystemOut = System.out
    val out = new ByteArrayOutputStream
    val systemTee = new PrintStream(new TeeOutputStream(oldSystemOut, out))
    val consoleTee = new PrintStream(new TeeOutputStream(Console.out, out))
    System.setOut(systemTee)
    try {
      Console.withOut(consoleTee)(action)
      out.toString
    }
    finally {
      System.setOut(oldSystemOut)
    }
  }

  /*
   * extra functions for throwables
   */
  implicit class ThrowableUtil[T<:Throwable](t:T) {
    def getCauseStack(soFar:List[Throwable] = List(t)):Seq[Throwable] = {
      Option(t.getCause()) match {
        case Some(cause) => cause.getCauseStack(cause :: soFar)
        case None        => soFar.reverse
      }
    }

    def getCauseStackString():String = t.getCauseStack().zipWithIndex.map{p => val (e:Throwable,d:Int)=p; " " * d + s"${e.getMessage}"}.mkString("\n")
    def getMessages(): Seq[String] = {
      def _getMessages(t: Throwable, messages: Seq[String] = Seq.empty): Seq[String] = {
        Option(t) match {
          case Some(e) => _getMessages(e.getCause, messages :+ t.getMessage)
          case None => messages
        }
      }
      _getMessages(t)
    }

  }

  /*
   * extra functions for Seq[Try]]
   */
  implicit class MonadSeqUtil[X](seq:Seq[Try[X]]) {
    def flatFoldLeft[Y](s:Y)(fn:Function2[Y,X,Y]):Try[Y] = seq.foldLeft(Try{s}){(soFarTry:Try[Y], elemTry:Try[X]) => for {
        soFar <- soFarTry
        elem  <- elemTry
      } yield fn(soFar,elem)
    }

    def flatReduceLeft(fn:Function2[X,X,X]):Try[X] = seq.reduceLeft{(soFarTry:Try[X], elemTry:Try[X]) => for {
        soFar <- soFarTry
        elem  <- elemTry
      } yield fn(soFar,elem)}

    def flatMkString(sep:String=""):Try[String] = seq.toTrySeq.map{_.mkString(sep)}
    def toTrySeq:Try[Seq[X]] = {
      val(successes,failures) = seq.partition(_.isSuccess)
      if(failures.isEmpty) {
        Success(successes.collect{case Success(v) => v})
      }
      else {
        Failure(new AggregateException("Exception(s) existed when converting a Seq[Try[X]] to a Try[Seq[X]].", failures.collect{case Failure(t) => t}))
      }
    }
  }

  implicit class SeqUtil[T](s: Seq[T]){
    def toMapBy[U](f: T => U): Map[U, T] =
      s.map(e => (f(e), e)).toMap
  }

  implicit class IteratorUtil[A](self: scala.collection.Iterator[A]) {
    def apply(n: Int): A =
      if (n >= 0) {
        val xs = self.drop(n)
        if (xs.hasNext) xs.next
        else throw new IndexOutOfBoundsException
      }
      else {
        val xs = last(-n)
        if (xs.length == -n) xs.head
        else throw new IndexOutOfBoundsException
      }

    def last(n: Int): Seq[A] = {
      require(n >= 0)
      val (xs, _) = self.foldLeft((Queue.empty[A], 0)) {
        case ((xs, size), x) =>
          val ys = xs.enqueue(x)
          if (size == n) (ys.tail, size) else (ys, size + 1)
      }
      xs
    }

    def takeWhileMore(n: Int)(p: A => Boolean): Iterator[A] = new Iterator[A] {
      require(n > 0)

      def hasNext = tail.hasNext

      def next = {
        val x = tail.next
        if (satisfied && !p(x)) {
          tail = tail.take(n - 1)
          satisfied = false
        }
        x
      }

      private var tail: Iterator[A]  = self
      private var satisfied: Boolean = true
    }

    def terminateWith(p: A => Boolean): Iterator[A] = takeWhileMore(1)(!p(_))
  }

  abstract class IteratorProxy[A] extends Iterator[A] {
    protected def self: Iterator[A]

    def next    = self.next
    def hasNext = self.hasNext
  }

  implicit class AnyUtil[A](x: A) {
    def withSideEffect(f: A => Unit): A = { f(x); x }
  }

  implicit class PromiseUtil[A](p: concurrent.Promise[A]) {
    def get: A = concurrent.Await.result(p.future, concurrent.duration.Duration.Inf)
  }
  /*
   * extra functions for try
   */
  implicit class TryUtil[X](tryThis:Try[X]) {
    def rethrow(message: String):Try[X] = tryThis.recoverWith{case t:Throwable => throw new Exception(message, t)}
  }

  def lexicalOrdering[A : Ordering] = new Ordering[Seq[A]] {
    val ord = implicitly[Ordering[A]]
    @tailrec def compare(xs: Seq[A], ys: Seq[A]): Int = (xs, ys) match {
      case (Seq(x, xs@_*), Seq(y, ys@_*)) => (ord.compare(x, y): @switch) match {
        case 0 => compare(xs, ys)
        case n => n
      }
      case (Seq(_, _), _) => 1
      case _ => -1
    }
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
