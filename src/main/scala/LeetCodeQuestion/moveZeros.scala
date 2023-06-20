

/*https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75*/

package LeetCodeQuestion

object moveZeros extends App {
  val nums = Array(0,1,0,3,12)
  val nonZeroArray = nums.filter(x => x!=0)
  println(nonZeroArray.toList)

  val zeroArray = nums.filter(x => x == 0)
  println(zeroArray.toList)

  println((nonZeroArray ++ zeroArray).toList)



}
