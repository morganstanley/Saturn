package com.ms.qaTools.saturn.kronus

import java.io.StringWriter

import scala.annotation.switch
import scala.collection.JavaConversions._
import scala.collection.mutable
import scala.util.parsing.combinator.RegexParsers

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.FeatureMap

import com.ms.qaTools.io.rowSource.ColumnDefinition
import com.ms.qaTools.io.rowWriter.CsvRowWriter
import com.ms.qaTools.saturn._
import com.ms.qaTools.saturn.codeGen.{SaturnCodeGenUtil, DependencyExtractor, ProcedureGenerator}
import com.ms.qaTools.saturn.codeGen.{ParameterTypeInferencer => PTI}
import com.ms.qaTools.saturn.kronus._
import com.ms.qaTools.saturn.modules.procedureCallModule._
import com.ms.qaTools.saturn.modules
import com.ms.qaTools.saturn.repetition._
import com.ms.qaTools.saturn.resources
import com.ms.qaTools.saturn.types._
import com.ms.qaTools.saturn.values._

object SaturnToKronus {
  def apply(config: Config): Dependency = new SaturnToKronus.TopLevel(config.codeGenUtil.saturn)(config).toTopLevel

  class Config(val codeGenUtil: SaturnCodeGenUtil,
               val backport: Backport,
               val pkg: Option[String]) {
    codeGenUtil.saturnEObjects.foreach(sanitize)

    val customLinks: Map[(String, AbstractRunGroup), CustomLink] = codeGenUtil.allLinks.iterator.collect {
      case l: CustomLink => (l.getSource.getName, l.getTarget) -> l
    }.toMap

    val includesBySaturn: Map[Saturn, Set[IncludeFile]] = codeGenUtil.includeFileMap.keySet.groupBy(getSaturn)

    val includeFileMap: mutable.Map[Saturn, Dependency] = mutable.Map()

    val procedureCallDependencies: Map[AbstractRunGroup, Set[ProcedureCallStep]] =
      codeGenUtil.wrappedRunGroups.keySet.collect {
        case caller: ProcedureCallStep =>
          val callee = complexValueToString(caller.getProcedureCallConfiguration.getRunGroup).split('.') match {
            case Array(name) => caller.eContainers.flatMap {
              case rg: RunGroup => rg.getRunGroups
              case _            => Nil
            }.find { x =>
              x.isProcedure && x.getName == name
            }.getOrElse(sys.error(s"Unable to find Procedure definition $name"))
            case Array(inc, name) => codeGenUtil.includeFileMap.collectFirst {
              case (incFile, (s, _)) if incFile.getName == inc => s
            }.flatMap {
              _.getRunGroups.find(x => x.isProcedure && x.getName == name)
            }.getOrElse(sys.error(s"Unable to find Procedure definition $inc.$name"))
          }
          callee -> caller
      }.groupBy(_._1).mapValues(_.map(_._2))
  }

  case class Dependency(topLevel: TopLevelKronus, children: Iterable[Dependency]) extends Iterable[TopLevelKronus] {
    def iterator = Iterator(topLevel) ++ children.flatMap(_.iterator)
  }

  def getSaturn(x: EObject): Saturn = (Iterator(x) ++ x.eContainers).collect{case s: Saturn => s}.next

  def complexValueToString(cv: ComplexValue): String = cv.getMixed.map {
    _.getValue match {
      case t: TextComplexValue => t.getText
    }
  }.mkString

  def hasConfiguredReturn(s: SaturnStatusEnum, c: SaturnStatusConditionEnum) = {
    import SaturnStatusEnum._, SaturnStatusConditionEnum._
    (s, c) match {
      case (PASS, ALLPASS) | (FAIL, ANYFAIL) => false
      case _ => true}}

  def createWrapper(step: AbstractStep): RunGroup = {
    val wrapper = SaturnFactory.eINSTANCE.createRunGroup
    wrapper.setName(step.getName)
    wrapper.setEnabled(step.isEnabled)
    wrapper.setProcedure(step.isProcedure)
    wrapper.setRepetitionHandler(EcoreUtil.copy(step.getRepetitionHandler))
    step.getParameters.foreach(x => wrapper.getParameters.add(EcoreUtil.copy(x)))
    step.getAttributes.foreach(x => wrapper.getAttributes.add(EcoreUtil.copy(x)))
    step.getResources.foreach(x => wrapper.getResources.add(EcoreUtil.copy(x)))
    wrapper.setWaitBefore(step.getWaitBefore)
    wrapper.setWaitAfter(step.getWaitAfter)
    wrapper
  }

  def sanitize(saturn: Saturn) {
    saturn.eAllContents.collect { // hack
      case step: AbstractRunGroup if hasConfiguredReturn(step.getDefaultStatus, step.getStatusCondition) && step.isEnabled => step
    }.toList.foreach { step =>
      val wrapper = SaturnFactory.eINSTANCE.createRunGroup
      SaturnToKronus.replace(step, wrapper, saturn)
      wrapper.getRunGroups.add(step)
      wrapper.setName(step.getName + "_wrapper")
      wrapper.getAttributes.addAll(step.getAttributes)
      wrapper.getResources.addAll(step.getResources)
      step.getResources.clear
      step.getAttributes.clear
    }

    saturn.eAllContents.collect {
      case step: AbstractStep if step.isProcedure
                              || !step.getAttributes.isEmpty
                              || !step.getResources.isEmpty
                              || step.getRepetitionHandler != null
                              || step.getWaitBefore.intValue > 0
                              || step.getWaitAfter.intValue > 0
                              => step
    }.toList.foreach { step =>
      val wrapper = createWrapper(step)
      SaturnToKronus.replace(step, wrapper, saturn)
      wrapper.getRunGroups.add(step)
      step.unsetProcedure()
      step.setRepetitionHandler(null)
      step.getParameters.clear()
      step.getAttributes.clear()
      step.getResources.clear()
      step.unsetWaitBefore()
      step.unsetWaitAfter()
    }
    saturn.eAllContents.collect {case x: AbstractRunGroup if !x.isEnabled => x}.toList.foreach { x =>
      val noop = SaturnFactory.eINSTANCE.createNoopTerminal
      noop.setName(x.getName)
      SaturnToKronus.replace(x, noop, saturn)
    }
  }

