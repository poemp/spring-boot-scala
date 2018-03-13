package org.poem.service

import java.util.Date

import org.poem.dao.UserDao
import org.poem.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl @Autowired()(val userDao: UserDao) {

  def save(user: User): Unit = {
    user.createdDate = new Date
    this.userDao.save(user)
  }

  def findAll(): java.lang.Iterable[User] = {
    this.userDao.findAll()
  }

  def findOne(id: Integer): User = {
    this.userDao.findOne(id)
  }

  def ListByName(name: String): Array[User] = {
    this.userDao.ListByName(name)
  }
}
