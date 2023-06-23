package OOPs

object Inheritance extends App {

  /*
  1. Private:
  The private access modifier restricts the visibility of a member to its enclosing class or object only.
  Private members are not accessible from outside the defining scope, including subclasses.
  Private members are useful when you want to encapsulate implementation details and ensure they are not accessible or
  overridden by other classes or objects.

  2. Protected:
  The protected access modifier allows access to a member within the same class, its subclasses, and the same package.
  Protected members can be accessed from subclasses, allowing inheritance and overriding.
  Protected members are useful when you want to provide access to members within a class hierarchy but still restrict
  access from outside the hierarchy(i.e outside the scope of class and inherited subclass).*/

  sealed class Animal{
    val creaturType = "Wild"
    protected def eat = println("abc")
  }

  class Cat extends Animal{
    def crunch = {
      super.eat
      println("xyz")
    }
  }

  val cat = new Cat
  cat.crunch                    //Method crunch is neither private not protected, it's public hence accesible




  class Person(name:String, age:String)
  class Adult(name:String, age:String, idCard:String) extends Person(name, age)

  class Dog extends Animal{
    override def eat: Unit = println("uvw")
    override val creaturType: String = "Domestic"                         //Override val i.e field
  }

  class Dogesh(override val creaturType: String) extends Animal {         //Override in Constructor
    override def eat: Unit = println("HeHeHe")
  }



  val dog = new Dog
  dog.eat
  println(dog.creaturType)

  val doge = new Dogesh("Meme Material")
  println(doge.creaturType)


  /*Overloading:
  Overloading refers to the ability to have multiple methods or functions with the same name but different parameters
  within the same class or object.

  Overriding:
  Overriding refers to the ability to provide a different implementation of a method in a subclass that is already
  defined in its superclass.*/


  /*In Scala, the super keyword is used to refer to the superclass or parent class. It allows you to access and invoke
   members (methods or fields) of the superclass from within a subclass. */

  /*Preventing Overrides
  1. final with class prevents extension
  2. final with method prevents from overriding
  3. sealed with class prevents it's usage in other file*/




}
