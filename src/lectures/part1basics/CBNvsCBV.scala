package lectures.part1basics

object CBNvsCBV extends App {

  // value is computed before call
  def calledByValue(x: Long): Unit = {
    println("by value: " + x) // === println("by name: " + 609739948045464)
    println("by value: " + x) // === println("by name: " + S609739948045464)
  }

  // expression is passed literally
  // expression is evaluated at every use within
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)  // === println("by name: " + System.nanoTime())
    println("by name: " + x)  // === println("by name: " + System.nanoTime())
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34)  // STACK OVERFLOW
  printFirst(34, infinite())    // infinite() is never evaluated
}
