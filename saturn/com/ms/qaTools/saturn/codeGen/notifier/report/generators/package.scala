package com.ms.qaTools.saturn.codeGen.notifier.report

import org.jsoup.nodes.Element
import com.ms.qaTools.saturn.runtime.notifier.html.HTMLCSS

package object generators {

  implicit class ElementUtils(element: Element) {
    def expand(b:Boolean):Element = if(b) element.attr("style", "display: block;")
                                    else element.attr("style", "display: none;")
    def appendDiv:Element = element.appendElement("div")
    def asPanelContent: Element = element.addClass(HTMLCSS.PANEL_CONTENT)
    def asPanelCollapsed: Element = element.addClass(HTMLCSS.PANEL_COLLAPSED)
    def asPanel: Element = element.addClass(HTMLCSS.PANEL)
  }
}