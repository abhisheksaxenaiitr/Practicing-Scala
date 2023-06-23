package OOPs

object AbstractDataTypes extends App {

  abstract class Animal{
    val creatureType:String
    def eat: Unit
  }

  /*Abstract Class can't be instantiated
   It can only be extended once*/

  class Dog extends Animal{
    val creatureType: String = "Domestic"               //Here, no need to mention override as compliler understands it
    def eat: Unit = "ChapChap"                          //automatically on extending abstract class
  }




}
