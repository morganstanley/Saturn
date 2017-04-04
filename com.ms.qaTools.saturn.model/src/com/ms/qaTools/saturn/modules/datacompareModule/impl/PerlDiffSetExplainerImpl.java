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
package com.ms.qaTools.saturn.modules.datacompareModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;
import com.ms.qaTools.saturn.modules.datacompareModule.PerlDiffSetExplainer;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Perl Diff Set Explainer</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PerlDiffSetExplainerImpl#getInitCode <em>Init Code</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PerlDiffSetExplainerImpl#getDiffCode <em>Diff Code</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PerlDiffSetExplainerImpl#getDestroyCode <em>Destroy Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerlDiffSetExplainerImpl extends AbstractDiffSetExplainerImpl implements PerlDiffSetExplainer
{
  /**
   * The cached value of the '{@link #getInitCode() <em>Init Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitCode()
   * @generated
   * @ordered
   */
  protected ComplexValue initCode;

  /**
   * The cached value of the '{@link #getDiffCode() <em>Diff Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDiffCode()
   * @generated
   * @ordered
   */
  protected ComplexValue diffCode;

  /**
   * The cached value of the '{@link #getDestroyCode() <em>Destroy Code</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDestroyCode()
   * @generated
   * @ordered
   */
  protected ComplexValue destroyCode;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PerlDiffSetExplainerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DatacompareModulePackage.Literals.PERL_DIFF_SET_EXPLAINER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getInitCode()
  {
    return initCode;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitCode(ComplexValue newInitCode, NotificationChain msgs)
  {
    ComplexValue oldInitCode = initCode;
    initCode = newInitCode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__INIT_CODE, oldInitCode, newInitCode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInitCode(ComplexValue newInitCode)
  {
    if (newInitCode != initCode)
    {
      NotificationChain msgs = null;
      if (initCode != null)
        msgs = ((InternalEObject)initCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__INIT_CODE, null, msgs);
      if (newInitCode != null)
        msgs = ((InternalEObject)newInitCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__INIT_CODE, null, msgs);
      msgs = basicSetInitCode(newInitCode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__INIT_CODE, newInitCode, newInitCode));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDiffCode()
  {
    return diffCode;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDiffCode(ComplexValue newDiffCode, NotificationChain msgs)
  {
    ComplexValue oldDiffCode = diffCode;
    diffCode = newDiffCode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DIFF_CODE, oldDiffCode, newDiffCode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDiffCode(ComplexValue newDiffCode)
  {
    if (newDiffCode != diffCode)
    {
      NotificationChain msgs = null;
      if (diffCode != null)
        msgs = ((InternalEObject)diffCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DIFF_CODE, null, msgs);
      if (newDiffCode != null)
        msgs = ((InternalEObject)newDiffCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DIFF_CODE, null, msgs);
      msgs = basicSetDiffCode(newDiffCode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DIFF_CODE, newDiffCode, newDiffCode));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getDestroyCode()
  {
    return destroyCode;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestroyCode(ComplexValue newDestroyCode, NotificationChain msgs)
  {
    ComplexValue oldDestroyCode = destroyCode;
    destroyCode = newDestroyCode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DESTROY_CODE, oldDestroyCode, newDestroyCode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDestroyCode(ComplexValue newDestroyCode)
  {
    if (newDestroyCode != destroyCode)
    {
      NotificationChain msgs = null;
      if (destroyCode != null)
        msgs = ((InternalEObject)destroyCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DESTROY_CODE, null, msgs);
      if (newDestroyCode != null)
        msgs = ((InternalEObject)newDestroyCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DESTROY_CODE, null, msgs);
      msgs = basicSetDestroyCode(newDestroyCode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DESTROY_CODE, newDestroyCode, newDestroyCode));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__INIT_CODE:
        return basicSetInitCode(null, msgs);
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DIFF_CODE:
        return basicSetDiffCode(null, msgs);
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DESTROY_CODE:
        return basicSetDestroyCode(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__INIT_CODE:
        return getInitCode();
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DIFF_CODE:
        return getDiffCode();
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DESTROY_CODE:
        return getDestroyCode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__INIT_CODE:
        setInitCode((ComplexValue)newValue);
        return;
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DIFF_CODE:
        setDiffCode((ComplexValue)newValue);
        return;
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DESTROY_CODE:
        setDestroyCode((ComplexValue)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__INIT_CODE:
        setInitCode((ComplexValue)null);
        return;
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DIFF_CODE:
        setDiffCode((ComplexValue)null);
        return;
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DESTROY_CODE:
        setDestroyCode((ComplexValue)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__INIT_CODE:
        return initCode != null;
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DIFF_CODE:
        return diffCode != null;
      case DatacompareModulePackage.PERL_DIFF_SET_EXPLAINER__DESTROY_CODE:
        return destroyCode != null;
    }
    return super.eIsSet(featureID);
  }

} // PerlDiffSetExplainerImpl
