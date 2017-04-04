package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.TryUtil
import com.ms.qaTools.codeGen.scala.ForTryExpr
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.OptionExpr
import com.ms.qaTools.codeGen.scala.ScalaExpr
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.SeqTryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.codeGen.scala._
import com.ms.qaTools.saturn.{SQLStep => MSQLStep}
import com.ms.qaTools.saturn.modules.sqlModule.AbstractSQLOperation
import com.ms.qaTools.saturn.modules.sqlModule.SQLCallOperation
import com.ms.qaTools.saturn.modules.sqlModule.SQLClearOperation
import com.ms.qaTools.saturn.modules.sqlModule.SQLExecuteOperation
import com.ms.qaTools.saturn.modules.sqlModule.SQLFetchOperation
import com.ms.qaTools.saturn.modules.sqlModule.SQLLoadOperation

object SQLLogicGenerator {

  private def appendOptions(index: Int) = ContextAppendOptions(true, (s: String) => s"${s}_$index")

  def apply(sql: MSQLStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    implicit val appendOptions = ContextAppendOptions(true)
    for {
      cfg <- Try { val c = sql.getSQLConfiguration(); if (c == null) throw new NullPointerException(s"Configuration for SQL Step: $sql cannot be null.") else c }
      dbResource <- ResourceGenerator(cfg.getDatabaseResource()).rethrow(s"An exception occurred while generating code for db resource in SQL step $sql.")
      operation <- genSQLOperation(cfg.getOperation(), sql, dbResource).rethrow(s"An exception occurred while generating code for operation in SQL step $sql.")
    } yield operation
  }

  def genSQLOperation(operation: AbstractSQLOperation, sql: MSQLStep, dbGen: TryGen)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    operation match {
      case op: SQLCallOperation    => genSQLCallOperation(op, sql, dbGen)
      case op: SQLClearOperation   => genSQLClearOperation(op, sql, dbGen)
      case op: SQLExecuteOperation => genSQLExecuteOperation(op, sql, dbGen)
      case op: SQLFetchOperation   => genSQLFetchOperation(op, sql, dbGen)
      case op: SQLLoadOperation    => genSQLLoadOperation(op, sql, dbGen)
    }

