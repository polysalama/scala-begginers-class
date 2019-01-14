package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")
}

// constructor
class Person(name: String, val age: Int = 0) {

// class parameters are NOT FIELDS
// convert parameters to fields with val/var

  // body
  val x = 2

  println(1 + 3)  // This is evaluated when the class is instaciated

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}