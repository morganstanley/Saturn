package com.ms.qaTools.saturn.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.ms.qaTools.saturn.DocumentRoot;
import com.ms.qaTools.saturn.Saturn;
import com.ms.qaTools.saturn.SaturnPackage;
import com.ms.qaTools.saturn.annotations.saturnReport.SaturnReportPackage;
import com.ms.qaTools.saturn.annotations.saturnWeb.SaturnWebPackage;
import com.ms.qaTools.saturn.listeners.ListenersPackage;
import com.ms.qaTools.saturn.modules.XSplitModule.XSplitModulePackage;
import com.ms.qaTools.saturn.modules.cometModule.CometModulePackage;
import com.ms.qaTools.saturn.modules.cpsModule.CpsModulePackage;
import com.ms.qaTools.saturn.modules.datacompareModule.DatacompareModulePackage;
import com.ms.qaTools.saturn.modules.documentumModule.DocumentumModulePackage;
import com.ms.qaTools.saturn.modules.dsConvertModule.DsConvertModulePackage;
import com.ms.qaTools.saturn.modules.dsValidatorModule.DsValidatorModulePackage;
import com.ms.qaTools.saturn.modules.envValidatorModule.EnvValidatorModulePackage;
import com.ms.qaTools.saturn.modules.extractDDLModule.ExtractDDLModulePackage;
import com.ms.qaTools.saturn.modules.mailModule.MailModulePackage;
import com.ms.qaTools.saturn.modules.mqModule.MqModulePackage;
import com.ms.qaTools.saturn.modules.procedureCallModule.ProcedureCallModulePackage;
import com.ms.qaTools.saturn.modules.psManagerModule.PsManagerModulePackage;
import com.ms.qaTools.saturn.modules.referenceModule.ReferenceModulePackage;
import com.ms.qaTools.saturn.modules.runcmdsModule.RuncmdsModulePackage;
import com.ms.qaTools.saturn.modules.singularityModule.SingularityModulePackage;
import com.ms.qaTools.saturn.modules.soapIOModule.SoapIOModulePackage;
import com.ms.qaTools.saturn.modules.sqlModule.SqlModulePackage;
import com.ms.qaTools.saturn.modules.xml2csvModule.Xml2csvModulePackage;
import com.ms.qaTools.saturn.modules.xmlDiffModule.XmlDiffModulePackage;
import com.ms.qaTools.saturn.modules.xmlGenModule.XmlGenModulePackage;
import com.ms.qaTools.saturn.modules.xmlManipModule.XmlManipModulePackage;
import com.ms.qaTools.saturn.modules.xmlValidatorModule.XmlValidatorModulePackage;
import com.ms.qaTools.saturn.repetition.RepetitionPackage;
import com.ms.qaTools.saturn.resources.db2Resource.Db2ResourcePackage;
import com.ms.qaTools.saturn.resources.directoryResource.DirectoryResourcePackage;
import com.ms.qaTools.saturn.resources.fileResource.FileResourcePackage;
import com.ms.qaTools.saturn.resources.informixResource.InformixResourcePackage;
import com.ms.qaTools.saturn.resources.ldapQueryResource.LdapQueryResourcePackage;
import com.ms.qaTools.saturn.resources.ldapResource.LdapResourcePackage;
import com.ms.qaTools.saturn.resources.mqResource.MqResourcePackage;
import com.ms.qaTools.saturn.resources.mssqlResource.MssqlResourcePackage;
import com.ms.qaTools.saturn.resources.nullResource.NullResourcePackage;
import com.ms.qaTools.saturn.resources.oracleResource.OracleResourcePackage;
import com.ms.qaTools.saturn.resources.queryResource.QueryResourcePackage;
import com.ms.qaTools.saturn.resources.referenceResource.ReferenceResourcePackage;
import com.ms.qaTools.saturn.resources.semaphoreResource.SemaphoreResourcePackage;
import com.ms.qaTools.saturn.resources.shadowDirectResource.ShadowDirectResourcePackage;
import com.ms.qaTools.saturn.resources.soapIOResource.SoapIOResourcePackage;
import com.ms.qaTools.saturn.resources.sqliteResource.SqliteResourcePackage;
import com.ms.qaTools.saturn.resources.sybaseResource.SybaseResourcePackage;
import com.ms.qaTools.saturn.resources.teradataResource.TeradataResourcePackage;
import com.ms.qaTools.saturn.resources.transactionResource.TransactionResourcePackage;
import com.ms.qaTools.saturn.resources.udbResource.UdbResourcePackage;
import com.ms.qaTools.saturn.types.TypesPackage;
import com.ms.qaTools.saturn.values.ComplexValue;
import com.ms.qaTools.saturn.values.TextComplexValue;
import com.ms.qaTools.saturn.values.ValuesPackage;

