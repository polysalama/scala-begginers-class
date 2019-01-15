package lectures.part2oop

object MethodNotations extends App {


  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and i like $favoriteMovie"

    //  1.
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)

    //  2.
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    //  3.
    def learns(subject: String): String = s"$name learns $subject"
    def learnsScala: String = learns("Scala")

    //  4.
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"
  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ALE METHODS

  // prefix notation
  val x = -1  // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary()) // equivalent

  /*
    1.  Overload the + operator
        mary + "the rockstar" => new person "Mary (the rockstar)"

    2.  Add and age to the Person class
        Add a unary + operator => new person with age + 1
        +mary => mary with age increment

    3.  Add a "learns" method in the Person class => "Mary learns Scala"
        Add a learnsScala method, calls learn method with "Scala".
        Use it in postfix notation.

    4.  Overload the apply method
        marry.apply(2) => "Mary watched Inception 2 times"
   */

  //  1.
  println((mary + "the rockstar").apply())

  //  2.
  println((+mary).age)

  //  3.
  println(mary learns "Scala")
  println(mary learnsScala)

  //  4.
  println(mary(2))
}
