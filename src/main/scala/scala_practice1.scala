class GFG {
  var name =

  def show(): Unit =
  {
    println("hello I am " + name + " my age is " +age, "I am from "+branch)
  }
}
object main {
  def main(args: Array[String]): Unit = {
    var ob = new GFG();
    ob.show();

  }
}
