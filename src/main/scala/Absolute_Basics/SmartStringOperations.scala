package Absolute_Basics

object SmartStringOperations extends App{
  val str = "Hello, I'm learning Scala"
  println(str.charAt(1))
  println(str.substring(1,4))       //Excludes upper bound
  println(str.split(" ").toList)
  println(str.replace(" ", "_"))
  println(str.toLowerCase())
  println(str.length)
  println(str.reverse)
  println(str.take(3))

  val a = "1234"
  val b = a.toInt
  println(b)

  //Appending and Prepending
  val str2 = '*' +: str :+ '*'              //Use single character only not string
  println(str2)

  //s string interpolatores
  val name = "Abhishek"
  val age = 24
  println(s"Hi, my name is $name and I'm $age years old")




}
