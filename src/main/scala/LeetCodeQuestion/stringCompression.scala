package LeetCodeQuestion

object stringCompression extends App{
  def compress(chars: Array[Char]): Array[Int] = {
    val unique_chars = chars.distinct
    val occurrenceArray = unique_chars.map(element => chars.count(_ == element))
    occurrenceArray



  }







  println(compress(Array('a','a','b','b','c','c','c')).toList)



}
