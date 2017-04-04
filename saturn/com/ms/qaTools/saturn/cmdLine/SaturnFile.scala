package com.ms.qaTools.saturn.cmdLine

import org.kohsuke.args4j.Option

trait SaturnFile {
  @Option(name = "--saturnFileName", aliases = Array("-s","--saturn", "--saturnFile"), usage = "Saturn file", required = true)    
  val saturnFileName: String = null
}