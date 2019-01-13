package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  /// Scala has >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3   // also works with -= *= /+   ...... side effects
  println(aVariable)

  // Instructions (DO, are EXECUTED) vs Expressions (VALUE and/or has TYPE, are EVALUATED)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN (avoid while loops!!!)

  // EVERYTHING in Scala is an Expression!
  val aWeirdValue = (aVariable = 3)  // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  val aCodeBlock = { // === value of last expression in code block (in this case hello or goodbye)

    // vals are scope is limited to inside of the code block
    val y = 2
    val z = y + 1

    if (z > y) "hello" else "goodbye"
  }


  // 1. difference between "hello world" and println("hello world")
  // "hello world" evaluates to type String === "hello world" (a String literal)
  // println("hello world" is type Unit, has side effect

  // 2.

  val someValue = { // Boolean === true
    2 < 3
  }

  val someOtherValue = {  // Int === 42
    if(someValue) 239 else 986
    42
  }
}








