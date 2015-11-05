package ie.eoin.sample.devrandom

import java.util.Arrays
import java.nio.ByteBuffer
import ie.eoin.sample.devrandom.model._

/**
 * @author ${user.name}
 */
object App {

  def main(args : Array[String]) {
    if(args.size!=2) {
      throw new WrongNumberOfArgumentsException("Missing flags, should include generator-name and byte array size")
    }

    val arraySize = args(1).toInt 
    val generator: Generator = args(0) match {
      case "java" => new JavaRandomGenerator(arraySize)
      case "javasecure" => new JavaSecureRandomGenerator(arraySize)
      case "simple" => new SimpleGenerator(arraySize)
      case _ => throw new NoSpecifiedGeneratorException("")
    }

    while(true) {
      println(Arrays.toString(generator.moreBytes))
    }
  }

  class NoSpecifiedGeneratorException(smth:String) extends Exception
  class WrongNumberOfArgumentsException(smth:String) extends Exception
}
