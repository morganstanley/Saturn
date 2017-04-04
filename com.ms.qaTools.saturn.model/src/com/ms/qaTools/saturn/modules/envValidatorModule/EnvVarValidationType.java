package com.ms.qaTools.saturn.modules.envValidatorModule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Env Var Validation Type</b></em>
 * ', and utility methods for working with them. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage#getEnvVarValidationType()
 * @model extendedMetaData="name='EnvVarValidationType'"
 * @generated
 */
public enum EnvVarValidationType implements Enumerator
{
  /**
   * The '<em><b>VALUE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #VALUE_VALUE
   * @generated
   * @ordered
   */
  VALUE(0, "VALUE", "VALUE"),

  /**
   * The '<em><b>REGEXP</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #REGEXP_VALUE
   * @generated
   * @ordered
   */
  REGEXP(1, "REGEXP", "REGEXP"),

  /**
   * The '<em><b>UNSET</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #UNSET_VALUE
   * @generated
   * @ordered
   */
  UNSET(2, "UNSET", "UNSET"),

  /**
   * The '<em><b>SET</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #SET_VALUE
   * @generated
   * @ordered
   */
  SET(3, "SET", "SET");

  /**
   * The '<em><b>VALUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VALUE</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VALUE
   * @model
   * @generated
   * @ordered
   */
  public static final int                        VALUE_VALUE  = 0;

  /**
   * The '<em><b>REGEXP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REGEXP</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REGEXP
   * @model
   * @generated
   * @ordered
   */
  public static final int                        REGEXP_VALUE = 1;

  /**
   * The '<em><b>UNSET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNSET</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNSET
   * @model
   * @generated
   * @ordered
   */
  public static final int                        UNSET_VALUE  = 2;

  /**
   * The '<em><b>SET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SET</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SET
   * @model
   * @generated
   * @ordered
   */
  public static final int                        SET_VALUE    = 3;

  /**
   * An array of all the '<em><b>Env Var Validation Type</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  private static final EnvVarValidationType[]    VALUES_ARRAY = new EnvVarValidationType[]
    {
      VALUE,
      REGEXP,
      UNSET,
      SET,
    };

  /**
   * A public read-only list of all the '<em><b>Env Var Validation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EnvVarValidationType> VALUES       = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Env Var Validation Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static EnvVarValidationType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnvVarValidationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Env Var Validation Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public static EnvVarValidationType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnvVarValidationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Env Var Validation Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static EnvVarValidationType get(int value)
  {
    switch (value)
    {
      case VALUE_VALUE: return VALUE;
      case REGEXP_VALUE: return REGEXP;
      case UNSET_VALUE: return UNSET;
      case SET_VALUE: return SET;
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
  private EnvVarValidationType(int value, String name, String literal)
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

} // EnvVarValidationType
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
