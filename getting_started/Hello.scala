/**
 * Getting Started. This is the simplest example. A Hello World.
 * Shows use of the App Trait
 */
object Hello extends App {
  println("Hello")

  printMe("World")

  def printMe(s:String)  {
    println(s)

    //executionStart is a property of the App,
    //which provides the time that the program started in millis since linux epoch
    println(executionStart)
  }

}
