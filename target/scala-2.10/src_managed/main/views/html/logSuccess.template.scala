
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object logSuccess extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""
"""),_display_(Seq[Any](/*2.2*/main("My Test login")/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
    <h1>登录成功</h1>
    <h2>Welcome:  """),_display_(Seq[Any](/*4.20*/username)),format.raw/*4.28*/(""" </h2>

""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(username:String): play.api.templates.HtmlFormat.Appendable = apply(username)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (username) => apply(username)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 08 12:39:10 CST 2013
                    SOURCE: E:/workspace/myFirstApp/app/views/logSuccess.scala.html
                    HASH: 3bb2fb022fe8c1a9d56dd0c68b31adad5098bd43
                    MATRIX: 561->1|673->19|709->21|738->42|776->43|849->81|878->89|917->98
                    LINES: 19->1|22->1|23->2|23->2|23->2|25->4|25->4|27->6
                    -- GENERATED --
                */
            