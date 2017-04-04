package com.ms.qaTools.saturn.runtime.runner.module

import scala.util.Try

import com.ms.qaTools.io.DeviceIO
import com.ms.qaTools.io.FileIO
import com.ms.qaTools.io.Input
import com.ms.qaTools.io.Output
import com.ms.qaTools.io.Writer
import com.ms.qaTools.io.rowSource.ColumnDefinitions
import com.ms.qaTools.io.rowSource.DatabaseConnection
import com.ms.qaTools.saturn.codeGen.Context
import com.ms.qaTools.saturn.codeGen.Utils.connectTry
import com.ms.qaTools.toolkit.sql.SQLCall
import com.ms.qaTools.toolkit.sql.SQLClear
import com.ms.qaTools.toolkit.sql.SQLExecute
import com.ms.qaTools.toolkit.sql.SQLFetch
import com.ms.qaTools.toolkit.sql.SQLLoad

object SQLCallRunner {
  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection],
            sqlExprsTry: Seq[Try[String]],
            outputFilenamesTry: Seq[Option[Try[String]]],
            parameterIOsTry: Seq[Option[Try[Input[Iterator[Seq[String]]]]]]): Try[SQLCall] =
    SQLCall(dbResourceTry,
      sqlExprsTry,
      outputFilenamesTry,
      parameterIOsTry.zipWithIndex.map {
        case (option, i) =>
                option.map(_.flatMap(input => connectTry(context, input.input, s"ParameterFile_$i", false)))
      }).rethrow("An exception occurred while running SQLCall.")
}

object SQLClearRunner {
  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection],
            tables: Seq[Try[String]]): Try[SQLClear] = SQLClear(dbResourceTry, tables).rethrow("An exception occurred while running SQLClear.")
}

object SQLExecuteRunner {
  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection],
            sqlExprsTry: Seq[Try[String]],
            parameterIOsTry: Seq[Option[Try[Input[Iterator[Seq[String]]]]]]): Try[SQLExecute] =
    SQLExecute(dbResourceTry,
      sqlExprsTry,
      parameterIOsTry.zipWithIndex.map {
        case (option, i) =>
                   option.map(_.flatMap(input => connectTry(context, input.input, s"ParameterFile_$i", false)))
      }).rethrow("An exception occurred while running SQLExecute.")
}

object SQLFetchRunner {
  type DeviceContainer = {
    def device: DeviceIO
  }

  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection],
            sqlExprsTry: Seq[Try[String]],
            outputsTry: Seq[Try[Output[Writer[Iterator[Seq[String]]]]]],
            parametersTry: Seq[Option[Try[Input[Iterator[Seq[String]] with ColumnDefinitions]]]]): Try[SQLFetch] = {

    val parameters = (parametersTry.zip(outputsTry)).zipWithIndex.map {
      case ((option, output), i) => option.map { opt =>
        (opt.flatMap(input => connectTry(context, input.input, s"ParameterFile_$i", false)),
          output.map(_.asInstanceOf[DeviceContainer].device.asInstanceOf[FileIO].fileName))
      }
    }
    SQLFetch(dbResourceTry,
      sqlExprsTry,
      outputsTry.zipWithIndex.map {
        case (outTry, i) =>
                 outTry.flatMap(output => connectTry(context, output.output, s"Output_$i", false))
      },
      parameters)
  }.rethrow("An exception occurred while running SQLFetch.")
}

object SQLLoadRunner {
  def apply(context: Context,
            dbResourceTry: Try[DatabaseConnection],
            tablesTry: Seq[Try[(String, Input[Iterator[Seq[String]] with ColumnDefinitions], Boolean)]]): Try[SQLLoad] = { for {
    dbResource <- dbResourceTry.rethrow("An exception occurred while connection database resource.")
    tables <- tablesTry.toTrySeq.rethrow("An exception occurred while generating table strings.")
    inputs <- tables.zipWithIndex.map {
      case ((name, input, cleanLoad), i) => Try { SQLLoad.Input(name, connectTry(context, input.input, s"Input_$i", false).get, cleanLoad) }.rethrow("An exception occurred while connecting input resources.")
    }.toTrySeq
  } yield {
    SQLLoad(dbResource, inputs)
  }}.rethrow("An exception occurred while running SQLLoad.")
}
