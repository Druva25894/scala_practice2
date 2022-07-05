object whileloop {
  def main(args: Array[String]): Unit = {
    var x=25
    while(x>=5)
      {
        println("value of x:" +x)
//increment the value of x for next iteration
        x = x - 1;
      }
  }
}
//infinite loop
object infiniteloop{
  def main(args: Array[String]): Unit = {
    var x = 25;

    do {
      print(x + " ");
      x = x - 1;
    }while(x >= 5);
    }
  }
//for loop

object for_loop {
  def main(args: Array[String]): Unit = {
    val y = 0;
    for (y<- 1 to 7)
      {
        println(y)
      }
  }
}
