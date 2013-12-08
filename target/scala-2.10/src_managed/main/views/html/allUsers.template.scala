
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
object allUsers extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: List[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.24*/("""

"""),_display_(Seq[Any](/*3.2*/main("My  AllUsers")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""

    """),_display_(Seq[Any](/*5.6*/userForm/*5.14*/.map/*5.18*/ { user =>_display_(Seq[Any](format.raw/*5.28*/("""

            <table style="width: 600px;border: 1px solid seagreen;">
                <tr style="height: 50px; border: 1px solid royalblue;">
                    <td>用户名：</td>
                    <td>"""),_display_(Seq[Any](/*10.26*/user/*10.30*/.name)),format.raw/*10.35*/("""</td>
                    <td>用户密码：</td>
                    <td><input size="10" value=""""),_display_(Seq[Any](/*12.50*/user/*12.54*/.password)),format.raw/*12.63*/("""" >
                        <button value=""""),_display_(Seq[Any](/*13.41*/user/*13.45*/.name)),format.raw/*13.50*/("""" onclick="deleteUser(this.value);">删除</button>
						<button value=""""),_display_(Seq[Any](/*14.23*/user/*14.27*/.name)),format.raw/*14.32*/("""" onclick="updateUser(this.value);">修改</button>
					</td>
                </tr>
            </table>
    """)))})),format.raw/*18.6*/("""
    用户名：<input id="name" type="text" onkeyup="check(this.value);"><span id="mesg"></span>
    密码：  <input id="password" type="password" >
    <!--<br/>Message：<span id="messg"></span>-->
    <button onclick="addUser();">添加</button><br/><br/>
	请输入修改后的密码：<input id="updatepassword" type="password">
	请确认密码：<input id="updatepassword2" type="password">

    <script type="text/javascript">
        function addUser()"""),format.raw/*27.27*/("""{"""),format.raw/*27.28*/("""
            var xmlhttp = createXMLHttpReq();
            var name = document.getElementById('name').value
            var password = document.getElementById('password').value
            var user = """),format.raw/*31.24*/("""{"""),format.raw/*31.25*/(""""user":"""),format.raw/*31.32*/("""{"""),format.raw/*31.33*/("""name    : name, password: password"""),format.raw/*31.67*/("""}"""),format.raw/*31.68*/("""}"""),format.raw/*31.69*/(""";
            if(name.length < 4 || password.length < 4)"""),format.raw/*32.55*/("""{"""),format.raw/*32.56*/("""
                alert("请核对用户名或密码长度！最少4位！");
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""else"""),format.raw/*34.18*/("""{"""),format.raw/*34.19*/("""
                xmlhttp.onreadystatechange = function ()"""),format.raw/*35.57*/("""{"""),format.raw/*35.58*/("""
                //alert(name+"pass: "+ password +" status: "+ xmlhttp.status)
                    if(xmlhttp.readyState == 4 && xmlhttp.status == 200)"""),format.raw/*37.73*/("""{"""),format.raw/*37.74*/("""
                        //alert("xmlhttp.responseText: "+xmlhttp.responseText);
                        //document.getElementById("messg" ).innerHTML = xmlhttp.responseText;
                    """),format.raw/*40.21*/("""}"""),format.raw/*40.22*/("""
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/("""
                var url = "http://localhost:9000/Users";
                xmlhttp.open("post", url, true);
                xmlhttp.setRequestHeader("Content-Type","application/json");
                //alert(JSON.stringify(user));
                xmlhttp.send(JSON.stringify(user));
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""
            window.setTimeout("window.location.reload()",800);
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""

		function updateUser(username)"""),format.raw/*51.32*/("""{"""),format.raw/*51.33*/("""
            var xmlhttp = createXMLHttpReq();
            var password1 = document.getElementById("updatepassword").value
            var password2 = document.getElementById("updatepassword2").value
			//alert("password1 :"+ password1 +" password2: "+password2);
            //var user = """),format.raw/*56.26*/("""{"""),format.raw/*56.27*/(""""user":"""),format.raw/*56.34*/("""{"""),format.raw/*56.35*/("""name    : name, password: password"""),format.raw/*56.69*/("""}"""),format.raw/*56.70*/("""}"""),format.raw/*56.71*/(""";
			var userPassword = """),format.raw/*57.23*/("""{"""),format.raw/*57.24*/(""""password":password1"""),format.raw/*57.44*/("""}"""),format.raw/*57.45*/(""";
            if(password1.length < 4)"""),format.raw/*58.37*/("""{"""),format.raw/*58.38*/("""
                alert("请核对密码长度！最少4位！");
            """),format.raw/*60.13*/("""}"""),format.raw/*60.14*/("""else if(password1 == password2)"""),format.raw/*60.45*/("""{"""),format.raw/*60.46*/("""
                xmlhttp.onreadystatechange = function ()"""),format.raw/*61.57*/("""{"""),format.raw/*61.58*/("""
                    if(xmlhttp.readyState == 4 && xmlhttp.status == 200)"""),format.raw/*62.73*/("""{"""),format.raw/*62.74*/("""
                        //alert("xmlhttp.responseText: "+xmlhttp.responseText);
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/("""
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/("""
                var url = "http://localhost:9000/Users/" + username;
				//alert("URL:"+ url+" ||username:" + username);
                xmlhttp.open("PUT", url, true);
                xmlhttp.setRequestHeader("Content-Type","application/json");
                //alert(JSON.stringify(userPassword));
                xmlhttp.send(JSON.stringify(userPassword));
                window.setTimeout("window.location.reload()",800);
			"""),format.raw/*73.4*/("""}"""),format.raw/*73.5*/("""else"""),format.raw/*73.9*/("""{"""),format.raw/*73.10*/("""
				alert("请确认两次密码是否一致！");
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/("""
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/("""

        function createXMLHttpReq()"""),format.raw/*78.36*/("""{"""),format.raw/*78.37*/("""
            if(window.XMLHttpRequest)"""),format.raw/*79.38*/("""{"""),format.raw/*79.39*/("""
                return new XMLHttpRequest();
            """),format.raw/*81.13*/("""}"""),format.raw/*81.14*/("""else if(window.ActiveXObject)"""),format.raw/*81.43*/("""{"""),format.raw/*81.44*/("""
                return new ActiveXObject("Microsoft.XMLHTTP");
            """),format.raw/*83.13*/("""}"""),format.raw/*83.14*/("""else"""),format.raw/*83.18*/("""{"""),format.raw/*83.19*/("""
                document.write("您的浏览器不支持Ajax");
            """),format.raw/*85.13*/("""}"""),format.raw/*85.14*/("""
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""
        function check(str)"""),format.raw/*87.28*/("""{"""),format.raw/*87.29*/("""
            if(str.length != 0)"""),format.raw/*88.32*/("""{"""),format.raw/*88.33*/("""
                var xmlhttp = createXMLHttpReq();
                xmlhttp.onreadystatechange = function()"""),format.raw/*90.56*/("""{"""),format.raw/*90.57*/("""
                    if(xmlhttp.readyState == 4 && xmlhttp.status == 200)"""),format.raw/*91.73*/("""{"""),format.raw/*91.74*/("""
                        document.getElementById("mesg" ).innerHTML = xmlhttp.responseText;
                    """),format.raw/*93.21*/("""}"""),format.raw/*93.22*/("""
                """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/("""
                xmlhttp.open("get","http://localhost:9000/test?a="+ str, true);
                xmlhttp.send();
            """),format.raw/*97.13*/("""}"""),format.raw/*97.14*/("""
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/("""

        function deleteUser(str)"""),format.raw/*100.33*/("""{"""),format.raw/*100.34*/("""
            //alert(str);
            if(str.length == 0)"""),format.raw/*102.32*/("""{"""),format.raw/*102.33*/("""
                document.getElementById("msg").innerHTML="";
            """),format.raw/*104.13*/("""}"""),format.raw/*104.14*/("""else"""),format.raw/*104.18*/("""{"""),format.raw/*104.19*/("""
                var xmlhttp = createXMLHttpReq();
                xmlhttp.onreadystatechange = function()"""),format.raw/*106.56*/("""{"""),format.raw/*106.57*/("""
                    if(xmlhttp.readyState == 4)"""),format.raw/*107.48*/("""{"""),format.raw/*107.49*/("""
                        console.log(xmlhttp.status);
                    if(xmlhttp.status == 200 || xmlhttp.status == 0)"""),format.raw/*109.69*/("""{"""),format.raw/*109.70*/("""
                        //document.getElementById("msg").innerHTML= xmlhttp.responseText;
                        console.log("responseText" + xmlhttp.responseText);
                    """),format.raw/*112.21*/("""}"""),format.raw/*112.22*/("""
                    """),format.raw/*113.21*/("""}"""),format.raw/*113.22*/("""else"""),format.raw/*113.26*/("""{"""),format.raw/*113.27*/("""
                        //document.getElementById("msg").innerHTML= "已经启动open(), 尚未send()";
                    """),format.raw/*115.21*/("""}"""),format.raw/*115.22*/("""
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/("""
                var url = "http://localhost:9000/Users/"+str;
                xmlhttp.open("DELETE",url,true);
                xmlhttp.send();
                //document.getElementById("msg" ).innerHTML = xmlhttp.responseText;
            """),format.raw/*121.13*/("""}"""),format.raw/*121.14*/("""
            window.setTimeout("location.reload()",420);
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/("""
    </script>
""")))})),format.raw/*125.2*/("""

"""))}
    }
    
    def render(userForm:List[User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((List[User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 08 15:56:38 CST 2013
                    SOURCE: E:/workspace/myFirstApp/app/views/allUsers.scala.html
                    HASH: 92da0df38de26d8901026bcdd677431e6383422a
                    MATRIX: 563->1|679->23|716->26|744->46|782->47|823->54|839->62|851->66|898->76|1136->278|1149->282|1176->287|1302->377|1315->381|1346->390|1426->434|1439->438|1466->443|1572->513|1585->517|1612->522|1750->629|2191->1042|2220->1043|2448->1243|2477->1244|2512->1251|2541->1252|2603->1286|2632->1287|2661->1288|2745->1344|2774->1345|2859->1402|2888->1403|2920->1407|2949->1408|3034->1465|3063->1466|3242->1617|3271->1618|3494->1813|3523->1814|3568->1831|3597->1832|3920->2127|3949->2128|4048->2200|4077->2201|4138->2234|4167->2235|4484->2524|4513->2525|4548->2532|4577->2533|4639->2567|4668->2568|4697->2569|4749->2593|4778->2594|4826->2614|4855->2615|4921->2653|4950->2654|5031->2707|5060->2708|5119->2739|5148->2740|5233->2797|5262->2798|5363->2871|5392->2872|5521->2973|5550->2974|5595->2991|5624->2992|6083->3424|6111->3425|6142->3429|6171->3430|6239->3470|6268->3471|6304->3480|6333->3481|6398->3518|6427->3519|6493->3557|6522->3558|6608->3616|6637->3617|6694->3646|6723->3647|6827->3723|6856->3724|6888->3728|6917->3729|7006->3790|7035->3791|7071->3800|7100->3801|7156->3829|7185->3830|7245->3862|7274->3863|7408->3969|7437->3970|7538->4043|7567->4044|7707->4156|7736->4157|7781->4174|7810->4175|7963->4300|7992->4301|8028->4310|8057->4311|8120->4345|8150->4346|8237->4404|8267->4405|8370->4479|8400->4480|8433->4484|8463->4485|8598->4591|8628->4592|8705->4640|8735->4641|8886->4763|8916->4764|9132->4951|9162->4952|9212->4973|9242->4974|9275->4978|9305->4979|9447->5092|9477->5093|9523->5110|9553->5111|9822->5351|9852->5352|9945->5417|9975->5418|10023->5434
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|26->5|31->10|31->10|31->10|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|39->18|48->27|48->27|52->31|52->31|52->31|52->31|52->31|52->31|52->31|53->32|53->32|55->34|55->34|55->34|55->34|56->35|56->35|58->37|58->37|61->40|61->40|62->41|62->41|68->47|68->47|70->49|70->49|72->51|72->51|77->56|77->56|77->56|77->56|77->56|77->56|77->56|78->57|78->57|78->57|78->57|79->58|79->58|81->60|81->60|81->60|81->60|82->61|82->61|83->62|83->62|85->64|85->64|86->65|86->65|94->73|94->73|94->73|94->73|96->75|96->75|97->76|97->76|99->78|99->78|100->79|100->79|102->81|102->81|102->81|102->81|104->83|104->83|104->83|104->83|106->85|106->85|107->86|107->86|108->87|108->87|109->88|109->88|111->90|111->90|112->91|112->91|114->93|114->93|115->94|115->94|118->97|118->97|119->98|119->98|121->100|121->100|123->102|123->102|125->104|125->104|125->104|125->104|127->106|127->106|128->107|128->107|130->109|130->109|133->112|133->112|134->113|134->113|134->113|134->113|136->115|136->115|137->116|137->116|142->121|142->121|144->123|144->123|146->125
                    -- GENERATED --
                */
            