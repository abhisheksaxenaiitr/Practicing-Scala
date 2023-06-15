package Absolute_Basics

object Functions extends App{
  //Normal Function
  def aFunction(a:String, b:Int): String = {
    a + " " + b
  }

  println(aFunction("Hello",3))

  //Parameterless Function
  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction)                   //Without Using Round Braces ()
  println(aParameterlessFunction())


  def aRepeatedFunction(aString: String, n: Int) : String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 3))


  def Factorial(n: Int, accumulator: Int): Int = {
    if (n==0) accumulator
    else n*Factorial(n-1, accumulator)
  }



}
