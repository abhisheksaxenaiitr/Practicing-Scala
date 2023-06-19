/*https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75*/

package LeetCodeQuestion

object fincdSubsequence extends App {
  def isSubsequence(s: String, t: String): Boolean = {
    def isSubsequenceUtil(sIndex: Int, tIndex: Int): Boolean = {
      if (sIndex >= s.length) true
      else if (tIndex >= t.length) false
      else if (s.charAt(sIndex) == t.charAt(tIndex))
        isSubsequenceUtil(sIndex + 1, tIndex + 1)
      else
        isSubsequenceUtil(sIndex, tIndex + 1)
    }

    isSubsequenceUtil(0, 0)
  }
}
