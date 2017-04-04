package com.ms.qaTools.saturn.kronus

import java.net.URI
import java.net.URL

import org.apache.ivy.Ivy
import org.apache.ivy.core.LogOptions
import org.apache.ivy.core.module.descriptor.ModuleDescriptor
import org.apache.ivy.core.report.ResolveReport
import org.apache.ivy.core.resolve.ResolveOptions
import org.apache.ivy.core.settings.IvySettings
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry
import org.apache.ivy.plugins.repository.url.URLResource

class IvyResolver(ivy: Ivy) {
  def this(settingsURL: URL) = this {
    val settings = new IvySettings
    settings.load(settingsURL)
    Ivy.newInstance(settings)
  }

  def resolve(file: URL, configs: Array[String]): ResolveReport = {
    val opts = new ResolveOptions().setConfs(configs)
    opts.setLog(LogOptions.LOG_QUIET)
    ivy.resolve(file, opts)
  }

  def artifacts(file: URL, configs: Array[String]): Seq[URI] = resolve(file, configs).getAllArtifactsReports.map { r =>
    Option(r.getLocalFile).fold(new URI(r.getArtifactOrigin.getLocation))(_.toURI)
  }

  def configurationNames(file: URL): Array[String] = parseModuleDescriptor(file).getConfigurationsNames

  protected def parseModuleDescriptor(file: URL): ModuleDescriptor = {
    val parser = ModuleDescriptorParserRegistry.getInstance.getParser(new URLResource(file))
    parser.parseDescriptor(ivy.getSettings, file, true)
  }
}
