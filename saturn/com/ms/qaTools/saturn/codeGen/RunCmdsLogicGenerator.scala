package com.ms.qaTools.saturn.codeGen

import scala.collection.JavaConversions.asScalaBuffer
import scala.util.Try

import org.apache.commons.lang.StringEscapeUtils.escapeJava
import org.eclipse.emf.ecore.EObject

import com.ms.qaTools.MonadSeqUtil
import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.SeqTryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{RunCmdsStep => MRunCmdsStep}
import com.ms.qaTools.saturn.types.InterpretersEnum

object RunCmdsLogicGenerator {
  def apply(runCmds: MRunCmdsStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      cfg         <- Try { val c = runCmds.getRunCmdsConfiguration; if (c == null) throw new NullPointerException(s"Configuration for RunCmds Step: $runCmds cannot be null.") else c }
      checkStrGen <- ComplexValueStringGenerator(cfg.getCheckStr)
      attributes = Iterator.iterate(runCmds: EObject)(_.eContainer).takeWhile(_ != null).collect {
        case x: MAbstractRunGroup => x
      }.flatMap(_.getAttributes).map(_.getName).toSet
      (interpreter, resultType, commandType) <- Try {
        cfg.getInterpreter() match {
          case InterpretersEnum.DML    => ("DmlInterpreter()", "DmlInterpreterResult", "String")
          case InterpretersEnum.GROOVY =>
            val env = attributes.map(x => s"""("$x", $x)""").mkString("Map[String, String](", ", ", ")")
            (s"GroovyInterpreter(new groovy.lang.Binding($env))", "GroovyInterpreterResult", "String")
          case InterpretersEnum.PERL   => ("CommandExecutor", "CommandExecutorResult[_]", "Command[Any]")
          case InterpretersEnum.SCALA  => ("CommandExecutor", "CommandExecutorResult[_]", "Command[Any]")
          case InterpretersEnum.SHELL  =>
            val env = attributes.map(x => s"""("$x", $x)""").mkString("Seq(", ", ", ")")
            (s"ShellInterpreter(tee = true, extraEnv = $env)", "ShellInterpreterResult", "String")
        }
      }
      validator   <- Try {
        val action = cfg.getCheckStrAction.toString.toLowerCase.capitalize
        val interpreter = cfg.getInterpreter.toString.toLowerCase.capitalize
        action match {
          case "None" => s"(checkStr: String) => NullInterpreterResultValidator[$resultType]()"
          case _      => s"(checkStr: String) => ${interpreter}${action}Validator(checkStr)"
        }
      }
      enabledCommands <- Try { cfg.getCommands().filter { _.isEnabled() } }
      commandsGen     <- if (cfg.getInterpreter() == InterpretersEnum.SCALA || cfg.getInterpreter() == InterpretersEnum.PERL) {
                           enabledCommands.map { c =>
                             for {
                               cmd <- ComplexValueCodeGenerator(c)
                             } yield new TryGen {
                               override def generate(): Try[String] =
                                 for {
                                   cmdStr <- cmd.generate()
                                 } yield s"""Try{ 
                                               new Command[Any]{
                                                 override def toString = "${escapeJava(cmdStr)}"
                                                 def execute: Try[Any] = $cmdStr
                                               }
                                             }"""
                             }
                           }.toTrySeq
                         }
      else {
        enabledCommands.map { c => ComplexValueStringGenerator(c) }.toTrySeq
      }
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        commands <- SeqTryExpr(commandsGen).generate
        checkStr <- checkStrGen.generate
      } yield s"""RunCmdsRunner(context, 
                                $interpreter,
                                $commands,
                                $checkStr,
                                $validator)"""
    }, runCmds, s"RunCmds[$commandType, $resultType]")
}
