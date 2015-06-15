import scalaz._
import Scalaz._

import net.liftweb.util.Helpers._

// hover for type
// goto decl
// errors
// code completion

object Foo {

  def foo(asdf: Int, y: Int) = asdf + y

  def curried(x: Int)(y: Int) = x + y

  def a = curried(2) _

  def bar = foo(2, 3)

  val x = bar

  def baz = (some(1) |@| some(2)) {_ * _}

  val cssTransform = "#data-lift-id *" #> "foo"

base64EncodeURLSafe(null)
}
