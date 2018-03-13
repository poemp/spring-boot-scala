package org.poem.controller

import org.poem.entity.User
import org.poem.service.UserServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{PathVariable, RequestMapping, RequestMethod, RestController}

@RestController
class HelloController @Autowired()(userServiceImpl: UserServiceImpl) {

  @RequestMapping(value = {
    Array("/scala")
  }, method = Array(RequestMethod.GET))
  def helloWord(): String = {
    "hello word spring boot scala"
  }

  @RequestMapping(value = {
    Array("/save")
  }, method = Array(RequestMethod.POST))
  def save(user: User) = {
    this.userServiceImpl.save(user)
  }

  @RequestMapping(value = {
    Array("/findAll")
  }, method = Array(RequestMethod.GET))
  def findAll(): java.lang.Iterable[User] = {
    this.userServiceImpl.findAll()
  }

  @RequestMapping(value = {
    Array("/findOne/{id}")
  }, method = Array(RequestMethod.GET))
  def findOne(@PathVariable(value = "id") id: Integer): User = {
    this.userServiceImpl.findOne(id)
  }

  @RequestMapping(value = {
    Array("/ListByName")
  }, method = Array(RequestMethod.GET))
  def ListByName(name: String): Array[User] = {
    this.userServiceImpl.ListByName(name)
  }
}
