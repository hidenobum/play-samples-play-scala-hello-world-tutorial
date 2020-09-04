// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hidenobumochigase/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Thu Aug 13 20:47:40 EDT 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:8
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
    // @LINE:10
    def hello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.hello",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
