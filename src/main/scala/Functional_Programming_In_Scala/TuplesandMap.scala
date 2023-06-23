package Functional_Programming_In_Scala

object TuplesandMap extends App {
  val tuple: (Int, String, Double) = (1, "John Doe", 25.5)
  println("Tuple Example:")
  println(s"ID: ${tuple._1}, Name: ${tuple._2}, Age: ${tuple._3}")

  // Creating a map
  val map: Map[Int, String] = Map(
    1 -> "Apple",
    2 -> "Banana",
    3 -> "Orange"
  )
  println("\nMap Example:")
  println("Fruits:")
  map.foreach { case (key, value) =>
    println(s"Key: $key, Value: $value")
  }




}
