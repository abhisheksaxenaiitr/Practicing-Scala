
package Functional_Programming_In_Scala

import scala.annotation.tailrec

object higherOrderFunctions extends App {
  def square(s: (Int => Int), n: Int, x: Int): Int = {
    if (n <= 0) x
    else square(s, n - 1, s(x))
  }

  val squaring = (y: Int) => y * y
  println(square(squaring, 5, 2))

  println(squaring(9))

  def power(f: BigInt => BigInt, n: Int, x: BigInt): BigInt = {
    if (n <= 0) x
    else power(f, n - 1, f(x))
  }

  def c(y: BigInt): BigInt = y * y

  println(power(c, 5, 2))


  @tailrec
  def badasum(f: Int => Int, n: Int, x: Int): Int = {
    if (n <= 0) x
    else badasum(f, n - 1, f(x))
  }

  val plusone = (x: Int) => x + 1

  println(badasum(plusone, 10, 2))

  def f: (Int, Int) => Int = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  println(f(10, 2))

}
