import org.scalatest.FunSuite 

class Location(val Lat: Double, val Lon: Double) {
  val lat = Lat
  val lon = Lon
}

class ScalaTestFunSuite extends FunSuite { 

  val x: Double = 31.35453
  val y: Double = -107.994545
  val loc = new Location(x, y)

  test("Checking Lat Value") {  
    assert(loc.lat === x)
  }

  test("Checking Lon Value") {
    assert(loc.lon === y)
  }

}
