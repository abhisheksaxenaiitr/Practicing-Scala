object Inheritance extends App {


  class Animal(val name: String) {
    def sound(): String = "Makes a sound"
  }


  class Cat(name: String) extends Animal(name) {
    override def sound(): String = "Meow"
  }


  class Dog(name: String) extends Animal(name) {
    override def sound(): String = "Woof"
  }


  val cat = new Cat("Whiskers")
  val dog = new Dog("Buddy")

  println(cat.name + " " + cat.sound())
  println(dog.name + " " + dog.sound())
}

