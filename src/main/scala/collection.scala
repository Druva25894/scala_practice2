// Scala program to illustrate the
  // implementation of break

  // Importing break package
  import scala.util.control.Breaks._
  object MainObject
  {

    // Main method
    def main(args: Array[String])
    {

      // Here, breakable is used to prevent exception
      breakable
      {
        for (a <- 1 to 10)
        {
          if (a == 6)

          // terminate the loop when
          // the value of a is equal to 6
            break
          else
            println(a);
        }
      }
    }
  }


object Tuple_stmnt {
  def main(args: Array[String]): Unit = {
    var name = ("tuples","stores","heterogeneous","data",2,3,true)
    println("tuples prints based on position index")
    println(name._6, name._1)

  }
}
object tuple_iterator{
  def main(args: Array[String]): Unit = {
    var name = ("tuples","stores","heterogeneous","data",2,3,true)
    name.productIterator.foreach{i=>println(i)}
  }
}
object tupletostring{
  def main(args: Array[String]): Unit = {
    val name = ("tuple",2,"string")
    println(name.toString())
  }
}
//swapping of tuple
object tupple_swap{
  def main(args: Array[String]): Unit = {
    var name = ("tuple","swap")
    println(name.swap)
  }
}
//operations on scala Map

object scala_map{
  def main(args: Array[String]): Unit = {
    //accessing required data using map
    val map = Map("scala"->30,"map"->35,"function"->40)

    val scala1 = map("scala")
    println(scala1)
  }
}

//using contains() method in scala Map
object Map_contains{
  def main(args: Array[String]): Unit = {
    val map = Map("scala"->30,"gap"->35,"function"->40)

    val a1 = if (map.contains("scala"))
      map("scala")else 0// we can give any info in else braces here we have given 0
    val a2 = if (map.contains("scala2"))
      map("scala2")else ("no data")// we can give any info in else braces here we have given string type info
    println("scala2: " +a2)
    //println((a1),(a2))//apart from the above prinln statement we can print the two statements at a time
  }
}
//updating values to the Map

object Map_update{
  def main(args: Array[String]): Unit = {
    val map = Map("scala"->30,"gap"->35,"function"->40)
    println(map)
    /*map ("gap") = 89/*we will get an error if we execute this statement because Map is an immutable
    if we want to update it we have to use scala.collection.mutable.Map*/
    updating Map using scala.collecction.mutable.Map */
    val map1 = scala.collection.mutable.Map("scala"->30,"gap"->35,"function"->40)

    //updating
    map1("gap") = 958
    println("After updating: " + map1)

    println("<<<<<adding and upadating the new key value pairs to mutable map>>>>>")

    map1 += ("function"->502,"Dk"->308)
    println("after adding and updating: " + map1)

    //Deleting a key value pair

    println("before delelting: " +map1)
    map1 -=("scala","gap")
    println("after deletion of key value pair: " +map1)

    //iteration on Map
    for((k, v)<-map1){
      print("key " +k+",")
      println("value " +v)
    }
  }
}
