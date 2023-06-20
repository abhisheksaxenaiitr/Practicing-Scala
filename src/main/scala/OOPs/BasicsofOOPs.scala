package OOPs

class Person(name: String, val age: Int = 24) {    //Added val to age to make it accesible for calling!!
  val gender = "Male"
  println("Bye, Bye!")

  def greet(name: String) = s"${this.name} says: Hi, $name"
  def greet(): String = s"Hi, my name is $name"                         //Method Overloading! No need to use this here!
  def this(name: String) = this(name, 0)
  def this() = this("Rohan Singh")                   //Auxilliary Constructor
}

object BasicsofOOPs extends App {
  val person = new Person("John", 26)
  println(person.gender)
  println(person.age)
  println(person.greet("Abhishek"))
  println(person.greet())

  println("----------------------------------------------------------------------------------------------------------")

  val person2 = new Person()
  println(person2.gender)
  println(person2.age)
  println(person2.greet("Abhishek"))
  println(person2.greet())


}
