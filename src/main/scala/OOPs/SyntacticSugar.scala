package OOPs

import scala.language.postfixOps

class Person(val name: String, favouritemovie: String){
  def likes(movie: String): Boolean = movie== favouritemovie
  def hangoutwith(person:Person):String = s"${this.name} is hanging out with ${person.name}"
  def +(lover: Person): String = s"${lover.name} loves ${this.name} "
  def unary_! = s"$name is a good human being"
  def unary_~ = s"${name} is a nice person"
  def movie : String = s"My favourite movie is $favouritemovie"
  def copy(name: String): Person = new Person(name, favouritemovie)
  def apply() : String = s"Hi, I am $name and my favourite movie is $favouritemovie"
}

object SyntacticSugar extends App {
  val mary = new Person("Mary", "Inception")
  val tom  = new Person("Tom", "Kal Ho Na Ho")
  val roy  = new Person("Roy", "Ishaqzade")
  val jai  = tom.copy("Jai")

  println(mary likes "Inception")
  println(tom hangoutwith mary)
  println(mary hangoutwith tom)
  println(mary + roy)      //Infix Notation
  println(1.+(2) == 1+2)   //Operators are Methods!
  println(mary.unary_!)
  println(!mary)
  println(~roy)            //Prefix Notation
  println(tom movie)       //Postfix Notation
  println(jai.movie)       //Immutability
  println(jai())           //Apply Method
  println(roy.apply())     //Apply Method
}


