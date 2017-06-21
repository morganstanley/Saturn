package com.ms.qaTools.saturn.kronus

import scala.collection.JavaConversions._

import com.ms.qaTools.saturn
import com.ms.qaTools.saturn.{modules, resources, types, values}
import com.ms.qaTools.saturn.KronusStep
import com.ms.qaTools.saturn.kronus.backport.KronusCallConfiguration

object SaturnToKronus33 {
  val backport = Backport()

  // XXX This is not Haskell, there is no `newtype`, wrappers cost memory & CPU
  // Use type class to group types together in the future
  sealed trait ResourceAttribute
  case class Attribute(v: values.ComplexValue)         extends ResourceAttribute
  case class Resource(r: types.ResourceDefinition)     extends ResourceAttribute

  def stepCall(name: String, function: String, args: Seq[(String, ResourceAttribute)]): KronusStep =
    saturn.SaturnFactory.eINSTANCE.createKronusStep.withSideEffect { s =>
      s.setName(name)
      s.setKronusCallConfiguration(callConf(function, args))
    }

  private def callConf(function: String, args: Seq[(String, ResourceAttribute)]): KronusCallConfiguration = {
    val f = modules.procedureCallModule.ProcedureCallModuleFactory.eINSTANCE
    val conf = saturn.kronus.backport.BackportFactory.eINSTANCE.createKronusCallConfiguration

    conf.setDef(function)
    args.foreach{case (n, v) => conf.getArguments.add(v match {
      case Resource(v) =>
        f.createResourceArgument.withSideEffect{a =>
          a.setName(n)
          a.setResource(v.asInstanceOf[types.NamedResourceDefinition].withSideEffect(_.setName(n)))}
      case Attribute(v) =>
        f.createAttributeArgument.withSideEffect{a =>
          a.setName(n)
          a.setValue(v)}
    })}
    conf
  }

  private def resourceCall0(function: String, args: Seq[(String, ResourceAttribute)]) =
    types.TypesFactory.eINSTANCE.createKronusResource.withSideEffect(_.setKronusCallConfiguration(callConf(function, args)))

  def resourceCall(function: String, args: Seq[(String, ResourceAttribute)]): ResourceAttribute = {
    Resource(resourceCall0(function, args))
  }

  def convSqlStep(step: saturn.SQLStep) = {
    // Gotcha: EMF prohibits sharing of children and will set other occurrences to null after the fact if this is defined as a val
    def db = Resource(step.getSQLConfiguration.getDatabaseResource.ensuring(_ != null))

    step.getSQLConfiguration.getOperation match {
      case op: modules.sqlModule.SQLCallOperation =>
        val calls = op.getProcedureCalls.filter(_.isEnabled).flatMap { c =>
          "calls" -> Attribute(c.getSQL) ::
          "parameters" -> convOption(Option(c.getParameterFile).map(Resource)) ::
          "outputs" -> Option(c.getOutput).map {
            case res: resources.fileResource.CSVFile => res.getDeviceResource match {
              case res: resources.fileResource.DeviceFile =>
                resourceCall("SqlCallOutput", Seq("f" -> Attribute(res.getFileName)))
              case _ => sys.error("Only file based CSVs are supported for SQLCall output")
            }
            case _ => sys.error("Only file based CSVs are supported for SQLCall output")
          }.getOrElse(resourceCall("NullSqlCallOutput", Nil)) :: Nil
        }
        stepCall(step.getName, "SqlCall", ("connection", db) +: calls)

      case op: modules.sqlModule.SQLClearOperation =>
        val tables = op.getTables.filter(_.isEnabled).map(t => "tables" -> Attribute(t))
        stepCall(step.getName, "SqlClear", ("connection", db) +: tables)

      case op: modules.sqlModule.SQLExecuteOperation =>
        val calls = op.getCommands.filter(_.isEnabled).flatMap { c =>
          "calls" -> Attribute(c.getSQL) :: "parameters" -> convOption(Option(c.getParameterFile).map(Resource)) :: Nil
        }
        stepCall(step.getName, "SqlExecute", ("connection", db) +: calls)

      case op: modules.sqlModule.SQLFetchOperation =>
        val calls = op.getQueries.filter(_.isEnabled).flatMap { q =>
          "calls" -> Attribute(q.getSQL) ::
          "parameters" -> convOption(Option(q.getParameterFile).map(Resource)) ::
          "outputs" -> Resource(q.getOutput.ensuring(_ != null)) :: Nil
        }
        stepCall(step.getName, "SqlFetch", ("connection", db) +: calls)

      case op: modules.sqlModule.SQLLoadOperation =>
        val tables = op.getTables.filter(_.isEnabled).flatMap { t =>
          "tables" -> Attribute(t.getSQL) ::
          "inputs" -> Resource(t.getInput.ensuring(_ != null)) ::
          "cleans" -> convBoolean(t.isCleanLoad) :: Nil
        }
        stepCall(step.getName, "SqlLoad", ("connection", db) +: tables)
    }
  }

