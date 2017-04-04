package com.ms.qaTools.saturn.modules.datacompareModule.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;
import com.ms.qaTools.saturn.modules.datacompareModule.Page;
import com.ms.qaTools.saturn.modules.datacompareModule.Pages;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pages</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl#getDifferent <em>Different</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl#getExplained <em>Explained</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl#getInLeftOnly <em>In Left Only</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl#getInRightOnly <em>In Right Only</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl#getIdentical <em>Identical</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.datacompareModule.impl.PagesImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PagesImpl extends EObjectImpl implements Pages
{
  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected Page summary;

  /**
   * The cached value of the '{@link #getDifferent() <em>Different</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDifferent()
   * @generated
   * @ordered
   */
  protected Page different;

  /**
   * The cached value of the '{@link #getExplained() <em>Explained</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExplained()
   * @generated
   * @ordered
   */
  protected Page explained;

  /**
   * The cached value of the '{@link #getInLeftOnly() <em>In Left Only</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getInLeftOnly()
   * @generated
   * @ordered
   */
  protected Page inLeftOnly;

  /**
   * The cached value of the '{@link #getInRightOnly() <em>In Right Only</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getInRightOnly()
   * @generated
   * @ordered
   */
  protected Page inRightOnly;

  /**
   * The cached value of the '{@link #getIdentical() <em>Identical</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentical()
   * @generated
   * @ordered
   */
  protected Page identical;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Page left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Page right;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PagesImpl()
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
    return DatacompareModulePackage.Literals.PAGES;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Page getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSummary(Page newSummary, NotificationChain msgs)
  {
    Page oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__SUMMARY, oldSummary, newSummary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(Page newSummary)
  {
    if (newSummary != summary)
    {
      NotificationChain msgs = null;
      if (summary != null)
        msgs = ((InternalEObject)summary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__SUMMARY, null, msgs);
      if (newSummary != null)
        msgs = ((InternalEObject)newSummary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__SUMMARY, null, msgs);
      msgs = basicSetSummary(newSummary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__SUMMARY, newSummary, newSummary));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Page getDifferent()
  {
    return different;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDifferent(Page newDifferent, NotificationChain msgs)
  {
    Page oldDifferent = different;
    different = newDifferent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__DIFFERENT, oldDifferent, newDifferent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setDifferent(Page newDifferent)
  {
    if (newDifferent != different)
    {
      NotificationChain msgs = null;
      if (different != null)
        msgs = ((InternalEObject)different).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__DIFFERENT, null, msgs);
      if (newDifferent != null)
        msgs = ((InternalEObject)newDifferent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__DIFFERENT, null, msgs);
      msgs = basicSetDifferent(newDifferent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__DIFFERENT, newDifferent, newDifferent));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Page getExplained()
  {
    return explained;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExplained(Page newExplained, NotificationChain msgs)
  {
    Page oldExplained = explained;
    explained = newExplained;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__EXPLAINED, oldExplained, newExplained);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setExplained(Page newExplained)
  {
    if (newExplained != explained)
    {
      NotificationChain msgs = null;
      if (explained != null)
        msgs = ((InternalEObject)explained).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__EXPLAINED, null, msgs);
      if (newExplained != null)
        msgs = ((InternalEObject)newExplained).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__EXPLAINED, null, msgs);
      msgs = basicSetExplained(newExplained, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__EXPLAINED, newExplained, newExplained));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Page getInLeftOnly()
  {
    return inLeftOnly;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInLeftOnly(Page newInLeftOnly, NotificationChain msgs)
  {
    Page oldInLeftOnly = inLeftOnly;
    inLeftOnly = newInLeftOnly;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__IN_LEFT_ONLY, oldInLeftOnly, newInLeftOnly);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInLeftOnly(Page newInLeftOnly)
  {
    if (newInLeftOnly != inLeftOnly)
    {
      NotificationChain msgs = null;
      if (inLeftOnly != null)
        msgs = ((InternalEObject)inLeftOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__IN_LEFT_ONLY, null, msgs);
      if (newInLeftOnly != null)
        msgs = ((InternalEObject)newInLeftOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__IN_LEFT_ONLY, null, msgs);
      msgs = basicSetInLeftOnly(newInLeftOnly, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__IN_LEFT_ONLY, newInLeftOnly, newInLeftOnly));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Page getInRightOnly()
  {
    return inRightOnly;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInRightOnly(Page newInRightOnly, NotificationChain msgs)
  {
    Page oldInRightOnly = inRightOnly;
    inRightOnly = newInRightOnly;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__IN_RIGHT_ONLY, oldInRightOnly, newInRightOnly);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInRightOnly(Page newInRightOnly)
  {
    if (newInRightOnly != inRightOnly)
    {
      NotificationChain msgs = null;
      if (inRightOnly != null)
        msgs = ((InternalEObject)inRightOnly).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__IN_RIGHT_ONLY, null, msgs);
      if (newInRightOnly != null)
        msgs = ((InternalEObject)newInRightOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__IN_RIGHT_ONLY, null, msgs);
      msgs = basicSetInRightOnly(newInRightOnly, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__IN_RIGHT_ONLY, newInRightOnly, newInRightOnly));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Page getIdentical()
  {
    return identical;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentical(Page newIdentical, NotificationChain msgs)
  {
    Page oldIdentical = identical;
    identical = newIdentical;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__IDENTICAL, oldIdentical, newIdentical);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setIdentical(Page newIdentical)
  {
    if (newIdentical != identical)
    {
      NotificationChain msgs = null;
      if (identical != null)
        msgs = ((InternalEObject)identical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__IDENTICAL, null, msgs);
      if (newIdentical != null)
        msgs = ((InternalEObject)newIdentical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__IDENTICAL, null, msgs);
      msgs = basicSetIdentical(newIdentical, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__IDENTICAL, newIdentical, newIdentical));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Page getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Page newLeft, NotificationChain msgs)
  {
    Page oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Page newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public Page getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Page newRight, NotificationChain msgs)
  {
    Page oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Page newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatacompareModulePackage.PAGES__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DatacompareModulePackage.PAGES__RIGHT, newRight, newRight));
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
      case DatacompareModulePackage.PAGES__SUMMARY:
        return basicSetSummary(null, msgs);
      case DatacompareModulePackage.PAGES__DIFFERENT:
        return basicSetDifferent(null, msgs);
      case DatacompareModulePackage.PAGES__EXPLAINED:
        return basicSetExplained(null, msgs);
      case DatacompareModulePackage.PAGES__IN_LEFT_ONLY:
        return basicSetInLeftOnly(null, msgs);
      case DatacompareModulePackage.PAGES__IN_RIGHT_ONLY:
        return basicSetInRightOnly(null, msgs);
      case DatacompareModulePackage.PAGES__IDENTICAL:
        return basicSetIdentical(null, msgs);
      case DatacompareModulePackage.PAGES__LEFT:
        return basicSetLeft(null, msgs);
      case DatacompareModulePackage.PAGES__RIGHT:
        return basicSetRight(null, msgs);
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
      case DatacompareModulePackage.PAGES__SUMMARY:
        return getSummary();
      case DatacompareModulePackage.PAGES__DIFFERENT:
        return getDifferent();
      case DatacompareModulePackage.PAGES__EXPLAINED:
        return getExplained();
      case DatacompareModulePackage.PAGES__IN_LEFT_ONLY:
        return getInLeftOnly();
      case DatacompareModulePackage.PAGES__IN_RIGHT_ONLY:
        return getInRightOnly();
      case DatacompareModulePackage.PAGES__IDENTICAL:
        return getIdentical();
      case DatacompareModulePackage.PAGES__LEFT:
        return getLeft();
      case DatacompareModulePackage.PAGES__RIGHT:
        return getRight();
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
      case DatacompareModulePackage.PAGES__SUMMARY:
        setSummary((Page)newValue);
        return;
      case DatacompareModulePackage.PAGES__DIFFERENT:
        setDifferent((Page)newValue);
        return;
      case DatacompareModulePackage.PAGES__EXPLAINED:
        setExplained((Page)newValue);
        return;
      case DatacompareModulePackage.PAGES__IN_LEFT_ONLY:
        setInLeftOnly((Page)newValue);
        return;
      case DatacompareModulePackage.PAGES__IN_RIGHT_ONLY:
        setInRightOnly((Page)newValue);
        return;
      case DatacompareModulePackage.PAGES__IDENTICAL:
        setIdentical((Page)newValue);
        return;
      case DatacompareModulePackage.PAGES__LEFT:
        setLeft((Page)newValue);
        return;
      case DatacompareModulePackage.PAGES__RIGHT:
        setRight((Page)newValue);
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
      case DatacompareModulePackage.PAGES__SUMMARY:
        setSummary((Page)null);
        return;
      case DatacompareModulePackage.PAGES__DIFFERENT:
        setDifferent((Page)null);
        return;
      case DatacompareModulePackage.PAGES__EXPLAINED:
        setExplained((Page)null);
        return;
      case DatacompareModulePackage.PAGES__IN_LEFT_ONLY:
        setInLeftOnly((Page)null);
        return;
      case DatacompareModulePackage.PAGES__IN_RIGHT_ONLY:
        setInRightOnly((Page)null);
        return;
      case DatacompareModulePackage.PAGES__IDENTICAL:
        setIdentical((Page)null);
        return;
      case DatacompareModulePackage.PAGES__LEFT:
        setLeft((Page)null);
        return;
      case DatacompareModulePackage.PAGES__RIGHT:
        setRight((Page)null);
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
      case DatacompareModulePackage.PAGES__SUMMARY:
        return summary != null;
      case DatacompareModulePackage.PAGES__DIFFERENT:
        return different != null;
      case DatacompareModulePackage.PAGES__EXPLAINED:
        return explained != null;
      case DatacompareModulePackage.PAGES__IN_LEFT_ONLY:
        return inLeftOnly != null;
      case DatacompareModulePackage.PAGES__IN_RIGHT_ONLY:
        return inRightOnly != null;
      case DatacompareModulePackage.PAGES__IDENTICAL:
        return identical != null;
      case DatacompareModulePackage.PAGES__LEFT:
        return left != null;
      case DatacompareModulePackage.PAGES__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} // PagesImpl
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
