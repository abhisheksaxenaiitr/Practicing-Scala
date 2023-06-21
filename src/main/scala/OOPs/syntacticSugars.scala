package OOPs

import scala.language.postfixOps

object syntacticSugars extends App {

  class Person(val name:String, favouriteMovie: String) {
    def likes(movie:String): Boolean = movie == favouriteMovie
    def +(person:Person) = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?"
    def isAlive: String = s"$name is alive!"
    def apply() : String = s"$name is dancing!"

  }

  val mary = new Person("Mary", "Inception")
  val tom = new Person( "Tom", "Fight Club")

  println(mary.likes("Inception"))
  println(mary likes "Inception")           /*InFIX NOTATION*/

  println(mary.+(tom))
  println(mary + tom)             /*InFIX NOTATION*/

  /*Infix Notation only works with methods containing single parameter*/
  /*All Operators are methods*/

  println(1.+(2))
  println(1 + 2)                  /*Operators are InFIX NOTATION*/

  /*------------------------------------------------------------------------------------------------------------------*/

  /*PREFIX NOTATION
  Unary Prefix only works with operators -, +, !, ~
*/
  val x = 1.unary_-        //Equivalent to -1
  println(x)

  println(!mary)

  /*------------------------------------------------------------------------------------------------------------------*/

  /*POSTFIX NOTATION
  It doesnot take any parameter
  */

  println(mary.isAlive)
  println(mary isAlive)         //Postfix Operator


  /*------------------------------------------------------------------------------------------------------------------*/

  //APPLY METHOD
  println(mary())              //Equivalent to println(marry.apply())



}
