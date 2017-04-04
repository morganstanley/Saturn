package com.ms.qaTools.saturn.codeGen
import scala.collection.JavaConversions._
import scala.util.parsing.combinator.JavaTokenParsers
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import com.ms.qaTools.saturn.{AbstractParameter => MAbstractParameter}
import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{IncludeFile => MIncludeFile}
import com.ms.qaTools.saturn.ProcedureCallStep
import com.ms.qaTools.saturn.{ResourceParameter => MResourceParameter, AttributeParameter => MAttributeParameter}
import com.ms.qaTools.saturn.{RunGroup => MRunGroup}
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.KronusStep
import com.ms.qaTools.saturn.SaturnPackage
import com.ms.qaTools.saturn.kronus.Backport
import com.ms.qaTools.saturn.kronus.backport.KronusCallConfiguration
import com.ms.qaTools.saturn.modules.cometModule.CometModulePackage
import com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage
import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage
import com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallConfiguration
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage
import com.ms.qaTools.saturn.modules.procedureCallModule.{AbstractArgument, ResourceArgument, AttributeArgument}
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage
import com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage
import com.ms.qaTools.saturn.repetition.RepetitionPackage
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage
import com.ms.qaTools.saturn.resources.queryResource.QueryResourcePackage
import com.ms.qaTools.saturn.resources.referenceResource.{ReferenceResource => MReferenceResource}
import com.ms.qaTools.saturn.types.KronusResource
import com.ms.qaTools.saturn.types.NamedResourceDefinition
import com.ms.qaTools.saturn.types.TypesPackage
import com.ms.qaTools.saturn.utils.SaturnEObjectUtils._
import com.ms.qaTools.saturn.values.ValuesPackage

object FeatureTypeMapping {
  protected object Internal {
  val fileDeviceStr     = "DeviceIO"
  val databaseDeviceStr = "DatabaseConnection"
  val dataSetStr        = ResourceGenerator.stringRowIO
  val dataSetInput      = s"Input[${ResourceGenerator.stringRowIterator}]"
  val xmlStr            = ResourceGenerator.w3cDocumentIO
  val fixStr            = ResourceGenerator.fixIO
  val strStr            = ResourceGenerator.stringIO
  val jsonStr           = ResourceGenerator.jsonIO
  val propStr           = ResourceGenerator.propIO
  val soapStr           = ResourceGenerator.soapIO

