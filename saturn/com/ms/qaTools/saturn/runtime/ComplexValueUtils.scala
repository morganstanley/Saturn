package com.ms.qaTools.saturn.runtime
import com.ms.qaTools.interpreter.ShellInterpreter
import com.ms.qaTools.interpreter.GroovyInterpreter

object Shell {
  def apply(code: String): String = {
    val result = ShellInterpreter().run(code)
    result.stdout match {
      case Some(m) if result.passed => m
      case _                        => throw new Exception(s"Code does not pass: $code")
    }
  }
}

object EnvVar {
  def apply(envVar: String)(implicit sc: SaturnExecutionContext): String = sc.envVars.getOrElse(
    envVar,
    throw new Exception(s"EnvVar unset: $envVar")
  )
}

object File {
  def apply(fileName: String): String = {
    val source = scala.io.Source.fromFile(fileName)
    val contents = source.getLines mkString "\n"
    source.close
    contents
  }
}

object Groovy{
  def apply(code:String):String = {
    val groovy = GroovyInterpreter()
    val result = groovy.run(code)
    result.resultObj match {
      case Some(x) if result.passed => x.toString
      case _                        => throw new Exception(s"Code does not pass: $code")
    }
  }
}
