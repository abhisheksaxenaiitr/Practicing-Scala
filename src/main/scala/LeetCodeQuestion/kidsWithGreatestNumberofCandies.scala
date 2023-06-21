



/*https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75*/

package LeetCodeQuestion



object kidsWithGreatestNumberofCandies extends App {
  def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] = {
    def recFunc(candy: Array[Int], extraCandy: Int, accumulator: List[Boolean], l: Int) : List[Boolean] = {
      if (l== candy.length) accumulator
      else recFunc(candy, extraCandy, if ((candy(l) + extraCandy) >= candy.max) accumulator:+ true   else accumulator :+ false , l+1)
    }

    recFunc(candies, extraCandies, List.empty[Boolean], 0)
  }

  println(kidsWithCandies((Array(2,3,5,1,3)), 3))



}
