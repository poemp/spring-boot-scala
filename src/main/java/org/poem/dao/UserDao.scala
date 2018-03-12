package org.poem.dao

import org.poem.common.BaseDao
import org.poem.entity.User
import org.springframework.data.jpa.repository.Query


trait UserDao  extends BaseDao[User,Integer]{

  @Query(value = "SELECT user FROM User AS user WHERE user.id=?1")
  def findOne(id :Integer):User


  def findAll(): java.lang.Iterable[User]


  @Query(value = "SELECT user FROM User AS user WHERE user.name like ?1")
  def ListByName(name:String) : Array[User]
}
