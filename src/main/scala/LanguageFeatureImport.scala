object LanguageFeatureImport {

  abstract class Thing[T] {
    def bar: String
  }

  val thang = new Thing[String] {
    def foo = "bar"
    def bar = foo
  }

  def bar = {
    import scala.language.reflectiveCalls
    thang.foo
  }
  
  trait A[B, C] 
  val x : A[A[_, Int], Int] = ??? 

}
