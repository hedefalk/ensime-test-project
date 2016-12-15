import net.liftweb.util.CssSel
import net.liftweb.util.Helpers._
import se.foo.bar.Thang

object Bar {
  import net.liftweb.util.CanBind._
  val b = strToCssBindPromoter("a").#>("foo")(stringTransform)
  val c = strToCssBindPromoter("a").#>("foo")(stringTransform)

  val x = "a" #> "foo" 

  val y = Thang("d")

  var adsf = new { def foo = 3 }

  val w = Set(1, 2, 3)

  val sa = new Baz {}
  
  new TimeSpan(2l)
  
}

trait Baz
