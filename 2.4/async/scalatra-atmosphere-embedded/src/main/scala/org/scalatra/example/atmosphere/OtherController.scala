package org.scalatra.example.atmosphere

import org.json4s.{DefaultFormats, Formats}
import org.scalatra.atmosphere.AtmosphereSupport
import org.scalatra.json.JacksonJsonSupport
import org.scalatra.{ScalatraServlet, SessionSupport}

class OtherController extends ScalatraServlet
  with JacksonJsonSupport
  with SessionSupport
  with AtmosphereSupport {

  implicit protected val jsonFormats: Formats = DefaultFormats

  get("/") {
    "This is another controller"
  }
}
