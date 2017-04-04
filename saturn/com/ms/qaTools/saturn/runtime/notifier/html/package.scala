package com.ms.qaTools.saturn.runtime.notifier

import org.jsoup.nodes.Element
import com.ms.qaTools.saturn.runtime.DEBUG
import com.ms.qaTools.saturn.runtime.VerbosityLevel
import com.ms.qaTools.saturn.runtime.NORMAL
import org.apache.commons.lang.StringEscapeUtils
import com.ms.qaTools.saturn.runtime.TRACE
import com.ms.qaTools.exceptions.AggregateException
import org.apache.commons.lang.exception.ExceptionUtils

trait HTMLColorizedString {
  val s: String
  def redHtml = "<font color=\"red\">%s</font>".format(s)
  def greenHtml = "<font color=\"green\">%s</font>".format(s)
  def yellowHtml = "<font color=\"yellow\">%s</font>".format(s)
  def blueHtml = "<font color=\"blue\">%s</font>".format(s)
  def boldHtml = "<b>%s</b>".format(s)
}

package object html {

  def htmlSpaces(i: Int, space: String = "&nbsp;&nbsp;") = Array.fill(i)(space).mkString
  def string2Html(s: String) = StringEscapeUtils.escapeHtml(s).replaceAll("\n", "<br/>").replaceAll(" ", "&nbsp;")
  implicit def stringToHtmlColorizedString(str: String) = new HTMLColorizedString { override val s: String = str }
  def appendException(parentElement: Element, exception: Throwable, indent: Int = 0)(implicit outputVerbosity: VerbosityLevel = NORMAL()) = {

      def appendMessageStack(e: Throwable, indentLevel: Int = 0): Unit = {
        val newMsg = e match {
          case ae: AggregateException => {
            parentElement.append(htmlSpaces(indentLevel) + (e.getClass.getName + ": ").redHtml.boldHtml + e.getMessage.redHtml + "<br/>")
            ae.exceptions.foreach(e => {
              parentElement.append(htmlSpaces(indentLevel + 1) + (e.getClass.getName + ": ").redHtml.boldHtml + e.getMessage.redHtml + "<br/>")
              outputVerbosity match {
                case TRACE() => parentElement.append(htmlSpaces(indentLevel + 2) + "Trace:".redHtml.boldHtml + "<br/>" + htmlSpaces(indentLevel + 3) + e.getStackTraceString.replaceAll("\n", "<br/>" + htmlSpaces(indentLevel + 3)).redHtml + "<br/>")
                case _       =>
              }
              if (e.getCause != null) appendMessageStack(e.getCause, indentLevel + 2)
            })
          }
          case _ => {
            parentElement.append(htmlSpaces(indentLevel) + (e.getClass.getName + ": ").redHtml.boldHtml + e.getMessage.redHtml + "<br/>")
          }
        }

        e.getCause() match {
          case t: Throwable => appendMessageStack(t, indentLevel + 1)
          case _            =>
        }
      }

    parentElement.append(htmlSpaces(indent) + "ErrorMessage:".redHtml.boldHtml + "<br/>")
    appendMessageStack(exception, indent + 1)

    val exStackString = outputVerbosity match {
      case TRACE() => parentElement.append(htmlSpaces(indent + 1) + "Trace:".redHtml + "<br/>" + ExceptionUtils.getStackTrace(exception) + "<br/>")
      case _       =>
    }
  }

}