  protected class TopLevel(runGroup: Saturn)(implicit config: SaturnToKronus.Config) extends SaturnToKronus(runGroup) {
    import KronusFactory.{eINSTANCE => Factory}

    backport.imports.foreach(i => kronus.getDefs.add(Factory.newAnnotatedDef(EcoreUtil.copy(i))))
    backport.packages.foreach(mod => kronus.getDefs.add(Factory.newAnnotatedDef(Factory.newIncludeDef(mod, None))))
    for ((n, d) <- includeFiles)
      kronus.getDefs.add(Factory.newAnnotatedDef(Factory.newIncludeDef(d.topLevel, Some(n))))

    def toTopLevel: Dependency = {
      populateKronus()
      val topLvl = Factory.createTopLevelKronus
      topLvl.setKronus(kronus)
      val pkgDef = Factory.createPackageDef
      pkgDef.setModule(Seq(config.pkg, Some(runGroup.getName)).flatten.mkString("."))
      topLvl.setPackage(pkgDef)
      addDependenciesToCalls()
      Dependency(topLvl, includeFiles.values)
    }

    def addDependenciesToCalls(): Unit = {
      import KronusPackage.eINSTANCE._
      kronus.eAllContents.foreach {
        case call: FunctionCall => addDependenciesToCall(call, getFunctionCall_Method)
        case call: ValRef       => addDependenciesToCall(call, getValRef_Ref)
        case call: TypeInstance => addDependenciesToCall(call, getTypeInstance_Name)
        case _                  =>
      }
    }

    def addDependenciesToCall(call: EObject, ref: EReference): Unit = {
      val target = call.eGet(ref).asInstanceOf[EObject]
      if (!EcoreUtil.isAncestor(kronus, target)) {
        val deps = kronus.allInclusions.find(deps => EcoreUtil.isAncestor(deps.head.getModule, target)).getOrElse {
          val mod = kronus.eContainer.asInstanceOf[TopLevelKronus].getPackage.getModule
          throw new NoSuchElementException(s"Cannot find ${ref.getName} in $call from $mod")
        }
        resource.DependencyTrackingEObjectDescription.Adapter.attach(call, ref, deps)
      }
    }
  }

  def replace(x: EObject, y: EObject, saturn: Saturn) {
    EcoreUtil.UsageCrossReferencer.find(x, saturn).filterNot { usage =>
      SaturnPackage.eINSTANCE.getAbstractResourceLink.isSuperTypeOf(usage.getEStructuralFeature.getEContainingClass)
    }.foreach(EcoreUtil.replace(_, x, y))
    EcoreUtil.replace(x, y)
  }
}

class SaturnToKronus protected (runGroup: RunGroup)(implicit config: SaturnToKronus.Config) {
  import KronusFactory.{eINSTANCE => Factory}
  import SaturnToKronus._

  val kronus = Factory.createKronus
  val children = scala.collection.mutable.Map[String, ValDef]()
  val backport = config.backport
  val codeGenUtil = config.codeGenUtil

  lazy val includeFiles: Map[String, Dependency] = {
    val incs = config.includesBySaturn.getOrElse(getSaturn(runGroup), Set.empty)
    codeGenUtil.includeFileMap.collect {
      case (inc, (s, _)) if incs(inc) => inc.getName -> s
    }.mapValues(s => config.includeFileMap.getOrElseUpdate(s, new SaturnToKronus.TopLevel(s).toTopLevel))
  }

  def addRunGroup(rg: RunGroup) {
    val conv = new SaturnToKronus(rg)
    val rhs = conv.wrapWait(conv.wrapStatus(Factory.newKronusCodeBlock(conv.kronus)))
    if (rg.isProcedure) addProcFunctionDef(rg, rhs) else addAbstractRunGroup(rg, rhs)
    conv.populateKronus()
  }

  def addProcFunctionDef(rg: RunGroup, rhs: KronusCodeBlock) {
    val fd = Factory.createFunctionDef
    fd.setName(rg.getName)
    val ad = Factory.newAnnotatedDef(fd)
    kronus.getDefs.add(ad)
    val generator = new ProcedureGenerator(rg)(codeGenUtil)
    val tparamMap = generator.typeParamRename.mapValues { tp =>
      val td = Factory.createTypeDef
      td.setName(tp.name)
      fd.getTypeParameters.add(td)
      td
    }
    fd.getParameterDefs.addAll(rg.getParameters.map(convParameter(_, generator.wrappedProc.typeInferencer, tparamMap)))
    generator.genImplicits.foreach { imp =>
      val pv = Factory.createSimpleParameterValue
      pv.setName("paramType")
      pv.setValue(imp.toString)
      val hc = Factory.createHashtagCall
      hc.setMethod(backport.hashtags("Implicit"))
      hc.getParameterValues.add(pv)
      ad.getHashtags.add(hc)
    }
    fd.setReturnType(kronusType)
    fd.setValue(rhs)
  }

  def wrapStatus(body: KronusCodeBlock): KronusCodeBlock = {
    import SaturnStatusEnum._, SaturnStatusConditionEnum._
    (runGroup.getDefaultStatus, runGroup.getStatusCondition) match {
      case (PASS, ALLPASS) | (FAIL, ANYFAIL) => body
      case (PASS, ANYPASS) | (FAIL, ALLFAIL) => wrapReturn(callPassIfAnyPass(body))
      case (PASS, ANYFAIL) | (FAIL, ALLPASS) => wrapReturn(mustFail(body))
      case (PASS, ALLFAIL) | (FAIL, ANYPASS) => wrapReturn(mustFail(callPassIfAnyPass(body)))
    }
  }

