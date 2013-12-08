
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
object loginSeccess extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("My Test login")/*1.23*/{_display_(Seq[Any](format.raw/*1.24*/("""
        <h1>Welcome 	</h1>
    <h2>登录成功</h2>

""")))})),format.raw/*5.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 08 12:39:10 CST 2013
                    SOURCE: E:/workspace/myFirstApp/app/views/loginSeccess.scala.html
                    HASH: 0e79c97e865d909b2094585bba0567b679db8e8d
                    MATRIX: 653->1|682->22|720->23|798->71
                    LINES: 22->1|22->1|22->1|26->5
                    -- GENERATED --
                */
            