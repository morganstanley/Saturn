package com.ms._2006.saturn.resources.sybase;

import com.ms._2006.saturn.types.DeviceResourceDefinition;
import com.ms._2006.saturn.values.ComplexValue;

/**
 * A representation of the model object '<em><b>SybaseResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SybaseResource extends DeviceResourceDefinition
{

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ComplexValue          login            = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ComplexValue          password         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ComplexValue          server           = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ComplexValue          database         = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private ComplexValue          maxConnect       = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private AuthentificationEnums authentification = AuthentificationEnums.PASSWORD;

  /**
   * Returns the value of '<em><b>login</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>login</b></em>' feature
   * @generated
   */
  public ComplexValue getLogin()
  {
    return login;
  }

  /**
   * Sets the '{@link SybaseResource#getLogin() <em>login</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SybaseResource#getLogin() login}' feature.
   * @generated
   */
  public void setLogin(ComplexValue newLogin)
  {
    login = newLogin;
  }

  /**
   * Returns the value of '<em><b>password</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>password</b></em>' feature
   * @generated
   */
  public ComplexValue getPassword()
  {
    return password;
  }

  /**
   * Sets the '{@link SybaseResource#getPassword() <em>password</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SybaseResource#getPassword() password}' feature.
   * @generated
   */
  public void setPassword(ComplexValue newPassword)
  {
    password = newPassword;
  }

  /**
   * Returns the value of '<em><b>server</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>server</b></em>' feature
   * @generated
   */
  public ComplexValue getServer()
  {
    return server;
  }

  /**
   * Sets the '{@link SybaseResource#getServer() <em>server</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SybaseResource#getServer() server}' feature.
   * @generated
   */
  public void setServer(ComplexValue newServer)
  {
    server = newServer;
  }

  /**
   * Returns the value of '<em><b>database</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>database</b></em>' feature
   * @generated
   */
  public ComplexValue getDatabase()
  {
    return database;
  }

  /**
   * Sets the '{@link SybaseResource#getDatabase() <em>database</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SybaseResource#getDatabase() database}' feature.
   * @generated
   */
  public void setDatabase(ComplexValue newDatabase)
  {
    database = newDatabase;
  }

  /**
   * Returns the value of '<em><b>maxConnect</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>maxConnect</b></em>' feature
   * @generated
   */
  public ComplexValue getMaxConnect()
  {
    return maxConnect;
  }

  /**
   * Sets the '{@link SybaseResource#getMaxConnect() <em>maxConnect</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SybaseResource#getMaxConnect() maxConnect}' feature.
   * @generated
   */
  public void setMaxConnect(ComplexValue newMaxConnect)
  {
    maxConnect = newMaxConnect;
  }

  /**
   * Returns the value of '<em><b>authentification</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>authentification</b></em>' feature
   * @generated
   */
  public AuthentificationEnums getAuthentification()
  {
    return authentification;
  }

  /**
   * Sets the '{@link SybaseResource#getAuthentification() <em>authentification</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SybaseResource#getAuthentification() authentification}' feature.
   * @generated
   */
  public void setAuthentification(AuthentificationEnums newAuthentification)
  {
    authentification = newAuthentification;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString()
  {
    return "SybaseResource " + " [authentification: " + getAuthentification() + "]";
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
