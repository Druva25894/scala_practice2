package com.thurdaycode

object PatternMatching extends App {


  /*Pattern matching is a way of checking the given sequence of tokens for the presence of the specific pattern.
  It is the most widely used feature in Scala.
    It is a technique for checking a value against a pattern. It is similar to the switch statement of Java and C.

    Here, “match” keyword is used instead of switch statement. “match” is always defined in Scala’s root class to make its
    availability to the all objects. This can contain a sequence of alternatives.

    Each alternative will start from case keyword. Each case statement includes a pattern and one or more expression which get evaluated if the specified pattern gets matched.
    To separate the pattern from the expressions, arrow symbol(=>) is used.*/

  val totCnt = 100
  val result= totCnt match {
    // if value of x is 0,
    // this case will be executed
    case 0 => "Hello, Geeks!!"

    // if value of x is 1,
    // this case will be executed
    case 100 => "Are you learning Scala?"

    // if x doesnt match any sequence,
    // then this case will be executed
    case _ => "Good Luck!!"
  }
  print(result)

  /*Important Points:

    Each match keyword must have at least one case clause.
    The last “_“, is a “catch-all” case, will be executed if none of the cases matches. Cases are also called alternatives.
    Pattern matching does not have any break statement.
  Pattern matching always returns some value.
  Match blocks are expressions, not statements. This means that they evaluate the body of whichever case matches. This is a very important feature of functional programming.*/
}
