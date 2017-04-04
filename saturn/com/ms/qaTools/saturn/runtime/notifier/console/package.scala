package com.ms.qaTools.saturn.runtime.notifier

import java.io.PrintStream
import java.text.SimpleDateFormat
import java.util.Date
import org.fusesource.jansi.Ansi._
import org.fusesource.jansi.Ansi.Color._
import com.ms.qaTools._
import com.ms.qaTools.io.IO3
import com.ms.qaTools.saturn.runtime.MetaDataResultContext
import com.ms.qaTools.saturn.runtime.ResourceResultContext
import com.ms.qaTools.toolkit.Failed
import com.ms.qaTools.toolkit.NotRun
import com.ms.qaTools.toolkit.Passed
import com.ms.qaTools.toolkit.Status

trait AnsiColorString {
  val text: String
  def red(implicit noColor:Boolean = false) = if(!noColor) ansi.fg(RED).a(text).reset.toString    
                                              else text
  def green(implicit noColor:Boolean = false) = if(!noColor) ansi.fg(GREEN).a(text).reset.toString    
                                                else text
  def blue(implicit noColor:Boolean = false) = if(!noColor) ansi.fg(CYAN).a(text).reset.toString    
                                               else text
  def yellow(implicit noColor:Boolean = false) = if(!noColor) ansi.fg(YELLOW).a(text).reset.toString    
                                                 else text
                                                 
  def bold(implicit noColor:Boolean = false)    = if(!noColor) ansi().a(Attribute.INTENSITY_BOLD) + text     else text
  def boldOff(implicit noColor:Boolean = false) = if(!noColor) text + ansi().a(Attribute.INTENSITY_BOLD_OFF) else text
  def reset(implicit noColor:Boolean = false)   = if(!noColor) text + ansi().reset().toString()              else text                                           
}
package object console {
  implicit def stringToAnsiColorString(str: String) = new AnsiColorString { override val text:String = str}
  
  def statusToString(status: Status)(implicit noColor:Boolean = false): String  = {
    status match {
      case Passed() => if(!noColor) "PASS".green.bold.reset     else "PASS"
      case Failed() => if(!noColor) "FAIL".red.bold.reset       else "FAIL"
      case NotRun() => if(!noColor) "NOT_RUN".yellow.bold.reset else "NOT_RUN"
    }
  }

  def timeStampToString(timeStamp: Long) = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(timeStamp))
  
  def spaces(i: Int, space: String = "  ") =  Array.fill(i)(space).mkString
  
  def printMetaDatas(metaDataContexts: Map[String, MetaDataResultContext], metaDataNames: TraversableOnce[String], indent: Int = 0, outStream: PrintStream = System.out)(implicit noColor:Boolean = false) = {
    metaDataNames.foreach(m => {
      metaDataContexts.get(m) match {
        case Some(r) => printMetaDataContext(r, indent, outStream)
        case None    => outStream.println(spaces(indent) + (m + ":").blue + " N/A!")
      }
    })
  }
  
  def printMetaDataContext(md: MetaDataResultContext, indent: Int = 0, outStream: PrintStream = System.out, renamedMetaData: Option[String] = None)(implicit noColor:Boolean = false): Unit = {
    val metaDataContexts = md.metaDataContexts.toSeq
    val name = renamedMetaData.getOrElse(md.name)
    if(metaDataContexts.isEmpty) outStream.println("%s%s %s".format(spaces(indent), (name + ":").blue, md.metaData.getOrElse("")))
    else {
      outStream.println("%s%s\n%s%s".format(spaces(indent), (name + ":").blue, spaces(indent+1), (md.metaData.getOrElse("").toString + ":").blue))
      metaDataContexts.foreach(mdc => printMetaDataContext( mdc._2, indent+2, outStream))
    }
  }
  
  def printResourceContext(rc: ResourceResultContext, indent: Int = 0, outStream: PrintStream = System.out, renamedResourceName: Option[String] = None)(implicit noColor:Boolean = false): Unit = {
    val name = renamedResourceName.getOrElse(rc.name)  
    outStream.println("%s%s(%s)".format(spaces(indent), name.blue, rc.resourceType.blue) + ":".blue)
      rc.resourceContexts.toSeq.foreach(rcc => printResourceContext(rcc._2, indent + 1, outStream))
      rc.metaDataContexts.toSeq.foreach(m => { 
        for(md <- m._2.metaData) {
          md match {
            case mdrc: MetaDataResultContext => {
              outStream.println("%s%s".format(spaces(indent+1), (m._1 + ":").blue))
              printMetaDataContext(mdrc, indent+2, outStream)
            }
            case _ => outStream.println("%s%s %s".format(spaces(indent+1), (m._1 + ":").blue, m._2.metaData.getOrElse("")))
          }
        }
      })
    }
}