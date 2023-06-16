

/*https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75*/
package LeetCodeQuestion

object returnHighestAltitude extends App {


  import scala.annotation.tailrec

  def getOutputArray(input: Array[Int]): Array[Int] = {
    @tailrec
    def helper(input: List[Int], output: List[Int], acc: Int): List[Int] = {
      input match {
        case Nil => (0 :: acc :: output).reverse
        case head :: tail =>
          val nextAcc = acc + head
          helper(tail, nextAcc :: output, nextAcc)
      }
    }

    helper(input.toList, Nil, 0).toArray
  }



  def maxElement(array: Array[Int]): Int = {
    @tailrec
    def findElement(arr: Array[Int], accumulator: Int, length: Int): Int = {
      if (length <= 1) accumulator

      else {
        if (arr(length - 1) > accumulator) findElement(arr, arr(length - 1), length - 1)
        else if (arr(length - 1) < accumulator) findElement(arr, accumulator, length - 1)
        else findElement(arr, accumulator, length - 1)
      }
    }

    findElement(array, Int.MinValue, array.length)
  }

  val input = Array(-4, -3, -2, -1, 4, 3, 2)
  val output = getOutputArray(input)
  //println(output.foreach(println))

  println(maxElement(getOutputArray(input)))


}

