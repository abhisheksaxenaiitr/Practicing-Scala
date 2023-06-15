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




  def numberOfDigits(num:Int):Int = {
    @tailrec
    def totalDigits(n:Int, accumulator: Int):Int ={
      if (n<= 1) accumulator
      else totalDigits(n/10, accumulator + 1)
    }

    totalDigits(num, 1)


  }

  println(numberOfDigits(1345607))



  def sumOfDigits(num:Int):Int = {
    @tailrec
    def totalSum(n:Int, accumulator:Int): Int ={
      if (n==0) accumulator
      else totalSum(n/10, n%10 + accumulator)
    }

    totalSum(num, 0)
  }

  println(sumOfDigits(123416))







}


