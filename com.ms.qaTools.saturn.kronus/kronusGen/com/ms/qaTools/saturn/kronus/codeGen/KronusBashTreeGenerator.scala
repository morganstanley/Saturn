package com.ms.qaTools.saturn.kronus.codeGen

import java.io.PrintWriter
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path

import scala.collection.JavaConverters._
import scala.compat.Platform.EOL
import scala.tools.nsc.Global
import scala.tools.nsc.Settings
import scala.tools.nsc.ast.TreeDSL
import scala.tools.nsc.reporters.StoreReporter

import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.CompilerClassLoader
import com.ms.qaTools.ScalaParseException
import com.ms.qaTools.saturn.{kronus => k}

object KronusBashTreeGenerator extends KronusGenerator {
  import scala.collection.JavaConversions._
  import scala.reflect.internal.Flags._
  import KronusGenerator.CompileException, KronusTreeGenerator._

  def generateFile(topLevel: k.TopLevelKronus, outputDir: Path) = {
     val wrappedTL: k.WrappedTopLevelKronus = topLevel
     val pkg = wrappedTL.pkg
     val cls = wrappedTL.clazz
     val dir = outputDir.resolve(pkg.mkString("/"))
     val kronus = topLevel.getKronus
     val defs = sortDefs(kronus.getDefs map { _.getDef})
     Files.createDirectories(dir)
     val bashFile = dir.resolve(s"$cls.sh")
     val writer = new PrintWriter(Files.newOutputStream(bashFile))
     val builder = new StringBuilder
     try {
      kronus.getDefs.foreach {
        _.getDef match {
          case x: k.ImportDef  => builder.append(s"source ${x.getModule}\n")
          case x: k.IncludeDef => builder.append(s"source ${(x.getModule.getPackage.getModule.replace(".","/"))}.sh\n")
          case _: k.TypeDef    =>
          case _: k.HashtagDef =>
          case _: k.Assignment =>
          case x               => val parsedLine = genAbstractDef(x, "")
                                  if(!parsedLine.equals("")){
                                    builder.append(s"$parsedLine\n")
                                  }
        }
      }
       builder.append(closePipes(builder.result(), "^mkfifo -m 777"))
       writer.print(builder.result()+"\n")
     } finally writer.close()
     KronusGenerator.Result(bashFile, wrappedTL.appFQN)
  }

 def genKronus(kronus: k.Kronus, trailing:String): String = {
     val builder = new StringBuilder
      kronus.getDefs.foreach {
        _.getDef match {
      case x: k.ImportDef  => builder.append(s"source ${x.getModule}\n")
          case x: k.IncludeDef => builder.append(s"source ${(x.getModule.getPackage.getModule.replace(".","/"))}.sh\n")
          case _: k.TypeDef    =>
          case _: k.HashtagDef =>
          case _: k.Assignment =>
          case x               => builder.append(s"\n${genAbstractDef(x, trailing+"\t")}")
        }
      }
     Option(kronus.getReturn).foreach { x => x match {
                                        case value: k.FunctionCall =>  if(isPipe(value.getMethod.getReturnType)) builder.append(s"\n\t${trailing}cat <(${genExpression(value)})")
                                                                       else builder.append(s"\n\t${trailing}echo ${genExpression(x)}")
                                        case value: k.ValRef       =>  if(isPipe(value)) builder.append(s"\n\t${trailing}cat ${genExpression(value)}")
                                                                       else builder.append(s"\n\t${trailing}echo ${genExpression(value)}")
                                        case _                     =>  builder.append(s"\n\t${trailing}echo ${genExpression(x)}")
                                      }
     }
     builder.append(closePipes(builder.result, "mkfifo -m 777"))
     builder.append(s"\n$trailing}")
     builder.result()
 }

 def genAbstractDef(x: k.AbstractDef, trailing: String): String =  {
    x match {
      case x: k.TypeDef if x.getValue != null => ""
      case _: k.TypeDef                       => ""
      case _: k.HashtagDef                    => ""
      case x: k.AnnotationDef                 => ""
      case x: k.FunctionDef                   => genFunctionDef(x, trailing)
      case x: k.ValDef                        => genValDef(x, trailing)
    }
  }

  def genParameters(params: Seq[k.ParameterDef], trailing: String): String = {
     val builder = new StringBuilder
     params.zipWithIndex.foreach { case (x,index) =>
       val varName = index+1
       builder.append(Option(x.getDefaultValue).map {
               defaultValue => s"\n\t$trailing${x.getName}=$${$varName:-${genExpression(defaultValue)}}" }
               .getOrElse(s"\n\t$trailing${x.getName}=$$$varName"))
     }
     builder.result()
  }

  def genFunctionDef(obj: k.FunctionDef, trailing:String): String = {
     val builder = new StringBuilder
     builder.append(trailing)
     builder.append(s"function ${obj.eGet(obj.eClass().getEStructuralFeature("name"))} ")
     obj.getValue match {
         case cb: k.KronusCodeBlock =>
           builder.append(s"{${genParameters(obj.getParameterDefs, trailing)}${parsePython(cb, trailing)}")
           builder.result()
         case _ =>
           builder.append(parsePython(obj.getValue.asInstanceOf[k.CodeBlock], trailing))
           builder.result()
     }
  }