  val featureTypePairs:Map[EStructuralFeature,Map[EClass,String]] = Seq(
    (ValuesPackage.eINSTANCE.getCellComplexValue_Resource(),                 dataSetInput),
    (ValuesPackage.eINSTANCE.getXPathComplexValue_Resource(),                xmlStr),
    (ValuesPackage.eINSTANCE.getFIXComplexValue_Resource(),                  fixStr),
    (ValuesPackage.eINSTANCE.getPropertyComplexValue_Resource(),             propStr),
    (ValuesPackage.eINSTANCE.getJSONComplexValue_Resource(),                 jsonStr),
    
    (RepetitionPackage.eINSTANCE.getForEachRepetition_DataSetResource(),          dataSetInput),
    (RepetitionPackage.eINSTANCE.getForEachXPathRepetition_XMLResource(),         xmlStr),
    (RepetitionPackage.eINSTANCE.getForEachXPathRepetition_NamespaceDefinition(), dataSetInput),

    CometModulePackage.eINSTANCE.getCometConfiguration_Database -> "MongoDBConnection",

    //TODO fix after merging refactor of CPSIO in util
//    (CpsModulePackage.eINSTANCE.getCpsConfiguration_CpsResource(), "IO3Try[CpsRowSource[_],CpsRowWriter[_],ExcelDiffSetWriter]"),
    (CpsModulePackage.eINSTANCE.getCpsGetOperation_Output(), dataSetStr),
    (CpsModulePackage.eINSTANCE.getCpsPutOperation_Input(),  dataSetInput),
    
    (DatacompareModulePackage.eINSTANCE.getDataSourceDefinition_Left(),      dataSetInput),
    (DatacompareModulePackage.eINSTANCE.getDataSourceDefinition_Right(),     dataSetInput),
    (DatacompareModulePackage.eINSTANCE.getOutput_Resource(),                dataSetStr),
    
    (DsConvertModulePackage.eINSTANCE.getSimpleOperation_Source(),           dataSetInput),
    (DsConvertModulePackage.eINSTANCE.getSimpleOperation_Target(),           dataSetStr),

    FileResourcePackage.eINSTANCE.getFixedWidthFile_ConfigFile -> s"Input[${ResourceGenerator.w3cDocumentIterator}]",

    (MqModulePackage.eINSTANCE.getMQConfiguration_MQResource(),              "MQResource"),
    (MqModulePackage.eINSTANCE.getMQGetAction_Output(),                      "Writer[Iterator[MqMessage]]"),
    (MqModulePackage.eINSTANCE.getMQPutAction_Input(),                       "Iterator[Iterator[javax.jms.Message]]"),
    (MqModulePackage.eINSTANCE.getMQGetOperation_OutputResource(),           fileDeviceStr),
    (MqModulePackage.eINSTANCE.getMQPutOperation_InputResource(),            fileDeviceStr),

    (SoapIOModulePackage.eINSTANCE.getSoapIOConfiguration_SoapIOResource(),  soapStr),
    (SoapIOModulePackage.eINSTANCE.getSoapIOGetOperation_Output(),           xmlStr),
    (SoapIOModulePackage.eINSTANCE.getSoapIOPutAndGetOperation_Input(),      xmlStr),
    (SoapIOModulePackage.eINSTANCE.getSoapIOPutAndGetOperation_Output(),     xmlStr),
    (SoapIOModulePackage.eINSTANCE.getSoapIOPutOperation_Input(),            xmlStr),
    
    (SqlModulePackage.eINSTANCE.getExecuteCommand_ParameterFile(),           dataSetInput),
    (SqlModulePackage.eINSTANCE.getFetchQuery_Output(),                      dataSetStr),    
    (SqlModulePackage.eINSTANCE.getFetchQuery_ParameterFile(),               dataSetInput),
    (SqlModulePackage.eINSTANCE.getLoadTable_Input(),                        dataSetInput),
    (SqlModulePackage.eINSTANCE.getProcCallDefinition_Output(),              dataSetStr),
    (SqlModulePackage.eINSTANCE.getProcCallDefinition_ParameterFile(),       dataSetInput),
    (SqlModulePackage.eINSTANCE.getSQLConfiguration_DatabaseResource(),      databaseDeviceStr),
    (SqlModulePackage.eINSTANCE.getSQLClearOperation_TableGroupDefinition(), fileDeviceStr),
    (SqlModulePackage.eINSTANCE.getSQLLoadOperation_TableGroupDefinition(),  fileDeviceStr),
    (SqlModulePackage.eINSTANCE.getSQLFetchOperation_TableGroupDefinition(), fileDeviceStr),
    (SqlModulePackage.eINSTANCE.getSQLLoadOperation_InputResource(),         fileDeviceStr),
    (SqlModulePackage.eINSTANCE.getSQLFetchOperation_OutputResource(),       fileDeviceStr),
    (SqlModulePackage.eINSTANCE.getSQLFetchOperation_ParameterResource(),    fileDeviceStr),
    
    (Xml2csvModulePackage.eINSTANCE.getXml2CsvConfiguration_ConfigFile(),    "XML2CSV_CFG"),
    (Xml2csvModulePackage.eINSTANCE.getXml2CsvConfiguration_CSVFile(),       dataSetStr),
    (Xml2csvModulePackage.eINSTANCE.getXml2CsvConfiguration_NamespaceFile(), dataSetInput),
    (Xml2csvModulePackage.eINSTANCE.getXml2CsvConfiguration_XMLFile(),       xmlStr),
    
    (XmlGenModulePackage.eINSTANCE.getDataSet_File(),                        dataSetInput),
    (XmlGenModulePackage.eINSTANCE.getXmlGenConfiguration_OutputResource(),  xmlStr),
    (XmlGenModulePackage.eINSTANCE.getXmlGenConfiguration_TemplateFile(),    xmlStr)
  ).map{pair => 
    val(feature,typeStr)=pair; 
    (feature,Map[EClass,String]().withDefaultValue(typeStr))
  }.toMap
 
