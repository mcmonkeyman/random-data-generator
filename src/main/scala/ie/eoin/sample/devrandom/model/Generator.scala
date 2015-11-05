package ie.eoin.sample.devrandom.model

trait Generator {
  def arraySize: Int
  def moreBytes: Array[Byte]
}
