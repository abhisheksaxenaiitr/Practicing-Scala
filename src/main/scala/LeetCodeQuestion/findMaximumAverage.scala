package LeetCodeQuestion

object findMaximumAverage extends App {

  def findMaxAverage(nums: Array[Int], k: Int): Double = {

    def recursiveFunc(array: Array[Int], k:Int, accumulator: Int, d:Int): Double = {
      if (d == (array.length - k + 1)) accumulator
      else recursiveFunc(array, k, (array.drop(d).take(k).sum)/k, d +1)
    }

    recursiveFunc(nums, k, 0, 0)

  }

  println(findMaxAverage( Array(1,12,-5,-6,50,3), 4))

}
