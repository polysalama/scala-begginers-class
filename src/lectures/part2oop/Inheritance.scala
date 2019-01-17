package lectures.part2oop

object Inheritance extends App {


  // single class inheritance
  class Animal {
    val creatureType = "wild creature"

    // public, protected private
    def eat = println("nomnom")
  }

  class Cat extends  Animal {
    def crunch = {
      eat
      println("crunch, crunch")
    }
  }

  val cat = new Cat
  cat.crunch


  // constructors
  class Person(name :String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType: String = "domestic"
    override def eat: Unit = {
      super.eat
      println("crunch, crunch")
    }
  }
  val dog = new Dog("k9")
  dog.eat
  println(dog.creatureType)

  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // overRIDING  === Supplying different implementation in derived classes
  // vs
  // overLOADING === Supplying multiple methods with different signatures withe the same name in the same class

  // super
  // super.eat = calls method of supper class

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class
  // 3 - seal the class = extend class in THIS FILE ONLY but prevent extension in other files
}
