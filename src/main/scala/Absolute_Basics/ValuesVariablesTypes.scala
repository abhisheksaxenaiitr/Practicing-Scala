package Absolute_Basics

object ValuesVariablesTypes extends App {
  val a: Int = 223456
  val b: String = "AbS"
  val c: Char = 'c'                         //Write single letter within single quotes not double
  val d: Boolean = true
  val e: Double = 1234.043                  //No need to put D at end as it's by default Double not Float
  val f: Float = 1.01F                      //Put F to specify it's a Floating Type Number
  val g: Long = 124356767787L               //By Default Int so put L at the end to specify it's a Long



  /*-------------------------------------------------------------------------------------------------------------------
  ##BigInt##
  In Scala, a BigInt is a built-in class that represents arbitrary-precision integers. It is part of the Scala standard
  library and provides a way to work with integers of any size, limited only by the available memory.*/

  val x: BigInt = 123456789
  val y = BigInt("123456789012345")

  /*The choice between the two constructors depends on the source of the number you want to represent as a BigInt. If
   you have a regular integer value, you can use the first constructor. If you have a string representation of a large
   number, you can use the second constructor.
  It's worth noting that the string constructor is more flexible as it allows you to represent numbers beyond the range
   of regular integer types, such as Int or Long. The string constructor can handle arbitrarily large numbers limited
   only by the available memory.
   -------------------------------------------------------------------------------------------------------------------*/


  /*--------------------------------------------------------------------------------------------------------------------
  Side effect: An observable change or interaction that occurs outside the primary purpose of a function or expression,
  typically involving modifications to the external environment or state.

  Here's a list of short examples of side effects:
  Modifying a variable
  Printing to the console
  Writing to a file
  Reading from a file
  Making a network request
  Updating a database
  Modifying the user interface
  Mutating an array or collection
  Changing the state of an object
  Throwing an exception
  Logging information
  Sleeping or delaying execution
  Mutating shared or global state
  Triggering external events or callbacks
  Interacting with hardware or peripherals
  ---------------------------------------------------------------------------------------------------------------------*/



}
