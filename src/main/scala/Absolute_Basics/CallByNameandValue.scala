package Absolute_Basics

object CallByNameandValue extends App {

  def calledByValue(x: Long) ={
    println("By Value: " + x)
    println("By Value: " + x)
  }

  def calledByName(x: => Long) ={
    println("By Name: " + x)
    println("By Name: " + x)
  }


  println(calledByValue(System.nanoTime()))
  println(calledByName(System.nanoTime()))

  /*Call by Value:
  -> Value is computed before call
  -> Same value is used everywhere
   */

  /*Call By Name
   When a function is called by name, the argument expression is not evaluated before the function is called. Instead,
   the expression is passed as is and evaluated each time it is used within the function.*/

}