  val featureTypeHierarchy:Map[EReference,Map[EClass,String]] = Map(
    TypesPackage.eINSTANCE.getDataSetResourceDefinition_DeviceResource() -> Map(
      FileResourcePackage.eINSTANCE.getCSVFile()         -> fileDeviceStr,
      FileResourcePackage.eINSTANCE.getCustomFile()      -> fileDeviceStr,
      FileResourcePackage.eINSTANCE.getDataFile()        -> fileDeviceStr,      
      FileResourcePackage.eINSTANCE.getExcelWorkSheet()  -> "IO3[Workbook,ExcelWorkBook,ExcelDiffSetWriterFactory]",
      FileResourcePackage.eINSTANCE.getFixedWidthFile()  -> fileDeviceStr,
      FileResourcePackage.eINSTANCE.getJsonFile()        -> fileDeviceStr,
      FileResourcePackage.eINSTANCE.getLineFile()        -> fileDeviceStr,
      FileResourcePackage.eINSTANCE.getOOCalcWorkSheet() -> "OOCalcWorkBook",
      FileResourcePackage.eINSTANCE.getSlurpFile()       -> fileDeviceStr,
      FileResourcePackage.eINSTANCE.getXMLFile()         -> fileDeviceStr,
      QueryResourcePackage.eINSTANCE.getQueryResource()  -> databaseDeviceStr
    )
  ) 
  
  val featureTypeMap = featureTypeHierarchy ++ featureTypePairs
  }

  def apply(feature: EStructuralFeature, eClass: EClass): String = try Internal.featureTypeMap(feature)(eClass) catch {
    case e: NoSuchElementException => throw new NoSuchElementException(s"${eClass.getName}#${feature.getName}")
  }
}

//TODO move this to a meta-information class along with what's in ResourceGenerator
class ParameterTypeInferencer protected (procs: List[MAbstractRunGroup],
                                         includeFileMap: Map[MIncludeFile, (MSaturn, String)]) {
  import ParameterTypeInferencer._

  val resourceParameters = procs.head.getParameters().collect{case r:MResourceParameter => r}
  val allReferences = procs.head.eAllContents.collect {
    case r:MReferenceResource => r
  }.toSet[MReferenceResource].groupBy(_.getResource)

  protected def allReferencesToResource(name: String,
                                        soFar: Set[MReferenceResource] = Set.empty): Set[MReferenceResource] = {
    val xs = allReferences.getOrElse(name, Set.empty)
    val found = soFar ++ xs
    val todo = xs -- soFar
    if (todo.isEmpty) found else todo.flatMap(r => allReferencesToResource(r.getName, found))
  }

  val parameterLeafFeatureMap: Map[MResourceParameter, TypeTree] = {
    for(resourceParameter <- resourceParameters) yield {
      val parmName = resourceParameter.getName()
      val refsToParm = allReferencesToResource(parmName)
      val parentsOfRefsToParm = refsToParm.map(r => (r.eContainer, r.eContainer.eContainer))

      val higherLevelParmTypes = for {
        (arg, call) <- parentsOfRefsToParm.collect {
          case (a: ResourceArgument, c: ProcedureCallConfiguration) => (a, c)
        }
        procedure = resolveProcedureIncludeAndName(call) if !(procs contains procedure)
      } yield {
        val param = procedure.getParameters.find(_.getName == arg.getName).get.asInstanceOf[MResourceParameter]
        new ParameterTypeInferencer(procedure :: procs, includeFileMap).getParameterType(param)
      }

      val kronusTypes = parentsOfRefsToParm.collect {
        case (a: ResourceArgument, c: KronusCallConfiguration) => KronusCodeGen(Backport()).genArgumentType(c, a)
      }

      val parmTypeSet = refsToParm.iterator.map(r => (r.eContainingFeature, r.eContainer.eClass)).collect {
        case (feature, eClass) if feature != SaturnPackage.eINSTANCE.getAbstractRunGroup_Resources &&
                                  feature != ProcedureCallModulePackage.eINSTANCE.getResourceArgument_Resource =>
          TypeTree(FeatureTypeMapping(feature, eClass))
      }.toSet ++ higherLevelParmTypes ++ kronusTypes - AnyType

      if(parmTypeSet.isEmpty)      { (resourceParameter, AnyType) }
      else if(parmTypeSet.size > 1) throw new Exception("More than one type was found for: " + procs.head.getName() + "(" + parmName + "): " + parmTypeSet)
      else { (resourceParameter, parmTypeSet.head)  }
    }
  }.toMap

  def getParameterType(param: MAbstractParameter): TypeTree = param match {
    case r: MResourceParameter  => parameterLeafFeatureMap.getOrElse(r, AnyType)
    case a: MAttributeParameter => StringType
  }
  
  def resolveProcedure(startRunGroup:EObject, procedureName:String):Option[MAbstractRunGroup] =
    startRunGroup match {
      case s:MSaturn   => s.getRunGroups().filter{_.isProcedure()}.find{_.getName() == procedureName}
      case r:MRunGroup => r.getRunGroups().filter{_.isProcedure()}.find{_.getName() == procedureName} match {
        case Some(i) => Some(i)
        case None    => resolveProcedure(r.eContainer(), procedureName)
      }
      case p:ProcedureCallStep => resolveProcedure(p.eContainer(),procedureName)
      case _ => None
  }
  
  def resolveProcedureIncludeAndName(procedureCall:ProcedureCallConfiguration):MAbstractRunGroup = {
    val fullProcedureName = procedureCall.getRunGroup().getText().map{_.getText()}.mkString
    
    val (rootEObject,procedureName) = if(fullProcedureName.contains(".")) {
      val parts = fullProcedureName.split("\\.")
      val includeName = parts(0)
      
      resolveInclude(procedureCall,includeName) match {
        case Some(i) => (includeFileMap(i)._1, parts(1))
        case None    => throw new Exception("Count not resolve include file: '" + includeName + "'")
      }
    } 
    else { 
      (procedureCall.eContainer(),fullProcedureName) 
    }
    
//    println("RESOLVING PROCEDURE: (" + rootEObject + ", " + procedureName + ")")
    
    resolveProcedure(rootEObject,procedureName) match {
      case Some(p) => p
      case None    => throw new Exception("Cound not resolve procedure: '" + fullProcedureName + "'")
    }
  }
}

