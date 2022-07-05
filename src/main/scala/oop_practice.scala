//name of the class is Oop

class Oop{
//class variables
  var number: Int = 16
  var nameofcompany: String = "apple"
  //class method
  def display(): Unit =
  {
    println("name of the company "  +nameofcompany)
    println("Total no of smartphones geneartion: " +number)
  }
}
object Main
{
  def main(args: Array[String]): Unit = {
    //creating object of the class
    var obj = new Oop();
    obj.display();
  }
}


