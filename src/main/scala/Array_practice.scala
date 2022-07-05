object Array_practice {
  //main method
  def main(args: Array[String]): Unit = {
    //Allocating values to Array of String
    var days = Array("sun", "mon", "tue", "wed", "thu", "fri", "sat")
    for (m <- days) {

      println(m)
    }
  }
}
//updating an element into array

object array_update{
  def main(args: Array[String]): Unit = {
    var array_update1 = Array("modi","Sky","Dhoni","vk","jaddu")
    array_update1(1) ="rohit"

    for(m <-array_update1){
      println(m)
    }

  }
}

//adding to elements to array
object array_add{
  def main(args: Array[String]): Unit = {
    var array_add = new Array[String](5)
    //adding elements
    array_add(0)= "rebel"
      array_add(1)="star"
    array_add(2)="prabhas"
    array_add(3)="mirchi"

    for (m1 <-array_add){

      println(m1)
    }
  }
}

//concatinating two arrays
import Array._
object Array_concat{
  def main(args: Array[String]): Unit = {
    var arr1= Array(1,2,3,4)
    var arr2= Array(6,7,8,9)

    var arr3= concat(arr1,arr2)
    //to print array in reverse order
    //var arr3= concat(arra1,arr2).reverse

    for(m <-arr3){
      println(m)
    }
  }
}
//multidimensional array
object muldm_array{
  def main(args: Array[String]): Unit = {
    /*val rows = 2
    val cols = 3*/
    //Declaring multidimensional Aray

    var names = Array.ofDim[String](2,3)
    //Allocating values
    names(0)(0) = "big"
    names(0)(1) = "data"
    names(0)(2) = "hadoop"
    names(1)(0) = "hdfs"
    names(1)(1) = "hive"
    names(1)(2) = "spark"

    for {
      i <- 0 to 1; j <- 0 until 3
    }
    {
      //add "" to s to convert string if s is shown in red colour
      println(names(i)(j))
    }

  }
}
//appending to array
//creating object
object array_app{
  def main(args: Array[String]): Unit = {
//Declaring an Array
    val a = Array( 1,2,3,4,5)
    print("array print ")
   // print(a)//optional output won't be visible
    for ( x<-a)
      {

        println(x)
      }
      //Appending one item
    print("one item appended")
    val b = a :+27 // for appending we have to use ->old array :+new array value
    for (x<-b){

      println(x)
    }
    //appending two items
    println("two more items appended")
    val c = b ++ Array(1,2) //for appending two or more items to an array ->old array ++ Array(value1,value2)
    for (x<-c){

      println(x)
    }
//prepending one item to an array
    println("prepending one item")
    val d = 50 +: c
    for(x<-d) {

      println(x)
    }
    //prepending two items
    println("prepending two items")
    val e = Array(60,70,80) ++: d
    for( x<-e ){
      println(x)
    }
  }
}