public class SaturnDocLoadSaveUtil
{

  public static void save(SaturnResourceImpl saturnResourceImpl_, Map<Entry, Entry> textNodes_)
  {
    textElementToTextNode(saturnResourceImpl_, textNodes_);
    addXmlNsPrefixes(saturnResourceImpl_);
  }

  public static void afterSave(XMLResource saturnResourceImpl_, Map<Entry, Entry> textNodes_)
  {
    undoTextElementToTextNode(saturnResourceImpl_, textNodes_);
  }

  public static void load(SaturnResourceImpl saturnResourceImpl_)
  {

  }

  public static void afterLoad(SaturnResourceImpl saturnResourceImpl_)
  {
    Saturn saturn = (Saturn)saturnResourceImpl_.getContents().get(0).eContents().get(0);
    textNodeToTextElement(saturnResourceImpl_);
    ResourceLinkUtil.populateResourceLinks(saturn);
  }

  private static void textElementToTextNode(SaturnResourceImpl saturnResourceImpl_, Map<Entry, Entry> textNodes_)
  {
    DocumentRoot o = (DocumentRoot) saturnResourceImpl_.getContents().get(0);
    Saturn saturn = (Saturn) o.eContents().get(0);
    TreeIterator<EObject> ee = saturn.eAllContents();
    while (ee.hasNext())
    {
      EObject e = ee.next();
      if (e == null) continue;
      EClass ec = e.eClass();
      if (!ValuesPackage.eINSTANCE.getComplexValue().isSuperTypeOf(ec)) continue;

      ComplexValue cv = (ComplexValue) e;

      for (int i = 0; i < cv.getMixed().size(); i++)
      {
        FeatureMap.Entry entry = cv.getMixed().get(i);
        Object value = entry.getValue();
        if (value instanceof TextComplexValue)
        {
          FeatureMap.Entry newEntry = FeatureMapUtil.createTextEntry(((TextComplexValue) value).getText());
          cv.getMixed().set(i, newEntry);
          textNodes_.put(newEntry, entry);
        }
      }
    }
  }

  private static void undoTextElementToTextNode(XMLResource saturnResourceImpl_, Map<Entry, Entry> textNodes_)
  {
    DocumentRoot o = (DocumentRoot) saturnResourceImpl_.getContents().get(0);
    Saturn saturn = (Saturn) o.eContents().get(0);
    TreeIterator<EObject> ee = saturn.eAllContents();
    while (ee.hasNext())
    {
      EObject e = ee.next();
      if (e == null) continue;
      EClass ec = e.eClass();
      if (!ValuesPackage.eINSTANCE.getComplexValue().isSuperTypeOf(ec)) continue;

      ComplexValue cv = (ComplexValue) e;
      for (int i = 0; i < cv.getMixed().size(); i++)
      {
        FeatureMap.Entry entry = cv.getMixed().get(i);
        if (textNodes_.containsKey(entry))
        {
          Entry textComplexValueEntry = textNodes_.get(entry);
          cv.getMixed().set(i, textComplexValueEntry);
        }
      }
    }
  }

  private static void textNodeToTextElement(SaturnResourceImpl saturnResourceImpl_)
  {
    DocumentRoot o = (DocumentRoot) saturnResourceImpl_.getContents().get(0);
    Saturn saturn = (Saturn) o.eContents().get(0);
    TreeIterator<EObject> ee = saturn.eAllContents();
    while (ee.hasNext())
    {
      EObject e = ee.next();
      if (e == null) continue;
      EClass ec = e.eClass();
      if (!ValuesPackage.eINSTANCE.getComplexValue().isSuperTypeOf(ec)) continue;

      ComplexValue cv = (ComplexValue) e;
      for (int i = 0; i < cv.getMixed().size(); i++)
      {
        FeatureMap.Entry entry = cv.getMixed().get(i);
        Object value = entry.getValue();
        if (value instanceof String)
        {
          TextComplexValue textComplexValue = ValuesPackage.eINSTANCE.getValuesFactory().createTextComplexValue();
          textComplexValue.setText((String) value);
          FeatureMap.Entry newEntry = FeatureMapUtil.createEntry(ValuesPackage.eINSTANCE.getComplexValue_Text(),
              textComplexValue);
          cv.getMixed().set(i, newEntry);
        }
      }
    }
  }

