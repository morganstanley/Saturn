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
COPYRIGHT NOTICE AND DISCLAIMER
Copyright (c) 2009-2016, Contributor

This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License, version 3 for more details.

You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
*/
