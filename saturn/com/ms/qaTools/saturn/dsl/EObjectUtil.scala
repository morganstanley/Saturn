package com.ms.qaTools.saturn.dsl

import com.ms.qaTools.saturn.{AbstractRunGroup => MAbstractRunGroup}
import com.ms.qaTools.saturn.{IncludeFile  => MIncludeFile}
import com.ms.qaTools.saturn.{Saturn       => MSaturn}
import com.ms.qaTools.saturn.{Attribute    => MAttribute}
import com.ms.qaTools.saturn.types.{NamedResourceDefinition => MNamedResourceDefinition}
import org.eclipse.emf.ecore.EObject
import com.ms.qaTools.io.rowSource.jdbc.ResultSetRowSource

class EObjectUtil(e:EObject) {
    def name:String = e match {
        case r:MAbstractRunGroup        => r.getName()
        case a:MAttribute               => a.getName()
        case r:MNamedResourceDefinition => r.getName()
        case i:MIncludeFile             => i.getName()
        case _                          => "XXX"
    }

    def eClassName = e.eClass().getName()
}

object EObjectUtil {
  implicit def eObjectToEObjectUtil(e:EObject) = new EObjectUtil(e)
}

abstract class QueryResource {
  val sqlRowSource: ResultSetRowSource
}