  def wrapWait(body: KronusCodeBlock): KronusCodeBlock = {
    val Seq(before, after) = Seq(runGroup.getWaitBefore, runGroup.getWaitAfter).map {
      Option(_).map(_.intValue).filter(_ > 0)
    }
    val bodyBefore = before match {
      case None    => body
      case Some(n) => wrapReturn(callWhen(callOnPass(callSleep(n)), body))
    }
    after match {
      case None =>
        bodyBefore
      case Some(n) =>
        val conv = new SaturnToKronus(runGroup)
        val vd = conv.addNewValDef(s"__Body_${runGroup.getName}")
        vd.setValue(bodyBefore)
        val sleep = callWhen(callOnFinish(Factory.newValRef(vd)), callSleep(n))
        conv.kronus.setReturn(callWhen(callOnPass(sleep), Factory.newValRef(vd)))
        Factory.newKronusCodeBlock(conv.kronus)
    }
  }

  def wrapReturn(x: Expression): KronusCodeBlock = {
    val k = Factory.createKronus
    k.setReturn(x)
    Factory.newKronusCodeBlock(k)
  }

  def populateKronus() {
    val DependencyExtractor(pre, _, rep) = codeGenUtil.getWrapped(runGroup).dependencyExtractor
    pre.foreach(addAttributeOrResource)
    rep.fold(populatePostRepetitionDependencies())(addRepetition)
  }

  def linkExpressions(s: Seq[Expression]): Expression =
    s.reduce((a, b) => callWhen(callOnFinish(a), b))

  def populatePostRepetitionDependencies() {
    codeGenUtil.getWrapped(runGroup).dependencyExtractor.postRepetitionDependencies.foreach(addAttributeOrResource)
    sortedRunGroups.foreach {
      case x: RunGroup          => addRunGroup(x)
      case x: KronusStep        => addKronusStep(x)
      case x: RunCmdsStep       => addScalaRunCmds(x)
      case x: ProcedureCallStep => addProcCallStep(x)
      case x: AbstractTerminal  => addAbstractRunGroup(x, convAbstractTerminal(x))
      case x: DataCompareStep   => addAbstractRunGroup(x, convDataCompareStep(x))
      case x: DSConvertStep     => addAbstractRunGroup(x, linkExpressions(convDsConvertStep(x)))
    }
    if (runGroup.getRunGroups.exists(x => x.isInstanceOf[PassTerminal] || x.isInstanceOf[FailTerminal])) {
      val results = kronus.getDefs.map(_.getDef).collect {case vd: ValDef => Factory.newValRef(vd)}
      kronus.setReturn(backport.functionCall("TerminalResult", Seq("results" -> Factory.newSequence(results))))
    }
  }

  def sortedRunGroups: Seq[AbstractRunGroup] = {
    val deps = runGroup.getRunGroups.map(_ -> Set.empty[AbstractRunGroup]).toMap
    val xs = deps.keySet
    val procDeps = for {
      x    <- xs
      call <- config.procedureCallDependencies.getOrElse(x, Nil)
      dep  <- (Iterator(call) ++ call.eContainers).collectFirst {case y: AbstractRunGroup if xs(y) => x -> y}
    } yield dep
    val edgeDeps = codeGenUtil.allLinks.iterator.collect {
      case l if xs(l.getSource) && xs(l.getTarget) => l.getSource -> l.getTarget
    }
    topSort((deps ++ (procDeps ++ edgeDeps).groupBy(_._1).mapValues(_.map(_._2))).toSeq) match {
      case (cycle, xs) if cycle.isEmpty =>
        xs.reverse
      case (cycle, _) =>
        val cycleStr = cycle.map {case (x, ys) => s"${x.getName} -> ${ys.map(_.getName)}"}.mkString("\n")
        sys.error(s"Cyclic dependencies in Saturn: $cycleStr")
    }
  }

  def addAttributeOrResource(x: EObject) {
    x match {
      case attr: Attribute              => addAttribute(attr)
      case res: NamedResourceDefinition => addNewValDef(res.getName).setValue(convResource(res))
    }
  }

  def addRepetition(rep: AbstractRepetitionHandler) {
    val generator = rep match {
      case rep: ForRepetition          => new ForRepetitionGenerator(rep, 0)
      case rep: ForEachRepetition      => new ForEachRepetitionGenerator(rep)
      case rep: ForEachXPathRepetition => new ForEachXPathRepetitionGenerator(rep)
    }
    generator.addToKronus()
  }

  def addKronusStep(ks: KronusStep) = {
    val call = ks.getKronusCallConfiguration
    val fc = Factory.newFunctionCall(backport.stepDefs(call.getDef), call.getArguments.map(convArgument): _*)
    addAbstractRunGroup(ks, toolkitResult(fc))
  }

  def addScalaRunCmds(runCmds: RunCmdsStep) {
    val conf = runCmds.getRunCmdsConfiguration
    require(conf.getInterpreter == InterpretersEnum.SCALA) // FIXME
    require(conf.getCommands.size == 1)
    val cmd = conf.getCommands.get(0) // FIXME
    val res = new ScalaCode(cmd)
    val fc = backport.functionCall("ScalaCommand", Seq("result" -> res.value, "code" -> Factory.newLiteral(res.code)))
    addAbstractRunGroup(runCmds, toolkitResult(fc))
  }

  def addProcCallStep(procCall: ProcedureCallStep) {
    val conf = procCall.getProcedureCallConfiguration
    val fullName = complexValueToString(conf.getRunGroup)
    val args = conf.getArguments.map(convArgument)
    val fc = {
      fullName.split('.') match {
        case Array(fdName) => parents.flatMap(_.getDefs).map(_.getDef).collectFirst {
          case fd: FunctionDef if fd.getName == fdName =>
            Factory.newFunctionCall(fd, args: _*)
        }
        case Array(inc, fdName) => includeFiles(inc).topLevel.getKronus.collectDefs[FunctionDef].collectFirst {
          case fd if fd.getName == fdName => Factory.newFunctionCall(fd, args: _*)
        }
      }
    }.getOrElse(sys.error(s"Unable to find FunctionDef $fullName"))
    addAbstractRunGroup(procCall, fc)
  }

