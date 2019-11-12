package io.scalajs.nodejs.http

import org.scalatest.FunSpec

import scala.scalajs.js

/**
  * Http Tests
  */
class StatusCodeTest extends FunSpec {
  describe("Http") {
    it("should provide an HTTP server") {
      val server = Http.createServer((request: ClientRequest, response: ServerResponse) => {
        response.writeHead(statusCode = 200, headers = js.Dictionary("Content-Type" -> "text/plain"))
        response.write("Hello World")
        response.end()
      })
      assert(server !== null)

      // don't listen on a port
      //server.listen(58888)
      //setTimeout(() => server.close(), 100.millis)
    }
  }
}
