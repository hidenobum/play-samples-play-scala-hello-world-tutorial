// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hidenobumochigase/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Thu Aug 13 20:47:40 EDT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
