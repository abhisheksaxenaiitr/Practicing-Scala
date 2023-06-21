
package Functional_Programming_In_Scala

trait myFunction[A,B]{
  def apply(element: Int): B
}

object WhatsAFunction extends App {

  val doubler = new myFunction[Int, Int] {
    override def apply(element: Int): Int = element*2
  }

  println(doubler(2))         //Instance acts like Function

  val stringToIntConverter = new Function[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }

  println(stringToIntConverter("3") + 4)


  val adder = new Function2[Int,Int,Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  println(adder(2,3))


  def stringConcatenator: ((String,String)=> String) = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + " " + v2
  }


  println("Hello", "World")



}
