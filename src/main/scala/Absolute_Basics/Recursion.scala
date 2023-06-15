package Absolute_Basics

import scala.annotation.tailrec

object Recursion extends App {
  def Factorial(x: Int): Int =
  {

    @tailrec
    def factorial(accumulator: Int, n: Int): Int =
    {
      if (n <= 1)
        accumulator
      else
        factorial(n * accumulator, n - 1)
    }
    factorial(1, x)
  }

  println(Factorial(5))







}


