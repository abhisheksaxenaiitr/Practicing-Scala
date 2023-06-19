package LeetCodeQuestion

object UniqueNumberofOccurence extends App {
  val arr = Array(1, 2, 2, 1, 1, 3, 4, 4)
  val uniqueArr = arr.distinct


  val occurrenceArr = uniqueArr.map(element => arr.count(_ == element))
  println(occurrenceArr.mkString("Array(", ", ", ")"))

  val check = occurrenceArr.distinct

  if (check.length == occurrenceArr.length) true else false



}
