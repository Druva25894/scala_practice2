import scala.collection.mutable._
import scala.collection.immutable._
  object list_set {
    def main(args: Array[String]): Unit = {
      println("initializing an immuatble object")
      val list_set = ListSet("list", "set", "stores", "set", "unique", "values")
      for(x<-list_set) {
        println(x)
      }
    }
  }
// Scala program to Check specific elements in ListSet
import scala.collection.immutable._

// Creating object
object GFG
{
  // Main method
  def main(args:Array[String])
  {
    println("Initializing an immutable ListSet ")

    // Creating ListSet
    val listSet1: ListSet[String] = ListSet("GeeksForGeeks",
      "Article", "Scala")
    println(s"Elements of listSet1 = $listSet1")

    println("Check elements of immutable ListSet")

    // Checking element in a ListSet if the element is not present it gives false as result
    println(s"GeeksForGeeks = ${listSet1("GeeksForGeeks")}")
    println(s"Student = ${listSet1("Student")}")
    println(s"Scala = ${listSet1("Scala")}")
  }
}

object lsr_st{
  def main(args: Array[String]): Unit = {
    var lst_st = ListSet("list","lsit1","list2")
    println(s"$lst_st")
  }
}