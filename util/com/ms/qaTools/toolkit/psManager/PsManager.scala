package com.ms.qaTools.toolkit.psManager

import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.seqAsJavaList
import com.ms.qaTools.complexValues._
import com.ms.qaTools.generated.complexValues.ComplexValue
import com.ms.qaTools.generated.psManager.{ Application => MApplication }
import com.ms.qaTools.generated.psManager.{ ApplicationRef => MApplicationRef }
import com.ms.qaTools.generated.psManager.{ LaunchCommand => MLaunchCommand }
import com.ms.qaTools.generated.psManager.{ Launcher => MLauncher }
import com.ms.qaTools.generated.psManager.{ LocalLauncher => MLocalLauncher }
import com.ms.qaTools.generated.psManager.{ RemoteLauncher => MRemoteLauncher }
import com.ms.qaTools.generated.psManager.{ Output => MOutput }
import com.ms.qaTools.generated.psManager.{ PerlLaunchCommand => MPerlLaunchCommand }
import com.ms.qaTools.generated.psManager.{ PerlIsAliveCommand => MPerlIsAliveCommand }
import com.ms.qaTools.generated.psManager.{ PerlTerminateCommand => MPerlTerminateCommand }
import com.ms.qaTools.generated.psManager.{ PsManagerConfig => MPsManagerConfig }
import com.ms.qaTools.generated.psManager.PsManagerFactory
import com.ms.qaTools.generated.psManager.{ ShellLaunchCommand => MShellLaunchCommand }
import com.ms.qaTools.generated.psManager.{ ShellTerminateCommand => MShellTerminateCommand }
import com.ms.qaTools.generated.psManager.{ ShellIsAliveCommand => MShellIsAliveCommand }
import com.ms.qaTools.generated.psManager.{ PidIsAliveCommand => MPidIsAliveCommand }
import com.ms.qaTools.generated.psManager.{ Parameter => MParameter }
import com.ms.qaTools.generated.psManager.{ ComplexValueParameter => MComplexValueParameter }


object PsManagerConfig {
  def apply() = PsManagerFactory.eINSTANCE.createPsManagerConfig()
  def apply(name: String,
    applications: Seq[MApplication] = Nil,
    launchers: Seq[MLauncher] = Nil): MPsManagerConfig = {
    val config = this()
    config.getApplications().addAll(applications)
    config.getLaunchers().addAll(launchers)
    config
  }

  def unapply(c: MPsManagerConfig): Option[(String, Seq[MApplication], Seq[MLauncher])] = Some((c.getName(), c.getApplications(), c.getLaunchers()))
}

object Application {
  def apply() = PsManagerFactory.eINSTANCE.createApplication()
  def apply(name: String, launchCommand: MLaunchCommand): MApplication = {
    val application = this()
    application.setName(name)
    application.setLaunchCommand(launchCommand)
    application
  }

  def unapply(a: MApplication): Option[(String, MLaunchCommand)] = Some(a.getName(), a.getLaunchCommand())
}

object PerlLaunchCommand {
  def apply() = PsManagerFactory.eINSTANCE.createPerlLaunchCommand()
  def apply(command: ComplexValue): MPerlLaunchCommand = {
    val launchCommand = this()
    launchCommand.setCommand(command)
    launchCommand
  }

  def apply(command: ComplexValue, output: MOutput): MPerlLaunchCommand = {
    val launchCommand = this(command)
    launchCommand.setOutput(output)
    launchCommand
  }

  def unapply(s: MPerlLaunchCommand): Option[(ComplexValue, MOutput)] = Some((s.getCommand(), s.getOutput()))
}

object ShellLaunchCommand {
  def apply(): MShellLaunchCommand = PsManagerFactory.eINSTANCE.createShellLaunchCommand()
  def apply(command: ComplexValue): MShellLaunchCommand = {
    val launchCommand = this()
    launchCommand.setCommand(command)
    launchCommand
  }

  def apply(command: ComplexValue, output: MOutput): MShellLaunchCommand = {
    val launchCommand = this(command)
    launchCommand.setOutput(output)
    launchCommand
  }

