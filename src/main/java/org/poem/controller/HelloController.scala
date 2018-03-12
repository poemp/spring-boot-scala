package org.poem.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class HelloController {

  @RequestMapping(value = {
    Array("/scala")
  }, method = Array(RequestMethod.GET))
  def helloWord(): String = {
    return "hello word spring boot scala"
  }
}
