package OOPs

import scala.language.postfixOps

object syntacticSugarExcercise extends App {
  class Person(name: String, favouriteMovie: String, val age: Int = 0) {
    def +(nickName: String): Person = new Person(s"$name + ($nickName)", favouriteMovie)
    def apply(): String = s"Hi, my name $name and I like $favouriteMovie"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
    def apply(n: Int) = s"$name watched $favouriteMovie $n times"
  }

  val mary = new Person("Mary", "Inception")

  println((mary + "The Rockstar")())        //Infix + Apply
  println((+mary).age)                      //Unary
  println(mary learnsScala)                 //Postfix
  println(mary(3))


}
