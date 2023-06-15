package Absolute_Basics

object CallByNameandValue extends App {

  //Call By Value
  def test(a: Int) = a * a

  //Call By Name
  def test(a: => Int) = a * a

  /*Call by Value:
  When a function is called by value, the argument expression is evaluated before the function is called, and the
  resulting value is passed to the function. This means that the argument expression is evaluated only once, regardless
  of how many times it is used within the function.
   */

  /*Call By Name
   When a function is called by name, the argument expression is not evaluated before the function is called. Instead,
   the expression is passed as is and evaluated each time it is used within the function.*/

}
