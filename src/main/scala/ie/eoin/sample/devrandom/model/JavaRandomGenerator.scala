package ie.eoin.sample.devrandom.model


class JavaRandomGenerator(var arraySize: Int) extends Generator{
  var r = new scala.util.Random

  def moreBytes = {
    val nByte = new Array[Byte](arraySize)
    r.nextBytes(nByte);
    nByte
  }
}