object ParameterTypeInferencer {
  def apply(proc: MAbstractRunGroup, includeFileMap: Map[MIncludeFile, (MSaturn, String)]) =
    new ParameterTypeInferencer(List(proc), includeFileMap)

  type TypeParameterOwner = Either[KronusStep, KronusResource]
  object TypeParameterOwner {
    def apply(owner: EObject): TypeParameterOwner = owner match {
      case ks: KronusStep     => Left(ks)
      case kr: KronusResource => Right(kr)
    }
  }

  abstract class TypeTree extends Traversable[TypeTree] {
    def foreach[A](f: TypeTree => A) = postOrderForeach(f)

    def postOrderForeach[A](f: TypeTree => A) {
      this match {
        case AppliedType(_, args) => args.foreach(_.postOrderForeach(f))
        case CompoundType(typs)   => typs.foreach(_.postOrderForeach(f))
        case _                    =>
      }
      f(this)
    }

    override def toString = this match {
      case TypeParameter(name, _)   => name
      case AppliedType(name, Seq()) => name
      case AppliedType(name, args)  => name + args.mkString("[", ", ", "]")
      case CompoundType(typs)       => typs.mkString(" with ")
    }

    def reifyTypeParam(tparam: String, arg: TypeTree)(implicit codeGenUtil: SaturnCodeGenUtil): TypeTree = {
      val tparamPos = typeParamPos(tparam).getOrElse {
        throw new IllegalArgumentException(s"Cannot find $tparam in $this")
      }
      val List((paramT, _), (argT, context)) = List(this, arg).map { tt =>
        val (t, c) = tt.toScalaTree(codeGenUtil)
        (t.tpe, c)
      }
      val (typ, _) = ((argT, paramT) /: tparamPos) {
        case ((argT, paramT), pos) =>
          val paramTSym = paramT.typeSymbol
          val tparam = paramTSym.typeParams(pos)
          val reified = tparam.toTypeIn(argT)
          if (reified =:= tparam.tpe) codeGenUtil.compiler.synchronized {
            import codeGenUtil.compiler._
            val reifiedTPs = for {
              (res, _) <- analyzer.allViewsFrom(argT, context, Nil)
              MethodType(_, argT) = res.tree.tpe
              reified = tparam.toTypeIn(argT) if !(reified =:= tparam.tpe)
            } yield reified
            (reifiedTPs.head, paramT.typeArgs(pos))
          } else (reified, paramT.typeArgs(pos))
      }
      TypeTree(typ.toString)
    }

