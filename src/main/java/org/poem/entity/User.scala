package org.poem.entity

import java.util.Date
import javax.persistence._

import scala.beans.BeanProperty

/**
  * 用scala的@BeanProperty注解，会自动生成JavaBeans的getter,setter方法。
  */
@Entity
@Table(name = "USER")
class User {

  /**
    * 主键
    */
  @Id
  @BeanProperty
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id: Integer = _

  /**
    * 名字
    */
  @BeanProperty
  var name: String = _

  /**
    * 年龄
    */
  @BeanProperty
  var  age :Integer = _

  /**
    * 创建的日期
    */
  @BeanProperty
  var createdDate:Date = _
}
