//
// Built on Fri Feb 19 15:40:58 UTC 2016 by logback-translator
// For more information on configuration files in Groovy
// please see http://logback.qos.ch/manual/groovy.html

// For assistance related to this tool or configuration files
// in general, please contact the logback user mailing list at
//    http://qos.ch/mailman/listinfo/logback-user

// For professional support please see
//   http://www.qos.ch/shop/products/professionalSupport

import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.filter.ThresholdFilter
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import ch.qos.logback.core.encoder.LayoutWrappingEncoder
import ch.qos.logback.core.status.NopStatusListener
import com.ms.qaTools.saturn.runtime.LoggingFileLayout

import static ch.qos.logback.classic.Level.ERROR
import static ch.qos.logback.classic.Level.TRACE

import org.slf4j.bridge.SLF4JBridgeHandler

//redirects all java.util.logging logs to slf4j
//see: http://www.slf4j.org/api/org/slf4j/bridge/SLF4JBridgeHandler.html
SLF4JBridgeHandler.removeHandlersForRootLogger();
SLF4JBridgeHandler.install();

context.name = "qaTools/saturn"
statusListener(NopStatusListener)
appender("STDERR", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%msg%n"
  }
  target = "System.err"
}
appender("FILE", FileAppender) {
  append = false
  filter(ThresholdFilter) {
    level = TRACE
  }
  encoder(LayoutWrappingEncoder) {
    layout(LoggingFileLayout)
  }
}
appender("STDOUT", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%msg%n"
  }
  target = "System.out"
}
logger("com.mongodb", ERROR)
root(ERROR, ["STDOUT", "FILE"])
