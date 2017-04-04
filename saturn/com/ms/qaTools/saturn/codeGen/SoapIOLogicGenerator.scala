package com.ms.qaTools.saturn.codeGen

import scala.util.Failure
import scala.util.Success
import scala.util.Try

import com.ms.qaTools.codeGen.scala.FutureGen
import com.ms.qaTools.codeGen.scala.ScalaGen
import com.ms.qaTools.codeGen.scala.StringExpr
import com.ms.qaTools.codeGen.scala.TryExpr
import com.ms.qaTools.codeGen.scala.TryGen
import com.ms.qaTools.saturn.{SoapIOStep => MSoapIOStep}
import com.ms.qaTools.saturn.modules.soapIOModule.AbstractSoapIOOperation
import com.ms.qaTools.saturn.modules.soapIOModule.PerlTerminationCondition
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOGetOperation
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutAndGetOperation
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOPutOperation
import com.ms.qaTools.saturn.values.{ComplexValue => MComplexValue}

object SoapIOLogicGenerator {
  def apply(soap: MSoapIOStep)(implicit codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = {
    implicit val appendOptions = ContextAppendOptions(true)
    for {
      cfg <- Try(soap.getSoapIOConfiguration)
      soapIO <- ResourceGenerator(cfg.getSoapIOResource)
      timeout <- timeOut(cfg.getOperation.getTimeOut)
      operation <- operationGenerator(cfg.getOperation, soap, soapIO, timeout)
    } yield operation
  }

  def operationGenerator(operation: AbstractSoapIOOperation,
                         soap: MSoapIOStep,
                         soapGen: TryGen,
                         timeOut: TryGen)(implicit appendOptions: ContextAppendOptions,
                                                   codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] = operation match {
    case op: SoapIOPutOperation       => putOperationGenerator(op, soap, soapGen, timeOut)
    case op: SoapIOGetOperation       => getOperationGenerator(op, soap, soapGen, timeOut)
    case op: SoapIOPutAndGetOperation => putAndGetOperationGenerator(op, soap, soapGen, timeOut)
  }

  def putOperationGenerator(operation: SoapIOPutOperation,
                            soap: MSoapIOStep,
                            soapGen: TryGen,
                            timeOut: TryGen)(implicit appendOptions: ContextAppendOptions,
                                                      codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      requestIO <- ResourceGenerator(operation.getInput)
      resourceType <- Try {
        ResourceGenerator.getMetaData(operation.getInput).flatMap(_.inputType).getOrElse(throw new Exception("Could not get type for SoapPut input resource."))
      }
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        soapResourceStr <- soapGen.generate
        timeOutStr <- timeOut.generate
        requestIOStr <- requestIO.generate
      } yield s"""SoapIOPutRunner(context, $soapResourceStr, $requestIOStr, $timeOutStr)"""
    }, soap, s"SoapPut[$resourceType]")

  def getOperationGenerator(operation: SoapIOGetOperation,
                            soap: MSoapIOStep,
                            soapGen: TryGen,
                            timeOut: TryGen)(implicit appendOptions: ContextAppendOptions,
                                                      codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      responseIO <- ResourceGenerator(operation.getOutput)
      resourceType <- Try {
        ResourceGenerator.getMetaData(operation.getOutput).flatMap(_.outputType).getOrElse(throw new Exception("Could not get type for SoapGet output resource."))
      }
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        soapResourceStr <- soapGen.generate
        timeOutStr <- timeOut.generate
        responseIOStr <- responseIO.generate
        termCondStr <- genTerminationCondition(operation)
      } yield s"""SoapIOGetRunner(context, $soapResourceStr, $responseIOStr, $timeOutStr, $termCondStr)"""
    }, soap, s"SoapGet[$resourceType]")

  def putAndGetOperationGenerator(operation: SoapIOPutAndGetOperation,
                                  soap: MSoapIOStep,
                                  soapGen: TryGen,
                                  timeOut: TryGen)(implicit appendOptions: ContextAppendOptions,
                                                            codeGenUtil: SaturnCodeGenUtil): Try[FutureGen] =
    for {
      requestIO <- ResourceGenerator(operation.getInput) // FIXME backwards, an object should write to its output and read from its input
      responseIO <- ResourceGenerator(operation.getOutput)
      inputResourceType <- Try {
        ResourceGenerator.getMetaData(operation.getInput).flatMap(_.inputType).getOrElse(throw new Exception("Could not get type for SoapPutAndGet input resource."))
      }
      outputResourceType <- Try {
        ResourceGenerator.getMetaData(operation.getOutput).flatMap(_.outputType).getOrElse(throw new Exception("Could not get type for SoapPutAndGet output resource."))
      }
    } yield StepLogicGenerator.modifierGen(new ScalaGen {
      override def generate(): Try[String] = for {
        soapResourceStr <- soapGen.generate
        timeOutStr <- timeOut.generate
        requestIOStr <- requestIO.generate
        responseIOStr <- responseIO.generate
      } yield s"""SoapIOPutAndGetRunner(context, $soapResourceStr, $requestIOStr, $responseIOStr, $timeOutStr)"""
    }, soap, s"SoapPutAndGet[$inputResourceType, $outputResourceType]")

  def timeOut(timeout: MComplexValue): Try[TryGen] = Option(timeout) flatMap { cv =>
    ComplexValueStringGenerator(cv) match {
      case Success(TryExpr(StringExpr("", _), _)) => None
      case other                                  => Option(other)
    }
  } getOrElse Try(TryExpr("\"60\""))

  protected def genTerminationCondition(op: SoapIOGetOperation): Try[Option[String]] =
    Option(op.getTerminationCondition) match {
      case Some(cond: PerlTerminationCondition) => for {
        codeTryGen <- ComplexValueCodeGenerator(cond.getPerlCode)
        codeTry <- codeTryGen.generate
      } yield Some(codeTry)
      case Some(unknown) =>
        new Failure(new IllegalArgumentException(s"Unknown SoapIO terminaion condition: $unknown"))
      case None =>
        new Success(None)
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
