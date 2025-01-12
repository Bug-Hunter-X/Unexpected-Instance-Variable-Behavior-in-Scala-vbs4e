```scala
object Counter {
  private var internalCounter = 0

  def increment(): Unit = {
    internalCounter += 1
  }

  def getCounter(): Int = {
    internalCounter 
  }
}

object Main extends App{
  Counter.increment()
  println(Counter.getCounter()) //Prints 1
  Counter.increment()
  println(Counter.getCounter()) //Prints 2
}

//Alternatively using a case class
case class MyClass(var internalCounter: Int = 0) {
  def increment(): Unit = internalCounter += 1
  def getCounter(): Int = internalCounter
}

object Main2 extends App {
  val instance1 = MyClass()
  instance1.increment()
  println(instance1.getCounter()) // Prints 1
  val instance2 = MyClass()
  println(instance2.getCounter()) // Prints 0
}
```