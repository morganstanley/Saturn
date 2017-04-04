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
package com.ms.qaTools.saturn.resources.soapIOResource.util;

import com.ms.qaTools.saturn.resources.soapIOResource.*;
import com.ms.qaTools.saturn.types.DeviceResourceDefinition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ms.qaTools.saturn.resources.soapIOResource.AbstractTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.CPSTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.CpsResource;
import com.ms.qaTools.saturn.resources.soapIOResource.HTTPTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.MQTransport;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResource;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.resources.soapIOResource.TCPTransport;
import com.ms.qaTools.saturn.types.NamedResourceDefinition;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage
 * @generated
 */
public class SoapIOResourceSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static SoapIOResourcePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public SoapIOResourceSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SoapIOResourcePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SoapIOResourcePackage.ABSTRACT_TRANSPORT:
      {
        AbstractTransport abstractTransport = (AbstractTransport)theEObject;
        T result = caseAbstractTransport(abstractTransport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoapIOResourcePackage.CPS_RESOURCE:
      {
        CpsResource cpsResource = (CpsResource)theEObject;
        T result = caseCpsResource(cpsResource);
        if (result == null) result = caseDeviceResourceDefinition(cpsResource);
        if (result == null) result = caseNamedResourceDefinition(cpsResource);
        if (result == null) result = caseResourceDefinition(cpsResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoapIOResourcePackage.CPS_TRANSPORT:
      {
        CPSTransport cpsTransport = (CPSTransport)theEObject;
        T result = caseCPSTransport(cpsTransport);
        if (result == null) result = caseAbstractTransport(cpsTransport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoapIOResourcePackage.HTTP_TRANSPORT:
      {
        HTTPTransport httpTransport = (HTTPTransport)theEObject;
        T result = caseHTTPTransport(httpTransport);
        if (result == null) result = caseAbstractTransport(httpTransport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoapIOResourcePackage.MQ_TRANSPORT:
      {
        MQTransport mqTransport = (MQTransport)theEObject;
        T result = caseMQTransport(mqTransport);
        if (result == null) result = caseAbstractTransport(mqTransport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoapIOResourcePackage.PTCP_TRANSPORT:
      {
        PTCPTransport ptcpTransport = (PTCPTransport)theEObject;
        T result = casePTCPTransport(ptcpTransport);
        if (result == null) result = caseAbstractTransport(ptcpTransport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoapIOResourcePackage.SOAP_IO_RESOURCE:
      {
        SoapIOResource soapIOResource = (SoapIOResource)theEObject;
        T result = caseSoapIOResource(soapIOResource);
        if (result == null) result = caseDeviceResourceDefinition(soapIOResource);
        if (result == null) result = caseNamedResourceDefinition(soapIOResource);
        if (result == null) result = caseResourceDefinition(soapIOResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SoapIOResourcePackage.TCP_TRANSPORT:
      {
        TCPTransport tcpTransport = (TCPTransport)theEObject;
        T result = caseTCPTransport(tcpTransport);
        if (result == null) result = caseAbstractTransport(tcpTransport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Transport</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Transport</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractTransport(AbstractTransport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cps Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cps Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpsResource(CpsResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CPS Transport</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CPS Transport</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCPSTransport(CPSTransport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HTTP Transport</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HTTP Transport</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHTTPTransport(HTTPTransport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MQ Transport</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MQ Transport</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMQTransport(MQTransport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PTCP Transport</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PTCP Transport</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePTCPTransport(PTCPTransport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Soap IO Resource</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Soap IO Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSoapIOResource(SoapIOResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TCP Transport</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TCP Transport</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTCPTransport(TCPTransport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Definition</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceDefinition(ResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Resource Definition</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   * 
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedResourceDefinition(NamedResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Device Resource Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Device Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviceResourceDefinition(DeviceResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
   * anyway. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} // SoapIOResourceSwitch