  def genFunctionCall(obj: k.FunctionCall): String = {
     val builder = new StringBuilder

     if(!isPipe(obj.getMethod.getReturnType)) builder.append("$(")
     builder.append(s"${obj.getMethod.getName} ")

     val params = obj.getParameterValues zip obj.getMethod.getParameterDefs
     builder.append(params.map { case(value, types) => value match {
              case p: k.PositionParameterValue => if(isPipe(types.getType)){
                                                      p.getValue match {
                                                        case e:k.ValRef => s" ${genValRef(e)}"
                                                        case _          => s" <(${genExpression(p.getValue)})"
                                                      }
                                                  }
                                                  else s" ${genExpression(p.getValue)}"
              case p:k.KeywordParameterValue   => s" ${p.getName}=${genExpression(p.getValue)}"
           }
     }.mkString(" "))

     if(!isPipe(obj.getMethod.getReturnType)) builder.append(")")
     builder.result()
  }

  def genValDef(vd: k.ValDef, trailing: String): String = {
     val name = vd.getName
     val value = vd.getValue
     value match {
       case v: k.KronusCodeBlock       => s"${trailing}function ${name} { ${genKronus(v.getCode, trailing)}"
       case v: k.impl.FunctionCallImpl => Option(v.getMethod.getReturnType).map { x =>
                                                                                       if(isPipe(x)) {
                                                                                           s"${trailing}${name}=$$(mktemp -u)\n"+
                                                                                           s"${trailing}mkfifo -m 777 $$${name}\n"+
                                                                                           s"${trailing}${genExpression(value)} > $$${name} &"
                                                                                       } else { s"$trailing${name}=${genExpression(value)}"  }
                                          }.getOrElse(s"$trailing${name}=${genExpression(value)}")
       case _                          => s"$trailing${name}=${genExpression(value)}"
     }
  }

  def genExpression(e: k.Expression): String = e match {
    case e: k.IntegerLiteral  => e.getValue.toString()
    case e: k.DoubleLiteral   => e.getValue.toString()
    case e: k.StringLiteral   => "\""+e.getValue.toString()+"\""
    case e: k.BooleanLiteral  => e.toString()
    case e: k.ValRef          => genValRef(e)
    case e: k.FunctionCall    => genFunctionCall(e)
    case e: k.Sequence        => s"(${e.getValues.map { x => genExpression(x) }.mkString(" ")})"
    case e: k.UnaryOperation  => "$"+s"((${e.getOp}(${genExpression(e.getExpr)})))"
    case e: k.BinaryOperation => genBinaryOperation(e)
    case e: k.CodeBlock       => parsePython(e,"")
  }

  def genBinaryOperation(bop: k.BinaryOperation): String = bop.getOp match {
    case "&&" =>
      s"$$(${genExpression(bop.getLeft)}${bop.getOp}${genExpression(bop.getRight)})"
    case "||" =>
      s"$$(${genExpression(bop.getLeft)}${bop.getOp}${genExpression(bop.getRight)})"
    case _ =>
      s"$$((${genExpression(bop.getLeft)}${bop.getOp}${genExpression(bop.getRight)}))"
  }

  def genValRef(vr: k.ValRef): String = {
    def qualified(name: String) = name
    vr.getRef match {
      case r: k.ParameterDef => "$"+qualified(r.getName).toString()
      case r: k.ValDef       => "$"+qualified(r.getName).toString()
      case r: k.FunctionDef  => qualified(r.getName).toString()
    }
  }

  def parsePython(code: k.CodeBlock, trailing: String): String = code match {
    case scb: k.ScalaCodeBlock =>
       scb.getType match {
            case "bash" =>
              s"{${genParameters(scb.eContainer().asInstanceOf[k.FunctionDef].getParameterDefs, trailing)}${scb.getCodeStr.replaceAll("\\r\\n", "\n").drop(1)}"
            case _ => sys.error("Can only process generate(\"bash\") in BashGenerator")
                      ""
       }
    case cb: k.KronusCodeBlock =>
       genKronus(cb.getCode, trailing)
  }

  def closePipes(code:String, pattern:String):String = {
    val Pattern = pattern.r
    val builder = new StringBuilder
    val splittedCode = code.split("\n").filter { x => Pattern.findFirstIn(x).map { x => true }.getOrElse(false)}
    val mappedPipes = splittedCode.map { x => Pattern.replaceAllIn(x, "rm -r ") }
    mappedPipes.foreach { x =>  builder.append("\n"+x) }
    builder.result()
  }

  def isPipe(e: k.TypeInstance): Boolean = {
     Option(e).map(x => Seq("Stream", "File").contains(x.getName.getName)).getOrElse(false)
  }

  def isPipe(e: k.ValRef): Boolean = {
    val value = e.getRef
    value match {
      case r: k.ValDef       => r.getValue match {
                                  case v: k.impl.FunctionCallImpl => Option(v.getMethod.getReturnType).map(isPipe(_)).getOrElse(false)
                                  case _                          => false
                                }
      case r: k.FunctionDef  => isPipe(r.getReturnType)
      case _                          => false
    }
  }
}
/*
Copyright 2017 Morgan Stanley

Licensed under the GNU Lesser General Public License Version 3 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.gnu.org/licenses/lgpl-3.0.en.html

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS PROGRAM:

THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY
WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY
USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED
LICENSE TERMS.
*/
