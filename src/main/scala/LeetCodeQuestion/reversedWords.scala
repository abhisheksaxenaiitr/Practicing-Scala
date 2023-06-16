/*https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75*/
package LeetCodeQuestion

object reversedWords extends App {


  def stripExtraSpace(str: String): String = {
    str.trim().replaceAll("\\s+", " ")
  }


  def reverseWords(s: String): String = {
    stripExtraSpace(s).split("\\s+").reverse.mkString(" ")
  }

  println(reverseWords("  This is a string with extra spaces.   "))

}
