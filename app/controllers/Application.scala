package controllers

import models._
import play.api.mvc._
import play.api.mvc.Results._
import play.api.data._
import play.api.data.Forms._
import play.api.libs.json._
import play.api.libs.functional.syntax._
import scala.Some
import  scala.concurrent.Future

object Application extends Controller{

  trait Reads[A] {
    self =>
    def reads(json: JsValue): A
  }

  implicit val userReads = new Reads[User] {
    def reads(js: JsValue): User = {
      User(
        (js \ "name").as[String],
        (js \ "password").as[String]
      )
    }
  }



  implicit val createWrites = (
      (__ \ "name").write[String] and
      (__ \ "password").write[String]
    )(unlift(User.unapply))

  val userForm: Form[User] = Form( mapping(
      "name" -> nonEmptyText(minLength = 6)	,
      "password"  -> tuple(
          "main" -> text(minLength = 6),
          "confirm" -> text
       ).verifying(
          "两次密码输入不一致", password => password._1 == password._2
       )
    )
    {
        (name, password ) => User(name,password._1)
    }
    {
        user => Some(user.name, (user.password, ""))
    }
  )

  val loginForm = Form(
      tuple(
        "name" -> text,
        "password" -> text
      ).verifying ("用户名和密码输入不正确", result => result match{
        case (name,password) => User.checkUserLogin(name ,password).isDefined
      })
  )

  def index = Action {
      Ok(views.html.index())
  }

  def loginOut = Action {
      Redirect(routes.Application.index).withNewSession.flashing("success" -> "您已成功退出")
  }

  def login = Action {
      Ok(views.html.login(loginForm))
  }

  def safety =  Authenticated{ implicit  req =>
      Ok(views.html.safety(req.username))
  }

  def logSuccess =  Authenticated{ implicit  req =>
      Ok(views.html.logSuccess(req.username))
  }

  def authenticate = Action{  implicit request =>
      loginForm.bindFromRequest.fold(
        errors => BadRequest(views.html.login(errors)),
        user  => Redirect(routes.Application.logSuccess).withSession("username" -> user._1)
      )
  }

  def register = Action {
      Ok(views.html.register(userForm))
  }
  def queryAll = Action{
    val list =  User.queryAll()
    Ok(views.html.allUsers(list))
  }

  def test(a:String) = Action {
      //Ok(a.toString);
      Ok("abcdefghijkl");
  }
  def findUser(name: String) = Action { request =>
    val u = User.findUserName(name)
    if(u != None){
      Ok("<font color='red'>该用户名已被注册!</font>")
    }else{
      Ok("<font color='green'>该用户名可以使用!</font>")
    }
  }


  def doRegister = Action { implicit request =>
      userForm.bindFromRequest.fold(
      errors => BadRequest(views.html.register(errors)),
      user => {
        User.save(user)
        Ok(views.html.registerSeccess(user))
      }
    )
  }

  // json crud
  def addUser = Action { implicit request =>
      val users:JsValue = request.body.asJson.get \ "user"
      val user = userReads.reads(users)
      println("this is :"+ user)
      User.save(user)
      Ok(Json.toJson(Json.obj("name" -> user.name,"password" -> user.password)))
  }

  def deleteUserByName(name: String) = Action { implicit request =>
      User.delete(name)
      Ok(Json.toJson(Map("DeleteSuccess::"+name -> true)))
  }

  def queryAllUser = Action { implicit request =>
      val userList: List[User] = User.queryAll()
      Ok(Json.toJson(userList))
  }

  def queryUser(name: String) = Action { request =>
      val u = User.findUserName(name)
      Ok(Json.toJson(u))
  }

  def updateUser(name: String) = Action { implicit request =>
      val users:JsValue = request.body.asJson.get \ "password"
      val password = users.as[String]
      User.update(name,password)
      Ok(Json.toJson(Json.obj("name" -> name,"password" -> password)))
  }


}

class AuthenticatedRequest[A](val username: String, request: Request[A]) extends WrappedRequest[A](request)

 object Authenticated extends ActionBuilder[AuthenticatedRequest] {
  def invokeBlock[A](request: Request[A], block: (AuthenticatedRequest[A]) => Future[SimpleResult]) = {
      request.session.get("username").map { username =>
        block(new AuthenticatedRequest(username, request))
      } getOrElse {
        Future.successful(Ok(views.html.login(Application.loginForm)))
      }
  }
}
