
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("My Test doregister")/*4.28*/{_display_(Seq[Any](format.raw/*4.29*/("""
	"""),_display_(Seq[Any](/*5.3*/form(routes.Application.doRegister)/*5.38*/ {_display_(Seq[Any](format.raw/*5.40*/("""
	    请输入用户名
        """),_display_(Seq[Any](/*7.10*/inputText(userForm("name")))),format.raw/*7.37*/("""
		请输入密码
		"""),_display_(Seq[Any](/*9.4*/inputPassword(userForm("password.main")))),format.raw/*9.44*/("""
		请确认密码
	    """),_display_(Seq[Any](/*11.7*/inputPassword(userForm("password.confirm")))),format.raw/*11.50*/("""

        """),_display_(Seq[Any](/*13.10*/userForm/*13.18*/.errors.map/*13.29*/ { error =>_display_(Seq[Any](format.raw/*13.40*/("""
             """),_display_(Seq[Any](/*14.15*/error/*14.20*/.message)),format.raw/*14.28*/("""
        """)))})),format.raw/*15.10*/("""
        <br/>
        <input type="submit" value="DoRegister">
    """)))})),format.raw/*18.6*/("""
    <script type="text/javascript">

    function loadMsg(str)"""),format.raw/*21.26*/("""{"""),format.raw/*21.27*/("""
        var xmlhttp ;
        if(str.length == 0)"""),format.raw/*23.28*/("""{"""),format.raw/*23.29*/("""
        document.getElementById("msg").innerHTML="0"
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""else"""),format.raw/*25.14*/("""{"""),format.raw/*25.15*/("""
        if(window.XMLHttpRequest)"""),format.raw/*26.34*/("""{"""),format.raw/*26.35*/("""
        xmlhttp = new XMLHttpRequest();
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/("""else if(window.ActiveXObject)"""),format.raw/*28.39*/("""{"""),format.raw/*28.40*/("""
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""else"""),format.raw/*30.14*/("""{"""),format.raw/*30.15*/("""
        document.write("您的浏览器不支持Ajax");
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/("""
        xmlhttp.onreadystatechange = function()"""),format.raw/*33.48*/("""{"""),format.raw/*33.49*/("""
        if(xmlhttp.readyState == 4)"""),format.raw/*34.36*/("""{"""),format.raw/*34.37*/("""
        console.log(xmlhttp.status);
        if(xmlhttp.status == 200 || xmlhttp.status == 0)"""),format.raw/*36.57*/("""{"""),format.raw/*36.58*/("""
        document.getElementById("msg").innerHTML= xmlhttp.responseText;
        console.log("responseText" + xmlhttp.responseText);
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""else"""),format.raw/*40.14*/("""{"""),format.raw/*40.15*/("""
        document.getElementById("msg").innerHTML= "已经启动open(), 尚未send()";
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/("""
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/("""
        var url = "http://localhost:9000/test";
        url = addURLParam(url,"a", str);
        console.log("request: " + url);
        xmlhttp.open("GET",url,true);
        xmlhttp.send(null);
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""
    """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""

    // 封装的请求方法
    function addURLParam (url, name, value) """),format.raw/*53.45*/("""{"""),format.raw/*53.46*/("""
    url += (url.indexOf("?") == -1 ? "?" : "&");
    url += encodeURIComponent(name) + "=" + encodeURIComponent(value);
    return url;
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""

    </script>
""")))})),format.raw/*60.2*/("""

"""))}
    }
    
    def render(userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 08 12:39:10 CST 2013
                    SOURCE: E:/workspace/myFirstApp/app/views/register.scala.html
                    HASH: eae97da98541d5923b06b9e1947e27960b72f68c
                    MATRIX: 563->1|695->23|722->41|758->43|792->69|830->70|867->73|910->108|949->110|1006->132|1054->159|1100->171|1161->211|1211->226|1276->269|1323->280|1340->288|1360->299|1409->310|1460->325|1474->330|1504->338|1546->348|1646->417|1737->480|1766->481|1844->531|1873->532|1962->594|1991->595|2023->599|2052->600|2114->634|2143->635|2219->684|2248->685|2305->714|2334->715|2428->782|2457->783|2489->787|2518->788|2594->837|2623->838|2699->886|2728->887|2792->923|2821->924|2943->1018|2972->1019|3140->1160|3169->1161|3205->1170|3234->1171|3266->1175|3295->1176|3405->1259|3434->1260|3470->1269|3499->1270|3730->1474|3759->1475|3791->1480|3819->1481|3908->1542|3937->1543|4105->1684|4133->1685|4181->1702
                    LINES: 19->1|23->1|24->3|25->4|25->4|25->4|26->5|26->5|26->5|28->7|28->7|30->9|30->9|32->11|32->11|34->13|34->13|34->13|34->13|35->14|35->14|35->14|36->15|39->18|42->21|42->21|44->23|44->23|46->25|46->25|46->25|46->25|47->26|47->26|49->28|49->28|49->28|49->28|51->30|51->30|51->30|51->30|53->32|53->32|54->33|54->33|55->34|55->34|57->36|57->36|60->39|60->39|61->40|61->40|61->40|61->40|63->42|63->42|64->43|64->43|70->49|70->49|71->50|71->50|74->53|74->53|78->57|78->57|81->60
                    -- GENERATED --
                */
            