    def typeParamPos(tparam: String): Option[List[Int]] = this match {
      case TypeParameter(name, _) if name == tparam =>
        Some(Nil)
      case AppliedType(_, args) => args.zipWithIndex.map {
        case (arg, i) => arg.typeParamPos(tparam).map(i :: _)
      }.reduce(_ orElse _)
      case _ =>
        None
    }

    def toScalaTree(codeGenUtil: SaturnCodeGenUtil): (codeGenUtil.compiler.Tree, codeGenUtil.compiler.analyzer.Context) = {
      val tparamNames = collect {case TypeParameter(name, _) => name}
      val tparamsStr = if (tparamNames.isEmpty) "" else tparamNames.mkString("[", ", ", "]")
      val code = s"type __A$tparamsStr = $this"
      val (codeGenUtil.compiler.TypeDef(_, _, _, tree), context) = codeGenUtil.parseScala(code)
      (tree, context)
    }

    def mapTypeParams(f: TypeParameter => TypeTree): TypeTree = this match {
      case tp: TypeParameter       => f(tp)
      case AppliedType(name, args) => AppliedType(name, args.map(_.mapTypeParams(f)))
      case CompoundType(typs)      => CompoundType(typs.map(_.mapTypeParams(f)))
    }
  }

  object TypeTree {
    def apply(name: String, tparams: Set[String] = Set.empty, owner: Option[TypeParameterOwner] = None): TypeTree = {
      val p = new Parser(tparams, owner)
      p.parse(p.typeTree, name).getOrElse(sys.error(s"Error parsing type $name"))
    }

    class Parser(tparams: Set[String], owner: Option[TypeParameterOwner]) extends JavaTokenParsers {
      def typeTree: Parser[TypeTree] = rep1sep(nonCompoundType, "with") ^^ {
        case List(typ) => typ
        case typs      => CompoundType(typs)
      }

      def nonCompoundType: Parser[TypeTree] = tuple | ordinary

      def ordinary: Parser[TypeTree] = typIdent ~ ("[" ~> rep1sep(typeTree, ",") <~ "]").? ^^ {
        case name ~ None if tparams(name) => TypeParameter(name, owner.get)
        case name ~ args                  => AppliedType(name, args.getOrElse(Nil))
      }

      def tuple: Parser[TypeTree] = "(" ~> rep1sep(typeTree, ",") <~ ")" ^^ {
        case xs => AppliedType(s"Tuple${xs.size}", xs)
      }

      val typIdent: Parser[String] = rep1sep(ident, ".") ^^ {_.mkString(".")}
    }
  }

  case class AppliedType(name: String, args: Seq[TypeTree] = Nil) extends TypeTree
  case class CompoundType(typs: Seq[TypeTree]) extends TypeTree
  case class TypeParameter(name: String, owner: TypeParameterOwner) extends TypeTree

  val AnyType    = AppliedType("Any")
  val StringType = AppliedType("String")

  def getArgumentType(arg: AbstractArgument)(implicit codeGenUtil: SaturnCodeGenUtil): TypeTree = arg match {
    case r: ResourceArgument  => getResourceType(r.getResource)
    case a: AttributeArgument => StringType
  }

  def getResourceType(res: NamedResourceDefinition)(implicit codeGenUtil: SaturnCodeGenUtil): TypeTree = res match {
    case ref: MReferenceResource =>
      ref.referencedContainers.flatMap { rg =>
        rg.getResources.find(_.getName == ref.getResource).map(getResourceType) orElse {
          if (rg.isProcedure) rg.getParameters.collectFirst {
            case r: MResourceParameter if r.getName == ref.getResource =>
              ParameterTypeInferencer(rg, codeGenUtil.includeFileMap).getParameterType(r)
          } else None
        }
      }.next
    case r =>
      ResourceGenerator.getMetaData(r).get.getTypeTree
  }

  def resolveInclude(startRunGroup: EObject, includeName: String) = startRunGroup.resolveInclude(includeName)
}