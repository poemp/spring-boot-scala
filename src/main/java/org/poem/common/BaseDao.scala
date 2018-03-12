package org.poem.common

import org.springframework.data.repository.{CrudRepository, NoRepositoryBean}

/**
  * 接口
  * @tparam T
  * @tparam ID
  */
@NoRepositoryBean
trait BaseDao[T,ID] extends CrudRepository[T,ID]{

}
