package com.ms.qaTools

import org.slf4j.LoggerFactory

object Logger {
  def apply(clientClass: Class[_]) = Slf4jLogger(clientClass)
}

object Slf4jLogger {
  def apply(clientClass: Class[_]) = new Slf4jLogger(clientClass)
}

object NullLogger {
  def apply() = new NullLogger()
}

trait Logger {
  def debug(msg: => AnyRef, t: => Throwable = null)
  def info(msg: => AnyRef, t: => Throwable = null)
  def warn(msg: => AnyRef, t: => Throwable = null)
  def error(msg: => AnyRef, t: => Throwable = null)
  def trace(msg: => AnyRef, t: => Throwable = null)
}

class NullLogger extends Logger {
  def debug(msg: => AnyRef, t: => Throwable = null) = Unit
  def info(msg: => AnyRef, t: => Throwable = null) = Unit
  def warn(msg: => AnyRef, t: => Throwable = null) = Unit
  def error(msg: => AnyRef, t: => Throwable = null) = Unit
  def trace(msg: => AnyRef, t: => Throwable = null) = Unit
}

class Slf4jLogger(clientClass: Class[_]) extends Logger {
  private lazy val logger = LoggerFactory.getLogger(clientClass)

  def debug(msg: => AnyRef, t: => Throwable = null): Unit = {
    if (logger.isDebugEnabled) {
      if (t != null) {
        logger.debug(msg.toString, t);
      } else {
        logger.debug(msg.toString)
      }
    }
  }

  def info(msg: => AnyRef, t: => Throwable = null): Unit = {
    if (logger.isInfoEnabled) {
      if (t != null) {
        logger.info(msg.toString, t);
      } else {
        logger.info(msg.toString)
      }
    }
  }

  def warn(msg: => AnyRef, t: => Throwable = null): Unit = {
    if (logger.isWarnEnabled) {
      if (t != null) {
        logger.warn(msg.toString, t);
      } else {
        logger.warn(msg.toString)
      }
    }
  }

  def error(msg: => AnyRef, t: => Throwable = null): Unit = {
    if (logger.isErrorEnabled) {
      if (t != null) {
        logger.error(msg.toString, t);
      } else {
        logger.error(msg.toString)
      }
    }
  }

  def trace(msg: => AnyRef, t: => Throwable = null): Unit = {
    if (logger.isTraceEnabled()) {
      if (t != null) {
        logger.trace(msg.toString, t);
      } else {
        logger.trace(msg.toString)
      }
    }
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
