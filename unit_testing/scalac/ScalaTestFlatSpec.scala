import org.scalatest.FlatSpec 

class ScalaTestFlatSpec extends FlatSpec { 

  val x: Double = 31.35453
  val y: Double = -107.994545
  val loc = new Location(x, y)


  "A location" should "have lat" in {
    assert(loc.lat == x)
  }

  it should "also have a lon" in {
    assert(loc.lon == y)
  }

}