  def convAbstractTerminal(t: AbstractTerminal): FunctionCall = t match {
    case _: NoopTerminal => backport.functionCall("NoopTerminal", Nil)
    case t: PassTerminal => backport.functionCall("PassTerminal", Seq("name" -> Factory.newLiteral(t.getName)))
    case t: FailTerminal => backport.functionCall("FailTerminal", Seq("name" -> Factory.newLiteral(t.getName)))
  }

  def convDataCompareStep(step: DataCompareStep): Expression = {
    val conf = step.getDataCompareConfiguration
    val inputs = conf.getDataSources
    val output = conf.getOutput
    val Seq(l, r, o) = Seq(inputs.getLeft, inputs.getRight, output.getResource).map(convResource)
    val cols = toInlineCsv(inputs.getColumns.iterator.map(c => Seq(c.getName, c.getMappingColumn, c.isIgnored.toString)),
                           Some(Seq("COLUMN", "MAPPING", "IGNORED").zipWithIndex.map{case (n, i) => ColumnDefinition(n, index = i)}))
    val pages = {
      import com.ms.qaTools.compare.writer._
      val ps = Option(output.getPages).map { ps =>
        val pnames = PageNames()
        Iterator( ps.getDifferent   -> pnames(DifferencesPage)
                , ps.getExplained   -> pnames(ExplainedPage)
                , ps.getIdentical   -> pnames(IdenticalPage)
                , ps.getInLeftOnly  -> pnames(InLeftOnlyPage)
                , ps.getInRightOnly -> pnames(InRightOnlyPage)
                , ps.getLeft        -> pnames(LeftPage)
                , ps.getRight       -> pnames(RightPage)
                , ps.getSummary     -> pnames(SummaryPage)
                )
      }.getOrElse(Iterator.empty).filter(_._1 != null)
      toInlineCsv(ps.map {case (p, name) => Seq(name, p.getName, p.isOmit.toString)},
                  Some(Seq("PAGE", "NAME", "OMITTED").zipWithIndex.map{case (n, i) => ColumnDefinition(n, index = i)}))
    }
    stepCall("DataCompareStep", Seq(
      "left" -> l, "right" -> r, "columns" -> cols, "output" -> o, "pageConfig" -> pages))
  }

  def convDsConvertStep(step: DSConvertStep): Seq[Expression] =
    // TODO make sure headers are printed/not printed depending on output type
    step.getDSConvertConfiguration.getOperations.collect {
      case o: modules.dsConvertModule.SimpleOperation if o.isEnabled=>
        stepCall("Write", Seq(
          "input" -> resourceCall("FilterOutColumns", Seq(
            "input"   -> convResource(o.getSource),
            "columns" -> toInlineCsv(scala.util.Try(Seq(o.getIgnoreCols.toList.map(complexValueToString))).getOrElse(Nil).iterator, None))),
          "output" -> convResource(o.getTarget)))
    }

  def addAttribute(attr: com.ms.qaTools.saturn.Attribute) {
    val rhs = convComplexValue(attr)
    val vd = addNewValDef(attr.getName)
    vd.setValue(rhs)
  }

  def convComplexValue(cv: ComplexValue): Expression =
    cv.getMixed.map(convComplexValueEntry).toSeq match {
      case Seq() =>
        Factory.newLiteral("")
      case Seq(expr) =>
        expr
      case exprs => exprs.reduce { (x, y) =>
        val add = Factory.createBinaryOperation
        add.setOp("+")
        add.setLeft(x)
        add.setRight(y)
        add
      }
    }

  def convComplexValueEntry(entry: FeatureMap.Entry): Expression = {
    import ValuesPackage._, InterpretersEnum._
    val x = entry.getValue
    val feature = entry.getEStructuralFeature
    (feature.getFeatureID: @switch) match {
      case COMPLEX_VALUE__TEXT =>
        Factory.newLiteral(x.asInstanceOf[TextComplexValue].getText)
      case COMPLEX_VALUE__REFERENCE =>
        val ref = x.asInstanceOf[ReferenceComplexValue]
        convReference(ref.getUserAttribute, Option(ref.getIncludeFile))
      case COMPLEX_VALUE__CODE =>
        val code = x.asInstanceOf[CodeComplexValue]
        code.getInterpreter match {
          case SCALA =>
            backport.functionCall("ToString", Seq("x" -> new ScalaCode(code).value))
          case GROOVY =>
            backport.functionCall("ToString",
                                  Seq("x" -> backport.functionCall("Groovy", Seq("code" -> convComplexValue(code)))))
          case SHELL =>
            backport.functionCall("Shell", Seq("code" -> convComplexValue(code)))
          case DML =>
            backport.functionCall("Dml", Seq("code" -> convComplexValue(code)))
          case interpreter =>
            sys.error(s"$interpreter interpreter is not supported")
        }
      case COMPLEX_VALUE__ENV_VAR =>
        backport.functionCall("EnvVar", Seq("name" -> convComplexValue(x.asInstanceOf[ComplexValue])))
      case COMPLEX_VALUE__FILE =>
        backport.functionCall("File", Seq("name" -> convComplexValue(x.asInstanceOf[ComplexValue])))
      case COMPLEX_VALUE__CELL_VALUE =>
        val cell = x.asInstanceOf[CellComplexValue]
        val row = backport.functionCall("ToInt", Seq("s" -> convComplexValue(cell.getRow)))
        val res = backport.functionCall("InputOf", Seq("io" -> convResource(cell.getResource)))
        backport.functionCall("Cell", Seq("resource" -> res,
                                          "column"   -> convComplexValue(cell.getColumn),
                                          "row"      -> row))
      case COMPLEX_VALUE__PROPERTY_VALUE =>
        val prop = x.asInstanceOf[PropertyComplexValue]
        val res = backport.functionCall("InputOf", Seq("io" -> convResource(prop.getResource)))
        backport.functionCall("Cell", Seq("resource" -> res,
                                          "column"   -> convComplexValue(prop.getProperty),
                                          "row"      -> Factory.newLiteral(0)))
      case COMPLEX_VALUE__XPATH_VALUE =>
        val xpath = x.asInstanceOf[XPathComplexValue]
        val xml = backport.functionCall("InputOf", Seq("io" -> convResource(xpath.getResource)))
        val row = backport.functionCall("ToInt", Seq("s" -> convComplexValue(xpath.getRow)))
        val ns = Option(xpath.getNamespaces).map { ns =>
          Seq("namespace" -> backport.functionCall("InputOf", Seq("io" -> convResource(ns))))
        }.getOrElse(Nil)
        backport.functionCall("XPath", ns ++ Seq("xml"        -> xml,
                                                 "xpath"      -> convComplexValue(xpath.getXPath),
                                                 "row"        -> row,
                                                 "returnType" -> Factory.newLiteral(xpath.getReturnType.toString),
                                                 "fragment"   -> Factory.newLiteral(xpath.isFragment)))
      case COMPLEX_VALUE__JSON_VALUE =>
        val jsonCv = x.asInstanceOf[JSONComplexValue]
        val json = backport.functionCall("InputOf", Seq("io" -> convResource(jsonCv.getResource)))
        val row = backport.functionCall("ToInt", Seq("s" -> convComplexValue(jsonCv.getRow)))
        backport.functionCall("JsonPath", Seq("json" -> json,
                                              "path" -> convComplexValue(jsonCv.getJSONPath),
                                              "row"  -> row))
      case _ =>
        sys.error(s"Unknown feature ${feature.getName} in ${feature.getEContainingClass.getName}")
    }
  }

