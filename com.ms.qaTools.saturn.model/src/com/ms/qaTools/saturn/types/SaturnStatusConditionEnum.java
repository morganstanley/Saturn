package com.ms.qaTools.saturn.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Saturn Status Condition Enum</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.types.TypesPackage#getSaturnStatusConditionEnum()
 * @model extendedMetaData="name='SaturnStatusConditionEnum'"
 * @generated
 */
public enum SaturnStatusConditionEnum implements Enumerator
{
  /**
   * The '<em><b>ANYFAIL</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ANYFAIL_VALUE
   * @generated
   * @ordered
   */
  ANYFAIL(0, "ANYFAIL", "ANY FAIL"),

  /**
   * The '<em><b>ANYPASS</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ANYPASS_VALUE
   * @generated
   * @ordered
   */
  ANYPASS(1, "ANYPASS", "ANY PASS"),

  /**
   * The '<em><b>ALLPASS</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ALLPASS_VALUE
   * @generated
   * @ordered
   */
  ALLPASS(2, "ALLPASS", "ALL PASS"),

  /**
   * The '<em><b>ALLFAIL</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ALLFAIL_VALUE
   * @generated
   * @ordered
   */
  ALLFAIL(3, "ALLFAIL", "ALL FAIL");

  /**
   * The '<em><b>ANYFAIL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANYFAIL</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANYFAIL
   * @model literal="ANY FAIL"
   * @generated
   * @ordered
   */
  public static final int                             ANYFAIL_VALUE = 0;

  /**
   * The '<em><b>ANYPASS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANYPASS</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANYPASS
   * @model literal="ANY PASS"
   * @generated
   * @ordered
   */
  public static final int                             ANYPASS_VALUE = 1;

  /**
   * The '<em><b>ALLPASS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALLPASS</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALLPASS
   * @model literal="ALL PASS"
   * @generated
   * @ordered
   */
  public static final int                             ALLPASS_VALUE = 2;

  /**
   * The '<em><b>ALLFAIL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ALLFAIL</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALLFAIL
   * @model literal="ALL FAIL"
   * @generated
   * @ordered
   */
  public static final int                             ALLFAIL_VALUE = 3;

  /**
   * An array of all the '<em><b>Saturn Status Condition Enum</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  private static final SaturnStatusConditionEnum[]    VALUES_ARRAY  = new SaturnStatusConditionEnum[]
    {
      ANYFAIL,
      ANYPASS,
      ALLPASS,
      ALLFAIL,
    };

  /**
   * A public read-only list of all the '<em><b>Saturn Status Condition Enum</b></em>' enumerators.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static final List<SaturnStatusConditionEnum> VALUES        = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Saturn Status Condition Enum</b></em>' literal with the specified literal value. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static SaturnStatusConditionEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SaturnStatusConditionEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Saturn Status Condition Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SaturnStatusConditionEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SaturnStatusConditionEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Saturn Status Condition Enum</b></em>' literal with the specified integer value. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static SaturnStatusConditionEnum get(int value)
  {
    switch (value)
    {
      case ANYFAIL_VALUE: return ANYFAIL;
      case ANYPASS_VALUE: return ANYPASS;
      case ALLPASS_VALUE: return ALLPASS;
      case ALLFAIL_VALUE: return ALLFAIL;
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
  private SaturnStatusConditionEnum(int value, String name, String literal)
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

} // SaturnStatusConditionEnum
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
