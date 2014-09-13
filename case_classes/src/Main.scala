
 object Main {
    def main(args: Array[String]) {

	  val beer = new Beer("Shiner", 12)
	  val spirit = new Spirit("Jack Daniels", 100, 80)
	  println(beer.name)
	  println(spirit.name)

	  //The toString method is implemented automatically for us
	  println(beer)
	  println(spirit)
    }

  }
