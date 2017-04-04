package com.ms.qaTools.saturn.modules.mqModule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Wait Operator</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.mqModule.MqModulePackage#getWaitOperator()
 * @model extendedMetaData="name='WaitOperator'"
 * @generated
 */
public enum WaitOperator implements Enumerator
{
  /**
   * The '<em><b></b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #__VALUE
   * @generated
   * @ordered
   */
  _(0, "_", "<"),

  /**
   * The '<em><b>1</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #_1_VALUE
   * @generated
   * @ordered
   */
  _1(1, "_1", "<="),

  /**
   * The '<em><b>2</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #_2_VALUE
   * @generated
   * @ordered
   */
  _2(2, "_2", "=="),

  /**
   * The '<em><b>3</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #_3_VALUE
   * @generated
   * @ordered
   */
  _3(3, "_3", ">="),

  /**
   * The '<em><b>4</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #_4_VALUE
   * @generated
   * @ordered
   */
  _4(4, "_4", ">");

/**
   * The '<em><b></b></em>' literal value.
   * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b></b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
   * @see #_
   * @model literal="<"
   * @generated
   * @ordered
   */
  public static final int                __VALUE      = 0;

  /**
   * The '<em><b>1</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>1</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_1
   * @model literal="<="
   * @generated
   * @ordered
   */
  public static final int                _1_VALUE     = 1;

  /**
   * The '<em><b>2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>2</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_2
   * @model literal="=="
   * @generated
   * @ordered
   */
  public static final int                _2_VALUE     = 2;

  /**
   * The '<em><b>3</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>3</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_3
   * @model literal=">="
   * @generated
   * @ordered
   */
  public static final int                _3_VALUE     = 3;

  /**
   * The '<em><b>4</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>4</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #_4
   * @model literal=">"
   * @generated
   * @ordered
   */
  public static final int                _4_VALUE     = 4;

  /**
   * An array of all the '<em><b>Wait Operator</b></em>' enumerators.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static final WaitOperator[]    VALUES_ARRAY = new WaitOperator[]
    {
      _,
      _1,
      _2,
      _3,
      _4,
    };

  /**
   * A public read-only list of all the '<em><b>Wait Operator</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static final List<WaitOperator> VALUES       = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Wait Operator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static WaitOperator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WaitOperator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Wait Operator</b></em>' literal with the specified name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static WaitOperator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      WaitOperator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Wait Operator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static WaitOperator get(int value)
  {
    switch (value)
    {
      case __VALUE: return _;
      case _1_VALUE: return _1;
      case _2_VALUE: return _2;
      case _3_VALUE: return _3;
      case _4_VALUE: return _4;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final int    value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private WaitOperator(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }

} // WaitOperator
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