  def genSQLCallOperation(operation: SQLCallOperation, sql: MSQLStep, dbGen: TryGen)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      procCalls <- Try { operation.getProcedureCalls().filter(_.isEnabled) }.rethrow("An exception occurred while retrieving procedure calls.")
      sqlExprsGen <- procCalls.map(c => ComplexValueStringGenerator(c.getSQL())).toTrySeq.map(SeqTryExpr(_)).rethrow("An exception occurred while generating code for procedure call expressions.")
      outputIOs <- Try {
        procCalls.zipWithIndex.map {
          case (c, i) =>
            for (output <- Option(c.getOutput)) yield ResourceGenerator(output, name = Option("OutputIO" + i))(appendOptions = appendOptions(i))
        }
      }.rethrow("An exception occurred while retrieving output resources.")
      parameters <- Try {
        procCalls.zipWithIndex.map {
          case (c, i) =>
            for (paramFile <- Option(c.getParameterFile)) yield ResourceGenerator(paramFile)(appendOptions = appendOptions(i))
        }
      }.rethrow("An exception occurred while retrieving parameter resources.")
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        dbStr <- dbGen.generate
        sqlExprsStr <- sqlExprsGen.generate
        outputsStr <- outputIOs.map { option =>
          option.map(outputIO => outputIO.flatMap { gen =>
            OptionExpr(gen.withMap(ScalaExpr("""_.device match {
                                                  case f:BaseFileIO => f.fileName
                                                  case _ => throw new Exception("")
                                                }"""))).generate
          }).getOrElse(Try { "None" })
        }.toTrySeq
        parametersStr <- parameters.map { option =>
          option.map(outputIO => outputIO.flatMap(OptionExpr(_).generate)).getOrElse(Try { """None""" })
        }.toTrySeq
      } yield {
        val fileNameStrs = outputsStr.mkString("Seq(", ",", ")")
        s"""SQLCallRunner(context, 
                          $dbStr,
                          $sqlExprsStr,
                          $fileNameStrs,
                          ${parametersStr.mkString("Seq(", ",", ")")})"""
      }
    }, sql, "SQLCall")

  def genSQLClearOperation(operation: SQLClearOperation, sql: MSQLStep, dbGen: TryGen)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      tables <- Try { operation.getTables().filter(_.isEnabled()) }.rethrow("An exception occurred while retrieving tables for SQL Clear step.")
      tableStringsGen <- tables.map(ComplexValueStringGenerator(_)).toTrySeq.map(SeqTryExpr(_)).rethrow("An exception occurred while generating code for table strings.")
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        dbStr <- dbGen.generate
        tablesStr <- tableStringsGen.generate
      } yield s"""SQLClearRunner(context, 
                                 $dbStr,
                                 $tablesStr)"""
    }, sql, "SQLClear")

  def genSQLExecuteOperation(operation: SQLExecuteOperation, sql: MSQLStep, dbGen: TryGen)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      commands <- Try { operation.getCommands() }.rethrow("An exception occurred while retrieving commands for SQL Execute step.")
      sqlExprsGen <- commands.map(c => ComplexValueStringGenerator(c.getSQL())).toTrySeq.map(SeqTryExpr(_)).rethrow("An exception occurred while generating code for execute sql expressions.")
      parameters <- Try {
        commands.map(c =>
          Option(c.getParameterFile()) match {
            case Some(p) => Option(ResourceGenerator(p))
            case None    => None
          })
      }.rethrow("An exception occurred while retrieving parameter resources.")
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        dbStr <- dbGen.generate
        sqlExprsStr <- sqlExprsGen.generate
        parametersStr <- parameters.map { option =>
          option.map(outputIO =>
            outputIO.flatMap(OptionExpr(_).generate)).getOrElse(Try { """None""" })
        }.toTrySeq
      } yield s"""SQLExecuteRunner(context, 
                                   $dbStr,
                                   $sqlExprsStr,
                                   ${parametersStr.mkString("Seq(", ",", ")")})"""
    }, sql, "SQLExecute")

  def genSQLFetchOperation(operation: SQLFetchOperation, sql: MSQLStep, dbGen: TryGen)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      queries <- Try { operation.getQueries().filter(_.isEnabled()) }.rethrow("An exception occurred while retrieving queries for SQL Fetch step.")
      sqlExprsGen <- queries.map(q => ComplexValueStringGenerator(q.getSQL())).toTrySeq.map(SeqTryExpr(_)).rethrow("An exception occurred while generating code for fetch sql expressions.")
      outputsGen <- queries.zipWithIndex.map {
        case (q, i) =>
          ResourceGenerator(q.getOutput(), withConnectTry = false)(appendOptions = appendOptions(i))
      }.toTrySeq.map(SeqTryExpr(_)).rethrow("An exception occurred while generating code for output resources.")
      parameters <- Try {
        queries.zipWithIndex.map {
          case (q, i) =>
            for (paramFile <- Option(q.getParameterFile)) yield ResourceGenerator(paramFile)(appendOptions = appendOptions(i))
        }
      }.rethrow("An exception occurred while retrieving parameter resources.")
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        dbStr <- dbGen.generate
        sqlExprsStr <- sqlExprsGen.generate
        outputsStr <- outputsGen.generate
        parametersStr <- parameters.map { option =>
          option.map(outputIO => outputIO.flatMap(OptionExpr(_).generate)).getOrElse(Try { "None" })
        }.toTrySeq
      } yield s"""SQLFetchRunner(context,
                                 $dbStr,
                                 $sqlExprsStr,
                                 $outputsStr,
                                 ${parametersStr.mkString("Seq(", ",", ")")})"""
    }, sql, "SQLFetch")

  def genSQLLoadOperation(operation: SQLLoadOperation, sql: MSQLStep, dbGen: TryGen)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      tables <- Try { operation.getTables().filter(_.isEnabled()) }.rethrow("An exception occurred while retrieving table strings for SQL Load operating.")
      
      tablesGen <- tables.zipWithIndex.map {
        case (t, index) => for {
          sql <- ComplexValueStringGenerator(t.getSQL())
          input <- ResourceGenerator(t.getInput(), withConnectTry = false)(appendOptions = appendOptions(index))
        } yield ForTryExpr(Seq(ForAssignment("sql", sql), ForAssignment("input", input)),
                           ScalaExpr(s"(sql, input, ${t.isCleanLoad})"))
      }.toTrySeq.map(SeqTryExpr(_)).rethrow("An exception occurred while generating code for load sql expressions.")
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        dbStr <- dbGen.generate
        tablesStr <- tablesGen.generate
      } yield s"SQLLoadRunner(context, $dbStr, $tablesStr)"
    }, sql, "SQLLoad")    
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
