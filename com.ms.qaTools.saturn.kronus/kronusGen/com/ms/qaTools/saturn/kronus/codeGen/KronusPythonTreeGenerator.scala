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

object KronusPythonTreeGenerator {
  def apply(): KronusPythonTreeGenerator = {
    new KronusPythonTreeGenerator()
  }
}

class KronusPythonTreeGenerator() extends KronusGenerator {
  import scala.collection.JavaConversions._
  import scala.reflect.internal.Flags._
  import KronusGenerator.CompileException, KronusTreeGenerator._

  def generateFile(topLevel: k.TopLevelKronus, outputDir: Path) = {
     val wrappedTL: k.WrappedTopLevelKronus = topLevel
     val pkg = wrappedTL.pkg
     val cls = wrappedTL.clazz
     val dir = outputDir.resolve(pkg.mkString("/"))
     val kronus = topLevel.getKronus
     //val defs = sortDefs(kronus.getDefs)
     Files.createDirectories(dir)

     for (index <- 0 until pkg.length) {
       val initFile = (outputDir.resolve(pkg.take(index+1).mkString("/"))).resolve("__init__.py")
       Files.newOutputStream(initFile)
     }
     val pythonFile = dir.resolve(s"$cls.py")
     val writer = new PrintWriter(Files.newOutputStream(pythonFile))
     try {
      kronus.getDefs.foreach {
        _.getDef match {
          case x: k.ImportDef  => writer.print(s"from ${x.getModule} import *\n")
          case x: k.IncludeDef => writer.print(s"from ${x.getModule} import *\n")
          case _: k.TypeDef    =>
          case _: k.HashtagDef =>
          case _: k.Assignment =>
          case x               =>  val parsedLine = genAbstractDef(x, "")
                                   if(!parsedLine.equals("")){
                                     writer.print(s"$parsedLine\n")
                                   }
        }
      }
     } finally writer.close()
     KronusGenerator.Result(pythonFile, wrappedTL.appFQN)
  }

  def genInclude(included: String): String = {
      val packageList = included.split("\\.")
      if(packageList.length > 1) s"from ${included.substring(0,included.lastIndexOf("."))} import ${packageList(packageList.length-1)}"
      else s"from ${packageList.mkString(".")} import *"
  }

 def genKronus(kronus: k.Kronus, trailing:String): String = {
     val builder = new StringBuilder
      kronus.getDefs.foreach {
        _.getDef match {
          case x: k.ImportDef  => builder.append("import " + x.getModule)
          case x: k.IncludeDef => builder.append("import " + x.getModule)
          case _: k.TypeDef    =>
          case _: k.HashtagDef =>
          case _: k.Assignment =>
          case x               =>  builder.append(s"\n${genAbstractDef(x, trailing+"\t")}")
        }
      }
     Option(kronus.getReturn).foreach { x =>  builder.append(s"\n\t${trailing}return ${genExpression(x)}") }
     builder.result()
 }

 def genAbstractDef(x: k.AbstractDef, trailing: String): String =  {
    x match {
      case x: k.TypeDef if x.getValue != null => ""
      case _: k.TypeDef                       => ""
      case x: k.HashtagDef                    => ""
      case x: k.AnnotationDef                 => ""
      case x: k.FunctionDef                   => genFunctionDef(x, trailing)
      case x: k.ValDef                        => genValDef(x, trailing)
    }
  }

  def genParameters(params: Seq[k.ParameterDef]): String = {
     params.map {
       par => s"${par.getName}${Option(par.getDefaultValue).map {
            defaultValue => s"=${genExpression(defaultValue)}" }.getOrElse("")
       }"
     }.mkString(",")
  }

  def genFunctionDef(obj: k.FunctionDef, trailing:String): String = {
     val builder = new StringBuilder
     val params = obj.getParameterDefs
     builder.append(s"${trailing}def ${obj.getName}(${genParameters(params)}):${parsePython(obj.getValue.asInstanceOf[k.CodeBlock], trailing)}")
     builder.result()
  }

  def genFunctionCall(obj: k.FunctionCall): String = {
     val builder = new StringBuilder
     builder.append(s"${obj.getMethod.getName}(")
     val params = obj.getParameterValues
     builder.append(params.map {
            case p: k.PositionParameterValue =>
              genExpression(p.getValue)
            case p:k.KeywordParameterValue   =>
              s"${p.getName}=${genExpression(p.getValue)}"
     }.mkString(","))
     builder.append(")")
     builder.result()
  }

  def genValDef(vd: k.ValDef, trailing: String): String = {
     vd.getValue match {
       case v: k.KronusCodeBlock => s"${trailing}def ${vd.getName}():${genKronus(v.getCode, trailing)}"
       case _                    => s"$trailing${vd.getName} = ${genExpression(vd.getValue)}"
     }
  }

  def genExpression(e: k.Expression): String = e match {
    case e: k.IntegerLiteral  => e.getValue.toString()
    case e: k.DoubleLiteral   => e.getValue.toString()
    case e: k.StringLiteral   => "\""+e.getValue.toString()+"\""
    case e: k.BooleanLiteral  => e.toString()
    case e: k.ValRef          => genValRef(e)
    case e: k.FunctionCall    => genFunctionCall(e)
    case e: k.Sequence        => s"[${e.getValues.map { x => genExpression(x) }.mkString(",")}]"
    case e: k.UnaryOperation  => s"(${e.getOp}${genExpression(e.getExpr)})"
    case e: k.BinaryOperation => genBinaryOperation(e)
    case e: k.CodeBlock       => parsePython(e,"")
  }

  def genBinaryOperation(bop: k.BinaryOperation): String = bop.getOp match {
    case "&&" => s"(${genExpression(bop.getLeft)} and ${genExpression(bop.getRight)})"
    case "||" => s"(${genExpression(bop.getLeft)} or ${genExpression(bop.getRight)})"
    case _    => s"(${genExpression(bop.getLeft)}${bop.getOp}${genExpression(bop.getRight)})"
  }

  def genValRef(vr: k.ValRef): String = {
      def qualified(name: String) = name
      vr.getRef match {
        case r: k.ParameterDef => qualified(r.getName).toString()
        case r: k.ValDef       => qualified(r.getName).toString()
        case r: k.FunctionDef  => qualified(r.getName).toString()
      }
  }
  def genHashtags(obj: k.HashtagCall, trailing: String): String = {
    val builder = new StringBuilder
    obj.getParameterValues.foreach { x => x.getName match {
         case "content" => builder.append(s"$trailing@${x.getValue}")
         case _         => ""
    }}
    builder.result()
  }

  def parsePython(code: k.CodeBlock, trailing: String): String = code match {
    case scb: k.ScalaCodeBlock =>
       scb.getType match {
            case "python" => scb.getCodeStr.drop(1).dropRight(1).replaceAll("\\r\\n", "\n")
            case _        => sys.error("Can only process generate(\"python\") in PythonGenerator")
                            ""
       }
    case cb: k.KronusCodeBlock =>
       genKronus(cb.getCode, trailing)
  }

  def indentCode(code: String, trailing:String): String = {
      val builder = new StringBuilder
      code.split("\n").foreach { x => builder.append(s"$trailing${x.replaceAll("""^\s+(?m)""","")}\n") }
      builder.result()
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
