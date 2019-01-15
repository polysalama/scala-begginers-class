package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Daniel")

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter()
  counter.inc.print()
  counter.inc.inc.inc.print()
  counter.inc(10).print()
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

/*

    Novel and a Writer

    Writer: first name, surname, year
      -method fullname

    Novel: name, year of release, author
      - authorAge
      - isWrittenBy(author)
      - copy (new year of release) = new instance of Novel
   */

class Writer(firstName: String, surname: String, val year: Int) {


  def fullName(): String = s"$firstName $surname"
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {

  def authorAge(): Int = yearOfRelease - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYearOfRelease: Int) = new Novel(name, newYearOfRelease, author)
}

/*

  Counter class
    - receives an int value
    - method current count === val count: Int, no need for def count() = n
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {

  def inc: Counter = {
    println("INC")
    new Counter(count + 1) // immutability !!
  }

  def dec: Counter = {
    println("DEC")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }

  def print(): Unit = println(count)
}