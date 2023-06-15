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
  In Scala, a BigInt is a built-in class that represents arbitrary-precision integers. It is part of the Scala standard
  library and provides a way to work with integers of any size, limited only by the available memory.*/

  val x: BigInt = 123456789



}