  def convParameter(param: AbstractParameter,
                    typeInferencer: PTI,
                    tparamMap: Map[PTI.TypeParameter, TypeDef]): ParameterDef = {
    val defVal = param match {
      case ap: AttributeParameter => Option(ap.getDefaultValue).map(convComplexValue)
      case rp: ResourceParameter  => Option(rp.getDefaultResource).map(convResource)
    }
    Factory.newParameterDef(param.getName, convTypeTree(typeInferencer.getParameterType(param), tparamMap), defVal)
  }

  def convTypeTree(tt: PTI.TypeTree, tparamMap: Map[PTI.TypeParameter, TypeDef]): TypeInstance = {
    tt match {
      case PTI.AppliedType(name, args) =>
        Factory.newTypeInstance(backport.typeDefs(name), args.map(convTypeTree(_, tparamMap)): _*)
      case tp: PTI.TypeParameter =>
        Factory.newTypeInstance(tparamMap(tp))
      case _ => tt.toString match {
        case "Iterator[Seq[String]] with ColumnDefinitions" => Factory.newTypeInstance(backport.typeDefs("DataSets"))
      }
    }
  }

  def convArgument(arg: AbstractArgument) = {
    val expr = arg match {
      case arg: AttributeArgument => convComplexValue(arg.getValue)
      case arg: ResourceArgument  => convResource(arg.getResource)
    }
    Factory.newParameterValue(arg.getName, expr)
  }

