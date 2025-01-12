```scala
class MyClass {
  private var internalCounter = 0

  def increment(): Unit = {
    internalCounter += 1
  }

  def getCounter(): Int = {
    internalCounter 
  }
}

object Main extends App{
  val myInstance = new MyClass()
  myInstance.increment()
  println(myInstance.getCounter()) //Prints 1
  val anotherInstance = new MyClass()
  println(anotherInstance.getCounter()) //Prints 0, as expected
}
```