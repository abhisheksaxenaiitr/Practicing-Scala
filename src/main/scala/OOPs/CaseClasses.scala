package OOPs


object CaseClasses extends App {

  trait Polygon
  case class Circle(radius: Int) extends Polygon
  case class Rectangle(length: Int, breadth: Int) extends Polygon
  case class Square(side: Int) extends Polygon

  val circle = Circle(4)
  val rectangle = Rectangle(7,5)
  val square = Square(3)


  def FindArea(x: Polygon) = x match {
    case Circle(radius) => 3.1427*radius*radius
    case Rectangle(length, breadth) => length*breadth
    case Square(side) => side*side
  }

  println(FindArea(Circle(5)))
  println(FindArea(circle))


}
