/*https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75*/

package LeetCodeQuestion
import scala.annotation.tailrec
import scala.math.max

object mergeStringsAlternatively extends App {
  def mergeStringsAlternatively(str1: String, str2: String): String = {
    val maxLength = max(str1.length, str2.length)
    val sb = new StringBuilder

    @tailrec
    def mergeHelper(i: Int, sb: StringBuilder): String = {
      if (i >= maxLength) {
        sb.toString()
      }

      else {
        if (i < str1.length) {
          sb.append(str1.charAt(i))
        }

        if (i < str2.length) {
          sb.append(str2.charAt(i))
        }

        mergeHelper(i + 1, sb)
      }
    }

    mergeHelper(0, sb)
  }


  val str1 = "Hello"
  val str2 = "World"
  val merged = mergeStringsAlternatively(str1, str2)
  println(merged)
}
