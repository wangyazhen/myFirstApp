package models
import play.api.db._
import play.api.Play.current
import anorm._
import anorm.SqlParser._


case class User( name: String, password: String)

object User{
  val user = {
      get[String]("user.name")~
      get[String]("user.password") map{
      case name~password => User(name,password)
    }
  }

  def queryAll(): List[User] = DB.withConnection { implicit c =>
    SQL("select * from user").as(user *)
  }

  def save (user: User): User = {
     DB.withConnection{ implicit  i =>
       SQL(
         """
           insert into user(name,password) values ({name},{password})
         """).on(
              'name -> user.name,
              'password -> user.password
            ).executeUpdate()
       user
     }
  }

  def update(user: User): User = {
      DB.withConnection{ implicit s =>
        SQL(
          """
            update user set password = {password} where name = {name}
          """.stripMargin
        ).on(
          'password -> user.password,
          'name ->     user.name
        ).executeUpdate()
        user
      }
  }

  def update(name: String,password: String){
    DB.withConnection{ implicit s =>
      SQL(
        """
            update user set password = {password} where name = {name}
        """.stripMargin
      ).on(
        'password -> password,
        'name     ->     name
      ).executeUpdate()
    }
  }

  def delete(name: String){
    DB.withConnection { implicit c =>
      SQL("delete from user where name = {name}").on(
        'name -> name
      ).executeUpdate()
    }
  }

  def checkUserLogin(name: String, password: String): Option[User] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
         select * from user where
         name = {name} and password = {password}
        """
      ).on(
        'name -> name,
        'password -> password
      ).as(User.user.singleOpt)
    }
  }

  def findUserName(name: String): Option[User] =  {
    DB.withConnection{ implicit c =>
      SQL("select * from user where name = {name}").on(
        'name -> name
      ).as(User.user.singleOpt)
    }
  }
}