  def convXml2CsvStep(step: saturn.Xml2CsvStep) = {
    val c = step.getXml2CsvConfiguration
    stepCall(step.getName, "KXml2Csv", Seq(
      "input"       -> Resource(c.getXMLFile),
      "output"      -> Resource(c.getCSVFile),
      "config"      -> Resource(c.getConfigFile),
      "namespace"   -> convOption(Option(c.getNamespaceFile).map(Resource)),
      "detachNodes" -> convBoolean(c.isDetachNodes),
      "addHeader"   -> convBoolean(c.isAddHeader),
      "removeNulls" -> convBoolean(c.isRemoveNulls)))}

  def convXmlGenStep(step: saturn.XmlGenStep) = {
    val c = step.getXmlGenConfiguration
    stepCall(step.getName, "KXmlGen", Seq(
      "template"     -> Resource(c.getTemplateFile),
      "input"        -> Resource(c.getDataSets.ensuring(_.size == 1, "XmlGen should have exactly one dataSet.").get(0).getFile),
      "output"       -> Resource(c.getOutputResource),
      "isLegacyMode" -> convBoolean(c.isLegacyMode)))}

  private def convSoapIOStep(step: saturn.SoapIOStep): KronusStep = {
    import saturn.modules.soapIOModule._
    val conf = step.getSoapIOConfiguration
    val gen = Resource(conf.getSoapIOResource)
    val op = conf.getOperation
    val timeout = Option(op.getTimeOut).filter(saturn.util.Util.isEmpty).fold(convString("60"))(Attribute)
    op match {
      case op: SoapIOPutAndGetOperation =>
        stepCall(step.getName, "SoapIOPutAndGet", Array("soapIO"  -> gen,
                                                        "input"   -> Resource(op.getInput),
                                                        "output"  -> Resource(op.getOutput),
                                                        "timeout" -> timeout))
      case op: SoapIOPutOperation =>
        stepCall(step.getName, "SoapIOPut", Array("soapIO"  -> gen,
                                                  "input"   -> Resource(op.getInput),
                                                  "timeout" -> timeout))
      case op: SoapIOGetOperation =>
        val termCond = Option(op.getTerminationCondition).map {
          case cond: PerlTerminationCondition => Attribute(cond.getPerlCode)
        }
        stepCall(step.getName, "SoapIOGet", Array("soapIO"               -> gen,
                                                  "output"               -> Resource(op.getOutput),
                                                  "timeout"              -> timeout,
                                                  "terminationCondition" -> convOption(termCond)))
    }
  }

  def convBoolean(x: Boolean) = convString(x.toString)

  def convOption(x: Option[ResourceAttribute]) =
    x.map(r => resourceCall("KSome", Seq("x" -> r))).getOrElse(resourceCall("KNone", Nil))

  def convString(x: String) = Attribute(saturn.util.Util.stringToComplexValue(x))

  private def convTransport(t: saturn.resources.soapIOResource.AbstractTransport): ResourceAttribute = t match {
    case t: resources.soapIOResource.MQTransport =>
      resourceCall("MqTransport", Seq(
        "manager"        -> Attribute(t.getMQResource.asInstanceOf[resources.mqResource.MQResource].getManagerName),
        "readQueue"      -> Attribute(t.getResponseQueue),
        "writeQueue"     -> Attribute(t.getRequestQueue)))
    case t: resources.soapIOResource.TCPTransport =>
      resourceCall("StringTcpTransport", Seq(
        "host"           -> Attribute(t.getHostname),
        "port"           -> Attribute(t.getPort),
        "authentication" -> convString(t.getHandshake.getName),
        "gzipped"        -> convBoolean(t.isGzipSend)))
    case t: resources.soapIOResource.HTTPTransport =>
      resourceCall("HttpTransport", Array("uri" -> Attribute(t.getUrl)))
  }

  private def reference(r: types.NamedResourceDefinition): saturn.resources.referenceResource.ReferenceResource = {
    val ref = saturn.resources.referenceResource.ReferenceResourceFactory.eINSTANCE.createReferenceResource
    ref.setResource(r.getName)
    ref
  }

