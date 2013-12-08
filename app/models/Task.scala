package models
import play.api.db._
import play.api.Play.current
import anorm._
import anorm.SqlParser._


case class Task(id: Long, label: String,pass: String)

object Task{
   val task = {
	get[Long]("id")~
	get[String]("label")~
	get[String]("pass") map{
	   case id~label~pass => Task(id,label,pass)
	}
   }
	def all(): List[Task] = DB.withConnection { implicit c =>	
		SQL("select * from task").as(task *)
	}
	def create(label: String,pass: String){
		  DB.withConnection { implicit c =>    
		  SQL("insert into task(label,pass) values ({label},{pass})").on(
		      'label -> label,
		      'pass  -> pass
		      ).executeUpdate()
		  }
	}
	def delete(id: Long){
		DB.withConnection { implicit c =>
		    SQL("delete from task where id = {id}").on(
		       'id -> id
		    ).executeUpdate()
		}
	}
}