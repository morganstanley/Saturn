package com.ms

import java.io.ByteArrayOutputStream
import java.io.Closeable
import java.io.File
import java.io.IOException
import java.io.PrintStream
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Collections
import java.util.{ Map => JMap }

import scala.collection.JavaConversions._
import scala.collection.immutable.Queue
import scala.compat.Platform
import scala.reflect.{ ClassTag, classTag }
import scala.util.{ Try, Success, Failure }

import org.apache.commons.io.output.TeeOutputStream

import com.ms.qaTools.exceptions.AggregateException

package object qaTools {
  val dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
  def printTime() = println(dateFormat.format(Calendar.getInstance().getTime()))

  def time[R](message: String, block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block // call-by-name
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

  def withCloseable[A <: { def close(): Unit }, B](closeable: A)(f: A => B): B = try {
    f(closeable)
  }
  finally {
    import scala.language.reflectiveCalls
    Option(closeable).foreach(_.close())
  }

  def closeAny(x: Any): Unit = x match {
    case c: Closeable => c.close()
    case _            =>
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
    }
    catch {
      case e: NoSuchFieldException =>
        for (c <- classOf[Collections].getDeclaredClasses if c.getName == "java.util.Collections$UnmodifiableMap")
          setEnv(c, "m", System.getenv)
    }
  }

  def stdOutDuring[A](action: => A): (String, A) = {
    val oldSystemOut = System.out
    val out = new ByteArrayOutputStream
    val systemTee = new PrintStream(new TeeOutputStream(oldSystemOut, out))
    val consoleTee = new PrintStream(new TeeOutputStream(Console.out, out))
    System.setOut(systemTee)
    try {
      val v = Console.withOut(consoleTee)(action)
      (out.toString, v)
    }
    finally {
      System.setOut(oldSystemOut)
    }
  }

  def newProxyInstance[A: ClassTag](h: InvocationHandler): A = {
    val interface = classTag[A].runtimeClass
    Proxy.newProxyInstance(interface.getClassLoader, Array(interface), h).asInstanceOf[A]
  }

  /*
   * extra functions for throwables
   */
  implicit class ThrowableUtil[T <: Throwable](val t: T) extends AnyVal {
    def getCauseStack(soFar: List[Throwable] = List(t)): Seq[Throwable] = {
      Iterator.iterate(t.asInstanceOf[Throwable])(_.getCause).takeWhile(_ != null).toList
    }

    def getCauseStackString(keepDuplicate: Boolean = false): String = {
      val cs = t.getCauseStack().reverse
      val filteredCS = cs.tail.foldLeft(List[Throwable](cs.head)) {
        (l, e) =>
          if (!keepDuplicate && e.getMessage.contains(l.head match {
            case first if first == cs.head => l.head.toString
            case _                         => l.head.getMessage
          })) l else e :: l
      }
      getFormattedMessage(filteredCS, _.getCauseStackString)
    }

    def getCauseStackString: String = getCauseStackString()

    def getFormattedMessage(throwables: Seq[Throwable], func: Throwable => String): String = {
      throwables.zipWithIndex.flatMap {
        case (ae: AggregateException, d: Int) => ae.exceptions.map(e => indendBlock(func(e), d))
        case (e: Throwable, d: Int) => List(indendBlock((e match {
          case lastEle if lastEle == throwables.last => e.toString
          case _                                     => e.getMessage
        }), d))
      }.mkString(Platform.EOL)
    }

    def indendBlock(b: String, d: Int): String = {
      Option(b).map(_.split(Platform.EOL).map(" " * d + _).mkString(Platform.EOL)).orNull
    }

    def getMessages(): Seq[String] = {
      def _getMessages(t: Throwable, messages: Seq[String] = Seq.empty): Seq[String] = {
        Option(t) match {
          case Some(e) => _getMessages(e.getCause, messages :+ t.getMessage)
          case None    => messages
        }
      }
      _getMessages(t)
    }
  }

  /*
   * extra functions for Seq[Try]]
   */
  implicit class MonadSeqUtil[X](val seq: Seq[Try[X]]) extends AnyVal {
    def flatFoldLeft[Y](s: Y)(fn: Function2[Y, X, Y]): Try[Y] = seq.foldLeft(Try { s }) { (soFarTry: Try[Y], elemTry: Try[X]) =>
      for {
        soFar <- soFarTry
        elem <- elemTry
      } yield fn(soFar, elem)
    }

    def flatReduceLeft(fn: Function2[X, X, X]): Try[X] = seq.reduceLeft { (soFarTry: Try[X], elemTry: Try[X]) =>
      for {
        soFar <- soFarTry
        elem <- elemTry
      } yield fn(soFar, elem)
    }

    def flatMkString(sep: String = ""): Try[String] = seq.toTrySeq.map { _.mkString(sep) }

    def toTrySeq: Try[Seq[X]] = {
      val (successes, failures) = seq.partition(_.isSuccess)
      if (failures.isEmpty) {
        Success(successes.collect { case Success(v) => v })
      }
      else {
        Failure(new AggregateException("Exception(s) existed when converting a Seq[Try[X]] to a Try[Seq[X]].", failures.collect { case Failure(t) => t }))
      }
    }
  }

  implicit class OptionTryUtil[A](val o: Option[Try[A]]) extends AnyVal {
    def toTryOption: Try[Option[A]] = o.map(_.map(Option(_))).getOrElse(Success(None))
  }

  implicit class SeqUtil[T](val s: Seq[T]) extends AnyVal {
    def toMapBy[U](f: T => U): Map[U, T] =
      s.map(e => (f(e), e)).toMap
  }

  implicit class IteratorUtil[A](val self: scala.collection.Iterator[A]) extends AnyVal {
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

      private var tail: Iterator[A] = self
      private var satisfied: Boolean = true
    }

    def terminateWith(p: A => Boolean): Iterator[A] = takeWhileMore(1)(!p(_))
  }

  implicit class AnyUtil[A](val x: A) extends AnyVal {
    def withSideEffect(f: A => Unit): A = { f(x); x }
  }

  implicit class PromiseUtil[A](val p: concurrent.Promise[A]) extends AnyVal {
    def get: A = concurrent.Await.result(p.future, concurrent.duration.Duration.Inf)
  }

  implicit class TryUtil[X](val tryThis: Try[X]) extends AnyVal {
    def rethrow(message: String): Try[X] = tryThis.recoverWith { case t: Throwable => throw new Exception(message, t) }
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
