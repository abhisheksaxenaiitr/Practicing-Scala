

/*https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75*/
package LeetCodeQuestion


object DifferenceofTwoArrays extends App {
  def findDifference(nums1: Array[Int], nums2: Array[Int]): List[List[Int]] = {


    val result1 = nums1.filterNot(nums2.contains).distinct.toList
    val result2 = nums2.filterNot(nums1.contains).distinct.toList

    val req_list = List(result1,result2)
    (req_list)
  }
}