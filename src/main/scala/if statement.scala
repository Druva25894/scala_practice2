object if_stmnt{
  //main method
  def main(args: Array[String]): Unit = {
  //taking a variable
    var a = 10
    if (a>20)
      {
       println("a is larger than 20")

      }
  }
}
//if else statement
object if_else{
  def main(args: Array[String]): Unit = {
    var a = 40
    if (a >= 60) {
      println("a is senior citizen")
    }
    else {
      println("a is not a senior citizen")
    }
  }
  }

  //nested if else statement

  object nested_ifelse {
    def main(args: Array[String]): Unit = {
      var a = 10
      var b = 10
      var c = 10
      if (a > b) {
        if (a > c) {
          println("a is the largest number")
        }
        else {
          println("c is the largest number")
        }
      }

      else {
        if (b > c) {
          println("b is the largest number")
        }
        else {
          println("c is the largest number")
        }
      }
    }
  }

object nested_if{
  def main(args: Array[String]): Unit = {
    var a = 20
    if (a == 20) {
      println("a is greater than 19")
    }
        else if (a >20){
      println("a is not less than 20")
      }
      }
}




