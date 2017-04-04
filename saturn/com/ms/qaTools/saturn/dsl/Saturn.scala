package com.ms.qaTools.saturn.dsl
import scala.collection.JavaConversions._
import com.ms.qaTools.saturn.values.{ComplexValue => MComplexValue}
import com.ms.qaTools.saturn.{AbstractLink        => MAbstractLink}
import com.ms.qaTools.saturn.{AbstractRunGroup    => MAbstractRunGroup}
import com.ms.qaTools.saturn.{Attribute           => MAttribute}
import com.ms.qaTools.saturn.{RunCmdsStep         => MRunCmds}
import com.ms.qaTools.saturn.{RunGroup            => MRunGroup}
import com.ms.qaTools.saturn.{Saturn              => MSaturn}
import com.ms.qaTools.saturn.{Xml2CsvStep         => MXml2Csv}
import com.ms.qaTools.saturn.{XmlDiffStep         => MXmlDiff}
import com.ms.qaTools.saturn.{XmlGenStep          => MXmlGen}
import com.ms.qaTools.saturn.{XmlManipStep        => MXmlManip}
import com.ms.qaTools.saturn.modules.runcmdsModule.{RunCmdsConfiguration      => MRunCmdsConfiguration}
import com.ms.qaTools.saturn.modules.runcmdsModule.{Command                   => MRunCmdsCommand}
import com.ms.qaTools.saturn.modules.xml2csvModule.{Xml2CsvConfiguration      => MXml2CsvConfiguration}
import com.ms.qaTools.saturn.modules.xml2csvModule.{XPathMapping              => MXml2CsvXPathMapping}
import com.ms.qaTools.saturn.modules.xmlDiffModule.{XmlDiffConfiguration      => MXmlDiffConfiguration}
import com.ms.qaTools.saturn.modules.xmlDiffModule.{XmlDiffColumn             => MXmlDiffColumn}
import com.ms.qaTools.saturn.modules.xmlDiffModule.{XmlDiffNamespace          => MXmlDiffNamespace}
import com.ms.qaTools.saturn.modules.xmlDiffModule.{XmlDiffObject             => MXmlDiffObject}
import com.ms.qaTools.saturn.modules.xmlGenModule.{XmlGenConfiguration        => MXmlGenConfigureation}
import com.ms.qaTools.saturn.modules.xmlGenModule.{DataSet                    => MXmlGenDataSet}
import com.ms.qaTools.saturn.modules.xmlGenModule.{XmlFormatEnums             => MXmlGenXmlFormatEnums}
import com.ms.qaTools.saturn.modules.xmlManipModule.{XmlManipConfiguration    => MXmlManipConfiguration}
import com.ms.qaTools.saturn.modules.xmlManipModule.{AbstractOperation        => MAbstractOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{XmlManipNamespace        => MXmlManipNamespace}
import com.ms.qaTools.saturn.modules.xmlManipModule.{AddOperation             => MXmlManipAddOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{CleanNamespacesOperation => MXmlManipCleanNamespacesOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{DeleteOperation          => MXmlManipDeleteOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{ExtractOperation         => MXmlManipExtractOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{IntersectOperation       => MXmlManipIntersectOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{RegisterFunctionOperation=> MXmlManipRegisterFunctionOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{ReplaceOperation         => MXmlManipReplaceOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{ShiftOperation           => MXmlManipShiftOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{SortOperation            => MXmlManipSortOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{SplitOperation           => MXmlManipSplitOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{StripNamespacesOperation => MXmlManipStripNamespacesOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{ValueReplaceOperation    => MXmlManipValueReplaceOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{WhereOperation           => MXmlManipWhereOperation}
import com.ms.qaTools.saturn.modules.xmlManipModule.{XPath                    => MXmlManipXPath}
import com.ms.qaTools.saturn.SaturnFactory
import com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModuleFactory
import com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModuleFactory
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModuleFactory
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModuleFactory
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModuleFactory
import com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum
import com.ms.qaTools.saturn.types.InterpretersEnum
import com.ms.qaTools.saturn.types.NamedResourceDefinition
import com.ms.qaTools.saturn.types.ResourceDefinition
import java.math.BigInteger
import com.ms.qaTools.saturn.{OnPassLink   => MOnPassLink}
import com.ms.qaTools.saturn.{OnFailLink   => MOnFailLink}
import com.ms.qaTools.saturn.{OnFinishLink => MOnFinishLink}
import com.ms.qaTools.saturn.{CustomLink   => MCustomLink}
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.FeatureMap
import com.ms.qaTools.saturn.values.ValuesFactory
import org.eclipse.emf.ecore.util.FeatureMapUtil
import com.ms.qaTools.saturn.values.ValuesPackage
import com.ms.qaTools.saturn.types.TypesFactory
import com.ms.qaTools.saturn.types.{NamedResourceDefinition => MNamedResource}
import com.ms.qaTools.saturn.types.{InlineDeviceResourceDefinition => MInlineFile}
import com.ms.qaTools.saturn.values.{ComplexValue => MComplexValue}
import com.ms.qaTools.saturn.resources.fileResource.FileResourceFactory
import com.ms.qaTools.saturn.resources.fileResource.{DeviceFile => MDeviceFile}
import com.ms.qaTools.saturn.resources.fileResource.{CSVFile => MCSVFile}
import com.ms.qaTools.saturn.resources.referenceResource.{ReferenceResource => MReferenceResource}
import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourceFactory



/**
 * TODO - ComplexValues
 *   are defined both in Saturn and in util, the saturn implementation should refer to the util implementation rather than implementing its own
 *   this first implementation should simply use Saturn's implementation while mimicking util's dsl, this can be refactored later
 *   the temporary version of complex values dsl should be implemented in its own file here
 *
 * TODO - File organization
 *   Should we have a dsl file/module-resource?
 */

trait LinkContext {
  def addLinks(p:MRunGroup,l:Seq[LinkDef])
  def calcLinks(s:MSaturn):Seq[MAbstractLink]
}

case object NullLinkContext extends LinkContext {
  def addLinks(p:MRunGroup,l:Seq[LinkDef]) = {}
  def calcLinks(s:MSaturn):Seq[MAbstractLink] = Nil
}

//object DefaultLinkContext extends ActiveLinkContext

case object ActiveLinkContext extends LinkContext {
  override def addLinks(p:MRunGroup,l:Seq[LinkDef]):Unit = linkMap.put(p,l)
  val linkMap:scala.collection.mutable.Map[MRunGroup,Seq[LinkDef]] = scala.collection.mutable.Map()
  def calcLinks(s:MSaturn):Seq[MAbstractLink] = {
    val links = for((parent,linkDefs) <- linkMap; linkDef <- linkDefs) yield {
      val link = linkDef.link
      val runGroups = for(g <- parent.getRunGroups()) yield {(g.getName(),g)}
      val runGroupsMap:scala.collection.Map[String,MAbstractRunGroup] = runGroups.toMap

      runGroupsMap.get(linkDef.source) match {
        case Some(rg) => link.setSource(rg)
        case _ => throw new Exception()
      }

      runGroupsMap.get(linkDef.target) match {
        case Some(rg) => link.setTarget(rg)
        case _ => throw new Exception()
      }
      link
    }
    links.toSeq
  }
}

case class LinkDef(source:String,target:String,link:MAbstractLink)

object OnPass {
  def apply(f:String,t:String):LinkDef = LinkDef(f,t,SaturnFactory.eINSTANCE.createOnPassLink())
  def unapply(l:MOnPassLink):Option[(MAbstractRunGroup,MAbstractRunGroup)] = Some(l.getSource(),l.getTarget())
}

object OnFail {
  def apply(f:String,t:String):LinkDef = LinkDef(f,t,SaturnFactory.eINSTANCE.createOnFailLink())
  def unapply(l:MOnFailLink):Option[(MAbstractRunGroup,MAbstractRunGroup)] = Some(l.getSource(),l.getTarget())
}

object OnFinish {
  def apply(f:String,t:String):LinkDef = LinkDef(f,t,SaturnFactory.eINSTANCE.createOnFinishLink())
  def unapply(l:MOnFinishLink):Option[(MAbstractRunGroup,MAbstractRunGroup)] = Some(l.getSource(),l.getTarget())
}

object OnCustom {
    def unapply(l:MCustomLink):Option[(MAbstractRunGroup,MAbstractRunGroup,MComplexValue)] = Some(l.getSource(),l.getTarget(),l.getCode())
}

object ComplexValue {
  def apply() = ValuesFactory.eINSTANCE.createComplexValue()
  def apply(body:FeatureMap.Entry*):MComplexValue = {
    val cv = ComplexValue()
    cv.getMixed().addAll(body)
    cv
  }
}

object Text {
  def apply() = ValuesFactory.eINSTANCE.createTextComplexValue()
  def apply(string:String):FeatureMap.Entry = {
    val text = Text()
    text.setText(string)
    FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_Text(), text)
  }
}

object Ref {
  def apply() = ValuesFactory.eINSTANCE.createReferenceComplexValue()
  def apply(attribute:String):FeatureMap.Entry = {
    val ref = Ref()
    ref.setUserAttribute(attribute)
    FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_Reference(), ref)
  }
}

object Attribute {
  def apply() = SaturnFactory.eINSTANCE.createAttribute()
  def apply(name:String, body:FeatureMap.Entry*):MAttribute = {
    val a = Attribute()
    a.setName(name)
    a.getMixed().addAll(body)
    a
  }
}

object DeviceFile {
  def apply() = FileResourceFactory.eINSTANCE.createDeviceFile()
  def apply(name:String, fileName:FeatureMap.Entry*):MDeviceFile = DeviceFile(name, ComplexValue(fileName:_*))
  def apply(name:String, fileName:MComplexValue):MDeviceFile = {
    val device = DeviceFile()
    device.setName(name)
    device.setFileName(fileName)
    device
  }
}

object InlineFile {
  def apply() = TypesFactory.eINSTANCE.createInlineDeviceResourceDefinition()
  def apply(name:String, body:FeatureMap.Entry*):MInlineFile = InlineFile(name, ComplexValue(body:_*))
  def apply(name:String, body:MComplexValue):MInlineFile = {
    val device = InlineFile()
    device.setName(name)
    device.setValue(body)
    device
  }
}

object CsvFile {
  def apply() = FileResourceFactory.eINSTANCE.createCSVFile()
  def apply(name:String, fileName:FeatureMap.Entry*):MCSVFile = CsvFile(name, DeviceFile("CsvFileDevice", fileName:_*))
  def apply(name:String, device:MNamedResource):MCSVFile = {
    val csvFile = CsvFile()
    csvFile.setName(name)
    csvFile.setDeviceResource(device)
    csvFile
  }
}

object ResRef {
  def apply() = ReferenceResourceFactory.eINSTANCE.createReferenceResource()
  def apply(name:String,resName:String):MReferenceResource = {
    val res = ResRef()
    res.setName(name)
    res.setAdvanced(false)
    res.setResource(resName)
    res
  }
}

/**
 * val s0 = Saturn(name = "mySaturn",
 *                 runGroups = Seq(RunCmds(name = "myCmd",
 *                                 commands = Seq("echo Hello!"))))
 *
 * val s1 = new com.ms.qaTools.saturn.Saturn() //or better...
 * val s1 = SaturnFactory.eINSTANCE.createSaturn()
 * s1.setName("mySaturn")
 *
 * val c0 = new com.ms.qaTools.saturn.RunCmdsStep()
 * val c0Cfg = new com.ms.qaTools.saturn.modules.runCmds.RunCmdsConfiguration()
 * ...
 * c0.setConfiguration(c0Cfg)
 * s1.getRunGroups().add(c0)
 *
 */


object Saturn {
  def apply():MSaturn = SaturnFactory.eINSTANCE.createSaturn()
  def apply(name:String,
            runGroups:Seq[MAbstractRunGroup]=Nil,
            attributes:Seq[MAttribute]=Nil,
            resources:Seq[NamedResourceDefinition]=Nil,
            linkDefs:Seq[LinkDef]=Nil)(implicit lc:LinkContext = ActiveLinkContext):MSaturn = {
    val s = Saturn()
    lc.addLinks(s,linkDefs)

    s.setName(name)
    s.getRunGroups().addAll(runGroups)
    s.getAttributes().addAll(attributes)
    s.getResources().addAll(resources)
    s.getLinks().addAll(lc.calcLinks(s))
    s
  }

  def unapply(s:MSaturn):Option[(String,Seq[MAbstractRunGroup],Seq[MAttribute])] = ???
}

object RunGroup {
  def apply() = SaturnFactory.eINSTANCE.createRunGroup()
  def apply(name:String,
            runGroups:Seq[MAbstractRunGroup]=Nil,
            attributes:Seq[MAttribute]=Nil,
            resources:Seq[NamedResourceDefinition]=Nil,
            linkDefs:Seq[LinkDef]=Nil)(implicit lc:LinkContext = ActiveLinkContext):MRunGroup = {
    val s = this()
    lc.addLinks(s,linkDefs)

    s.setName(name)
    s.getRunGroups().addAll(runGroups)
    s.getAttributes().addAll(attributes)
    s.getResources().addAll(resources)
    s
  }
}

object RunCmds {
  def apply() = SaturnFactory.eINSTANCE.createRunCmdsStep()
  def apply(name:String,
            commands:Seq[MRunCmdsCommand]=Nil,
            attributes:Seq[MAttribute]=Nil,
            resources:Seq[NamedResourceDefinition]=Nil):MRunCmds = {
    val s = this()
    s.setName(name)
    s.getAttributes().addAll(attributes)
    s.getResources().addAll(resources)
    s.setRunCmdsConfiguration(Config(commands))
    s
  }

  def Config() = RuncmdsModuleFactory.eINSTANCE.createRunCmdsConfiguration()

  def Config(commands:Seq[MRunCmdsCommand]):MRunCmdsConfiguration = {
    val c = Config()
    c.getCommands().addAll(commands)
    c
  }

  def Config(commands:Seq[MRunCmdsCommand],
             checkStr:MComplexValue,
             checkStrAction:CheckStrActionEnum,
             interpreter:InterpretersEnum):MRunCmdsConfiguration = {
    val c = Config()
    c.getCommands().addAll(commands)
    c.setCheckStr(checkStr)
    c.setCheckStrAction(checkStrAction)
    c.setInterpreter(interpreter)
    c
  }
}

object RunCmdsCommand {
  def apply() = RuncmdsModuleFactory.eINSTANCE.createCommand()
  def apply(tee:Boolean = false, enabled:Boolean = true):MRunCmdsCommand = {
    val c = this()
    c.setEnabled(enabled)
    c.setTee(tee)
    c
  }
}

object Xml2Csv {
  def apply() = SaturnFactory.eINSTANCE.createXml2CsvStep()
  def apply(name:String,
            xmlFile:ResourceDefinition,
            csvFile:ResourceDefinition,
            configFile:ResourceDefinition
            ):MXml2Csv = {
    val c = this()
    c.setName(name)
    c.setXml2CsvConfiguration(Config(xmlFile, csvFile, configFile))
    c
  }

  def apply(name:String,
            xmlFile:ResourceDefinition,
            csvFile:ResourceDefinition,
            configFile:ResourceDefinition,
            namespaceFile:ResourceDefinition,
            addHeader:Boolean=true,
            removeNulls:Boolean=true,
            xPathMapping:Seq[MXml2CsvXPathMapping]=Nil
            ):MXml2Csv = {
    val c = this()
    c.setName(name)
    c.setXml2CsvConfiguration(Config(xmlFile, csvFile, configFile, namespaceFile, addHeader, removeNulls, xPathMapping))
    c
  }

  def Config() = Xml2csvModuleFactory.eINSTANCE.createXml2CsvConfiguration()

  def Config(xmlFile:ResourceDefinition,
            csvFile:ResourceDefinition,
            configFile:ResourceDefinition
            ):MXml2CsvConfiguration = {
    val c = Config()
    c.setXMLFile(xmlFile)
    c.setCSVFile(csvFile)
    c.setConfigFile(configFile)
    c
  }

  def Config(xmlFile:ResourceDefinition,
            csvFile:ResourceDefinition,
            configFile:ResourceDefinition,
            namespaceFile:ResourceDefinition,
            addHeader:Boolean=true,
            removeNulls:Boolean=true,
            xPathMapping:Seq[MXml2CsvXPathMapping]=Nil
            ):MXml2CsvConfiguration = {
    val c = Config(xmlFile, csvFile, configFile)
    c.setNamespaceFile(namespaceFile)
    c.setAddHeader(addHeader)
    c.setRemoveNulls(removeNulls)
    c.getXPathMappings().addAll(xPathMapping)
    c
  }
}

object XmlDiff {
  def apply() = SaturnFactory.eINSTANCE.createXmlDiffStep()

  def apply(name:String,
            leftFile:ResourceDefinition,
            rightFile:ResourceDefinition,
            outResource:ResourceDefinition
            ):MXmlDiff = {
    val c = this()
    c.setName(name)
    c.setXmlDiffConfiguration(Config(leftFile, rightFile, outResource))
    c
  }

  def apply(name:String,
            leftFile:ResourceDefinition,
            rightFile:ResourceDefinition,
            outResource:ResourceDefinition,
            description:MComplexValue=null,
            failOnValidation:Boolean=false,
            ignoreInLeftOnly:Boolean=true,
            ignoreInRightOnly:Boolean=true,
            documentKeys:Seq[MXmlDiffColumn]=Nil,
            namespaces:Seq[MXmlDiffNamespace]=Nil,
            objects:Seq[MXmlDiffObject]=Nil
            ):MXmlDiff = {
    val c = this()
    c.setName(name)
    c.setXmlDiffConfiguration(Config(leftFile, rightFile, outResource, description, failOnValidation, ignoreInLeftOnly, ignoreInRightOnly, documentKeys, namespaces, objects))
    c
  }

  def Config() = XmlDiffModuleFactory.eINSTANCE.createXmlDiffConfiguration()

  def Config(leftFile:ResourceDefinition,
            rightFile:ResourceDefinition,
            outResource:ResourceDefinition
            ):MXmlDiffConfiguration = {
    val c = Config()
    c.setLeftFile(leftFile)
    c.setRightFile(rightFile)
    c.setOutResource(outResource)
    c
  }

  def Config(leftFile:ResourceDefinition,
            rightFile:ResourceDefinition,
            outResource:ResourceDefinition,
            description:MComplexValue=null,
            failOnValidation:Boolean=false,
            ignoreInLeftOnly:Boolean=true,
            ignoreInRightOnly:Boolean=true,
            documentKeys:Seq[MXmlDiffColumn]=Nil,
            namespaces:Seq[MXmlDiffNamespace]=Nil,
            objects:Seq[MXmlDiffObject]=Nil
            ):MXmlDiffConfiguration = {
    val c = Config(leftFile, rightFile, outResource)
    c.setDescription(description)
    c.setFailOnValidation(failOnValidation)
    c.setIgnoreInLeftOnly(ignoreInLeftOnly)
    c.setIgnoreInRightOnly(ignoreInRightOnly)
    c.getDocumentKeys().addAll(documentKeys)
    c.getNamespaces().addAll(namespaces)
    c.getObjects().addAll(objects)
    c
  }
}


object XmlGen {
  def apply() = SaturnFactory.eINSTANCE.createXmlGenStep()

  def apply(name:String,
            dataSets:Seq[MXmlGenDataSet],
            output:ResourceDefinition,
            template:ResourceDefinition
           ):MXmlGen = {
    val c = this()
    c.setName(name)
    c.setXmlGenConfiguration(Config(dataSets, output, template))
    c
  }

  def apply(name:String,
            dataSets:Seq[MXmlGenDataSet],
            output:ResourceDefinition,
            template:ResourceDefinition,
            xmlFormat:MXmlGenXmlFormatEnums=null
           ):MXmlGen = {
    val c = this()
    c.setName(name)
    c.setXmlGenConfiguration(Config(dataSets, output, template, xmlFormat))
    c
  }

  def Config() = XmlGenModuleFactory.eINSTANCE.createXmlGenConfiguration()

  def Config(dataSets:Seq[MXmlGenDataSet],
            output:ResourceDefinition,
            template:ResourceDefinition
            ):MXmlGenConfigureation = {
    val c = Config()
    c.setOutputResource(output)
    c.setTemplateFile(template)
    c.getDataSets().addAll(dataSets)
    c
  }

  def Config(dataSets:Seq[MXmlGenDataSet],
            output:ResourceDefinition,
            template:ResourceDefinition,
            xmlFormat:MXmlGenXmlFormatEnums=null
            ):MXmlGenConfigureation = {
    val c = Config(dataSets, output, template)
    c.setXmlFormat(xmlFormat)
    c
  }
}

object XmlManip {
  def apply() = SaturnFactory.eINSTANCE.createXmlManipStep()

  def apply(name:String,
            input:ResourceDefinition,
            output:ResourceDefinition,
            namespaces:Seq[MXmlManipNamespace]=Nil,
            operations:Seq[MAbstractOperation]=Nil
           ):MXmlManip = {
    var c = this()
    c.setName(name)
    c.setXmlManipConfiguration(Config(input, output, namespaces, operations))
    c
  }

  def Config() = XmlManipModuleFactory.eINSTANCE.createXmlManipConfiguration()

  def Config(input:ResourceDefinition,
            output:ResourceDefinition,
            namespaces:Seq[MXmlManipNamespace]=Nil,
            operations:Seq[MAbstractOperation]=Nil
            ):MXmlManipConfiguration = {
    val c = Config()
    c.setInputResource(input)
    c.setOutputResource(output)
    c.getNamespaces().addAll(namespaces)
    c.getOperations().addAll(operations)
    c
  }
}

object XmlManipAdd {
  def apply() = XmlManipModuleFactory.eINSTANCE.createAddOperation()
  def apply(parentNodeName:MComplexValue,
            nodeName:MComplexValue,
            value:MComplexValue,
            uri:MComplexValue,
            isAttribute:Boolean=false,
            enabled:Boolean=true
           ):MXmlManipAddOperation = {
    val c = this()
    c.setParentNodeName(parentNodeName)
    c.setNodeName(nodeName)
    c.setValue(value)
    c.setIsAttribute(isAttribute)
    c.setUri(uri)
    c.setEnabled(enabled)
    c
  }
}

/*
 * ToDo: ?
 * Object XmlManipCleanNamespaces
 */

object XmlManipCleanNS {
  def apply() = XmlManipModuleFactory.eINSTANCE.createCleanNamespacesOperation()
  def apply(enabled:Boolean=true):MXmlManipCleanNamespacesOperation = {
    val c = this()
    c.setEnabled(enabled)
    c
  }
}


object XmlManipDelete {
  def apply() = XmlManipModuleFactory.eINSTANCE.createDeleteOperation()
  def apply(xpath:Seq[MXmlManipXPath], enabled:Boolean=true):MXmlManipDeleteOperation = {
    val c = this()
    c.getXPaths().addAll(xpath)
    c.setEnabled(enabled)
    c
  }
}

object XmlManipExtract {
  def apply() = XmlManipModuleFactory.eINSTANCE.createExtractOperation()
  def apply(xpath:MComplexValue, enabled:Boolean=true):MXmlManipExtractOperation = {
    val c = this()
    c.setXPath(xpath)
    c.setEnabled(enabled)
    c
  }
}

object XmlManipIntersect {
  def apply() = XmlManipModuleFactory.eINSTANCE.createIntersectOperation()
  def apply(intersectResource:ResourceDefinition, enabled:Boolean=true):MXmlManipIntersectOperation = {
    val c = this()
    c.setIntersectResource(intersectResource)
    c.setEnabled(enabled)
    c
  }
}

object XmlManipRegisterFunction {
  def apply() = XmlManipModuleFactory.eINSTANCE.createRegisterFunctionOperation()
  def apply(function:MComplexValue,
            thepackage:NamedResourceDefinition,
            subName:MComplexValue,
            uri:MComplexValue,
            enabled:Boolean=true
           ):MXmlManipRegisterFunctionOperation = {
    val c = this()
    c.setFunction(function)
    c.setPackage(thepackage)
    c.setSubName(subName)
    c.setUri(uri)
    c.setEnabled(enabled)
    c
  }
}

object XmlManipReplace {
  def apply() = XmlManipModuleFactory.eINSTANCE.createReplaceOperation()
  def apply(search:MComplexValue, replacewith:MComplexValue, enabled:Boolean=true):MXmlManipReplaceOperation = {
    val c = this()
    c.setSearch(search)
    c.setWith(replacewith)
    c.setEnabled(enabled)
    c
  }
}

/*
 *
 * Need to find out remain and remove default value
 */

object XmlManipShift {
  def apply() = XmlManipModuleFactory.eINSTANCE.createShiftOperation()
  def apply(outputResource:ResourceDefinition,
            count:BigInteger,
            remain:Boolean=false,
            remove:Boolean=false,
            enabled:Boolean=true
           ):MXmlManipShiftOperation = {
    val c = this()
    c.setCount(count)
    c.setOutputResource(outputResource)
    c.setRemain(remain)
    c.setRemove(remove)
    c.setEnabled(enabled)
    c
  }
}

object XmlManipSort {
  def apply() = XmlManipModuleFactory.eINSTANCE.createSortOperation()
  def apply(xpath:Seq[MXmlManipXPath], enabled:Boolean=true):MXmlManipSortOperation = {
    val c = this()
    c.getXPaths().addAll(xpath)
    c.setEnabled(enabled)
    c
  }
}

object XmlManipSplit {
  def apply() = XmlManipModuleFactory.eINSTANCE.createSplitOperation()
  def apply(outputResources:NamedResourceDefinition,
            groupBys: Seq[MXmlManipXPath]=Nil,
            keys: Seq[MXmlManipXPath]=Nil,
            enabled:Boolean=true
           ):MXmlManipSplitOperation = {
    val c = this()
    c.setOutputResource(outputResources)
    c.getGroupBys().addAll(groupBys)
    c.getKeys().addAll(keys)
    c.setEnabled(enabled)
    c
  }
}

object XmlManipStripNS {
  def apply() = XmlManipModuleFactory.eINSTANCE.createStripNamespacesOperation()
  def apply(enabled:Boolean=true):MXmlManipStripNamespacesOperation = {
    val c = this()
    c.setEnabled(enabled)
    c
  }
}

object XmlManipValueReplace {
  def apply() = XmlManipModuleFactory.eINSTANCE.createValueReplaceOperation()
  def apply(newValue:MComplexValue, regExp:MComplexValue, enabled:Boolean=true):MXmlManipValueReplaceOperation = {
    val c = this()
    c.setNewValue(newValue)
    c.setRegExp(regExp)
    c.setEnabled(enabled)
    c
  }
}

object XmlManipWhere {
  def apply() = XmlManipModuleFactory.eINSTANCE.createWhereOperation()
  def apply(xpath:MComplexValue, exclude:Boolean=false, enabled:Boolean=true):MXmlManipWhereOperation = {
    val c = this()
    c.setXPath(xpath)
    c.setExclude(exclude)
    c.setEnabled(enabled)
    c
  }
}
