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

  /*In Scala, companion objects are objects that are defined in the same file as a class or trait and share the same name.
   They serve as a container for static methods and fields related to the class or trait, providing a way to organize and
   encapsulate related functionality. Here are some key points about Scala companion objects:

      1) Shared Name: A companion object has the same name as its corresponding class or trait.
      2) Access to Private Members: A companion object can access private members of its companion class or trait, and
      vice versa. This allows them to share implementation details that are not exposed to the external code.
      3) Factory Methods: Companion objects are commonly used to define factory methods for creating instances of the
      associated class. These factory methods can have any custom logic required to construct instances, and they are
      often named apply.
      4) No Static Keyword: In Scala, there is no static keyword like in Java. Instead, you define static-like members
      inside the companion object, and they can be accessed using the class name.
      5) Implicit Conversions: Companion objects are frequently used to define implicit conversions. By defining an
      implicit method inside the companion object, you can enable automatic type conversions when required.
      6) Object Initialization: Companion objects can have their own initialization code, which is executed when the
      object is first accessed. This is useful for performing one-time setup tasks. */

  class MyClass(val name: String) {
    def greet(): Unit = {
      println(s"Hello, $name!")
    }
  }

  object MyClass {
    def apply(): MyClass = {
      new MyClass("John Doe")                                     //Factory Method
    }

    val defaultName: String = "Default"
  }


  val obj1 = new MyClass("Alice")
  obj1.greet()  // Output: Hello, Alice!

  val obj2 = MyClass()
  obj2.greet()  // Output: Hello, John Doe!

  println(MyClass.defaultName)  // Output: Default



}
