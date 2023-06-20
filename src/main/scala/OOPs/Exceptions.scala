package OOPs

object Exceptions extends App {
  def divide(a: Int, b: Int): Int = {
    if (b == 0) {
      throw new RuntimeException("Cannot divide by zero")
    }
    a / b
  }

  try {
    val result = divide(10, 0)
    println("Result: " + result)
  }

  catch {
    case ex: RuntimeException => println("Caught exception: " + ex.getMessage)
  }

  finally {
    println("Finally block")
  }


  try {
    var N = 5 / 0
  }
  catch {
    // Catch block contain case.
    case ex: ArithmeticException => {
      println("Arithmetic Exception occurred.")
    }
  }
  finally {
    // Finally block will execute
    println("This is final block.")
  }
}
