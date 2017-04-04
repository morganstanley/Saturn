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
package com.ms.qaTools.saturn.resources.transactionResource;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Termination Event</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnFail <em>On Fail</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnPass <em>On Pass</em>}</li>
 * <li>{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnWarn <em>On Warn</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage#getTerminationEvent()
 * @model extendedMetaData="name='TerminationEvent' kind='empty'"
 * @generated
 */
public interface TerminationEvent extends AbstractEvent
{
  /**
   * Returns the value of the '<em><b>On Fail</b></em>' attribute.
   * The default value is <code>"ROLLBACK"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Fail</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Fail</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @see #isSetOnFail()
   * @see #unsetOnFail()
   * @see #setOnFail(TransactionTermination)
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage#getTerminationEvent_OnFail()
   * @model default="ROLLBACK" unsettable="true"
   *        extendedMetaData="kind='attribute' name='onFail'"
   * @generated
   */
  TransactionTermination getOnFail();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnFail <em>On Fail</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>On Fail</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @see #isSetOnFail()
   * @see #unsetOnFail()
   * @see #getOnFail()
   * @generated
   */
  void setOnFail(TransactionTermination value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnFail <em>On Fail</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOnFail()
   * @see #getOnFail()
   * @see #setOnFail(TransactionTermination)
   * @generated
   */
  void unsetOnFail();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnFail <em>On Fail</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>On Fail</em>' attribute is set.
   * @see #unsetOnFail()
   * @see #getOnFail()
   * @see #setOnFail(TransactionTermination)
   * @generated
   */
  boolean isSetOnFail();

  /**
   * Returns the value of the '<em><b>On Pass</b></em>' attribute.
   * The default value is <code>"COMMIT"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Pass</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Pass</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @see #isSetOnPass()
   * @see #unsetOnPass()
   * @see #setOnPass(TransactionTermination)
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage#getTerminationEvent_OnPass()
   * @model default="COMMIT" unsettable="true"
   *        extendedMetaData="kind='attribute' name='onPass'"
   * @generated
   */
  TransactionTermination getOnPass();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnPass <em>On Pass</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>On Pass</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @see #isSetOnPass()
   * @see #unsetOnPass()
   * @see #getOnPass()
   * @generated
   */
  void setOnPass(TransactionTermination value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnPass <em>On Pass</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOnPass()
   * @see #getOnPass()
   * @see #setOnPass(TransactionTermination)
   * @generated
   */
  void unsetOnPass();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnPass <em>On Pass</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>On Pass</em>' attribute is set.
   * @see #unsetOnPass()
   * @see #getOnPass()
   * @see #setOnPass(TransactionTermination)
   * @generated
   */
  boolean isSetOnPass();

  /**
   * Returns the value of the '<em><b>On Warn</b></em>' attribute.
   * The default value is <code>"ROLLBACK"</code>.
   * The literals are from the enumeration {@link com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Warn</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Warn</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @see #isSetOnWarn()
   * @see #unsetOnWarn()
   * @see #setOnWarn(TransactionTermination)
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage#getTerminationEvent_OnWarn()
   * @model default="ROLLBACK" unsettable="true"
   *        extendedMetaData="kind='attribute' name='onWarn'"
   * @generated
   */
  TransactionTermination getOnWarn();

  /**
   * Sets the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnWarn <em>On Warn</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>On Warn</em>' attribute.
   * @see com.ms.qaTools.saturn.resources.transactionResource.TransactionTermination
   * @see #isSetOnWarn()
   * @see #unsetOnWarn()
   * @see #getOnWarn()
   * @generated
   */
  void setOnWarn(TransactionTermination value);

  /**
   * Unsets the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnWarn <em>On Warn</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOnWarn()
   * @see #getOnWarn()
   * @see #setOnWarn(TransactionTermination)
   * @generated
   */
  void unsetOnWarn();

  /**
   * Returns whether the value of the '{@link com.ms.qaTools.saturn.resources.transactionResource.TerminationEvent#getOnWarn <em>On Warn</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>On Warn</em>' attribute is set.
   * @see #unsetOnWarn()
   * @see #getOnWarn()
   * @see #setOnWarn(TransactionTermination)
   * @generated
   */
  boolean isSetOnWarn();

} // TerminationEvent
