package programming_scala.ch4

import programming_scala.ch4.ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}
