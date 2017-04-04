package com.ms.qaTools.saturn.modules.mailModule.impl;

import com.ms.qaTools.saturn.modules.mailModule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.modules.mailModule.DocumentRoot;
import com.ms.qaTools.saturn.modules.mailModule.MailConfiguration;
import com.ms.qaTools.saturn.modules.mailModule.MailModuleFactory;
import com.ms.qaTools.saturn.modules.mailModule.MailModulePackage;
import com.ms.qaTools.saturn.modules.mailModule.MailRecipient;
import com.ms.qaTools.saturn.modules.mailModule.MessageTypeEnum;
import com.ms.qaTools.saturn.modules.mailModule.RecipientTypeEnum;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class MailModuleFactoryImpl extends EFactoryImpl implements MailModuleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static MailModuleFactory init()
  {
    try
    {
      MailModuleFactory theMailModuleFactory = (MailModuleFactory)EPackage.Registry.INSTANCE.getEFactory(MailModulePackage.eNS_URI);
      if (theMailModuleFactory != null)
      {
        return theMailModuleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MailModuleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MailModuleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MailModulePackage.DOCUMENT_ROOT: return createDocumentRoot();
      case MailModulePackage.MAIL_CONFIGURATION: return createMailConfiguration();
      case MailModulePackage.MAIL_RECIPIENT: return createMailRecipient();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MailModulePackage.MESSAGE_TYPE_ENUM:
        return createMessageTypeEnumFromString(eDataType, initialValue);
      case MailModulePackage.RECIPIENT_TYPE_ENUM:
        return createRecipientTypeEnumFromString(eDataType, initialValue);
      case MailModulePackage.MESSAGE_TYPE_ENUM_OBJECT:
        return createMessageTypeEnumObjectFromString(eDataType, initialValue);
      case MailModulePackage.RECIPIENT_TYPE_ENUM_OBJECT:
        return createRecipientTypeEnumObjectFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MailModulePackage.MESSAGE_TYPE_ENUM:
        return convertMessageTypeEnumToString(eDataType, instanceValue);
      case MailModulePackage.RECIPIENT_TYPE_ENUM:
        return convertRecipientTypeEnumToString(eDataType, instanceValue);
      case MailModulePackage.MESSAGE_TYPE_ENUM_OBJECT:
        return convertMessageTypeEnumObjectToString(eDataType, instanceValue);
      case MailModulePackage.RECIPIENT_TYPE_ENUM_OBJECT:
        return convertRecipientTypeEnumObjectToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MailConfiguration createMailConfiguration()
  {
    MailConfigurationImpl mailConfiguration = new MailConfigurationImpl();
    return mailConfiguration;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MailRecipient createMailRecipient()
  {
    MailRecipientImpl mailRecipient = new MailRecipientImpl();
    return mailRecipient;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MessageTypeEnum createMessageTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    MessageTypeEnum result = MessageTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertMessageTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RecipientTypeEnum createRecipientTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    RecipientTypeEnum result = RecipientTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertRecipientTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MessageTypeEnum createMessageTypeEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createMessageTypeEnumFromString(MailModulePackage.Literals.MESSAGE_TYPE_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertMessageTypeEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertMessageTypeEnumToString(MailModulePackage.Literals.MESSAGE_TYPE_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RecipientTypeEnum createRecipientTypeEnumObjectFromString(EDataType eDataType, String initialValue)
  {
    return createRecipientTypeEnumFromString(MailModulePackage.Literals.RECIPIENT_TYPE_ENUM, initialValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String convertRecipientTypeEnumObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertRecipientTypeEnumToString(MailModulePackage.Literals.RECIPIENT_TYPE_ENUM, instanceValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public MailModulePackage getMailModulePackage()
  {
    return (MailModulePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MailModulePackage getPackage()
  {
    return MailModulePackage.eINSTANCE;
  }

} // MailModuleFactoryImpl
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
