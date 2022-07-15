import scala.collection.mutable.ListBuffer

class GFG1 {
  var name = "druva"
  var age = "50"
  var branch = "mechanical"

  def show(): Unit =
  {
    println("hello I am " + name + " my age is " +age, "I am from "+branch)
  }
}
object Smartphone {
  def main(args: Array[String]): Unit = {
    var ob = new GFG1();
    ob.show();

  }
}
//<<<<<<< practice_branch
object lstbuffer {
  def main(args: Array[String]): Unit = {


  var name = ListBuffer[String]()
  name += "GeeksForGeeks"
  name += "gfg"
  name += "Class"
  println(name)
}
}
//=======
//>>>>>>> master
