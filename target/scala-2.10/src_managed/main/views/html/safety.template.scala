
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
object safety extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""
"""),_display_(Seq[Any](/*2.2*/main("this a safety data")/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""

    <h1>index  users(s) safety data</h1>
    <h3> Hello: <font color=red>"""),_display_(Seq[Any](/*5.34*/username)),format.raw/*5.42*/("""</font></h3>
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
                    SOURCE: E:/workspace/myFirstApp/app/views/safety.scala.html
                    HASH: 97e67a0eed1e2ef8ee5ce5d6497b3f01cd362e9f
                    MATRIX: 557->1|669->19|705->21|739->47|778->49|889->125|918->133|962->147
                    LINES: 19->1|22->1|23->2|23->2|23->2|26->5|26->5|27->6
                    -- GENERATED --
                */
            