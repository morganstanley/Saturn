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
package com.ms.qaTools.saturn.exception;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.exception.ExceptionFactory
 * @model kind="package"
 *        annotation="http://www.ms.com/2011/tdo-qa-tools/rcs author='$Author$' change='$Change$' file='$File$' id='$Id$' revision='$Revision$' timestamp='$DateTime$'"
 * @generated
 */
public interface ExceptionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNAME                                     = "exception";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_URI                                   = "http://www.ms.com/2009/Saturn/Exception";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String           eNS_PREFIX                                = "exception";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  ExceptionPackage eINSTANCE                                 = com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.TraceableExceptionImpl <em>Traceable Exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.TraceableExceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getTraceableException()
   * @generated
   */
  int              TRACEABLE_EXCEPTION                       = 11;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              TRACEABLE_EXCEPTION__MESSAGE              = 0;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              TRACEABLE_EXCEPTION__EXCEPTION            = 1;

  /**
   * The number of structural features of the '<em>Traceable Exception</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              TRACEABLE_EXCEPTION_FEATURE_COUNT         = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.CompareExceptionImpl <em>Compare Exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.CompareExceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getCompareException()
   * @generated
   */
  int              COMPARE_EXCEPTION                         = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              COMPARE_EXCEPTION__MESSAGE                = TRACEABLE_EXCEPTION__MESSAGE;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              COMPARE_EXCEPTION__EXCEPTION              = TRACEABLE_EXCEPTION__EXCEPTION;

  /**
   * The number of structural features of the '<em>Compare Exception</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              COMPARE_EXCEPTION_FEATURE_COUNT           = TRACEABLE_EXCEPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.CompareInitExceptionImpl <em>Compare Init Exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.CompareInitExceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getCompareInitException()
   * @generated
   */
  int              COMPARE_INIT_EXCEPTION                    = 1;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              COMPARE_INIT_EXCEPTION__MESSAGE           = COMPARE_EXCEPTION__MESSAGE;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              COMPARE_INIT_EXCEPTION__EXCEPTION         = COMPARE_EXCEPTION__EXCEPTION;

  /**
   * The number of structural features of the '<em>Compare Init Exception</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              COMPARE_INIT_EXCEPTION_FEATURE_COUNT      = COMPARE_EXCEPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.DocumentRootImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getDocumentRoot()
   * @generated
   */
  int              DOCUMENT_ROOT                             = 2;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__MIXED                      = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__XMLNS_PREFIX_MAP           = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__XSI_SCHEMA_LOCATION        = 2;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT__EXCEPTION                  = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              DOCUMENT_ROOT_FEATURE_COUNT               = 4;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.exceptionImpl <em>exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.exceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getexception()
   * @generated
   */
  int              EXCEPTION                                 = 3;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              EXCEPTION__EXCEPTION                      = 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              EXCEPTION__MESSAGE                        = 1;

  /**
   * The number of structural features of the '<em>exception</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              EXCEPTION_FEATURE_COUNT                   = 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.FileSystemExceptionImpl <em>File System Exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.FileSystemExceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getFileSystemException()
   * @generated
   */
  int              FILE_SYSTEM_EXCEPTION                     = 5;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SYSTEM_EXCEPTION__MESSAGE            = TRACEABLE_EXCEPTION__MESSAGE;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              FILE_SYSTEM_EXCEPTION__EXCEPTION          = TRACEABLE_EXCEPTION__EXCEPTION;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SYSTEM_EXCEPTION__FILE_NAME          = TRACEABLE_EXCEPTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>File System Exception</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_SYSTEM_EXCEPTION_FEATURE_COUNT       = TRACEABLE_EXCEPTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.FileNotFoundExceptionImpl <em>File Not Found Exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.FileNotFoundExceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getFileNotFoundException()
   * @generated
   */
  int              FILE_NOT_FOUND_EXCEPTION                  = 4;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_NOT_FOUND_EXCEPTION__MESSAGE         = FILE_SYSTEM_EXCEPTION__MESSAGE;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              FILE_NOT_FOUND_EXCEPTION__EXCEPTION       = FILE_SYSTEM_EXCEPTION__EXCEPTION;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_NOT_FOUND_EXCEPTION__FILE_NAME       = FILE_SYSTEM_EXCEPTION__FILE_NAME;

  /**
   * The number of structural features of the '<em>File Not Found Exception</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              FILE_NOT_FOUND_EXCEPTION_FEATURE_COUNT    = FILE_SYSTEM_EXCEPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.PermissionDeniedExceptionImpl <em>Permission Denied Exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.PermissionDeniedExceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getPermissionDeniedException()
   * @generated
   */
  int              PERMISSION_DENIED_EXCEPTION               = 6;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              PERMISSION_DENIED_EXCEPTION__MESSAGE      = FILE_SYSTEM_EXCEPTION__MESSAGE;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              PERMISSION_DENIED_EXCEPTION__EXCEPTION    = FILE_SYSTEM_EXCEPTION__EXCEPTION;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              PERMISSION_DENIED_EXCEPTION__FILE_NAME    = FILE_SYSTEM_EXCEPTION__FILE_NAME;

  /**
   * The number of structural features of the '<em>Permission Denied Exception</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              PERMISSION_DENIED_EXCEPTION_FEATURE_COUNT = FILE_SYSTEM_EXCEPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.QATUnknownCodeImpl <em>QAT Unknown Code</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.QATUnknownCodeImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getQATUnknownCode()
   * @generated
   */
  int              QAT_UNKNOWN_CODE                          = 7;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              QAT_UNKNOWN_CODE__MESSAGE                 = TRACEABLE_EXCEPTION__MESSAGE;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              QAT_UNKNOWN_CODE__EXCEPTION               = TRACEABLE_EXCEPTION__EXCEPTION;

  /**
   * The feature id for the '<em><b>Env</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              QAT_UNKNOWN_CODE__ENV                     = TRACEABLE_EXCEPTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Raw</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              QAT_UNKNOWN_CODE__RAW                     = TRACEABLE_EXCEPTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>QAT Unknown Code</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              QAT_UNKNOWN_CODE_FEATURE_COUNT            = TRACEABLE_EXCEPTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.RawExceptionImpl <em>Raw Exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.RawExceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getRawException()
   * @generated
   */
  int              RAW_EXCEPTION                             = 8;

  /**
   * The number of structural features of the '<em>Raw Exception</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              RAW_EXCEPTION_FEATURE_COUNT               = 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.SATExceptionImpl <em>SAT Exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.SATExceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getSATException()
   * @generated
   */
  int              SAT_EXCEPTION                             = 9;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              SAT_EXCEPTION__MESSAGE                    = TRACEABLE_EXCEPTION__MESSAGE;

  /**
   * The feature id for the '<em><b>Exception</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              SAT_EXCEPTION__EXCEPTION                  = TRACEABLE_EXCEPTION__EXCEPTION;

  /**
   * The number of structural features of the '<em>SAT Exception</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int              SAT_EXCEPTION_FEATURE_COUNT               = TRACEABLE_EXCEPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ms.qaTools.saturn.exception.impl.StackTraceExceptionImpl <em>Stack Trace Exception</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see com.ms.qaTools.saturn.exception.impl.StackTraceExceptionImpl
   * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getStackTraceException()
   * @generated
   */
  int              STACK_TRACE_EXCEPTION                     = 10;

  /**
   * The feature id for the '<em><b>Trace</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int              STACK_TRACE_EXCEPTION__TRACE              = 0;

  /**
   * The number of structural features of the '<em>Stack Trace Exception</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int              STACK_TRACE_EXCEPTION_FEATURE_COUNT       = 1;

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.CompareException <em>Compare Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.CompareException
   * @generated
   */
  EClass getCompareException();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.CompareInitException <em>Compare Init Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare Init Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.CompareInitException
   * @generated
   */
  EClass getCompareInitException();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.ms.qaTools.saturn.exception.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.ms.qaTools.saturn.exception.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.ms.qaTools.saturn.exception.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.exception.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.ms.qaTools.saturn.exception.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.ms.qaTools.saturn.exception.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.ms.qaTools.saturn.exception.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.exception.DocumentRoot#getException <em>Exception</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.DocumentRoot#getException()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Exception();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.exception <em>exception</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>exception</em>'.
   * @see com.ms.qaTools.saturn.exception.exception
   * @generated
   */
  EClass getexception();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.exception.exception#getException <em>Exception</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.exception#getException()
   * @see #getexception()
   * @generated
   */
  EReference getexception_Exception();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.exception.exception#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see com.ms.qaTools.saturn.exception.exception#getMessage()
   * @see #getexception()
   * @generated
   */
  EAttribute getexception_Message();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.FileNotFoundException <em>File Not Found Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>File Not Found Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.FileNotFoundException
   * @generated
   */
  EClass getFileNotFoundException();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.FileSystemException <em>File System Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>File System Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.FileSystemException
   * @generated
   */
  EClass getFileSystemException();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.exception.FileSystemException#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Name</em>'.
   * @see com.ms.qaTools.saturn.exception.FileSystemException#getFileName()
   * @see #getFileSystemException()
   * @generated
   */
  EAttribute getFileSystemException_FileName();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.PermissionDeniedException <em>Permission Denied Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Permission Denied Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.PermissionDeniedException
   * @generated
   */
  EClass getPermissionDeniedException();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.QATUnknownCode <em>QAT Unknown Code</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>QAT Unknown Code</em>'.
   * @see com.ms.qaTools.saturn.exception.QATUnknownCode
   * @generated
   */
  EClass getQATUnknownCode();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.exception.QATUnknownCode#getEnv <em>Env</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Env</em>'.
   * @see com.ms.qaTools.saturn.exception.QATUnknownCode#getEnv()
   * @see #getQATUnknownCode()
   * @generated
   */
  EAttribute getQATUnknownCode_Env();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.exception.QATUnknownCode#getRaw <em>Raw</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Raw</em>'.
   * @see com.ms.qaTools.saturn.exception.QATUnknownCode#getRaw()
   * @see #getQATUnknownCode()
   * @generated
   */
  EAttribute getQATUnknownCode_Raw();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.RawException <em>Raw Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Raw Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.RawException
   * @generated
   */
  EClass getRawException();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.SATException <em>SAT Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>SAT Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.SATException
   * @generated
   */
  EClass getSATException();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.StackTraceException <em>Stack Trace Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Stack Trace Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.StackTraceException
   * @generated
   */
  EClass getStackTraceException();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.exception.StackTraceException#getTrace <em>Trace</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trace</em>'.
   * @see com.ms.qaTools.saturn.exception.StackTraceException#getTrace()
   * @see #getStackTraceException()
   * @generated
   */
  EAttribute getStackTraceException_Trace();

  /**
   * Returns the meta object for class '{@link com.ms.qaTools.saturn.exception.TraceableException <em>Traceable Exception</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Traceable Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.TraceableException
   * @generated
   */
  EClass getTraceableException();

  /**
   * Returns the meta object for the attribute '{@link com.ms.qaTools.saturn.exception.TraceableException#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see com.ms.qaTools.saturn.exception.TraceableException#getMessage()
   * @see #getTraceableException()
   * @generated
   */
  EAttribute getTraceableException_Message();

  /**
   * Returns the meta object for the containment reference '{@link com.ms.qaTools.saturn.exception.TraceableException#getException <em>Exception</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exception</em>'.
   * @see com.ms.qaTools.saturn.exception.TraceableException#getException()
   * @see #getTraceableException()
   * @generated
   */
  EReference getTraceableException_Exception();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExceptionFactory getExceptionFactory();

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
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.CompareExceptionImpl <em>Compare Exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.CompareExceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getCompareException()
     * @generated
     */
    EClass     COMPARE_EXCEPTION                  = eINSTANCE.getCompareException();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.CompareInitExceptionImpl <em>Compare Init Exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.CompareInitExceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getCompareInitException()
     * @generated
     */
    EClass     COMPARE_INIT_EXCEPTION             = eINSTANCE.getCompareInitException();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.DocumentRootImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getDocumentRoot()
     * @generated
     */
    EClass     DOCUMENT_ROOT                      = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED               = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP    = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EXCEPTION           = eINSTANCE.getDocumentRoot_Exception();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.exceptionImpl <em>exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.exceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getexception()
     * @generated
     */
    EClass     EXCEPTION                          = eINSTANCE.getexception();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference EXCEPTION__EXCEPTION               = eINSTANCE.getexception_Exception();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute EXCEPTION__MESSAGE                 = eINSTANCE.getexception_Message();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.FileNotFoundExceptionImpl <em>File Not Found Exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.FileNotFoundExceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getFileNotFoundException()
     * @generated
     */
    EClass     FILE_NOT_FOUND_EXCEPTION           = eINSTANCE.getFileNotFoundException();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.FileSystemExceptionImpl <em>File System Exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.FileSystemExceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getFileSystemException()
     * @generated
     */
    EClass     FILE_SYSTEM_EXCEPTION              = eINSTANCE.getFileSystemException();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute FILE_SYSTEM_EXCEPTION__FILE_NAME   = eINSTANCE.getFileSystemException_FileName();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.PermissionDeniedExceptionImpl <em>Permission Denied Exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.PermissionDeniedExceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getPermissionDeniedException()
     * @generated
     */
    EClass     PERMISSION_DENIED_EXCEPTION        = eINSTANCE.getPermissionDeniedException();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.QATUnknownCodeImpl <em>QAT Unknown Code</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.QATUnknownCodeImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getQATUnknownCode()
     * @generated
     */
    EClass     QAT_UNKNOWN_CODE                   = eINSTANCE.getQATUnknownCode();

    /**
     * The meta object literal for the '<em><b>Env</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute QAT_UNKNOWN_CODE__ENV              = eINSTANCE.getQATUnknownCode_Env();

    /**
     * The meta object literal for the '<em><b>Raw</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute QAT_UNKNOWN_CODE__RAW              = eINSTANCE.getQATUnknownCode_Raw();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.RawExceptionImpl <em>Raw Exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.RawExceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getRawException()
     * @generated
     */
    EClass     RAW_EXCEPTION                      = eINSTANCE.getRawException();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.SATExceptionImpl <em>SAT Exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.SATExceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getSATException()
     * @generated
     */
    EClass     SAT_EXCEPTION                      = eINSTANCE.getSATException();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.StackTraceExceptionImpl <em>Stack Trace Exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.StackTraceExceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getStackTraceException()
     * @generated
     */
    EClass     STACK_TRACE_EXCEPTION              = eINSTANCE.getStackTraceException();

    /**
     * The meta object literal for the '<em><b>Trace</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute STACK_TRACE_EXCEPTION__TRACE       = eINSTANCE.getStackTraceException_Trace();

    /**
     * The meta object literal for the '{@link com.ms.qaTools.saturn.exception.impl.TraceableExceptionImpl <em>Traceable Exception</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see com.ms.qaTools.saturn.exception.impl.TraceableExceptionImpl
     * @see com.ms.qaTools.saturn.exception.impl.ExceptionPackageImpl#getTraceableException()
     * @generated
     */
    EClass     TRACEABLE_EXCEPTION                = eINSTANCE.getTraceableException();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    EAttribute TRACEABLE_EXCEPTION__MESSAGE       = eINSTANCE.getTraceableException_Message();

    /**
     * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     */
    EReference TRACEABLE_EXCEPTION__EXCEPTION     = eINSTANCE.getTraceableException_Exception();

  }

} // ExceptionPackage
