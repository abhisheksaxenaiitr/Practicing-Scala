package LeetCodeQuestion

object Checking extends App{
  // Parent class
  class Vehicle(val brand: String, val year: Int) {
    def start(): Unit = {
      println("The vehicle is starting...")
    }

    def stop(): Unit = {
      println("The vehicle is stopping...")
    }
  }

  // Child class inheriting from the parent class
  class Car(brand: String, year: Int, val fuelType: String) extends Vehicle(brand, year) {
    def accelerate(): Unit = {
      println("The car is accelerating...")
    }
  }

  // Creating instances of the classes
  val vehicle = new Vehicle("ABC Motors", 2022)


}
