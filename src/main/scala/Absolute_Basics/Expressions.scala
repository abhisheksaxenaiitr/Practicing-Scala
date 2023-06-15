package Absolute_Basics

object Expressions extends App {

  /*In Scala, an expression is a piece of code that produces a value when evaluated.
  It can be a simple value, a function call, a mathematical operation like pow, or a combination of these. */

  //if expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)


  //while loop
  var i = 0

  val aWhile = while(i<10) {
    i+= 1             //Not i+ = 1 (No space between + and =)
    println(i)
  }

  


}
