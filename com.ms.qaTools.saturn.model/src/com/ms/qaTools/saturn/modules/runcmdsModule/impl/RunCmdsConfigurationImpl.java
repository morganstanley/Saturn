/**
 * COPYRIGHT NOTICE AND DISCLAIMER
 *  
 * Copyright © 2009, Contributor
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License, version 3, as published by the Free Software Foundation.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License, version 3 for more details.
 * You should have received a copy of the GNU Lesser General Public License, version 3, along with this program; if not, see http://www.gnu.org/licenses/ or write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * THE FOLLOWING DISCLAIMER APPLIES TO ALL SOFTWARE CODE AND OTHER MATERIALS CONTRIBUTED IN CONNECTION WITH THIS PROGRAM:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER AS WELL AS ANY OTHER LICENSE TERMS THAT MAY APPLY.
 */
package com.ms.qaTools.saturn.modules.runcmdsModule.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ms.qaTools.saturn.modules.runcmdsModule.CheckStrActionEnum;
import com.ms.qaTools.saturn.modules.runcmdsModule.Command;
import com.ms.qaTools.saturn.modules.runcmdsModule.RunCmdsConfiguration;
import com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModulePackage;
import com.ms.qaTools.saturn.types.InterpretersEnum;
import com.ms.qaTools.saturn.values.ComplexValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Run Cmds Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.RunCmdsConfigurationImpl#getCheckStr <em>Check Str</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.RunCmdsConfigurationImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.RunCmdsConfigurationImpl#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.runcmdsModule.impl.RunCmdsConfigurationImpl#getCheckStrAction <em>Check Str Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunCmdsConfigurationImpl extends EObjectImpl implements RunCmdsConfiguration
{
  /**
   * The cached value of the '{@link #getCheckStr() <em>Check Str</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckStr()
   * @generated
   * @ordered
   */
  protected ComplexValue                    checkStr;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command>                  commands;

  /**
   * The default value of the '{@link #getInterpreter() <em>Interpreter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInterpreter()
   * @generated
   * @ordered
   */
  protected static final InterpretersEnum   INTERPRETER_EDEFAULT      = InterpretersEnum.SHELL;

  /**
   * The cached value of the '{@link #getInterpreter() <em>Interpreter</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #getInterpreter()
   * @generated
   * @ordered
   */
  protected InterpretersEnum                interpreter               = INTERPRETER_EDEFAULT;

  /**
   * This is true if the Interpreter attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                         interpreterESet;

  /**
   * The default value of the '{@link #getCheckStrAction() <em>Check Str Action</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getCheckStrAction()
   * @generated
   * @ordered
   */
  protected static final CheckStrActionEnum CHECK_STR_ACTION_EDEFAULT = CheckStrActionEnum.NONE;

  /**
   * The cached value of the '{@link #getCheckStrAction() <em>Check Str Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckStrAction()
   * @generated
   * @ordered
   */
  protected CheckStrActionEnum              checkStrAction            = CHECK_STR_ACTION_EDEFAULT;

  /**
   * This is true if the Check Str Action attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean                         checkStrActionESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected RunCmdsConfigurationImpl()
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
    return RuncmdsModulePackage.Literals.RUN_CMDS_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue getCheckStr()
  {
    return checkStr;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCheckStr(ComplexValue newCheckStr, NotificationChain msgs)
  {
    ComplexValue oldCheckStr = checkStr;
    checkStr = newCheckStr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR, oldCheckStr, newCheckStr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCheckStr(ComplexValue newCheckStr)
  {
    if (newCheckStr != checkStr)
    {
      NotificationChain msgs = null;
      if (checkStr != null)
        msgs = ((InternalEObject)checkStr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR, null, msgs);
      if (newCheckStr != null)
        msgs = ((InternalEObject)newCheckStr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR, null, msgs);
      msgs = basicSetCheckStr(newCheckStr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR, newCheckStr, newCheckStr));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<Command>(Command.class, this, RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public CheckStrActionEnum getCheckStrAction()
  {
    return checkStrAction;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setCheckStrAction(CheckStrActionEnum newCheckStrAction)
  {
    CheckStrActionEnum oldCheckStrAction = checkStrAction;
    checkStrAction = newCheckStrAction == null ? CHECK_STR_ACTION_EDEFAULT : newCheckStrAction;
    boolean oldCheckStrActionESet = checkStrActionESet;
    checkStrActionESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR_ACTION, oldCheckStrAction, checkStrAction, !oldCheckStrActionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetCheckStrAction()
  {
    CheckStrActionEnum oldCheckStrAction = checkStrAction;
    boolean oldCheckStrActionESet = checkStrActionESet;
    checkStrAction = CHECK_STR_ACTION_EDEFAULT;
    checkStrActionESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR_ACTION, oldCheckStrAction, CHECK_STR_ACTION_EDEFAULT, oldCheckStrActionESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetCheckStrAction()
  {
    return checkStrActionESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public InterpretersEnum getInterpreter()
  {
    return interpreter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInterpreter(InterpretersEnum newInterpreter)
  {
    InterpretersEnum oldInterpreter = interpreter;
    interpreter = newInterpreter == null ? INTERPRETER_EDEFAULT : newInterpreter;
    boolean oldInterpreterESet = interpreterESet;
    interpreterESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__INTERPRETER, oldInterpreter, interpreter, !oldInterpreterESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetInterpreter()
  {
    InterpretersEnum oldInterpreter = interpreter;
    boolean oldInterpreterESet = interpreterESet;
    interpreter = INTERPRETER_EDEFAULT;
    interpreterESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__INTERPRETER, oldInterpreter, INTERPRETER_EDEFAULT, oldInterpreterESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetInterpreter()
  {
    return interpreterESet;
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
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR:
        return basicSetCheckStr(null, msgs);
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR:
        return getCheckStr();
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__COMMANDS:
        return getCommands();
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__INTERPRETER:
        return getInterpreter();
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR_ACTION:
        return getCheckStrAction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR:
        setCheckStr((ComplexValue)newValue);
        return;
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
        return;
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__INTERPRETER:
        setInterpreter((InterpretersEnum)newValue);
        return;
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR_ACTION:
        setCheckStrAction((CheckStrActionEnum)newValue);
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
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR:
        setCheckStr((ComplexValue)null);
        return;
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__COMMANDS:
        getCommands().clear();
        return;
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__INTERPRETER:
        unsetInterpreter();
        return;
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR_ACTION:
        unsetCheckStrAction();
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
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR:
        return checkStr != null;
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__COMMANDS:
        return commands != null && !commands.isEmpty();
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__INTERPRETER:
        return isSetInterpreter();
      case RuncmdsModulePackage.RUN_CMDS_CONFIGURATION__CHECK_STR_ACTION:
        return isSetCheckStrAction();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (interpreter: ");
    if (interpreterESet) result.append(interpreter); else result.append("<unset>");
    result.append(", checkStrAction: ");
    if (checkStrActionESet) result.append(checkStrAction); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // RunCmdsConfigurationImpl
