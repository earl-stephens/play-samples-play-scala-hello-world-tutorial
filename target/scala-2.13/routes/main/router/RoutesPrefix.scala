// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/earltstephens/turing/1903_4module/playground/1sep19/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Sep 01 13:01:34 MDT 2019


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
