/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 *
 * $Id$
 */
package com.ms.qaTools.saturn.resources.semaphoreResource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.ms.qaTools.saturn.types.TypesPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourceFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface SemaphoreResourcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNAME                                              = "semaphoreResource";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_URI                                            = "http://www.ms.com/2011/Saturn/Resources/Semaphore";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String                   eNS_PREFIX                                         = "semaphoreResource";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  SemaphoreResourcePackage eINSTANCE                                          = com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreProviderImpl <em>Semaphore Provider</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreProviderImpl
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getSemaphoreProvider()
   * @generated
   */
  int                      SEMAPHORE_PROVIDER                                 = 5;

  /**
   * The number of structural features of the '<em>Semaphore Provider</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_PROVIDER_FEATURE_COUNT                   = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.LocalSemaphoreProviderImpl <em>Local Semaphore Provider</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.LocalSemaphoreProviderImpl
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getLocalSemaphoreProvider()
   * @generated
   */
  int                      LOCAL_SEMAPHORE_PROVIDER                           = 0;

  /**
   * The feature id for the '<em><b>Semaphores</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LOCAL_SEMAPHORE_PROVIDER__SEMAPHORES               = SEMAPHORE_PROVIDER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Local Semaphore Provider</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      LOCAL_SEMAPHORE_PROVIDER_FEATURE_COUNT             = SEMAPHORE_PROVIDER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.ObtainSemaphoreResourceImpl <em>Obtain Semaphore Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.ObtainSemaphoreResourceImpl
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getObtainSemaphoreResource()
   * @generated
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE                          = 1;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE__ENABLED                 = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE__STATE                   = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE__CONNECTOR_PREFERENCE    = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE__NAME                    = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Semaphore Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE      = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Semaphore Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_NAME          = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE__TIMEOUT                 = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Release At End Of Scope</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE__RELEASE_AT_END_OF_SCOPE = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Obtain Semaphore Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      OBTAIN_SEMAPHORE_RESOURCE_FEATURE_COUNT            = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.ReleaseSemaphoreResourceImpl <em>Release Semaphore Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.ReleaseSemaphoreResourceImpl
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getReleaseSemaphoreResource()
   * @generated
   */
  int                      RELEASE_SEMAPHORE_RESOURCE                         = 2;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      RELEASE_SEMAPHORE_RESOURCE__ENABLED                = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      RELEASE_SEMAPHORE_RESOURCE__STATE                  = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      RELEASE_SEMAPHORE_RESOURCE__CONNECTOR_PREFERENCE   = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      RELEASE_SEMAPHORE_RESOURCE__NAME                   = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Semaphore Resource</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      RELEASE_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE     = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Semaphore Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      RELEASE_SEMAPHORE_RESOURCE__SEMAPHORE_NAME         = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      RELEASE_SEMAPHORE_RESOURCE__TIMEOUT                = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Release Semaphore Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      RELEASE_SEMAPHORE_RESOURCE_FEATURE_COUNT           = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.RemoteSemaphoreProviderImpl <em>Remote Semaphore Provider</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.RemoteSemaphoreProviderImpl
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getRemoteSemaphoreProvider()
   * @generated
   */
  int                      REMOTE_SEMAPHORE_PROVIDER                          = 3;

  /**
   * The feature id for the '<em><b>Host</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REMOTE_SEMAPHORE_PROVIDER__HOST                    = SEMAPHORE_PROVIDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REMOTE_SEMAPHORE_PROVIDER__PORT                    = SEMAPHORE_PROVIDER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Remote Semaphore Provider</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      REMOTE_SEMAPHORE_PROVIDER_FEATURE_COUNT            = SEMAPHORE_PROVIDER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreDefinitionImpl <em>Semaphore Definition</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreDefinitionImpl
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getSemaphoreDefinition()
   * @generated
   */
  int                      SEMAPHORE_DEFINITION                               = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_DEFINITION__NAME                         = 0;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_DEFINITION__COUNT                        = 1;

  /**
   * The number of structural features of the '<em>Semaphore Definition</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_DEFINITION_FEATURE_COUNT                 = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourceImpl <em>Semaphore Resource</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourceImpl
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getSemaphoreResource()
   * @generated
   */
  int                      SEMAPHORE_RESOURCE                                 = 6;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_RESOURCE__ENABLED                        = TypesPackage.NAMED_RESOURCE_DEFINITION__ENABLED;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_RESOURCE__STATE                          = TypesPackage.NAMED_RESOURCE_DEFINITION__STATE;

  /**
   * The feature id for the '<em><b>Connector Preference</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_RESOURCE__CONNECTOR_PREFERENCE           = TypesPackage.NAMED_RESOURCE_DEFINITION__CONNECTOR_PREFERENCE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_RESOURCE__NAME                           = TypesPackage.NAMED_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Provider</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_RESOURCE__PROVIDER                       = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Semaphore Resource</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int                      SEMAPHORE_RESOURCE_FEATURE_COUNT                   = TypesPackage.NAMED_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.semaphoreResource.LocalSemaphoreProvider <em>Local Semaphore Provider</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Semaphore Provider</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.LocalSemaphoreProvider
   * @generated
   */
  EClass getLocalSemaphoreProvider();

  /**
   * Returns the meta object for the containment reference list '{@link com.ms.qaTools.saturn.resources.semaphoreResource.LocalSemaphoreProvider#getSemaphores <em>Semaphores</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Semaphores</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.LocalSemaphoreProvider#getSemaphores()
   * @see #getLocalSemaphoreProvider()
   * @generated
   */
  EReference getLocalSemaphoreProvider_Semaphores();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource <em>Obtain Semaphore Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Obtain Semaphore Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource
   * @generated
   */
  EClass getObtainSemaphoreResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getSemaphoreResource <em>Semaphore Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Semaphore Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getSemaphoreResource()
   * @see #getObtainSemaphoreResource()
   * @generated
   */
  EReference getObtainSemaphoreResource_SemaphoreResource();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getSemaphoreName <em>Semaphore Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Semaphore Name</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getSemaphoreName()
   * @see #getObtainSemaphoreResource()
   * @generated
   */
  EAttribute getObtainSemaphoreResource_SemaphoreName();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#isReleaseAtEndOfScope <em>Release At End Of Scope</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Release At End Of Scope</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#isReleaseAtEndOfScope()
   * @see #getObtainSemaphoreResource()
   * @generated
   */
  EAttribute getObtainSemaphoreResource_ReleaseAtEndOfScope();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource#getTimeout()
   * @see #getObtainSemaphoreResource()
   * @generated
   */
  EAttribute getObtainSemaphoreResource_Timeout();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource <em>Release Semaphore Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Release Semaphore Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource
   * @generated
   */
  EClass getReleaseSemaphoreResource();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource#getSemaphoreResource <em>Semaphore Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Semaphore Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource#getSemaphoreResource()
   * @see #getReleaseSemaphoreResource()
   * @generated
   */
  EReference getReleaseSemaphoreResource_SemaphoreResource();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource#getSemaphoreName <em>Semaphore Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Semaphore Name</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource#getSemaphoreName()
   * @see #getReleaseSemaphoreResource()
   * @generated
   */
  EAttribute getReleaseSemaphoreResource_SemaphoreName();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource#getTimeout()
   * @see #getReleaseSemaphoreResource()
   * @generated
   */
  EAttribute getReleaseSemaphoreResource_Timeout();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.semaphoreResource.RemoteSemaphoreProvider <em>Remote Semaphore Provider</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Semaphore Provider</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.RemoteSemaphoreProvider
   * @generated
   */
  EClass getRemoteSemaphoreProvider();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.semaphoreResource.RemoteSemaphoreProvider#getHost <em>Host</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Host</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.RemoteSemaphoreProvider#getHost()
   * @see #getRemoteSemaphoreProvider()
   * @generated
   */
  EReference getRemoteSemaphoreProvider_Host();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.semaphoreResource.RemoteSemaphoreProvider#getPort <em>Port</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.RemoteSemaphoreProvider#getPort()
   * @see #getRemoteSemaphoreProvider()
   * @generated
   */
  EReference getRemoteSemaphoreProvider_Port();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition <em>Semaphore Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Semaphore Definition</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition
   * @generated
   */
  EClass getSemaphoreDefinition();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getName()
   * @see #getSemaphoreDefinition()
   * @generated
   */
  EReference getSemaphoreDefinition_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getCount <em>Count</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition#getCount()
   * @see #getSemaphoreDefinition()
   * @generated
   */
  EAttribute getSemaphoreDefinition_Count();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreProvider <em>Semaphore Provider</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Semaphore Provider</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreProvider
   * @generated
   */
  EClass getSemaphoreProvider();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResource <em>Semaphore Resource</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Semaphore Resource</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResource
   * @generated
   */
  EClass getSemaphoreResource();

  /**
   * Returns the meta object for the containment reference '
   * {@link com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResource#getProvider <em>Provider</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Provider</em>'.
   * @see com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResource#getProvider()
   * @see #getSemaphoreResource()
   * @generated
   */
  EReference getSemaphoreResource_Provider();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SemaphoreResourceFactory getSemaphoreResourceFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.LocalSemaphoreProviderImpl <em>Local Semaphore Provider</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.LocalSemaphoreProviderImpl
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getLocalSemaphoreProvider()
     * @generated
     */
    EClass     LOCAL_SEMAPHORE_PROVIDER                           = eINSTANCE.getLocalSemaphoreProvider();

    /**
     * The meta object literal for the '<em><b>Semaphores</b></em>' containment reference list feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference LOCAL_SEMAPHORE_PROVIDER__SEMAPHORES               = eINSTANCE.getLocalSemaphoreProvider_Semaphores();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.ObtainSemaphoreResourceImpl <em>Obtain Semaphore Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.ObtainSemaphoreResourceImpl
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getObtainSemaphoreResource()
     * @generated
     */
    EClass     OBTAIN_SEMAPHORE_RESOURCE                          = eINSTANCE.getObtainSemaphoreResource();

    /**
     * The meta object literal for the '<em><b>Semaphore Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE      = eINSTANCE.getObtainSemaphoreResource_SemaphoreResource();

    /**
     * The meta object literal for the '<em><b>Semaphore Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute OBTAIN_SEMAPHORE_RESOURCE__SEMAPHORE_NAME          = eINSTANCE.getObtainSemaphoreResource_SemaphoreName();

    /**
     * The meta object literal for the '<em><b>Release At End Of Scope</b></em>' attribute feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBTAIN_SEMAPHORE_RESOURCE__RELEASE_AT_END_OF_SCOPE = eINSTANCE.getObtainSemaphoreResource_ReleaseAtEndOfScope();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute OBTAIN_SEMAPHORE_RESOURCE__TIMEOUT                 = eINSTANCE.getObtainSemaphoreResource_Timeout();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.ReleaseSemaphoreResourceImpl <em>Release Semaphore Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.ReleaseSemaphoreResourceImpl
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getReleaseSemaphoreResource()
     * @generated
     */
    EClass     RELEASE_SEMAPHORE_RESOURCE                         = eINSTANCE.getReleaseSemaphoreResource();

    /**
     * The meta object literal for the '<em><b>Semaphore Resource</b></em>' containment reference feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference RELEASE_SEMAPHORE_RESOURCE__SEMAPHORE_RESOURCE     = eINSTANCE.getReleaseSemaphoreResource_SemaphoreResource();

    /**
     * The meta object literal for the '<em><b>Semaphore Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RELEASE_SEMAPHORE_RESOURCE__SEMAPHORE_NAME         = eINSTANCE.getReleaseSemaphoreResource_SemaphoreName();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute RELEASE_SEMAPHORE_RESOURCE__TIMEOUT                = eINSTANCE.getReleaseSemaphoreResource_Timeout();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.RemoteSemaphoreProviderImpl <em>Remote Semaphore Provider</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.RemoteSemaphoreProviderImpl
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getRemoteSemaphoreProvider()
     * @generated
     */
    EClass     REMOTE_SEMAPHORE_PROVIDER                          = eINSTANCE.getRemoteSemaphoreProvider();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REMOTE_SEMAPHORE_PROVIDER__HOST                    = eINSTANCE.getRemoteSemaphoreProvider_Host();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REMOTE_SEMAPHORE_PROVIDER__PORT                    = eINSTANCE.getRemoteSemaphoreProvider_Port();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreDefinitionImpl <em>Semaphore Definition</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreDefinitionImpl
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getSemaphoreDefinition()
     * @generated
     */
    EClass     SEMAPHORE_DEFINITION                               = eINSTANCE.getSemaphoreDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEMAPHORE_DEFINITION__NAME                         = eINSTANCE.getSemaphoreDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute SEMAPHORE_DEFINITION__COUNT                        = eINSTANCE.getSemaphoreDefinition_Count();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreProviderImpl <em>Semaphore Provider</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreProviderImpl
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getSemaphoreProvider()
     * @generated
     */
    EClass     SEMAPHORE_PROVIDER                                 = eINSTANCE.getSemaphoreProvider();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourceImpl <em>Semaphore Resource</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourceImpl
     * @see com.ms.qaTools.saturn.resources.semaphoreResource.impl.SemaphoreResourcePackageImpl#getSemaphoreResource()
     * @generated
     */
    EClass     SEMAPHORE_RESOURCE                                 = eINSTANCE.getSemaphoreResource();

    /**
     * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEMAPHORE_RESOURCE__PROVIDER                       = eINSTANCE.getSemaphoreResource_Provider();

  }

} // SemaphoreResourcePackage
