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
package com.ms.qaTools.saturn.resources.semaphoreResource.impl;

import com.ms.qaTools.saturn.resources.semaphoreResource.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ms.qaTools.saturn.resources.semaphoreResource.LocalSemaphoreProvider;
import com.ms.qaTools.saturn.resources.semaphoreResource.ObtainSemaphoreResource;
import com.ms.qaTools.saturn.resources.semaphoreResource.ReleaseSemaphoreResource;
import com.ms.qaTools.saturn.resources.semaphoreResource.RemoteSemaphoreProvider;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreDefinition;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreProvider;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResource;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourceFactory;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class SemaphoreResourceFactoryImpl extends EFactoryImpl implements SemaphoreResourceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static SemaphoreResourceFactory init()
  {
    try
    {
      SemaphoreResourceFactory theSemaphoreResourceFactory = (SemaphoreResourceFactory)EPackage.Registry.INSTANCE.getEFactory(SemaphoreResourcePackage.eNS_URI);
      if (theSemaphoreResourceFactory != null)
      {
        return theSemaphoreResourceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SemaphoreResourceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SemaphoreResourceFactoryImpl()
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
      case SemaphoreResourcePackage.LOCAL_SEMAPHORE_PROVIDER: return createLocalSemaphoreProvider();
      case SemaphoreResourcePackage.OBTAIN_SEMAPHORE_RESOURCE: return createObtainSemaphoreResource();
      case SemaphoreResourcePackage.RELEASE_SEMAPHORE_RESOURCE: return createReleaseSemaphoreResource();
      case SemaphoreResourcePackage.REMOTE_SEMAPHORE_PROVIDER: return createRemoteSemaphoreProvider();
      case SemaphoreResourcePackage.SEMAPHORE_DEFINITION: return createSemaphoreDefinition();
      case SemaphoreResourcePackage.SEMAPHORE_PROVIDER: return createSemaphoreProvider();
      case SemaphoreResourcePackage.SEMAPHORE_RESOURCE: return createSemaphoreResource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public LocalSemaphoreProvider createLocalSemaphoreProvider()
  {
    LocalSemaphoreProviderImpl localSemaphoreProvider = new LocalSemaphoreProviderImpl();
    return localSemaphoreProvider;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ObtainSemaphoreResource createObtainSemaphoreResource()
  {
    ObtainSemaphoreResourceImpl obtainSemaphoreResource = new ObtainSemaphoreResourceImpl();
    return obtainSemaphoreResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ReleaseSemaphoreResource createReleaseSemaphoreResource()
  {
    ReleaseSemaphoreResourceImpl releaseSemaphoreResource = new ReleaseSemaphoreResourceImpl();
    return releaseSemaphoreResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public RemoteSemaphoreProvider createRemoteSemaphoreProvider()
  {
    RemoteSemaphoreProviderImpl remoteSemaphoreProvider = new RemoteSemaphoreProviderImpl();
    return remoteSemaphoreProvider;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SemaphoreDefinition createSemaphoreDefinition()
  {
    SemaphoreDefinitionImpl semaphoreDefinition = new SemaphoreDefinitionImpl();
    return semaphoreDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SemaphoreProvider createSemaphoreProvider()
  {
    SemaphoreProviderImpl semaphoreProvider = new SemaphoreProviderImpl();
    return semaphoreProvider;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SemaphoreResource createSemaphoreResource()
  {
    SemaphoreResourceImpl semaphoreResource = new SemaphoreResourceImpl();
    return semaphoreResource;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SemaphoreResourcePackage getSemaphoreResourcePackage()
  {
    return (SemaphoreResourcePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SemaphoreResourcePackage getPackage()
  {
    return SemaphoreResourcePackage.eINSTANCE;
  }

} // SemaphoreResourceFactoryImpl
