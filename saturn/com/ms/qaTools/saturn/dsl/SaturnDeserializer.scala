package com.ms.qaTools.saturn.dsl
import scala.collection.JavaConversions.asScalaIterator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.util.XMLProcessor
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import com.ms.qaTools.ecore.utils.stringToURI
import com.ms.qaTools.ecore.utils.ECoreXmlDeserializer
import com.ms.qaTools.saturn.util.SaturnResourceFactoryImpl
import com.ms.qaTools.saturn.util.SaturnXMLProcessor
import com.ms.qaTools.saturn.{IncludeFile => MIncludeFile}
import com.ms.qaTools.saturn.{Saturn => MSaturn}
import com.ms.qaTools.saturn.SaturnPackage
import java.io.File
import java.util.UUID
import org.apache.commons.io.FilenameUtils
import com.ms.qaTools.saturn.codeGen.WrappedRunGroup

object SaturnDeserializer extends ECoreXmlDeserializer[MSaturn] {
  val xmlProcessor:XMLProcessor = new SaturnXMLProcessor()
  val packageInstance:EPackage = SaturnPackage.eINSTANCE
  val rootFeature:EStructuralFeature = SaturnPackage.eINSTANCE.getDocumentRoot_Saturn()
  val resourceFactory:Resource.Factory = new SaturnResourceFactoryImpl()

  def extractAllIncludeFiles(eObject:EObject):List[MIncludeFile] = eObject.eAllContents().filter{_.isInstanceOf[MIncludeFile]}.map{_.asInstanceOf[MIncludeFile]}.toList

  def extractPath(fileName:String,path:Option[String]=None):Option[String] = {
    val fullFileName = concatPaths(fileName,path)
    Some(fullFileName.reverse.dropWhile(c => c != File.separatorChar).reverse)
  }

  def concatPaths(fileName:String,path:Option[String]):String = path match {
      case Some(p) if !p.isEmpty => p + "/" + fileName
      case _ => fileName
    }

  def genIncludeFileMap(includeFiles:List[MIncludeFile],
                        path:Option[String]=None,
                        saturnFiles:scala.collection.mutable.Map[String,MSaturn]=scala.collection.mutable.Map.empty,
                        soFar:Map[MIncludeFile, (MSaturn, String)]=Map.empty
                       ):Map[MIncludeFile, (MSaturn, String)] = {
    if(includeFiles.isEmpty) soFar
    else {
      val includeFile = includeFiles.head
      if(includeFile.getMixed().size() != 1 && includeFile.getText().size() != 1) throw new Exception("could not open includeFile:" + includeFile.getName() + ", fileName must contain only text.")
      val includeFilePath = includeFile.getText().get(0).getText()
      val isAbsolutePath = includeFilePath.head == File.separatorChar
      val fullIncludeFilePath = new File(if (! isAbsolutePath) concatPaths(includeFilePath, path) else includeFilePath).getAbsolutePath()

      val newMap:Map[MIncludeFile, (MSaturn, String)] = saturnFiles.get(fullIncludeFilePath) match {
        case Some(saturn) => genIncludeFileMap(includeFiles.tail, path, saturnFiles, soFar + (includeFile -> (saturn, fullIncludeFilePath)))
        case None         => {
          val includeFileSaturn = if(saturnFiles.contains(fullIncludeFilePath)) {
            saturnFiles(fullIncludeFilePath)
          }
          else {
            val newIncludeFileSaturn = SaturnDeserializer.deserialize(fullIncludeFilePath).get
            saturnFiles += (fullIncludeFilePath -> newIncludeFileSaturn)
            newIncludeFileSaturn
          }
          val newSoFar = soFar +(includeFile -> (includeFileSaturn, fullIncludeFilePath)) ++ genIncludeFileMap(extractAllIncludeFiles(includeFileSaturn), extractPath(fullIncludeFilePath), saturnFiles)
          genIncludeFileMap(includeFiles.tail, path, saturnFiles, newSoFar)
        }
      }
      newMap
    }
  }
}
