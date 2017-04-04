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
package com.ms.qaTools.saturn.modules.XSplitModule.impl;

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

import com.ms.qaTools.saturn.modules.XSplitModule.XPath;
import com.ms.qaTools.saturn.modules.XSplitModule.XSplitConfiguration;
import com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage;
import com.ms.qaTools.saturn.types.ResourceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>XSplit Configuration</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl#getXMLFile <em>XML File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl#getXPaths <em>XPaths</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl#getConfigFile <em>Config File</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl#isClearOutputDirectory <em>Clear Output Directory</em>}</li>
 *   <li>{@link com.ms.qaTools.saturn.modules.XSplitModule.impl.XSplitConfigurationImpl#isGzip <em>Gzip</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XSplitConfigurationImpl extends EObjectImpl implements XSplitConfiguration
{
  /**
   * The cached value of the '{@link #getXMLFile() <em>XML File</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   xMLFile;

  /**
   * The cached value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOutputDirectory()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   outputDirectory;

  /**
   * The cached value of the '{@link #getXPaths() <em>XPaths</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXPaths()
   * @generated
   * @ordered
   */
  protected EList<XPath>         xPaths;

  /**
   * The cached value of the '{@link #getConfigFile() <em>Config File</em>}' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getConfigFile()
   * @generated
   * @ordered
   */
  protected ResourceDefinition   configFile;

  /**
   * The default value of the '{@link #isClearOutputDirectory() <em>Clear Output Directory</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isClearOutputDirectory()
   * @generated
   * @ordered
   */
  protected static final boolean CLEAR_OUTPUT_DIRECTORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClearOutputDirectory() <em>Clear Output Directory</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isClearOutputDirectory()
   * @generated
   * @ordered
   */
  protected boolean              clearOutputDirectory            = CLEAR_OUTPUT_DIRECTORY_EDEFAULT;

  /**
   * This is true if the Clear Output Directory attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              clearOutputDirectoryESet;

  /**
   * The default value of the '{@link #isGzip() <em>Gzip</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isGzip()
   * @generated
   * @ordered
   */
  protected static final boolean GZIP_EDEFAULT                   = true;

  /**
   * The cached value of the '{@link #isGzip() <em>Gzip</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isGzip()
   * @generated
   * @ordered
   */
  protected boolean              gzip                            = GZIP_EDEFAULT;

  /**
   * This is true if the Gzip attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean              gzipESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected XSplitConfigurationImpl()
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
    return XSplitModulePackage.Literals.XSPLIT_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getXMLFile()
  {
    return xMLFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXMLFile(ResourceDefinition newXMLFile, NotificationChain msgs)
  {
    ResourceDefinition oldXMLFile = xMLFile;
    xMLFile = newXMLFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSplitModulePackage.XSPLIT_CONFIGURATION__XML_FILE, oldXMLFile, newXMLFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setXMLFile(ResourceDefinition newXMLFile)
  {
    if (newXMLFile != xMLFile)
    {
      NotificationChain msgs = null;
      if (xMLFile != null)
        msgs = ((InternalEObject)xMLFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSplitModulePackage.XSPLIT_CONFIGURATION__XML_FILE, null, msgs);
      if (newXMLFile != null)
        msgs = ((InternalEObject)newXMLFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSplitModulePackage.XSPLIT_CONFIGURATION__XML_FILE, null, msgs);
      msgs = basicSetXMLFile(newXMLFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSplitModulePackage.XSPLIT_CONFIGURATION__XML_FILE, newXMLFile, newXMLFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getOutputDirectory()
  {
    return outputDirectory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputDirectory(ResourceDefinition newOutputDirectory, NotificationChain msgs)
  {
    ResourceDefinition oldOutputDirectory = outputDirectory;
    outputDirectory = newOutputDirectory;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSplitModulePackage.XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY, oldOutputDirectory, newOutputDirectory);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setOutputDirectory(ResourceDefinition newOutputDirectory)
  {
    if (newOutputDirectory != outputDirectory)
    {
      NotificationChain msgs = null;
      if (outputDirectory != null)
        msgs = ((InternalEObject)outputDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSplitModulePackage.XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY, null, msgs);
      if (newOutputDirectory != null)
        msgs = ((InternalEObject)newOutputDirectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSplitModulePackage.XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY, null, msgs);
      msgs = basicSetOutputDirectory(newOutputDirectory, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSplitModulePackage.XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY, newOutputDirectory, newOutputDirectory));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EList<XPath> getXPaths()
  {
    if (xPaths == null)
    {
      xPaths = new EObjectContainmentEList<XPath>(XPath.class, this, XSplitModulePackage.XSPLIT_CONFIGURATION__XPATHS);
    }
    return xPaths;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public ResourceDefinition getConfigFile()
  {
    return configFile;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfigFile(ResourceDefinition newConfigFile, NotificationChain msgs)
  {
    ResourceDefinition oldConfigFile = configFile;
    configFile = newConfigFile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XSplitModulePackage.XSPLIT_CONFIGURATION__CONFIG_FILE, oldConfigFile, newConfigFile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setConfigFile(ResourceDefinition newConfigFile)
  {
    if (newConfigFile != configFile)
    {
      NotificationChain msgs = null;
      if (configFile != null)
        msgs = ((InternalEObject)configFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XSplitModulePackage.XSPLIT_CONFIGURATION__CONFIG_FILE, null, msgs);
      if (newConfigFile != null)
        msgs = ((InternalEObject)newConfigFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XSplitModulePackage.XSPLIT_CONFIGURATION__CONFIG_FILE, null, msgs);
      msgs = basicSetConfigFile(newConfigFile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSplitModulePackage.XSPLIT_CONFIGURATION__CONFIG_FILE, newConfigFile, newConfigFile));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isClearOutputDirectory()
  {
    return clearOutputDirectory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setClearOutputDirectory(boolean newClearOutputDirectory)
  {
    boolean oldClearOutputDirectory = clearOutputDirectory;
    clearOutputDirectory = newClearOutputDirectory;
    boolean oldClearOutputDirectoryESet = clearOutputDirectoryESet;
    clearOutputDirectoryESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSplitModulePackage.XSPLIT_CONFIGURATION__CLEAR_OUTPUT_DIRECTORY, oldClearOutputDirectory, clearOutputDirectory, !oldClearOutputDirectoryESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetClearOutputDirectory()
  {
    boolean oldClearOutputDirectory = clearOutputDirectory;
    boolean oldClearOutputDirectoryESet = clearOutputDirectoryESet;
    clearOutputDirectory = CLEAR_OUTPUT_DIRECTORY_EDEFAULT;
    clearOutputDirectoryESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XSplitModulePackage.XSPLIT_CONFIGURATION__CLEAR_OUTPUT_DIRECTORY, oldClearOutputDirectory, CLEAR_OUTPUT_DIRECTORY_EDEFAULT, oldClearOutputDirectoryESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetClearOutputDirectory()
  {
    return clearOutputDirectoryESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isGzip()
  {
    return gzip;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setGzip(boolean newGzip)
  {
    boolean oldGzip = gzip;
    gzip = newGzip;
    boolean oldGzipESet = gzipESet;
    gzipESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XSplitModulePackage.XSPLIT_CONFIGURATION__GZIP, oldGzip, gzip, !oldGzipESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetGzip()
  {
    boolean oldGzip = gzip;
    boolean oldGzipESet = gzipESet;
    gzip = GZIP_EDEFAULT;
    gzipESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, XSplitModulePackage.XSPLIT_CONFIGURATION__GZIP, oldGzip, GZIP_EDEFAULT, oldGzipESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetGzip()
  {
    return gzipESet;
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
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XML_FILE:
        return basicSetXMLFile(null, msgs);
      case XSplitModulePackage.XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY:
        return basicSetOutputDirectory(null, msgs);
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XPATHS:
        return ((InternalEList<?>)getXPaths()).basicRemove(otherEnd, msgs);
      case XSplitModulePackage.XSPLIT_CONFIGURATION__CONFIG_FILE:
        return basicSetConfigFile(null, msgs);
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
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XML_FILE:
        return getXMLFile();
      case XSplitModulePackage.XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY:
        return getOutputDirectory();
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XPATHS:
        return getXPaths();
      case XSplitModulePackage.XSPLIT_CONFIGURATION__CONFIG_FILE:
        return getConfigFile();
      case XSplitModulePackage.XSPLIT_CONFIGURATION__CLEAR_OUTPUT_DIRECTORY:
        return isClearOutputDirectory();
      case XSplitModulePackage.XSPLIT_CONFIGURATION__GZIP:
        return isGzip();
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
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XML_FILE:
        setXMLFile((ResourceDefinition)newValue);
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY:
        setOutputDirectory((ResourceDefinition)newValue);
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XPATHS:
        getXPaths().clear();
        getXPaths().addAll((Collection<? extends XPath>)newValue);
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__CONFIG_FILE:
        setConfigFile((ResourceDefinition)newValue);
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__CLEAR_OUTPUT_DIRECTORY:
        setClearOutputDirectory((Boolean)newValue);
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__GZIP:
        setGzip((Boolean)newValue);
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
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XML_FILE:
        setXMLFile((ResourceDefinition)null);
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY:
        setOutputDirectory((ResourceDefinition)null);
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XPATHS:
        getXPaths().clear();
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__CONFIG_FILE:
        setConfigFile((ResourceDefinition)null);
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__CLEAR_OUTPUT_DIRECTORY:
        unsetClearOutputDirectory();
        return;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__GZIP:
        unsetGzip();
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
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XML_FILE:
        return xMLFile != null;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__OUTPUT_DIRECTORY:
        return outputDirectory != null;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__XPATHS:
        return xPaths != null && !xPaths.isEmpty();
      case XSplitModulePackage.XSPLIT_CONFIGURATION__CONFIG_FILE:
        return configFile != null;
      case XSplitModulePackage.XSPLIT_CONFIGURATION__CLEAR_OUTPUT_DIRECTORY:
        return isSetClearOutputDirectory();
      case XSplitModulePackage.XSPLIT_CONFIGURATION__GZIP:
        return isSetGzip();
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
    result.append(" (clearOutputDirectory: ");
    if (clearOutputDirectoryESet) result.append(clearOutputDirectory); else result.append("<unset>");
    result.append(", gzip: ");
    if (gzipESet) result.append(gzip); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // XSplitConfigurationImpl
