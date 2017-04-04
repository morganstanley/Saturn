package com.ms.qaTools.saturn.cmdLine

import java.io.File

import org.kohsuke.args4j.Option

import com.ms.qaTools.toolkit.cmdLine.BasicCmdLine

abstract class SaturnCmdLine extends BasicCmdLine {
  @Option(name = "--logFileName", usage = "specify an log file name")
  val logFileName: String = null

  @Option(name = "--noLogging", usage = "disable logging")
  val noLogging: Boolean = false

  @Option(name = "--appendToLogFile", usage = "append to log file")
  val appendToLogFile: Boolean = false

  @Option(name = "--quiet", usage = "disable console output")
  val noOutput: Boolean = false

  @Option(name = "--noOutputColor", usage = "disable console colored output")
  val noOutputColor: Boolean = false

  @Option(name = "--sourceFile", usage = "display saturn file")
  val showSourceFile: Boolean = false

  @Option(name = "--scenarioReport", usage = "scenario report file path")
  val scenarioReport: String = null

  @Option(name = "--verbosity", usage = "control verbosity level: QUIET, NORMAL, DEBUG, DEBUG_ON_FAIL (default), DEBUG_ON_PASS, TRACE")
  val verbosity: String = "DEBUG_ON_FAIL"

  @Option(name = "--junitOutputDir", usage = "Output directory for JUnit generated files")
  val junitOutputDir: String = null

  def resolveEnvVars: Seq[(String, String)] = Nil
  override def parseArguments(args: Array[String]) {
    super.parseArguments(args)
  }
}
