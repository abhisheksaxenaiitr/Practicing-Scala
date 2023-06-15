package Absolute_Basics

object Expressions extends App {

  /*
  In Scala, an expression is a piece of code that produces a value when evaluated.
  It can be a simple value, a function call, a mathematical operation like pow, or a combination of these.
  Side effects are expressions returning Unit
  */

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

  /*The above while loop returns Unit which shows the side effect
   In Scala, Unit is a type that represents the absence of a meaningful value. It is similar to the void type in other
   programming languages like Java or C. The Unit type is used to indicate that a function or expression does not return
   a useful result.
   Functions, Loops, Code Blocks that have a Unit return type are typically used for performing side effects, such as
    printing to the console, updating state, or interacting with external resources.
   */




  //Code Block
  val aCodeBlock = {
    val x = 3
    val y = "AbS"
    if (x>2) "Yes" else "No"
  }

  /*For Code Block the datatype and value is taken from its last expression
  and we can't use its variables outside the block ex- x & y can't be used outside block*/



  /*Difference in Datatypes of the foloowing*/
  val a = "hello world"
  val b = println("hello world")

  val someValue ={
    2<3
  }

  println(someValue)

  val someOtherValue = {
    if (someValue) 239 else 971
    231
  }

  println(someValue)



}