  private static void addXmlNsPrefixes(SaturnResourceImpl saturnResourceImpl_)
  {
    EList<EObject> contents = saturnResourceImpl_.getContents();
    if (contents.size() <= 0) return;
    if (!(contents.get(0) instanceof DocumentRoot)) return;

    DocumentRoot documentRoot = (DocumentRoot) contents.get(0);

    List<BasicEMap.Entry<String, String>> xmlNsList = getXmlNsList();
    for (BasicEMap.Entry<String, String> newEntry : xmlNsList)
    {
      documentRoot.getXMLNSPrefixMap().add(newEntry);
    }
  }

  private final static List<BasicEMap.Entry<String, String>> getXmlNsList()
  {
    List<EPackage> packages = new ArrayList<EPackage>();

    // resource packages
    packages.add(Db2ResourcePackage.eINSTANCE);
    packages.add(DirectoryResourcePackage.eINSTANCE);
    packages.add(FileResourcePackage.eINSTANCE);
    packages.add(InformixResourcePackage.eINSTANCE);
    packages.add(MqResourcePackage.eINSTANCE);
    packages.add(OracleResourcePackage.eINSTANCE);
    packages.add(QueryResourcePackage.eINSTANCE);
    packages.add(ReferenceResourcePackage.eINSTANCE);
    packages.add(ShadowDirectResourcePackage.eINSTANCE);
    packages.add(SoapIOResourcePackage.eINSTANCE);
    packages.add(SybaseResourcePackage.eINSTANCE);
    packages.add(TeradataResourcePackage.eINSTANCE);
    packages.add(UdbResourcePackage.eINSTANCE);
    packages.add(NullResourcePackage.eINSTANCE);
    packages.add(TransactionResourcePackage.eINSTANCE);
    packages.add(SemaphoreResourcePackage.eINSTANCE);
    packages.add(LdapResourcePackage.eINSTANCE);
    packages.add(LdapQueryResourcePackage.eINSTANCE);
    packages.add(SqliteResourcePackage.eINSTANCE);
    packages.add(MssqlResourcePackage.eINSTANCE);

    // global packages
    packages.add(ValuesPackage.eINSTANCE);
    packages.add(TypesPackage.eINSTANCE);
    packages.add(ListenersPackage.eINSTANCE);
    packages.add(RepetitionPackage.eINSTANCE);
    packages.add(SaturnWebPackage.eINSTANCE);
    packages.add(SaturnReportPackage.eINSTANCE);

    // module packages
    packages.add(CpsModulePackage.eINSTANCE);
    packages.add(DatacompareModulePackage.eINSTANCE);
    packages.add(DsConvertModulePackage.eINSTANCE);
    packages.add(DsValidatorModulePackage.eINSTANCE);
    packages.add(EnvValidatorModulePackage.eINSTANCE);
    packages.add(ExtractDDLModulePackage.eINSTANCE);
    packages.add(MailModulePackage.eINSTANCE);
    packages.add(MqModulePackage.eINSTANCE);
    packages.add(ProcedureCallModulePackage.eINSTANCE);
    packages.add(PsManagerModulePackage.eINSTANCE);
    packages.add(RuncmdsModulePackage.eINSTANCE);
    packages.add(SingularityModulePackage.eINSTANCE);
    packages.add(SoapIOModulePackage.eINSTANCE);
    packages.add(SqlModulePackage.eINSTANCE);
    packages.add(Xml2csvModulePackage.eINSTANCE);
    packages.add(XmlDiffModulePackage.eINSTANCE);
    packages.add(XmlGenModulePackage.eINSTANCE);
    packages.add(XmlManipModulePackage.eINSTANCE);
    packages.add(XmlValidatorModulePackage.eINSTANCE);
    packages.add(CometModulePackage.eINSTANCE);

    packages.add(XSplitModulePackage.eINSTANCE);
    packages.add(ReferenceModulePackage.eINSTANCE);
    packages.add(DocumentumModulePackage.eINSTANCE);

    List<BasicEMap.Entry<String, String>> xmlNsList = new ArrayList<BasicEMap.Entry<String, String>>();
    for (EPackage ePackage : packages)
    {
      ((EcoreFactoryImpl) EcoreFactory.eINSTANCE).createEStringToStringMapEntry();
      BasicEMap.Entry<String, String> newEntry = (BasicEMap.Entry<String, String>) EcoreUtil
          .create((EClass) SaturnPackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap().getEType());
      // new EStringToStringMapEntryImpl();
      // //((EcoreFactoryImpl)EcoreFactory.eINSTANCE).createEStringToStringMapEntry();
      xmlNsList.add(newEntry);

      newEntry.setKey(ePackage.getNsPrefix());
      newEntry.setValue(ePackage.getNsURI());
    }
    return xmlNsList;
  }
}
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
