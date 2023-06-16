/*https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75*/

package LeetCodeQuestion

object GCDofStrings extends App {
  val str1 = "AABAABAABAABAABAAB"
  val str2 = "AABAABAA"




  def gcd(str1: String): List[String] = {
    def divisorFunc(givenString: String, l: Int, accumulator: String, resultList: List[String]): List[String] = {
      if (l < 1) givenString:: resultList
      else if (givenString.length % l == 0 && givenString.substring(0, l) * (givenString.length / l) == givenString)
        divisorFunc(givenString, l - 1, accumulator, givenString.substring(0, l) :: resultList)
      else
        divisorFunc(givenString, l - 1, accumulator, resultList)
    }

    divisorFunc(str1, str1.length / 2, "", List.empty[String])
  }




  val pattern = "^[A-Z]+$".r
  val L1: Option[List[String]] = if (1 <= str1.length && pattern.matches(str1)) Some(gcd(str1)) else None
  val L2: Option[List[String]] = if (str2.length <= 1000 && pattern.matches(str2)) Some(gcd(str2)) else None

  def findGreatestCommonString(L1: Option[List[String]], L2: Option[List[String]]): Option[String] = {
    (L1, L2) match {
      case (Some(list1), Some(list2)) =>
        val commonStrings = list1.filter(list2.contains)
        if (commonStrings.nonEmpty) Some(commonStrings.maxBy(_.length)) else None
      case _ => None
    }
  }

  val greatestCommonString = findGreatestCommonString(L1, L2)
  println(greatestCommonString.getOrElse(""))


  }
/*Check*/





/*object Solution {
    def gcdOfStrings(str1: String, str2: String): String = {
          def gcd(str1: String): List[String] = {
    def divisorFunc(givenString: String, l: Int, accumulator: String, resultList: List[String]): List[String] = {
      if (l < 1) givenString:: resultList
      else if (givenString.length % l == 0 && givenString.substring(0, l) * (givenString.length / l) == givenString)
        divisorFunc(givenString, l - 1, accumulator, givenString.substring(0, l) :: resultList)
      else
        divisorFunc(givenString, l - 1, accumulator, resultList)
    }

    divisorFunc(str1, str1.length / 2, "", List.empty[String])
  }




  val pattern = "^[A-Z]+$".r
  val L1: Option[List[String]] = if (1 <= str1.length && pattern.matches(str1)) Some(gcd(str1)) else None
  val L2: Option[List[String]] = if (str2.length <= 1000 && pattern.matches(str2)) Some(gcd(str2)) else None

  def findGreatestCommonString(L1: Option[List[String]], L2: Option[List[String]]): Option[String] = {
    (L1, L2) match {
      case (Some(list1), Some(list2)) =>
        val commonStrings = list1.filter(list2.contains)
        if (commonStrings.nonEmpty) Some(commonStrings.maxBy(_.length)) else None
      case _ => None
    }
  }

  val greatestCommonString = findGreatestCommonString(L1, L2)
  greatestCommonString.getOrElse("")


  }

}*/
