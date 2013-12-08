// @SOURCE:E:/workspace/myFirstApp/conf/routes
// @HASH:0ea429cb1b0511de16063210ec546cfa330a6f93
// @DATE:Sun Dec 08 12:39:09 CST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_loginOut1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginOut"))))
        

// @LINE:9
private[this] lazy val controllers_Application_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_logSuccess3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("loginSuccess"))))
        

// @LINE:11
private[this] lazy val controllers_Application_authenticate4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate"))))
        

// @LINE:12
private[this] lazy val controllers_Application_register5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:13
private[this] lazy val controllers_Application_doRegister6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("doregister"))))
        

// @LINE:14
private[this] lazy val controllers_Application_safety7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("safety"))))
        

// @LINE:15
private[this] lazy val controllers_Application_queryAll8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("allUser"))))
        

// @LINE:16
private[this] lazy val controllers_Application_findUser9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test"))))
        

// @LINE:19
private[this] lazy val controllers_Application_addUser10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Users"))))
        

// @LINE:20
private[this] lazy val controllers_Application_deleteUserByName11 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Users/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_Application_queryAllUser12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Users"))))
        

// @LINE:22
private[this] lazy val controllers_Application_queryUser13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Users/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Application_updateUser14 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Users/"),DynamicPart("name", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginOut""","""controllers.Application.loginOut"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """loginSuccess""","""controllers.Application.logSuccess"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.Application.authenticate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """doregister""","""controllers.Application.doRegister"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """safety""","""controllers.Application.safety"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """allUser""","""controllers.Application.queryAll"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.Application.findUser(a:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Users""","""controllers.Application.addUser"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Users/$name<[^/]+>""","""controllers.Application.deleteUserByName(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Users""","""controllers.Application.queryAllUser"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Users/$name<[^/]+>""","""controllers.Application.queryUser(name:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Users/$name<[^/]+>""","""controllers.Application.updateUser(name:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_loginOut1(params) => {
   call { 
        invokeHandler(controllers.Application.loginOut, HandlerDef(this, "controllers.Application", "loginOut", Nil,"GET", """""", Routes.prefix + """loginOut"""))
   }
}
        

// @LINE:9
case controllers_Application_login2(params) => {
   call { 
        invokeHandler(controllers.Application.login, HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_logSuccess3(params) => {
   call { 
        invokeHandler(controllers.Application.logSuccess, HandlerDef(this, "controllers.Application", "logSuccess", Nil,"GET", """""", Routes.prefix + """loginSuccess"""))
   }
}
        

// @LINE:11
case controllers_Application_authenticate4(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate, HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """authenticate"""))
   }
}
        

// @LINE:12
case controllers_Application_register5(params) => {
   call { 
        invokeHandler(controllers.Application.register, HandlerDef(this, "controllers.Application", "register", Nil,"GET", """""", Routes.prefix + """register"""))
   }
}
        

// @LINE:13
case controllers_Application_doRegister6(params) => {
   call { 
        invokeHandler(controllers.Application.doRegister, HandlerDef(this, "controllers.Application", "doRegister", Nil,"POST", """""", Routes.prefix + """doregister"""))
   }
}
        

// @LINE:14
case controllers_Application_safety7(params) => {
   call { 
        invokeHandler(controllers.Application.safety, HandlerDef(this, "controllers.Application", "safety", Nil,"GET", """""", Routes.prefix + """safety"""))
   }
}
        

// @LINE:15
case controllers_Application_queryAll8(params) => {
   call { 
        invokeHandler(controllers.Application.queryAll, HandlerDef(this, "controllers.Application", "queryAll", Nil,"GET", """""", Routes.prefix + """allUser"""))
   }
}
        

// @LINE:16
case controllers_Application_findUser9(params) => {
   call(params.fromQuery[String]("a", None)) { (a) =>
        invokeHandler(controllers.Application.findUser(a), HandlerDef(this, "controllers.Application", "findUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """test"""))
   }
}
        

// @LINE:19
case controllers_Application_addUser10(params) => {
   call { 
        invokeHandler(controllers.Application.addUser, HandlerDef(this, "controllers.Application", "addUser", Nil,"POST", """ RESTful""", Routes.prefix + """Users"""))
   }
}
        

// @LINE:20
case controllers_Application_deleteUserByName11(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.deleteUserByName(name), HandlerDef(this, "controllers.Application", "deleteUserByName", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """Users/$name<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_Application_queryAllUser12(params) => {
   call { 
        invokeHandler(controllers.Application.queryAllUser, HandlerDef(this, "controllers.Application", "queryAllUser", Nil,"GET", """""", Routes.prefix + """Users"""))
   }
}
        

// @LINE:22
case controllers_Application_queryUser13(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.queryUser(name), HandlerDef(this, "controllers.Application", "queryUser", Seq(classOf[String]),"GET", """""", Routes.prefix + """Users/$name<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Application_updateUser14(params) => {
   call(params.fromPath[String]("name", None)) { (name) =>
        invokeHandler(controllers.Application.updateUser(name), HandlerDef(this, "controllers.Application", "updateUser", Seq(classOf[String]),"PUT", """""", Routes.prefix + """Users/$name<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     