  def convResource(res: ResourceDefinition): Expression = res match {
    case res: resources.referenceResource.ReferenceResource =>
      convReference(res.getResource, Option(res.getIncludeFile))
    case res: InlineDeviceResourceDefinition =>
      resourceCall("InlineDevice", Seq("contents" -> convComplexValue(res.getValue)))
    case res: resources.fileResource.XMLFile =>
      resourceCall("XmlIO", Seq("device" -> convResource(res.getDeviceResource)))
    case res: resources.fileResource.JsonFile =>
      resourceCall("JsonFile", Seq("device" -> convResource(res.getDeviceResource)))
    case res: resources.fileResource.LineFile =>
      resourceCall("LineFile", Seq("device" -> convResource(res.getDeviceResource)))
    case res: resources.fileResource.ExcelWorkBook =>
      import com.ms.qaTools.saturn.resources.fileResource.ExcelVersions._
      resourceCall("ExcelWorkBook", Seq(
        "fileName" -> convComplexValue(res.getFileName),
        "version"  -> Factory.newLiteral(res.getVersion.getLiteral)))
    case res: resources.fileResource.DeviceFile =>
      resourceCall("DeviceFile", Seq(
        "fileName" -> convComplexValue(res.getFileName),
        "append"   -> Factory.newLiteral(res.isAppend)))
    case res: resources.fileResource.CSVFile =>
      resourceCall("CsvFile", Seq("device" -> convResource(res.getDeviceResource)))
    case res: resources.fileResource.PropertiesFile =>
      resourceCall("PropertiesFile", Seq("device" -> convResource(res.getDeviceResource)))
    case res: resources.fileResource.SlurpFile =>
      resourceCall("SlurpFile", Seq("device" -> convResource(res.getDeviceResource)))
    case res: KronusResource =>
      val call = res.getKronusCallConfiguration
      Factory.newFunctionCall(backport.resourceDefs(call.getDef), call.getArguments.map(convArgument): _*)
    case res: resources.nullResource.NullDevice =>
      resourceCall("NullDevice", Nil)
    case res: resources.sqliteResource.SQLiteResource =>
      val db = Option(res.getDatabase) match {
        case Some(mem: resources.sqliteResource.MemoryDatabase)  =>
          resourceCall("Sqlite", Nil)
        case Some(file: resources.sqliteResource.SQLiteDatabase) =>
          resourceCall("SqliteFromFile", Seq("file" -> convResource(file.getDBResource.ensuring(_ != null))))
        case db => sys.error("Unsupported database for SQLite: " + db.toString)}
      Option(res.getDDLResource).map{query =>
        val name = s"__${res.getName}_db"
        addNewValDef(name).setValue(db)
        callWhen(callOnFinish(stepCall("Write", Seq(
          "input"  -> resourceCall("QueryIO", Seq(
            "connection"   -> convReference(name, None),
            "ignoreResult" -> Factory.newLiteral("TRUE"), // FIXME no Boolean literal in Kronus
            "query"        -> backport.functionCall("GetNext", Seq("i" -> convResource(query))))),
          "output" -> resourceCall("KNullWriter", Nil)))),
          convReference(name, None))}.getOrElse(db)
    case res: resources.db2Resource.DB2Resource =>
      resourceCall("DB2Resource", Seq(
        "server" -> convComplexValue(res.getServer),
        "schema" -> convComplexValue(res.getQualifier),
        "login"  -> convComplexValue(res.getLogin),
        "passwd" -> convComplexValue(res.getPassword)))
    case res: resources.sybaseResource.SybaseResource =>
      resourceCall("Sybase", Seq(
        "server"   -> convComplexValue(res.getServer),
        "database" -> convComplexValue(res.getDatabase),
        "login"    -> Option(res.getLogin).map(convComplexValue).getOrElse(backport.functionCall("Null", Nil)),
        "passwd"   -> Option(res.getPassword).map(convComplexValue).getOrElse(backport.functionCall("Null", Nil))))
    case res: resources.udbResource.UDBResource =>
      resourceCall("Udb", Seq(
        "server" -> convComplexValue(res.getServer),
        "schema" -> convComplexValue(res.getQualifier)))
    case res: resources.h2Resource.H2Resource =>
      val db = Option(res.getDatabase) match {
        case Some(mem: resources.h2Resource.MemoryDatabase) =>
          resourceCall("H2", Nil)
        case Some(file: resources.h2Resource.FileDatabase) =>
          resourceCall("H2FromFile", Seq("file" -> convResource(file.getDBResource)))
        case db => sys.error("Unsupported database for H2: " + db.toString)}
      Option(res.getDDLResource).map{query =>
        val name = s"__${res.getName}_db"
        addNewValDef(name).setValue(db)
        callWhen(callOnFinish(stepCall("Write", Seq(
          "input"  -> resourceCall("QueryIO", Seq(
            "connection"   -> convReference(name, None),
            "ignoreResult" -> Factory.newLiteral("TRUE"), // FIXME no Boolean literal in Kronus
            "query"        -> backport.functionCall("GetNext", Seq("i" -> convResource(query))))),
          "output" -> resourceCall("KNullWriter", Nil)))),
          convReference(name, None))}.getOrElse(db)
    case res: resources.fileResource.StandardIO =>
      if (res.isUseStdErr) resourceCall("StdErr", Nil)
      else resourceCall("StdOut", Nil)
    case res: resources.queryResource.QueryResource =>
      resourceCall("QueryIO", Seq(
        "connection" -> convResource(res.getDeviceResource.ensuring(_ != null)),
        "query"      -> Option(res.getQuery).map(convComplexValue).getOrElse(Factory.newLiteral(""))))
    case res: resources.queryResource.TableResource =>
      resourceCall("TableIO", Seq(
        "connection" -> convResource(res.getDeviceResource.ensuring(_ != null)),
        "table"      -> convComplexValue(res.getTable)))
    case res: resources.shadowDirectResource.ShadowDirectResource =>
      resourceCall("ShadowDirect", Seq(
        "server" -> convComplexValue(res.getServer),
        "login"  -> convComplexValue(res.getLogin),
        "passwd" -> convComplexValue(res.getPassword)))
    case res => sys.error(s"${Option(res).map(_.getClass.getName).orNull}: cannot convert resource")
  }

  def convReference(name: String, includeFile: Option[String]): Value = includeFile match {
    case None =>
      object ValDefExtractor {
        def unapply(k: Kronus) = k.getDefs.map(_.getDef).collectFirst {case vd: ValDef if vd.getName == name => vd}
      }
      object ParameterDefExtractor {
        def unapply(fd: FunctionDef) = fd.getParameterDefs.find(_.getName == name)
      }
      (Iterator(kronus) ++ kronus.eContainers).collectFirst {
        case ValDefExtractor(vd)       => vd
        case ParameterDefExtractor(pd) => pd
      }.fold(sys.error(s"Fail to find ValDef or ParameterDef $name"))(Factory.newValRef)
    case Some(inc) =>
      includeFiles(inc).topLevel.getKronus.getDefs.map(_.getDef).collectFirst {
        case vd: ValDef if vd.getName == name => Factory.newValRef(vd)
      }.getOrElse(sys.error(s"Fail to find ValDef $name"))
  }

  def addNewAbstractDef[A <: AbstractDef](d: A): A = {
    kronus.getDefs.add(Factory.newAnnotatedDef(d))
    d
  }

  def addNewValDef(name: String): ValDef = {
    val vd = Factory.createValDef
    vd.setName(name)
    addNewAbstractDef(vd)
  }

  def addNewFunctionDef(name: String): FunctionDef = {
    val fd = Factory.createFunctionDef
    fd.setName(name)
    addNewAbstractDef(fd)
  }

  def addAbstractRunGroup(step: AbstractRunGroup, rhs: Expression) = {
    val vd = addNewValDef(step.getName)
    vd.setValue(new CanRunExpressionDecoder.Target(step).decode().fold(rhs)(callWhen(_, rhs)))
    children += step.getName -> vd
  }

  def parents: Iterator[Kronus] = (Iterator(kronus) ++ kronus.eContainers).collect {case k: Kronus => k}

  def toolkitResult(e: Expression) = backport.functionCall("ToolkitResult", Seq("result" -> e))

