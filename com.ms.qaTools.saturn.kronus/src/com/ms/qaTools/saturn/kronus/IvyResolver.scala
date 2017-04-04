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
