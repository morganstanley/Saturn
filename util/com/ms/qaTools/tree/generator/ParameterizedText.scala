package com.ms.qaTools.tree.generator



import scala.util.matching.Regex

trait Part {
  def value(data:Seq[String])(implicit colMap:Lookupable, context:ColContext):String
}

case class StringPart(val _value:String) extends Part {
  override def value(data:Seq[String])(implicit colMap:Lookupable, context:ColContext):String = _value
}

case class ParmPart(colQuery:UnresolvedColQuery) extends Part {
  override def value(data:Seq[String])(implicit colMap:Lookupable, context:ColContext):String = {
    try {
        val resolvedColQuery:ResolvedColQuery = context.resolveQuery(colQuery)
        val colDef:ColDef = context.lookupColDef(resolvedColQuery)
        data(colDef.index)
    }
    catch { 
     case e => throw new Exception("An exception occurred looking up value for: " + colQuery.queryString, e)
    }
  }
}

trait ParameterizedText {
  def value:String
  def isLegacyMode:Boolean
  val parts:List[Part] = {    
    // When legacy mode is on, variables are defined as: %%d0.C0%% where d0 stands for the dataSet name and everything else is the column name
    // When legacy mode is off, variables are defined as ${C0} and no dataSet is required.
    
    val hasParm:Regex = if(isLegacyMode) """^(?s)(.*?)%%(.+?)%%(.*)$""".r else """^(?s)(.*?)\$\{(.+?)\}(.*)$""".r
    def addSIfNotNull(s:String,l:List[Part]):List[Part] = if(s.isEmpty) { l } else { StringPart(s)::l }

    //@tailrec
    def _parts(v:String,p:List[Part]):List[Part] = {
      if(v.isEmpty) p
      else {
        hasParm findFirstMatchIn v match {
          case Some(m) => {
            val pre = m.subgroups(0)
            val parm = m.subgroups(1)
            val post = m.subgroups(2)
            val colQuery = if(isLegacyMode) UnresolvedColQuery(parm).tail else UnresolvedColQuery(parm)
            val parmPart = ParmPart(colQuery) 
            _parts(post, parmPart::addSIfNotNull(pre,p))            
          }
          case None => StringPart(v)::p
        }
        /*v match {
          case hasParm(pre,parm,post) => {
            val colQuery = if(isLegacyMode) UnresolvedColQuery(parm).tail else UnresolvedColQuery(parm)
            val parmPart = ParmPart(colQuery) 
            _parts(post, parmPart::addSIfNotNull(pre,p))}
          case _                      => StringPart(v)::p
        }*/
      }
    }
    _parts(value,Nil).reverse
  }

  def resolveValue(data:Seq[String])(implicit colMap:Lookupable, context:ColContext):String = parts.map{_.value(data)}.filterNot(_ == null).mkString
  
  def extractColQueries:Set[UnresolvedColQuery] = {
    val colQueries = parts flatMap(_ match {
      case ParmPart(colQuery) => List(colQuery) //if(colQuery.isIterQuery) colQuery.trimmedHierarchy else List(colQuery)
      case _ => Nil
    })
    colQueries.toSet
  }
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
