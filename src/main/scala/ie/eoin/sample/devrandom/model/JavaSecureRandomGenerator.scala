package ie.eoin.sample.devrandom.model

import java.security.SecureRandom

class JavaSecureRandomGenerator(var arraySize: Int)  extends Generator {
  val r: SecureRandom = SecureRandom.getInstance("SHA1PRNG", "SUN");
  //Make r seed itself
  r.nextBytes(new Array[Byte](arraySize))

  def moreBytes = {
    val nByte = new Array[Byte](arraySize)
    r.nextBytes(nByte)
    nByte
  }
}


