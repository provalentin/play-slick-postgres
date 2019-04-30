
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/val/Developer/play-postgres-slick/examples/play-slick-example/conf/routes
// @DATE:Tue Apr 30 23:40:26 EEST 2019


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
