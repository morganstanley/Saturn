package com.ms.qaTools.toolkit.pbValidate
import com.google.protobuf.Descriptors.Descriptor
import com.google.protobuf.Descriptors.FieldDescriptor
import com.google.protobuf.DynamicMessage
import com.google.protobuf.Message
import com.ms.qaTools.tree.PBNode
import com.ms.qaTools.tree.validator.Comparator
import com.ms.qaTools.tree.validator.ComparatorWithKeys
import com.ms.qaTools.tree.validator.EnumValidator
import com.ms.qaTools.tree.validator.ExistsValidator
import com.ms.qaTools.tree.validator.ImplicitMapper
import com.ms.qaTools.tree.validator.KeyedMatcher
import com.ms.qaTools.tree.validator.LinearMatcher
import com.ms.qaTools.tree.validator.Matcher
import com.ms.qaTools.tree.validator.PatternValidator
import com.ms.qaTools.tree.validator.PBPathNodeLookup
import com.ms.qaTools.tree.validator.Validator
import groovy.lang.GroovyShell
import scala.collection.JavaConversions._

case class PBValidateComparator(comparator: Comparator[FieldDescriptor], keys: Seq[String])
extends ComparatorWithKeys[FieldDescriptor]

object PBValidateComparator {
  def apply(): PBValidateComparator = PBValidateComparator(new Comparator[FieldDescriptor](), Seq[String]())

  def apply(configTemplate: DynamicMessage, descriptor: Descriptor): PBValidateComparator =
    PBValidateComparator(createComparator(configTemplate, descriptor), getProtoBufTemplateKeyField(configTemplate))

  private def getProtoBufTemplateKeyField(template: DynamicMessage): Seq[String] = {
    val vKeyField = template.getAllFields().filter(f => f._1.getName() == "v_keys")
    vKeyField.values.toSeq.flatMap {_.toString().split(",")}
  }

  case class GroovyConfig(validators: Iterable[Validator[FieldDescriptor]] = Nil, ignores: Iterable[PBPathNodeLookup] = Nil, keys: Iterable[PBPathNodeLookup] = Nil) {
    def addValidator(v: Validator[FieldDescriptor]) = copy(validators = validators ++ Seq(v))
    def addIgnore(p: PBPathNodeLookup) = copy(ignores = ignores ++ Seq(p))
    def addKey(m: PBPathNodeLookup) = copy(keys = keys ++ Seq(m))
  }
  
  object GroovyConfig {
    val imports = """
        import com.ms.qaTools.tree.validator.GroovyEnumValidator
        import com.ms.qaTools.tree.validator.GroovyExistsValidator
        import com.ms.qaTools.tree.validator.GroovyPatternValidator
      """
    val defs = """          
        def Enum(enumList) {
            def lookUps = []
            def enumVal = new GroovyEnumValidator(enumList, lookUps)
            enumVal.create()
        }

        def Exists() {
           def lookUps = []
           def existsVal = new GroovyExistsValidator(lookUps)
           existsVal.create()
        }
      
        def Pattern(regex) {
           def lookUps = []
           def patternVal = new GroovyPatternValidator(regex, lookUps)
           patternVal.create()
        }
      
        // redundant, but just for clarity.
      
        def Ignore() { "." }
      
        def Key() { true }
              
        """
    def wrapInGroovyTry(field: String) = s"try { \n $field \n } catch (e) {} "
    
    def apply(templateMsg: Message, source: Descriptor): GroovyConfig = {
      val fields = templateMsg.getAllFields()
      // Filter all the elements of message type
      val implicitFields = fields.filter {case (field,value) => field.getType() != FieldDescriptor.Type.MESSAGE}.toList
      val shell = new GroovyShell()
      def process0(fields: List[(FieldDescriptor, Any)], config: GroovyConfig = GroovyConfig()): GroovyConfig = {
        fields.foldLeft(config) {
          case (config, (fd, value)) => {
            val fieldValue = if (fd.isRepeated()) value.asInstanceOf[java.util.Collection[String]].head else value.asInstanceOf[String]
            val result = shell.evaluate(s"$imports $defs ${wrapInGroovyTry(fieldValue)}")
            def evaluateResult0(result: List[Any], config: GroovyConfig): GroovyConfig = 
              result match {
                case Nil => config
                case (x: java.util.List[_]) :: xs => evaluateResult0(x.toList ++ xs, config)
                case (enumVal: EnumValidator[_]) :: xs => evaluateResult0(xs, config.addValidator(new EnumValidator(enumVal.enums.toSeq, Seq(PBPathNodeLookup(fd.getName())))))
                case (existsVal: ExistsValidator[_]) :: xs => evaluateResult0(xs, config.addValidator(new ExistsValidator(Seq(PBPathNodeLookup(fd.getName())))))
                case (patternVal: PatternValidator[_]) :: xs => evaluateResult0(xs, config.addValidator(new PatternValidator(patternVal.regex, Seq(PBPathNodeLookup(fd.getName)))))
                case (ignore: String) :: xs => evaluateResult0(xs, config.addIgnore(PBPathNodeLookup(ignore)))
                case (isKey: Boolean) :: xs => evaluateResult0(xs, config.addKey(PBPathNodeLookup(fd.getName())))
                case x :: xs => evaluateResult0(xs, config.addValidator(EnumValidator[FieldDescriptor](Array(PBNode(fd, fieldValue.toString(), Seq(fieldValue)).valueAsString), Seq(PBPathNodeLookup(fd.getName())))))              
              }
            evaluateResult0(List(result), config)
          }
        }
      }
      process0(implicitFields)
    }
  }
  
  def createLinearMatcher(messageType: String, template: Message, descriptor: Descriptor): Matcher[FieldDescriptor] =
    LinearMatcher(ImplicitMapper(PBPathNodeLookup(messageType)), Option(createComparator(template, descriptor)))
    
  def createKeyedMatcher(messageType: String, lookups: Iterable[PBPathNodeLookup], template: Message, descriptor: Descriptor): Matcher[FieldDescriptor] =
    KeyedMatcher(ImplicitMapper(PBPathNodeLookup(messageType)), lookups.toSeq, Option(createComparator(template, descriptor)), false)    

  def createComparator(template: Message, source: Descriptor): Comparator[FieldDescriptor] = {
    val fields = template.getAllFields()
    val fieldList = fields.filter {case (field, value) => field.getType() == FieldDescriptor.Type.MESSAGE}
    val matchers = fieldList.map {
      case (fd, value) =>
        val sourceMessageType = source.findFieldByName(fd.getName()).asInstanceOf[FieldDescriptor].getMessageType()
        val subMessage: Message = if (fd.isRepeated()) value.asInstanceOf[java.util.Collection[Message]].head else value.asInstanceOf[Message]
        val config = GroovyConfig(subMessage, sourceMessageType)
        if (config.keys.nonEmpty)
          createKeyedMatcher(fd.getName, config.keys, subMessage, sourceMessageType)
        else
          createLinearMatcher(fd.getName, subMessage, sourceMessageType)
    }
    val config = GroovyConfig(template, source)
    new Comparator(matchers = matchers, validators = config.validators, ignores = config.ignores, explainer = None)
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
