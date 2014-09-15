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
    describe("when lat is set") {
      it("should have a valid lat") {
        assert(loc.lat == x)
      }
    }

    describe("when lon is set") {
      it("should have a valid lon") {
        assert(loc.lon == y)
      }
    }  
  }

}
