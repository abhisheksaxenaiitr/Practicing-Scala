package OOPs

object scalaObjects extends App {

  /*Here, Person is a Singleton Object
  In Scala, a singleton object is an object that can have only one instance, and it is defined using the "object"
  keyword instead of the "class" keyword. The singleton object is automatically instantiated and initialized when
  it is first accessed, and it remains in memory throughout the entire execution of the program.*/

  object Person{
    val N_EYES = 2
    def canFly: Boolean = false
  }

  println(Person.N_EYES)        //Accesing method directly without creating any instance
  println(Person.canFly)        //Accesing method directly without creating any instance


  //Singleton Object = Single Instance
  val a =  Person
  val b =  Person
  println(a == b)               //Shows both a & b are equal hence only one instance gets created

  /*------------------------------------------------------------------------------------------------------------------*/

  //COMPANIONS

  /*Companion Objects */




}
