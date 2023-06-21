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

  class MyClass {
    private var count: Int = 0

    def increment(): Unit = {
      MyClass.incrementCount() // Accessing companion object's method
      count += 1
    }

    def displayCount(): Unit = {
      println(s"Count: $count")
    }
  }

  object MyClass {
    private var totalCount: Int = 0

    def incrementCount(): Unit = {
      totalCount += 1
    }

    def displayTotalCount(): Unit = {
      println(s"Total Count: $totalCount")
    }
  }

  val obj = new MyClass()
  obj.increment()
  obj.displayCount()

  MyClass.displayTotalCount()


}
