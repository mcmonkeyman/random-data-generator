package ie.eoin.sample.devrandom.model

class SimpleGenerator(var arraySize: Int)  extends Generator {
  var seed = 0
  setSeed(42)

  def moreBytes = {
    val ar = new Array[Byte](arraySize)
    for(count <-0 to ar.size -1) {
      ar(count) = num().byteValue()
    }
    ar
  }

  private def setSeed(input: Int) = {
    seed = Math.abs(input % 9999999 + 1)
  }

  private def num(min:Int = 0, max:Int = 9999999) = {
    seed = (seed * 127) % 4539203
    seed % (max - min + 1) + min
  }
}


