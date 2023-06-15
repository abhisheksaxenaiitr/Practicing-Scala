package Absolute_Basics

object TypeInference extends App {
  val a = 3
  val b = "AbS"
  val c = a + b                       //Int + String = String

  def add(x:String) = x + 1           //Int + String = String
  def add2(x:String) = x + "1"        //String + String
  def add(x:Int) = x + 1                 //Int + Int
  def add2(x:Int) = x + "1"           //Int + String = String

/*In case of Recursion always mention the return type of function*/

}
