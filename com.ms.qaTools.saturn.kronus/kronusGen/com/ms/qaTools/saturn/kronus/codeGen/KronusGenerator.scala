package com.ms.qaTools.saturn.kronus.codeGen

import java.nio.file.Path

import scala.util.Try
import scala.util.control.NonFatal

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.saturn.kronus._

trait KronusGenerator {
  def generateFile(topLevel: TopLevelKronus, outputDir: Path): Try[KronusGenerator.Result]
}

object KronusGenerator {
  def apply(): KronusGenerator = KronusTreeGenerator()
  case class Result(output: Path, appObject: String)

  object CompileException {
    def rethrow[A](eobj: EObject)(body: => A): A = try body catch {
      case NonFatal(t) => throw new CompileException(eobj, null, t)
    }
  }

  class CompileException(eobj: EObject, message: String, cause: Throwable) extends Exception(message, cause) {
    def location = Location.fromEObject(eobj)

    def path = (Iterator(eobj) ++ eobj.eContainers).collect {
      case x: AbstractDef => x.getName
    }.toSeq.reverse.mkString(".")

    override def getMessage = {
      val loc = locationInErrorMessage(location)
      val msg = Option(super.getMessage).fold("")(": " + _)
      s"Error generate code for $path$loc$msg"
    }
  }
}
