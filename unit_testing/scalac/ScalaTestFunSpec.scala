import org.scalatest.FunSpec 

class Location(val Lat: Double, val Lon: Double) {
  val lat = Lat
  val lon = Lon
}

class ScalaTestFunSpec extends FunSpec { 

  val x: Double = 31.35453
  val y: Double = -107.994545
  val loc = new Location(x, y)


  describe("A Location") {
    describe("when lat is set to ") {
      it("should have a lat set to") {
        assert(loc.lat == x)
      }
    }

    describe("when lon is set to ") {
      it("should have a lon set to ") {
        assert(loc.lon == y)
      }
    }  
  }

}
