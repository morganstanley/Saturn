package com.ms._2006.saturn.resources.sybase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;
import com.ms._2006.saturn.types.TypesModelPackage;
import com.ms._2006.saturn.values.ValuesModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>sybaseResource</b></em>'. It contains initialization code and access to the
 * Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SybaseResourceModelPackage extends ModelPackage
{

  /**
   * Is set when the package has been initialized.
   * 
   * @generated
   */
  private static boolean                         isInitialized                              = false;

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final String                     NS_URI                                     = "http://www.ms.com/2006/Saturn/Resources/Sybase";

  /**
   * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SybaseResourceModelFactory MODELFACTORY                               = new SybaseResourceModelFactory();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int                        AUTHENTIFICATIONENUMS_CLASSIFIER_ID        = 1;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int                        AUTHENTIFICATIONENUMSOBJECT_CLASSIFIER_ID  = 2;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int                        SYBASERESOURCE_CLASSIFIER_ID               = 0;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int                        SYBASERESOURCE_LOGIN_FEATURE_ID            = 6;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int                        SYBASERESOURCE_PASSWORD_FEATURE_ID         = 7;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int                        SYBASERESOURCE_SERVER_FEATURE_ID           = 8;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int                        SYBASERESOURCE_DATABASE_FEATURE_ID         = 9;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int                        SYBASERESOURCE_MAXCONNECT_FEATURE_ID       = 10;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final int                        SYBASERESOURCE_AUTHENTIFICATION_FEATURE_ID = 11;

  /**
   * The static member with the instance of this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static final SybaseResourceModelPackage INSTANCE                                   = initialize();

  /**
   * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static SybaseResourceModelPackage initialize()
  {

    if (isInitialized) { return (SybaseResourceModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI); }

    final SybaseResourceModelPackage modelPackage = new SybaseResourceModelPackage();

    ModelResolver.getInstance().registerModelPackage(modelPackage);

    // read the model from the ecore file, the EPackage is registered in the EPackage.Registry
    // see the ModelResolver getEPackageRegistry method
    ModelUtils.readEPackagesFromFile(modelPackage);

    isInitialized = true;

    TypesModelPackage.initialize();
    ValuesModelPackage.initialize();

    // force the initialization of the EFactory proxy
    modelPackage.getEPackage();

    // register the relation between a Class and its EClassifier
    ModelResolver.getInstance().registerClassModelMapping(SybaseResource.class, modelPackage.getSybaseResourceEClass(),
        modelPackage);

    ModelResolver.getInstance().registerClassModelMapping(AuthentificationEnums.class,
        modelPackage.getAuthentificationEnumsEEnum(), modelPackage);

    // and return ourselves
    return modelPackage;
  }

  /**
   * Returns the {@link ModelFactory} of this ModelPackage. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the {@link SybaseResourceModelFactory} instance.
   * @generated
   */
  @Override
  public SybaseResourceModelFactory getModelFactory()
  {
    return MODELFACTORY;
  }

  /**
   * Returns the nsUri of the {@link EPackage} managed by this Package instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the nsUri of the EPackage
   * @generated
   */
  @Override
  public String getNsURI()
  {
    return NS_URI;
  }

  /**
   * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the name of the ecore file
   * @generated
   */
  @Override
  public String getEcoreFileName()
  {
    return "sybaseResource.ecore";
  }

  /**
   * Returns the {@link EClass} '<em><b>SybaseResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EClass} '<em><b>SybaseResource</b></em>'
   * @generated
   */
  public EClass getSybaseResourceEClass()
  {
    return (EClass) getEPackage().getEClassifiers().get(SYBASERESOURCE_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SybaseResource.login</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SybaseResource.login</b></em>'.
   * @generated
   */
  public EReference getSybaseResource_Login()
  {
    return (EReference) getSybaseResourceEClass().getEAllStructuralFeatures().get(SYBASERESOURCE_LOGIN_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SybaseResource.password</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SybaseResource.password</b></em>'.
   * @generated
   */
  public EReference getSybaseResource_Password()
  {
    return (EReference) getSybaseResourceEClass().getEAllStructuralFeatures().get(SYBASERESOURCE_PASSWORD_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SybaseResource.server</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SybaseResource.server</b></em>'.
   * @generated
   */
  public EReference getSybaseResource_Server()
  {
    return (EReference) getSybaseResourceEClass().getEAllStructuralFeatures().get(SYBASERESOURCE_SERVER_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SybaseResource.database</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SybaseResource.database</b></em>'.
   * @generated
   */
  public EReference getSybaseResource_Database()
  {
    return (EReference) getSybaseResourceEClass().getEAllStructuralFeatures().get(SYBASERESOURCE_DATABASE_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SybaseResource.maxConnect</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SybaseResource.maxConnect</b></em>'.
   * @generated
   */
  public EReference getSybaseResource_MaxConnect()
  {
    return (EReference) getSybaseResourceEClass().getEAllStructuralFeatures().get(SYBASERESOURCE_MAXCONNECT_FEATURE_ID);
  }

  /**
   * Returns the {@link EStructuralFeature} '<em><b>SybaseResource.authentification</b></em>'. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @return an instance of the {@link EStructuralFeature}: '<em><b>SybaseResource.authentification</b></em>'.
   * @generated
   */
  public EAttribute getSybaseResource_Authentification()
  {
    return (EAttribute) getSybaseResourceEClass().getEAllStructuralFeatures().get(
        SYBASERESOURCE_AUTHENTIFICATION_FEATURE_ID);
  }

  /**
   * Returns the EEnum '<em><b>AuthentificationEnums</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return an instance of the EEnum representing '<em><b>AuthentificationEnums</b></em>'
   * @generated
   */
  public EEnum getAuthentificationEnumsEEnum()
  {
    return (EEnum) getEPackage().getEClassifiers().get(AUTHENTIFICATIONENUMS_CLASSIFIER_ID);
  }

  /**
   * Returns the {@link EDataType} '<em><b>AuthentificationEnumsObject</b></em>'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return an instance of the {@link EDataType} representing '<em><b>AuthentificationEnumsObject</b></em>'
   * @generated
   */
  public EDataType getAuthentificationEnumsObjectEDataType()
  {
    return (EDataType) getEPackage().getEClassifiers().get(AUTHENTIFICATIONENUMSOBJECT_CLASSIFIER_ID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eClassifier
   *          the {@link EClassifier}
   * @return the class implementing a specific {@link EClass}.
   * @generated
   */
  @Override
  public Class<?> getEClassifierClass(EClassifier eClassifier)
  {
    switch (eClassifier.getClassifierID())
    {
    case SYBASERESOURCE_CLASSIFIER_ID:
      return SybaseResource.class;
    case AUTHENTIFICATIONENUMS_CLASSIFIER_ID:
      return AuthentificationEnums.class;
    case AUTHENTIFICATIONENUMSOBJECT_CLASSIFIER_ID:
      return AuthentificationEnums.class;
    }
    throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
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
