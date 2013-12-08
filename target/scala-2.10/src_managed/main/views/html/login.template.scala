
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[scala.Tuple2[String, String]],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[(String, String)]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title>my login page</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>

"""),_display_(Seq[Any](/*11.2*/main("My Test authenticate")/*11.30*/{_display_(Seq[Any](format.raw/*11.31*/("""
    """),_display_(Seq[Any](/*12.6*/form(routes.Application.authenticate)/*12.43*/ {_display_(Seq[Any](format.raw/*12.45*/("""
        <h2>This is a login page</h2>
        用户名："""),_display_(Seq[Any](/*14.14*/inputText(loginForm("name")))),format.raw/*14.42*/("""
        密  码："""),_display_(Seq[Any](/*15.15*/inputPassword(loginForm("password")))),format.raw/*15.51*/("""
        """),_display_(Seq[Any](/*16.10*/loginForm/*16.19*/.errors.map/*16.30*/{ error =>_display_(Seq[Any](format.raw/*16.40*/(""" """),_display_(Seq[Any](/*16.42*/error/*16.47*/.message))))})),format.raw/*16.56*/("""
        <p>
            <button type="submit" id="loginbutton">Login</button>
        </p>
    """)))})),format.raw/*20.6*/("""
 """)))})),format.raw/*21.3*/("""
    </body>
</html>"""))}
    }
    
    def render(loginForm:Form[scala.Tuple2[String, String]]): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[scala.Tuple2[String, String]]) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 08 12:39:10 CST 2013
                    SOURCE: E:/workspace/myFirstApp/app/views/login.scala.html
                    HASH: 99ab402e32c165caebd7b1a6000beb2b2ed25cd0
                    MATRIX: 584->1|729->36|756->54|904->167|918->173|971->205|1078->277|1092->283|1149->318|1212->346|1249->374|1288->375|1329->381|1375->418|1415->420|1503->472|1553->500|1604->515|1662->551|1708->561|1726->570|1746->581|1794->591|1832->593|1846->598|1881->607|2009->704|2043->707
                    LINES: 19->1|23->1|24->3|27->6|27->6|27->6|28->7|28->7|28->7|32->11|32->11|32->11|33->12|33->12|33->12|35->14|35->14|36->15|36->15|37->16|37->16|37->16|37->16|37->16|37->16|37->16|41->20|42->21
                    -- GENERATED --
                */
            