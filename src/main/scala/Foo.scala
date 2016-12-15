import net.liftweb
import net.liftweb.util.Helpers._
import scalaz.Scalaz._

// hover for type + click
// goto decl
// errors
// code completion
// format
// organize imports
// search type
// docs
// implicits

trait Buh {
  type Member
  val member: Member
  override def toString = "buh"

}

object Foo extends Buh {
  def asdfasdf = super.toString

  type Member = String

  val member = ""

  def foo2(asdf: Int, y: Int) = asdf + y
  val asdafsd = foo2(2, 2)

  def curried(x: Int)(implicit y: Int, z: Int) = x + y + z

  val apa = curried(3)(5, 6)
  implicit val y = 3

  val z = curried(2)

  val bar = 3
  def baz = (some(1) |@| some(2))
  val baz2 = baz.apply { _ * _ }

  val test = "#data-lift-id *" #> "foo"

  val cssTransform = test

  base64EncodeURLSafe(null)
  val x = cssTransform
}

object Demo {
  def z(a: Int)(f: Int => Double)(g: Double => Int): Int = ???
  def f(a: Int)(f: Int => Double): Int = ???
  def g(a: Int) = Demo.f(a) _
}
