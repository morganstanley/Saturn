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
package com.ms.qaTools.saturn.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package. <!-- end-user-doc -->
 * @see com.ms.qaTools.saturn.util.SaturnResourceFactoryImpl
 * @generated
 */
public class SaturnResourceImpl extends XMLResourceImpl
{
  /**
   * Creates an instance of the resource.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param uri the URI of the new resource.
   * @generated
   */
  public SaturnResourceImpl(URI uri)
  {
    super(uri);
  }

  /**
   * @generated NOT
   */
  @Override
  public void doLoad(InputStream inputStream_, Map<?, ?> options_) throws IOException
  {
    boolean deliver = this.eDeliver();
    this.eSetDeliver(false);

    SaturnDocLoadSaveUtil.load(this);
    super.doLoad(inputStream_, options_);
    SaturnDocLoadSaveUtil.afterLoad(this);

    this.eSetDeliver(deliver);
  }

  /**
   * @generated NOT
   */
  @Override
  public void doSave(OutputStream outputStream_, Map<?, ?> options_) throws IOException
  {
    final Map<Entry, Entry> textNodes_ = new HashMap<Entry, Entry>();

    Collection<EObject> objects = EcoreUtil.copyAll(this.getContents());
    SaturnResourceImpl s = new SaturnResourceImpl(this.uri);
    s.init();
    s.getContents().addAll(objects);
    SaturnDocLoadSaveUtil.save(s, textNodes_);

    XMLSave xmlSave = createXMLSave();

    if (options_ == null)
    {
      options_ = Collections.EMPTY_MAP;
    }

    ResourceHandler handler = (ResourceHandler) options_.get(OPTION_RESOURCE_HANDLER);

    if (handler != null)
    {
      handler.preSave(s, outputStream_, options_);
    }

    xmlSave.save(s, outputStream_, options_);

    if (handler != null)
    {
      handler.postSave(s, outputStream_, options_);
    }

  }

} // SaturnResourceImpl
