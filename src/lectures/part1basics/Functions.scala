package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction() : Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  // Return type Unit


  // Nested functions
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
  1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
  2.  Factorial function
  3.  A Fibonacci function
  4.  Tests if a number is prime
   */

  // 1.
  def aGreetingFunction(name: String, age: Int): String =
    "Hi, my name is" +  name + " and I am " + age + " years old."
  println(aGreetingFunction("Test", 1))

  // 2.
  def factorialFunction(n: Int): Int = {
    if (n > 1) n * factorialFunction(n-1)
    else n
  }
  println(factorialFunction(5))

  //3.
  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(fibonacci(8))

  //4.
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(5))
}
