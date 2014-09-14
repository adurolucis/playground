class Location(val Lat: Double, val Lon: Double) {

  val lat = Lat
  val lon = Lon

}

object ScalaLocationTest {

  def main(args: Array[String]) {

    val x: Double = 31.35453
    val y: Double = -107.994545
    val location = new Location(x, y)
    assert(location.Lat == x, "Verify Lat")

  }

}
