package com.ms.qaTools.saturn.modules.extractDDLModule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Table Lock Override Type Enum</b></em>', and utility methods for working with them. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage#getTableLockOverrideTypeEnum()
 * @model extendedMetaData="name='TableLockOverrideTypeEnum'"
 * @generated
 */
public enum TableLockOverrideTypeEnum implements Enumerator
{
  /**
   * The '<em><b>ANY</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ANY_VALUE
   * @generated
   * @ordered
   */
  ANY(0, "ANY", "ANY"),

  /**
   * The '<em><b>LOB</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #LOB_VALUE
   * @generated
   * @ordered
   */
  LOB(1, "LOB", "LOB"),

  /**
   * The '<em><b>PAGE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #PAGE_VALUE
   * @generated
   * @ordered
   */
  PAGE(2, "PAGE", "PAGE"),

  /**
   * The '<em><b>ROW</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #ROW_VALUE
   * @generated
   * @ordered
   */
  ROW(3, "ROW", "ROW"),

  /**
   * The '<em><b>TABLESPACE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #TABLESPACE_VALUE
   * @generated
   * @ordered
   */
  TABLESPACE(4, "TABLESPACE", "TABLESPACE"),

  /**
   * The '<em><b>TABLE</b></em>' literal object.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #TABLE_VALUE
   * @generated
   * @ordered
   */
  TABLE(5, "TABLE", "TABLE");

  /**
   * The '<em><b>ANY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANY
   * @model
   * @generated
   * @ordered
   */
  public static final int                             ANY_VALUE        = 0;

  /**
   * The '<em><b>LOB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LOB</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOB
   * @model
   * @generated
   * @ordered
   */
  public static final int                             LOB_VALUE        = 1;

  /**
   * The '<em><b>PAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PAGE</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PAGE
   * @model
   * @generated
   * @ordered
   */
  public static final int                             PAGE_VALUE       = 2;

  /**
   * The '<em><b>ROW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ROW</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROW
   * @model
   * @generated
   * @ordered
   */
  public static final int                             ROW_VALUE        = 3;

  /**
   * The '<em><b>TABLESPACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TABLESPACE</b></em>' literal object isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TABLESPACE
   * @model
   * @generated
   * @ordered
   */
  public static final int                             TABLESPACE_VALUE = 4;

  /**
   * The '<em><b>TABLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TABLE</b></em>' literal object isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TABLE
   * @model
   * @generated
   * @ordered
   */
  public static final int                             TABLE_VALUE      = 5;

  /**
   * An array of all the '<em><b>Table Lock Override Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  private static final TableLockOverrideTypeEnum[]    VALUES_ARRAY     = new TableLockOverrideTypeEnum[]
    {
      ANY,
      LOB,
      PAGE,
      ROW,
      TABLESPACE,
      TABLE,
    };

  /**
   * A public read-only list of all the '<em><b>Table Lock Override Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static final List<TableLockOverrideTypeEnum> VALUES           = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Table Lock Override Type Enum</b></em>' literal with the specified literal value. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static TableLockOverrideTypeEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TableLockOverrideTypeEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Table Lock Override Type Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   */
  public static TableLockOverrideTypeEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TableLockOverrideTypeEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Table Lock Override Type Enum</b></em>' literal with the specified integer value. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static TableLockOverrideTypeEnum get(int value)
  {
    switch (value)
    {
      case ANY_VALUE: return ANY;
      case LOB_VALUE: return LOB;
      case PAGE_VALUE: return PAGE;
      case ROW_VALUE: return ROW;
      case TABLESPACE_VALUE: return TABLESPACE;
      case TABLE_VALUE: return TABLE;
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
  private TableLockOverrideTypeEnum(int value, String name, String literal)
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

} // TableLockOverrideTypeEnum
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