  def unapply(s: MShellLaunchCommand): Option[(ComplexValue, MOutput)] = Some((s.getCommand(), s.getOutput()))
}

object PerlAliveCommand {
  def apply() = PsManagerFactory.eINSTANCE.createPerlIsAliveCommand()
  def apply(command: ComplexValue): MPerlIsAliveCommand = {
    val isAliveCommand = this()
    isAliveCommand.setCommand(command)
    isAliveCommand
  }

  def apply(command: ComplexValue, output: MOutput): MPerlIsAliveCommand = {
    val isAliveCommand = this(command)
    isAliveCommand.setOutput(output)
    isAliveCommand
  }

  def unapply(s: MPerlIsAliveCommand): Option[(ComplexValue, MOutput)] = Some((s.getCommand(), s.getOutput()))
}

object PidAliveCommand {
  def apply() = PsManagerFactory.eINSTANCE.createPidIsAliveCommand()
}

object ShellAliveCommand {
  def apply() = PsManagerFactory.eINSTANCE.createShellIsAliveCommand()
  def apply(command: ComplexValue): MShellIsAliveCommand = {
    val isAliveCommand = this()
    isAliveCommand.setCommand(command)
    isAliveCommand
  }

  def apply(command: ComplexValue, output: MOutput): MShellIsAliveCommand = {
    val isAliveCommand = this(command)
    isAliveCommand.setOutput(output)
    isAliveCommand
  }

  def unapply(s: MShellIsAliveCommand): Option[(ComplexValue, MOutput)] = Some((s.getCommand(), s.getOutput()))
}

object ApplicationRef {
  def apply() = PsManagerFactory.eINSTANCE.createApplicationRef()
  def apply(name: String, id: String, parameters: Seq[MParameter]): MApplicationRef = {
    val ar = this()
    ar.setName(name)
    ar.setId(id)
    ar.getParameters().addAll(parameters)
    ar
  }
  def unapply(ar: MApplicationRef): Option[(String, String, Seq[MParameter])] = Some(ar.getName(), ar.getId(), ar.getParameters())
}

object LocalLauncher {
  def apply() = PsManagerFactory.eINSTANCE.createLocalLauncher()
  def apply(name: String, applicationRefs: Seq[MApplicationRef]): MLocalLauncher = {
    val launcher = this()
    launcher.setName(name)
    launcher.getApplicationRefs().addAll(applicationRefs)
    launcher
  }

  def unapply(al: MLocalLauncher): Option[(String, Seq[MApplicationRef])] = Some(al.getName(), al.getApplicationRefs())
}

object RemoteLauncher {
  def apply() = PsManagerFactory.eINSTANCE.createRemoteLauncher()
  def apply(name: String,
    user: ComplexValue,
    host: ComplexValue,
    applicationRefs: Seq[MApplicationRef]): MRemoteLauncher = {
    val launcher = this()
    launcher.setUser(user)
    launcher.setHost(host)
    launcher.getTimeout()
    launcher.setName(name)
    launcher.getApplicationRefs().addAll(applicationRefs)
    launcher
  }

  def apply(name: String,
    user: ComplexValue,
    host: ComplexValue,
    timeout: ComplexValue,
    applicationRefs: Seq[MApplicationRef]): MRemoteLauncher = {
    val launcher = this(name, user, host, applicationRefs)
    launcher.setTimeout(timeout)
    launcher
  }

  def unapply(al: MRemoteLauncher): Option[(String, ComplexValue, ComplexValue, ComplexValue, Seq[MApplicationRef])] = Some(al.getName(), al.getUser(), al.getHost(), al.getTimeout(), al.getApplicationRefs())
}

object ComplexValueParameter {
  def apply() = PsManagerFactory.eINSTANCE.createComplexValueParameter()
  def apply(name: String, fmEntries: FMEntry*): MComplexValueParameter = {
    val p = this()
    p.getMixed().addAll(fmEntries)
    p
  }
}

object Test {
  PsManagerConfig("P000", Nil, Nil)
  PsManagerConfig("P001")
  PsManagerConfig("P002", Seq(Application("A000", null)))
  PsManagerConfig("P002", Seq(Application("A001", ShellLaunchCommand(""))))
}
/*
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
