package Absolute_Basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

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




  def reverseInteger(num:Int):Int = {
    @tailrec
    def reversedNumber(n: Int, accumulator: Int):Int ={
      if (n <= 1) accumulator + n%10
      else reversedNumber(n/10, ((n%10) + accumulator)*10 )
    }

    reversedNumber(num, 0)
  }

  println(reverseInteger(12367))




  def powerOfNumber(num:Int, power:Int): Int = {
    def calculatedNumber(n:Int, p:Int, accumulator:Int):Int = {
      if (p==0) accumulator
      else calculatedNumber(n, p-1, accumulator*n)
    }

    calculatedNumber(num, power, 1)
  }

  println(powerOfNumber(5,4))




  def sumOfnNaturalNumbers(num:Int) :Int ={
    def totalSum(n:Int, accumulator:Int):Int = {
      if (n==0) accumulator
      else totalSum(n-1, n + accumulator)
    }

    totalSum(num, 0)
  }

  println(sumOfnNaturalNumbers(10))





  val arr: Array[Int] = Array(1,2,5,0,10,-1)

  def minimumElement(array: Array[Int]): Int ={
    val l = array.length
    def minimumNumber(arr: Array[Int], size: Int, accumulator: Int):Int = {
      if (size<=1) accumulator
      else minimumNumber(arr, size-1, if (accumulator>arr(size-2)) arr(size-2) else accumulator)
    }

    minimumNumber(array, l,  array(array.length-1))
  }

  println(minimumElement(arr))




  def checkPrime(num:Int): Boolean = {
    def ifPrime(n: Int, accumulator: Int) : Boolean ={
      if (accumulator == 0) false
      else if (n<=2) true
      else ifPrime(n-1, num%(n-1) )
    }

    ifPrime(num, 1)
  }

  println(checkPrime(23))




  def concatenateString(given_string: String, times: Int): String = {
    def finalString(str: String, n: Int, accumulator: String): String = {
      if (n<=0) accumulator
      else finalString(str, n-1, str + accumulator)
    }

    finalString(given_string, times, "")
  }

  println(concatenateString("Hello", 5))


/*  def fiboncciNumber(position: Int):Int ={
    def fibonacci(s: Int, e:Int, accumulator: Int, l:Int):Int = {
      if (l<=1) accumulator + 1
      else fibonacci(e, s + e,  s + e  , l-1)
    }


    fibonacci(0, 1, 0, position)
  }

  println(fiboncciNumber(6))

//  0 1 1 2 3 5 8 13 21 34 55*/





}


