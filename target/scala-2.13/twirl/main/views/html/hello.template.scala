
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Hello")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
    """),format.raw/*3.5*/("""<section id="content">
      <div class="wrapper doc">
        <article>
          <h2>Hello """),_display_(/*6.22*/name),format.raw/*6.26*/("""!</h2>
        </article>  
        <aside>
          """),_display_(/*9.12*/commonSidebar()),format.raw/*9.27*/("""
        """),format.raw/*10.9*/("""</aside>
      </div>
    </section>
  """)))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-08-13T20:53:43.037215
                  SOURCE: /Users/hidenobumochigase/play-samples-play-scala-hello-world-tutorial/app/views/hello.scala.html
                  HASH: 0482e5fce91a462738fc2b45854a7fec04e537f4
                  MATRIX: 729->1|837->17|858->30|897->32|928->37|1048->131|1072->135|1153->190|1188->205|1224->214
                  LINES: 21->1|26->2|26->2|26->2|27->3|30->6|30->6|33->9|33->9|34->10
                  -- GENERATED --
              */
          