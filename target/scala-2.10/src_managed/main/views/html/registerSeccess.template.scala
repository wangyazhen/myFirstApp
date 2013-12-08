
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
object registerSeccess extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""

"""),_display_(Seq[Any](/*3.2*/main("My Test login")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
	<h2>注册成功</h2>
	username:
	"""),_display_(Seq[Any](/*6.3*/user/*6.7*/.name)),format.raw/*6.12*/("""
    """),format.raw/*7.34*/("""
""")))})))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 08 12:39:10 CST 2013
                    SOURCE: E:/workspace/myFirstApp/app/views/registerSeccess.scala.html
                    HASH: 5d55bdfbd8baca4ad52f86f2f77939ed5128dd2e
                    MATRIX: 564->1|670->13|707->16|736->37|774->38|837->67|848->71|874->76|906->110
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|27->6|28->7
                    -- GENERATED --
                */
            