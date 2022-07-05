// Scala program to illustrate the
// implementation of break in nested loop

// Importing break package
import scala.util.control._

object Test {

  // Main method
  def main(args: Array[String]) {
    var num1 = 0;
    var num2 = 0;
    val x = List(5, 10, 15);
    val y = List(20, 25, 30);

    val outloop = new Breaks;
    val inloop = new Breaks;

    // Here, breakable is used to
    // prevent from exception
    outloop.breakable {
      for (num1 <- x) {

        // print list x
        println(" " + num1);

        inloop.breakable {
          for (num2 <- y) {

            //print list y
            println(" " + num2);

            if (num2 == 25)
            {

              // inloop is break when
              // num2 is equal to 25
              inloop.break;
            }
          }

          // Here, inloop breakable
        }
      }

      // Here, outloop breakable
    }
  }
}
