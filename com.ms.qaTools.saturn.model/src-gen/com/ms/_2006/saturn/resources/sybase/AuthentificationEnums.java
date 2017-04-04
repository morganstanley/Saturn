package com.ms._2006.saturn.resources.sybase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>AuthentificationEnums</b></em>'. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public enum AuthentificationEnums
{

  /**
   * The enum: PASSWORD <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  PASSWORD(0, "PASSWORD", "PASSWORD")
  {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isPASSWORD()
    {
      return true;
    }
  },
  /**
   * The enum: KERBEROS <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  KERBEROS(1, "KERBEROS", "KERBEROS")
  {

    /**
     * @return always true for this instance
     * @generated
     */
    @Override
    public boolean isKERBEROS()
    {
      return true;
    }
  };

  /**
   * An array of all the '<em><b>AuthentificationEnums</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  private static final AuthentificationEnums[]    VALUES_ARRAY = new AuthentificationEnums[] { PASSWORD, KERBEROS };

  /**
   * A public read-only list of all the '<em><b>AuthentificationEnums</b></em>' enumerators. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final List<AuthentificationEnums> VALUES       = Collections.unmodifiableList(Arrays
                                                                   .asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>AuthentificationEnums</b></em>' literal with the specified literal value. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static AuthentificationEnums get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AuthentificationEnums result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) { return result; }
    }
    return null;
  }

  /**
   * Returns the '<em><b>AuthentificationEnums</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public static AuthentificationEnums getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AuthentificationEnums result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) { return result; }
    }
    return null;
  }

  /**
   * Returns the '<em><b>AuthentificationEnums</b></em>' literal with the specified integer value. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static AuthentificationEnums get(int value)
  {
    for (AuthentificationEnums enumInstance : VALUES_ARRAY)
    {
      if (enumInstance.getValue() == value) { return enumInstance; }
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final int    value;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private AuthentificationEnums(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isPASSWORD()
  {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return false, is overridden by actual enum types.
   * @generated
   */
  public boolean isKERBEROS()
  {
    return false;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the literal value of the enumerator, which is its string representation.
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
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
