import org.scalatest.FunSuite 

class Location(val Lat: Double, val Lon: Double) {
  val lat = Lat
  val lon = Lon
}

class ScalaTestFunSuite extends FunSuite { 

  test("Checking invalid Lat") {  
    val x: Double = 31.35453
    val y: Double = -107.994545
    val loc = new Location(x, y)
    assert(loc.lat === x)
  }

}