  def toInlineCsv(xss: Iterator[Seq[String]], columns: Option[Seq[ColumnDefinition]]): FunctionCall = {
    val w = new StringWriter
    CsvRowWriter(w).write(xss, columns)
    val str = KronusFactory.eINSTANCE.newLiteral(w.toString)
    resourceCall("CsvFile", Seq("device" -> resourceCall("InlineDevice", Seq("contents" -> str))))
  }

  def resourceCall(name: String, args: Seq[(String, Expression)]) = backport.functionCall(name, args, backport.resourceDefs)
  def stepCall(name: String, args: Seq[(String, Expression)]) = backport.functionCall(name, args, backport.stepDefs)

  def callWhen(pred: Expression, body: Expression) = backport.functionCall("When", Seq("pred" -> pred, "body" -> body))
  def callOnPass(result: Expression) = backport.functionCall("OnPass", Seq("result" -> result))
  def callOnFail(result: Expression) = backport.functionCall("OnFail", Seq("result" -> result))
  def callOnFinish(result: Expression) = backport.functionCall("OnFinish", Seq("result" -> result))
  def mustFail(result: Expression) = backport.functionCall("FailOnFalse", Seq("pred" -> callOnFail(result)))
  def callPassIfAnyPass(results: Expression) = backport.functionCall("PassIfAnyPass", Seq("results" -> results))
  def callSleep(duration: Int) = backport.functionCall("Sleep", Seq("duration" -> Factory.newLiteral(duration)))

  def AnyType     = Factory.newTypeInstance(backport.typeDefs("Any"))
  def BooleanType = Factory.newTypeInstance(backport.typeDefs("Boolean"))
  def StringType  = Factory.newTypeInstance(backport.typeDefs("String"))

  def SeqType(targ: TypeInstance) = Factory.newTypeInstance(backport.typeDefs("Seq"), targ)
  def TryType(targ: TypeInstance) = Factory.newTypeInstance(backport.typeDefs("Try"), targ)

  def kronusType = SeqType(TryType(AnyType))

  object CanRunExpressionDecoder extends RegexParsers {
    val onPass = "runGroupPassed(_" ~> "\\w+".r <~ ")" ^^ {src => callOnPass(Factory.newValRef(children(src)))}
    val onFail = "runGroupFailed(_" ~> "\\w+".r <~ ")" ^^ {src => callOnFail(Factory.newValRef(children(src)))}
    val onFinish = "runGroupFinished(_" ~> "\\w+".r <~ ")" ^^ genOnFinish
    val onCustomRegex = """__(\w+)2([a-zA-Z_]\w*)Satisfied""".r

    def genOnFinish(src: String) = callOnFinish(Factory.newValRef(children(src)))

    class Target(target: AbstractRunGroup) {
      val onCustom = onCustomRegex ^^ {
        case onCustomRegex(src, dest) if dest == target.getName =>
          val pred = new ScalaCode(config.customLinks((src, target)).getCode, BooleanType).value
          backport.functionCall("OnCustom", Seq("result" -> genOnFinish(src), "pred" -> pred))
      }

      val atomExpr = onPass | onFail | onFinish | onCustom

      lazy val andExpr = "(" ~> rep1sep(expr, "&&") <~ ")" ^^ { xs =>
        backport.functionCall("And", Seq("preds" -> Factory.newSequence(xs)))
      }

      lazy val orExpr = "(" ~> rep1sep(expr, "||") <~ ")" ^^ { xs =>
        backport.functionCall("Or", Seq("preds" -> Factory.newSequence(xs)))
      }

      val expr: Parser[FunctionCall] = atomExpr | andExpr | orExpr

      def decode(): Option[FunctionCall] = codeGenUtil.getWrapped(target).canRunYieldExpression match {
        case "true" => None
        case e      => parseAll(expr, e) match {
          case Success(res, _)   => Some(res)
          case NoSuccess(msg, _) => sys.error(s"Unable to decode Can Run Expression `$e': $msg")
        }
      }
    }
  }

  abstract class RepetitionGenerator {
    def genData: Expression
    def genFunc: Expression

    def addToKronus() {
      val fc = backport.functionCall("ForEach", Seq("xs" -> genData, "f" -> genFunc, "batchSize" -> batchSize))
      addNewValDef(gensym("value")).setValue(fc)
    }

    def gensym(typ: String): String = f"__Repetition_${runGroup.getName}%s_$typ%s_$runGroup%h"

    def batchSize: IntegerLiteral = Factory.newLiteral {
      if (runGroup.isCanMultiplex) runGroup.getMaxSimultaneousIterations.intValue else 1
    }
  }

  class ForRepetitionGenerator(rep: ForRepetition, depth: Int) extends RepetitionGenerator {
    val itr = rep.getIterators.get(depth)

    override def gensym(typ: String) = s"${super.gensym(typ)}_$depth"

    def genData =
      backport.functionCall("RangeIterator", Seq("start" -> Factory.newLiteral(itr.getStartIndex.intValue),
                                                 "end"   -> Factory.newLiteral(itr.getEndIndex.intValue + 1)))

    def genFunc = {
      val fd = addNewFunctionDef(gensym("func"))
      fd.getParameterDefs.add(Factory.newParameterDef(itr.getAttribute, StringType, None))
      fd.setReturnType(kronusType)
      val fdRHS = new SaturnToKronus(runGroup)
      fd.setValue(Factory.newKronusCodeBlock(fdRHS.kronus))
      if (depth + 1 == rep.getIterators.size) fdRHS.populatePostRepetitionDependencies()
      else new fdRHS.ForRepetitionGenerator(rep, depth + 1).addToKronus()
      backport.functionCall("Compose", Seq("f" -> Factory.newValRef(fd),
                                           "g" -> Factory.newValRef(backport.helperDefs("ToString"))))
    }
  }

  abstract class AbstractForEachRepetitionGenerator extends RepetitionGenerator {
    def dataSets: Expression
    def mappings: Seq[(String, String)]

    val dataSetsValDef = {
      val vd = addNewValDef(gensym("datasets"))
      vd.setValue(backport.functionCall("InputOf", Seq("io" -> dataSets)))
      vd
    }

