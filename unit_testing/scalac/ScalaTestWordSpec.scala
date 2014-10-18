import org.scalatest.WordSpec 

class ScalaTestWordSpec extends WordSpec { 

  val x: Double = 31.35453
  val y: Double = -107.994545
  val loc = new Location(x, y)


  "A location" when {
    "lat is initalized" should {
      "have lat" in {
        assert(loc.lat == x)
      }
    }
  }

  "A location" when {
    "lon is initalized" should {
      "have lon" in {
        assert(loc.lon == y)
      }
    }
  }

}
