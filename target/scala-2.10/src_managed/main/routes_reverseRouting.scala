// @SOURCE:E:/workspace/myFirstApp/conf/routes
// @HASH:0ea429cb1b0511de16063210ec546cfa330a6f93
// @DATE:Sun Dec 08 12:39:09 CST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:20
def deleteUserByName(name:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "Users/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:23
def updateUser(name:String): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "Users/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:19
def addUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "Users")
}
                                                

// @LINE:22
def queryUser(name:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Users/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
}
                                                

// @LINE:8
def loginOut(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loginOut")
}
                                                

// @LINE:13
def doRegister(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "doregister")
}
                                                

// @LINE:10
def logSuccess(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "loginSuccess")
}
                                                

// @LINE:12
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:15
def queryAll(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "allUser")
}
                                                

// @LINE:21
def queryAllUser(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "Users")
}
                                                

// @LINE:14
def safety(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "safety")
}
                                                

// @LINE:16
def findUser(a:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("a", a)))))
}
                                                

// @LINE:11
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "authenticate")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:20
def deleteUserByName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteUserByName",
   """
      function(name) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "Users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:23
def updateUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateUser",
   """
      function(name) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "Users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:19
def addUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Users"})
      }
   """
)
                        

// @LINE:22
def queryUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.queryUser",
   """
      function(name) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Users/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name))})
      }
   """
)
                        

// @LINE:8
def loginOut : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginOut",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginOut"})
      }
   """
)
                        

// @LINE:13
def doRegister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doRegister",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "doregister"})
      }
   """
)
                        

// @LINE:10
def logSuccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logSuccess",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSuccess"})
      }
   """
)
                        

// @LINE:12
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:15
def queryAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.queryAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allUser"})
      }
   """
)
                        

// @LINE:21
def queryAllUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.queryAllUser",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Users"})
      }
   """
)
                        

// @LINE:14
def safety : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.safety",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "safety"})
      }
   """
)
                        

// @LINE:16
def findUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.findUser",
   """
      function(a) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("a", a)])})
      }
   """
)
                        

// @LINE:11
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:26
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:20
def deleteUserByName(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteUserByName(name), HandlerDef(this, "controllers.Application", "deleteUserByName", Seq(classOf[String]), "DELETE", """""", _prefix + """Users/$name<[^/]+>""")
)
                      

// @LINE:23
def updateUser(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateUser(name), HandlerDef(this, "controllers.Application", "updateUser", Seq(classOf[String]), "PUT", """""", _prefix + """Users/$name<[^/]+>""")
)
                      

// @LINE:19
def addUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addUser(), HandlerDef(this, "controllers.Application", "addUser", Seq(), "POST", """ RESTful""", _prefix + """Users""")
)
                      

// @LINE:22
def queryUser(name:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.queryUser(name), HandlerDef(this, "controllers.Application", "queryUser", Seq(classOf[String]), "GET", """""", _prefix + """Users/$name<[^/]+>""")
)
                      

// @LINE:8
def loginOut(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginOut(), HandlerDef(this, "controllers.Application", "loginOut", Seq(), "GET", """""", _prefix + """loginOut""")
)
                      

// @LINE:13
def doRegister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doRegister(), HandlerDef(this, "controllers.Application", "doRegister", Seq(), "POST", """""", _prefix + """doregister""")
)
                      

// @LINE:10
def logSuccess(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logSuccess(), HandlerDef(this, "controllers.Application", "logSuccess", Seq(), "GET", """""", _prefix + """loginSuccess""")
)
                      

// @LINE:12
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:15
def queryAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.queryAll(), HandlerDef(this, "controllers.Application", "queryAll", Seq(), "GET", """""", _prefix + """allUser""")
)
                      

// @LINE:21
def queryAllUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.queryAllUser(), HandlerDef(this, "controllers.Application", "queryAllUser", Seq(), "GET", """""", _prefix + """Users""")
)
                      

// @LINE:14
def safety(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.safety(), HandlerDef(this, "controllers.Application", "safety", Seq(), "GET", """""", _prefix + """safety""")
)
                      

// @LINE:16
def findUser(a:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.findUser(a), HandlerDef(this, "controllers.Application", "findUser", Seq(classOf[String]), "GET", """""", _prefix + """test""")
)
                      

// @LINE:11
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """authenticate""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    