//
// Built on Fri Feb 19 15:40:58 UTC 2016 by logback-translator
// For more information on configuration files in Groovy
// please see http://logback.qos.ch/manual/groovy.html

// For assistance related to this tool or configuration files
// in general, please contact the logback user mailing list at
//    http://qos.ch/mailman/listinfo/logback-user

// For professional support please see
//   http://www.qos.ch/shop/products/professionalSupport

import org.slf4j.bridge.SLF4JBridgeHandler

import ch.qos.logback.core.status.NopStatusListener

//redirects all java.util.logging logs to slf4j
//see: http://www.slf4j.org/api/org/slf4j/bridge/SLF4JBridgeHandler.html
SLF4JBridgeHandler.removeHandlersForRootLogger();
SLF4JBridgeHandler.install();

context.name = "qaTools/saturn"
statusListener(NopStatusListener)

//appender("FILE", FileAppender) {
//  file = "debug.log"
//  append = false
//  encoder(PatternLayoutEncoder) {
//    pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
//  }
//}
//root(DEBUG, ["FILE"])
