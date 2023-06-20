package OOPs

object Enums extends App {

  object Role extends Enumeration {
    type Role = Value
    val Admin, User, Guest = Value
  }

  import Role._

  case class User(name: String, age: Int, role: Role)

  val adminUser = User("John Doe", 30, Admin)
  val regularUser = User("Jane Smith", 25, Role.User)
  val guestUser = User("Guest", 0, Guest)

  println(s"Admin User: ${adminUser.name}, ${adminUser.age}, ${adminUser.role}")
  println(s"Regular User: ${regularUser.name}, ${regularUser.age}, ${regularUser.role}")
  println(s"Guest User: ${guestUser.name}, ${guestUser.age}, ${guestUser.role}")
}