    def genData = Factory.newValRef(dataSetsValDef)

    def genFunc = {
      val fd = addNewFunctionDef(gensym("func"))
      val row = Factory.newParameterDef(gensym("row"), SeqType(StringType), None)
      fd.getParameterDefs.add(row)
      fd.setReturnType(kronusType)
      val fdRHS = new SaturnToKronus(runGroup)
      fd.setValue(Factory.newKronusCodeBlock(fdRHS.kronus))
      for ((attr, col) <- mappings) {
        fdRHS.addNewValDef(attr).setValue {
          val idx = backport.functionCall("IndexOfColumn", Seq("cols" -> genData, "name" -> Factory.newLiteral(col)))
          backport.functionCall("Nth", Seq("n" -> idx, "xs" -> Factory.newValRef(row)))
        }
      }
      fdRHS.populatePostRepetitionDependencies()
      Factory.newValRef(fd)
    }
  }

  class ForEachRepetitionGenerator(rep: ForEachRepetition) extends AbstractForEachRepetitionGenerator {
    def dataSets = convResource(rep.getDataSetResource)
    def mappings = rep.getColumnMappings.map(colMap => colMap.getAttribute -> colMap.getColumn)
  }

  class ForEachXPathRepetitionGenerator(rep: ForEachXPathRepetition) extends AbstractForEachRepetitionGenerator {
    def dataSets = {
      val xml = Option(rep.getNamespaceDefinition).fold(convResource(rep.getXMLResource)) { nsDef =>
        val ns = backport.functionCall("InputOf", Seq("io" -> convResource(nsDef)))
        backport.functionCall("SubstituteNamespaces", Seq("xml"        -> convResource(rep.getXMLResource),
                                                          "namespaces" -> ns))
      }
      val mappings = toInlineCsv(rep.getXPathMappings.iterator.map(m => Seq(m.getXPath, m.getAttribute)),
                                 Some(Seq("XPATH", "ATTR").zipWithIndex.map{case (n, i) => ColumnDefinition(n, index = i)}))
      resourceCall("Extractor", Seq("trees" -> xml, "mappings" -> mappings))
    }

    def mappings = rep.getXPathMappings.map(xpathMap => xpathMap.getAttribute -> xpathMap.getAttribute)
  }

  class ScalaCode(cv: ComplexValue, typ: TypeInstance = AnyType) {
    val (params, code): (Seq[(String, Expression)], String) = {
      val paramNames = Iterator.from(1).map("__param" + _)
      val params = scala.collection.mutable.Buffer[(String, Expression)]()
      val code = new StringBuilder
      cv.getMixed.foreach {
        convComplexValueEntry(_) match {
          case x: StringLiteral =>
            code ++= x.getValue + System.getProperty("line.separator")
          case x =>
            val p = paramNames.next
            params += p -> x
            code ++= p
        }
      }
      (params, code.toString)
    }

    val value: Value = {
      val codeBlk = Factory.createScalaCodeBlock
      codeBlk.setType("yield")
      codeBlk.setCodeStr(s"{$code}")
      if (params.isEmpty)
        codeBlk
      else {
        val fd = addNewFunctionDef(f"__${cv.getClass.getSimpleName}%s_$cv%h")
        fd.setReturnType(typ)
        for ((name, value) <- params) fd.getParameterDefs.add(Factory.newParameterDef(name, StringType, Some(value)))
        fd.setValue(codeBlk)
        Factory.newFunctionCall(fd)
      }
    }
  }
}


import com.ms.qaTools.toolkit

class SaturnToKronusCmdLine extends toolkit.cmdLine.BasicCmdLine {
  @org.kohsuke.args4j.Option(name = "--target", usage = "Generate code for this Saturn version (default: 4)")
  val target: String = "4"

  @org.kohsuke.args4j.Argument(usage = "INPUT", index = 0, required = true)
  val input: String = null

  @org.kohsuke.args4j.Argument(usage = "[OUTPUT]", index = 1)
  val output: String = null
}

object SaturnToKronusApp extends toolkit.ToolkitApp[toolkit.Result] {
  val APP_NAME = "saturn2kronus"
  val cmdLine = new SaturnToKronusCmdLine

  import com.ms.qaTools.AnyUtil

  exit(scala.util.Try {
    parseArguments

    val codeGenUtil = SaturnCodeGenUtil.createFromFileName(cmdLine.input). get

    cmdLine.target match {
      case "4" =>
        val backport = Backport()
        SaturnToKronus(new SaturnToKronus.Config(codeGenUtil, backport, None)).map { k =>
          val out = new java.io.File(Option(cmdLine.output).getOrElse(cmdLine.input.replace("saturn", "kronus")))
          val uri = out.ensuring(_.getName.matches(".*\\.kronus"), s"$out: Destination files must end with .kronus").toURI
          backport.resourceSet.createResource(uri).withSideEffect(_.getContents.add(k))
        }.head.save(java.util.Collections.EMPTY_MAP)
      case "3" =>
        val uri = new java.io.File(Option(cmdLine.output).getOrElse(cmdLine.input.replace("saturn", "saturn33"))).toURI
        import org.eclipse.emf.ecore.resource

        (new resource.impl.ResourceSetImpl).withSideEffect{rs =>
          rs.getResourceFactoryRegistry.getExtensionToFactoryMap.put(
            resource.Resource.Factory.Registry.DEFAULT_EXTENSION,
            new com.ms.qaTools.saturn.util.SaturnResourceFactoryImpl)
          rs.createResource(uri).withSideEffect{r =>
            r.getContents.add(SaturnFactory.eINSTANCE.createDocumentRoot.withSideEffect(_.setSaturn(SaturnToKronus33(codeGenUtil))))
            r.save(null)}}
      case v => sys.error(s"Unsupported target Saturn version: `$v`")
    }
    toolkit.Result(toolkit.Passed)
  })
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
