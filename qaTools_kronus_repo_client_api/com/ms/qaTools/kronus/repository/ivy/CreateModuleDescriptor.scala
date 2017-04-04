package com.ms.qaTools.kronus.repository.ivy

import java.io.File
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.net.URL

import scala.collection.mutable
import scala.runtime.AbstractFunction2

import org.apache.ivy.core.module.descriptor.{ModuleDescriptor, DefaultModuleDescriptor}
import org.apache.ivy.core.module.descriptor.Configuration
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor
import org.apache.ivy.core.module.descriptor.DefaultExtendsDescriptor
import org.apache.ivy.core.module.descriptor.MDArtifact
import org.apache.ivy.core.module.id.ModuleRevisionId
import org.apache.ivy.core.settings.IvySettings
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorWriter
import org.apache.ivy.plugins.repository.url.URLResource

import com.ms.qaTools.kronus.repository._

case class UserIvyConfig(userIvy: URL, configurationInheritance: Map[String, Seq[String]])

object CreateModuleDescriptor extends AbstractFunction2[Config, Option[UserIvyConfig], ModuleDescriptor] {
  val saturnVersionProp = "qaTools.saturn.version"
  val scalaVersionProp = "scala.version"
  val saturnCompileMasterConf = "saturn-compile"
  val saturnCompileDepConf = "runtime"

  def apply(config: Config, userIvyConf: Option[UserIvyConfig]) = {
    val repoMD = repoModuleDescriptor(config)
    userIvyConf.fold(repoMD) {
      case UserIvyConfig(userIvy, confInherit) =>
        val userMD = parse(userIvy).asInstanceOf[DefaultModuleDescriptor]
        repoMD.getConfigurations.foreach { conf =>
          val ext = conf.getExtends ++ confInherit.getOrElse(conf.getName, Nil)
          userMD.addConfiguration(newConf(conf.getName, conf.getVisibility, ext))
        }
        for {
          conf <- repoMD.getConfigurationsNames
          artifact <- repoMD.getArtifacts(conf)
        } userMD.addArtifact(conf, artifact)
        repoMD.getDependencies.foreach(userMD.addDependency)
        userMD.check()
        newProxyInstance[ModuleDescriptor](new ModuleDescriptorInvocationHandler(userMD))
    }
  }

  def repoModuleDescriptor(config: Config): ModuleDescriptor = {
    val mrid = moduleRevisionId(config.publishInfo)
    val md = new DefaultModuleDescriptor(mrid, "release", null)
    val deps = mutable.LinkedHashMap.empty[ModuleRevisionId, DefaultDependencyDescriptor]
    def addDep(organization: String, name: String, revision: String, confs: Seq[(String, String)]) {
      val id = ModuleRevisionId.newInstance(organization, name, revision)
      val dep = new DefaultDependencyDescriptor(id, false)
      confs.foreach((dep.addDependencyConfiguration _).tupled)
      deps += id -> dep
    }
    val searchSession = new SearchSession(IClient(config.repository))
    md.addConfiguration(newConf("scala-compile", Configuration.Visibility.PRIVATE))
    md.addConfiguration(newConf(saturnCompileMasterConf))
    addDep("ossjava", "scala", s"$${$scalaVersionProp}", Seq("scala-compile" -> "*"))
    addDep("qaTools", "saturn", s"$${$saturnVersionProp}", Seq(saturnCompileMasterConf -> saturnCompileDepConf))
    config.components.foreach { comp =>
      md.addConfiguration(newConf(comp.name, Configuration.Visibility.PUBLIC, Array(saturnCompileMasterConf)))
      md.addConfiguration(newConf("build-" + comp.name, Configuration.Visibility.PRIVATE, Array(comp.name)))
      if (comp.sources.nonEmpty) {
        val artifact = new MDArtifact(md, artifactName(config, comp), "jar", "jar")
        artifact.addConfiguration(comp.name)
        md.addArtifact(comp.name, artifact)
      }
      comp.dependencies.foreach { dep =>
        val found = searchSession.search(dep.release)
        val depMRID = moduleRevisionId(found)
        val dd = deps.getOrElseUpdate(depMRID, new DefaultDependencyDescriptor(depMRID, false))
        found.resolvers.collectFirst {
          case IvySupport.IvyResolver(confs) => dep.filterComponents(confs.map(_.name))
        }.getOrElse(throw new IllegalStateException(s"No Ivy resolver found for dependency: $found")).foreach {
          dd.addDependencyConfiguration(comp.name, _)
        }
      }
    }
    deps.values.foreach(md.addDependency)
    md.check()
    md
  }

  def moduleRevisionId(release: Release): ModuleRevisionId =
    ModuleRevisionId.newInstance(release.group, release.artifact, release.version)

  def parse(url: URL): ModuleDescriptor = {
    val parser = ModuleDescriptorParserRegistry.getInstance.getParser(new URLResource(url))
    parser.parseDescriptor(new IvySettings, url, true)
  }

  def newConf(name: String,
              visibility: Configuration.Visibility = Configuration.Visibility.PUBLIC,
              inherits: Array[String] = null) =
    new Configuration(name, visibility, null, inherits, true, null)

  def expandConf(conf: String, exts: Map[String, Seq[String]]): Seq[String] =
    conf +: exts.getOrElse(conf, Nil).flatMap(expandConf(_, exts))

  def artifactName(config: Config, component: Config.Component): String =
    Seq(config.publishInfo.artifact, component.name).mkString("-")

  class SearchSession(client: IClient) {
    protected val cache = mutable.HashMap.empty[(Option[String], Option[String], Option[String]), Release]

    def search(release: Release): Release = {
      import scala.math.Ordering.Implicits._
      val key = (Some(release.group), Some(release.artifact), Some(release.version).filterNot(_ == "*"))
      cache.getOrElseUpdate(key, (client.search _).tupled(key).maxBy(_.version.split('.').toSeq.map(_.toInt)))
    }
  }

  class ModuleDescriptorInvocationHandler(self: ModuleDescriptor) extends InvocationHandler {
    def invoke(proxy: AnyRef, method: Method, args: Array[AnyRef]) = method.getName match {
      case "toIvyFile" =>
        val Array(ivyFile: File) = args
        XmlModuleDescriptorWriter.write(self, ivyFile)
        null
      case _ =>
        method.invoke(self, args)
    }
  }
}
