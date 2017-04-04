package com.ms.qaTools.saturn.kronus

import java.net.URI

import org.eclipse.xtext.validation.Issue

case class ParseError(uri: URI, lnum: Int, cnum: Int, msg: String, line: String) extends Exception(msg) {
  require(lnum > 0)
  require(cnum >= 0)
  override def getMessage = s"$uri: line $lnum: $msg\n$line\n${" " * cnum}^"
}

object ParseError {
  def apply(issue: Issue, uri: URI, text: String): ParseError = {
    val offset: Int = issue.getOffset
    val (lbegin, lend) = lineRange(text, offset)
    apply(uri, issue.getLineNumber, offset - lbegin, issue.getMessage, text.substring(lbegin, lend))
  }

  def lineRange(text: String, offset: Int): (Int, Int) = {
    var lbegin = offset - 1
    while (lbegin >= 0 && text(lbegin) != '\n') lbegin -= 1
    lbegin += 1
    var lend = lbegin
    while (lend < text.length && text(lend) != '\n') lend += 1
    if (text(lend - 1) == '\r') lend -= 1
    (lbegin, lend)
  }
}

case class ParseErrors(errors: Seq[ParseError]) extends Exception(s"${errors.size} error(s) found") {
  override def getMessage = super.getMessage +: errors.map(_.getMessage) mkString "\n\n"
}
