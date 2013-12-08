
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Welcome FirstPage")/*1.27*/ {_display_(Seq[Any](format.raw/*1.29*/("""
    <a  href=""""),_display_(Seq[Any](/*2.16*/routes/*2.22*/.Application.loginOut)),format.raw/*2.43*/("""" style="float: right">EXIT APP</a>
    <h1>index  users(s)</h1>

    <a href=""""),_display_(Seq[Any](/*5.15*/routes/*5.21*/.Application.safety)),format.raw/*5.40*/("""">safety data</a>
    <h2>Add a new user</h2>
      <a href=""""),_display_(Seq[Any](/*7.17*/routes/*7.23*/.Application.register)),format.raw/*7.44*/("""">注册</a>
      <a href=""""),_display_(Seq[Any](/*8.17*/routes/*8.23*/.Application.login)),format.raw/*8.41*/("""">登录</a>
    <br/>
       <a href=""""),_display_(Seq[Any](/*10.18*/routes/*10.24*/.Application.queryAll)),format.raw/*10.45*/("""">查看所有用户</a>
""")))})),format.raw/*11.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 08 12:39:10 CST 2013
                    SOURCE: E:/workspace/myFirstApp/app/views/index.scala.html
                    HASH: 100092543d3395344b81615ddc66d0465814ee03
                    MATRIX: 646->1|679->26|718->28|769->44|783->50|825->71|940->151|954->157|994->176|1091->238|1105->244|1147->265|1207->290|1221->296|1260->314|1332->350|1347->356|1390->377|1435->391
                    LINES: 22->1|22->1|22->1|23->2|23->2|23->2|26->5|26->5|26->5|28->7|28->7|28->7|29->8|29->8|29->8|31->10|31->10|31->10|32->11
                    -- GENERATED --
                */
            