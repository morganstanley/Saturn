package com.ms.qaTools.kronus.repository

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes

import scala.collection.mutable.Buffer
import scala.io.Source
import scala.util.DynamicVariable
import scala.util.Properties
import scala.util.Try

import com.typesafe.config.ConfigException
import com.typesafe.config.ConfigFactory

import spray.json._

/**
 * Client API
 *
 * Should keep as stable as possible
 */
trait IClient {
  def search(group: Option[String], artifact: Option[String], version: Option[String]): Seq[Release]
  def add(release: Release): Unit
  def remove(group: String, artifact: String, version: Option[String]): Unit
}

object IClient {
  val fsConfKey = "qaTools.kronus-repo.file-system"
  protected lazy val conf = ConfigFactory.load()

  lazy val defaultURL: URL = new URL("http://kronusrepo/")

  protected lazy val impl: DynamicVariable[URL => IClient] = {
    def mkClient(url: URL) =
      Try {conf.getString(fsConfKey)}.map {p => new FileSystemFallbackClient(url, Paths.get(p))}.getOrElse {new Client(url)}

    new DynamicVariable(mkClient)
  }

  def apply(url: URL = defaultURL) = impl.value(url)
  def withImpl[A](client: IClient)(thunk: => A): A = impl.withValue(_ => client)(thunk)
}

/**
 * A minimal implementation of `IClient` so that downstream projects do not need to drag in the whole spray stack.
 * This is especially important for Eclipse plug-ins.
 *
 * Never build stuff depending on this guy.  Use the interface.
 */
class Client(root: URL) extends IClient {
  require(root.getPath.endsWith("/"), s"root URL $root does not end with /")

  def withHttpURLConnection[A](url: URL, goodResponses: Set[Int] = Set(HttpURLConnection.HTTP_OK))
                              (body: HttpURLConnection => A): A = {
    val conn = url.openConnection().asInstanceOf[HttpURLConnection]
    try {
      val x = body(conn)
      conn.getResponseCode match {
        case code if goodResponses(code) =>
        case code =>
          val in = conn.getErrorStream
          val err = Option(try Source.fromInputStream(in).mkString finally in.close()).filter(_.nonEmpty)
          val msg = s"bad response from HTTP server: $code ${conn.getResponseMessage}"
          throw new IOException((Seq(msg) ++ err).mkString(Properties.lineSeparator))
      }
      x
    } finally conn.disconnect()
  }

  def searchFilter(groupId: Option[String], id: Option[String], version: Option[String]): Seq[String] = {
    val filter = Seq(groupId, id, version)
    val (somes, nones) = filter.span(_.nonEmpty)
    assert(nones.forall(_.isEmpty), filter)
    somes.map(_.get)
  }

  def search(groupId: Option[String], id: Option[String], version: Option[String]) = {
    val url = new URL(root, searchFilter(groupId, id, version).mkString("/"))
    val src = Source.fromURL(url)
    try src.mkString.parseJson.convertTo[Seq[Release]] finally src.close()
  }

  def add(release: Release) = withHttpURLConnection(root) { conn =>
    val bs = release.toJson.compactPrint.getBytes
    conn.setDoOutput(true)
    conn.setRequestMethod("POST")
    conn.setRequestProperty("Content-Type", "application/json")
    conn.setRequestProperty("Content-Length", bs.length.toString)
    val out = conn.getOutputStream
    try out.write(bs) finally out.close()
  }

  def remove(groupId: String, id: String, version: Option[String]) = {
    val spec = (Seq(groupId, id) ++ version).mkString("/")
    val url = new URL(root, spec)
    withHttpURLConnection(url) { conn =>
      conn.setRequestMethod("DELETE")
      if (conn.getResponseCode == HttpURLConnection.HTTP_NOT_FOUND)
        throw new NoSuchElementException(s"unable to find release: $spec")
    }
  }
}

class FileSystemFallbackClient(url: URL, path: Path) extends Client(url) {
  def searchInFS(groupId: Option[String], id: Option[String], version: Option[String]): Seq[Release] = {
    val releases = Buffer[Release]()
    val start = (path /: searchFilter(groupId, id, version).take(2))(_ resolve _)
    val visitor = new SimpleFileVisitor[Path] {
      override def visitFile(file: Path, attrs: BasicFileAttributes) = {
        val reader = Files.newBufferedReader(file)
        try Iterator.continually(reader.readLine()).takeWhile(_ != null).foreach { line =>
          val r = line.parseJson.convertTo[Release]
          version match {
            case Some(v) => if (v == r.version) releases += r
            case None    => releases += r
          }
        } finally reader.close()
        super.visitFile(file, attrs)
      }
    }
    if (Files.exists(start)) Files.walkFileTree(start, visitor)
    releases
  }

  override def search(groupId: Option[String], id: Option[String], version: Option[String]) = try {
    super.search(groupId, id, version)
  } catch {
    case _: IOException => searchInFS(groupId, id, version)
  }
}
