/*https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75*/

package LeetCodeQuestion

import scala.math.ceil

object GCDofStrings extends App {
  val str1 = "AA"
  val str2 = "A"


  def gcd(str1: String): String = {
    def divisorFunc(given_string: String, l:Int, accumulator:String):String = {
      if ((str1.length) / 2<=0) str1
      else if ((accumulator*(ceil(str1.length / accumulator.length).toInt) == str1) && accumulator.length != 0) accumulator
      else divisorFunc(given_string, l+1, given_string.substring(0,l))
    }

    divisorFunc(str1, 1, " " )
  }

  def GCDofStrings(str1:String, str2: String){
    val pattern = "^[A-Z]+$".r
    if ((1 <= str1.length && str2.length <= 1000) && (pattern.matches(str1) && pattern.matches(str2))) {
      if (gcd(str1) == gcd(str2)) gcd(str1) else ""
    }

    else "Can't Do"
  }



  println(GCDofStrings(str1, str2))




}



/*
object Solution {
  import scala.math.ceil

  def gcd(str1: String): String = {
    def divisorFunc(given_string: String, l:Int, accumulator:String):String = {
      if ((str1.length) / 2<=1) str1
      else if ((accumulator*(ceil(str1.length / accumulator.length).toInt) == str1) && accumulator.length != 0) accumulator
      else divisorFunc(given_string, l+1, given_string.substring(0,l))
    }

    divisorFunc(str1, 1, " " )
  }



    def gcdOfStrings(str1: String, str2: String): String = {
        (if (gcd(str1)==gcd(str2)) gcd(str1) else "")
    }



}*/
