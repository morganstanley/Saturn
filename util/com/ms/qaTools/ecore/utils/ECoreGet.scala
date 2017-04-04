package com.ms.qaTools.ecore.utils

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import scala.util.Try

object ECoreGet {
  def apply[ReturnType <: Object](parent: EObject, feature: EStructuralFeature): ReturnType = {
    val rawValue = parent.eGet(feature)
    rawValue match {
      case typedValue: ReturnType => typedValue
      case _ => throw new ClassCastException("Invalid class cast of value:" + rawValue + " from" + parent + "." + feature)
    }
  }
}

object ECoreGetOption {
  def apply[ReturnType <: Object](parent: EObject, feature: EStructuralFeature): Option[ReturnType] = {
    val rawValue = Option(parent.eGet(feature))
    rawValue match {
      case Some(typedValue:ReturnType) => Some(typedValue)
      case Some(_) => throw new ClassCastException("Invalid class cast of value:" + rawValue + " from" + parent + "." + feature)
      case None => throw new ClassCastException("Invalid class cast of value:" + rawValue + " from" + parent + "." + feature)
    }
  }
}

object ECoreGetTry {
  def apply[ReturnType <: Object](parent: EObject, feature: EStructuralFeature): Try[ReturnType] = Try {
    Option(parent.eGet(feature)).getOrElse(throw new Exception(s"The eObject: $parent did not contain a value for the feature: $feature.")).asInstanceOf[ReturnType]
  }.recoverWith{case t:Throwable => throw new Exception(s"An exception occurred while getting feature: $feature from: $parent.", t) }
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
