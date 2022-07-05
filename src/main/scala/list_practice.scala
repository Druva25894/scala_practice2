import org.apache.spark.sql.SparkSession
import scala.collection.mutable.ListBuffer



object list_practice {
  def main(args: Array[String]): Unit = {
    val spark=SparkSession.builder()
      .appName("list_practice")
      .master("local")
      .getOrCreate()

    var name= ListBuffer[String]()
      name += "druva"
      name += "kumar"
    println(name)

  }
}

import scala.collection.mutable.ListBuffer

object practice {
  def main(args: Array[String]): Unit = {
    var name = ListBuffer[String]()
    name += "SQL"
    name += "HQL"
    println(name)
  }
}

object add_new {
  def main(args: Array[String]): Unit = {
    var name = ListBuffer[String]()
    name += "GeeksForGeeks"
    name += "gfg"
    name += "Class"
    name += "java"
    println(name)
//adding element in list
    name += "scala"
    println(name)
//removing element in list
    name -= "gfg"
    println(name)
   //removing elements with .remove and index number
    name.remove(0)

    println(name)
  }
}