  def convCpsStep(step: saturn.CpsStep) = {
    import resources.soapIOResource.SubscribeEnums
    import saturn.utils.SaturnEObjectUtils._
    val c = step.getCpsConfiguration

    val configType = Map(
      resources.soapIOResource.CpsMessageTypes.CPS0 -> "Cps0Config",
      resources.soapIOResource.CpsMessageTypes.SOAP -> "SoapConfig",
      resources.soapIOResource.CpsMessageTypes.GPB  -> "GpbConfig")

    def convCpsResource(r: types.ResourceDefinition) = r match {
      case r: resources.soapIOResource.CpsResource =>
        val t = r.getTransport
        resourceCall0("Cps", Seq(
          "transport" -> convTransport(t.getTransport),
          "config"    -> resourceCall(configType(t.getCpsMessageType), Seq(
            "topic"      -> convOption(Option(t.getTopic).map(t => Some(Attribute(t))).getOrElse(Some(convString("")))),
            "filter"     -> convOption(Option(t.getFilter).map(Attribute)),
            "sow"        -> convBoolean(t.getSubscribe == SubscribeEnums.SUBSCRIBE_SOW),
            "namespaces" -> convOption(Option(t.getNamespaceDefinition).map(Resource)))
            ++ protobufArgs(t)),
          "subscribe" -> convBoolean(t.getSubscribe != SubscribeEnums.NONE)))
      case r: types.NamedResourceDefinition => r
    }

    def protobufArgs(t: resources.soapIOResource.CPSTransport) = t.getCpsMessageType match {
      case resources.soapIOResource.CpsMessageTypes.GPB => Seq(
        "className"  -> Attribute(t.getClassName),
        "jarName"    -> Attribute(t.getJarLocation))
      case _ => Nil}

    val wrapper = SaturnToKronus.createWrapper(step)
    val cps = convCpsResource(c.getCpsResource.ensuring(_ != null))
    if (cps.getName == null || cps.getName.isEmpty) {
      cps.setName(wrapper.getName + "_CPSIO")
      if (wrapper.getResources.exists(_.getName == cps.getName) || wrapper.getAttributes.exists(_.getName == cps.getName))
        throw new RuntimeException(s"name ${cps.getName} already used in ${step.eObjectToPath}")
    }
    wrapper.getResources.add(cps)
    val ops = c.getOperations.iterator.zipWithIndex.map {
      case (o: modules.cpsModule.CpsGetOperation, i) =>
        stepCall(wrapper.getName + i, "CpsGet", Seq(
          "cps"         -> Resource(reference(cps)),
          "output"      -> Resource(o.getOutput),
          "termination" -> convOption(Option(o.getTerminationCondition).map{
            case c: modules.cpsModule.PerlTerminationCondition => Attribute(c.getPerlCode)
            case c => sys.error(s"Unsupported termination condition: `$c`")}),
          "timeout"     -> convOption(Option(o.getTimeOut).map(Attribute))))
      case (o: modules.cpsModule.CpsPutOperation, i) =>
        stepCall(wrapper.getName + i, "CpsPut", Seq(
          "cps"         -> Resource(reference(cps)),
          "input"       -> Resource(o.getInput),
          "topic"       -> convOption(Option(o.getTopic).map(Attribute)),
          "timeout"     -> convOption(Option(o.getTimeOut).map(Attribute))))
      case (o: modules.cpsModule.CpsSowDeleteOperation, i) =>
        stepCall(wrapper.getName + i, "CpsDeleteSow", Seq(
          "cps"         -> Resource(reference(cps)),
          "topic"       -> convOption(Option(o.getTopic).map(Attribute)),
          "filter"      -> convOption(Option(o.getFilter).map(Attribute))))
      case (o: modules.cpsModule.CpsSubscribeOperation, i) =>
        stepCall(wrapper.getName + i, "CpsSubscribe", Seq(
          "cps"         -> Resource(reference(cps)),
          "topic"       -> convOption(Option(o.getTopic).map(Attribute)),
          "filter"      -> convOption(Option(o.getFilter).map(Attribute)),
          "sow"         -> convBoolean(o.isSetSowInit && o.isSowInit)))
      case (o: modules.cpsModule.CpsUnsubscribeOperation, i) =>
        stepCall(wrapper.getName + i, "CpsUnsubscribe", Seq(
          "cps"         -> Resource(reference(cps)),
          "topic"       -> Attribute(o.getTopic)))
    }.toSeq
    wrapper.getRunGroups.addAll(ops)
    ops.sliding(2).foreach {
      case Seq(s, t) =>
        val l = saturn.SaturnFactory.eINSTANCE.createOnPassLink
        l.setSource(s)
        l.setTarget(t)
        step.parent[saturn.Saturn].getOrElse {
          throw new RuntimeException("unable to find top level saturn for " + step)
        }.getLinks.add(l)
      case _ =>
    }
    wrapper
  }

  def apply(u: saturn.codeGen.SaturnCodeGenUtil) = {
    u.saturn.eAllContents.toList.foreach{
      case s: saturn.CpsStep     => SaturnToKronus.replace(s, convCpsStep(s), u.saturn)
      case s: saturn.SoapIOStep  => SaturnToKronus.replace(s, convSoapIOStep(s), u.saturn)
      case s: saturn.SQLStep     => SaturnToKronus.replace(s, convSqlStep(s), u.saturn)
      case s: saturn.Xml2CsvStep => SaturnToKronus.replace(s, convXml2CsvStep(s), u.saturn)
      case s: saturn.XmlGenStep  => SaturnToKronus.replace(s, convXmlGenStep(s), u.saturn)
      case _ => ()}
    u.saturn}
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
