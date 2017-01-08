import java.math.BigInteger

val big = new BigInteger("12345")

val greetStrings = new Array[String] (3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

greetStrings(1) = "ahem"


for (i <- 0 to 2)
  print(greetStrings(i))

greetStrings.foreach(arg => println(arg))


//val oneTwoThree = List(1, 2, 3)

var twoThree = List(2, 3)
var oneTwoThree = 1 :: twoThree

val pair = (99, "LuftBallons")

println(pair._1)
println(pair._2)

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"

//println(jetSet(1))


println(jetSet.contains("Cessna"))

import scala.collection.mutable

val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)
movieSet.foreach(movie => println(movie))

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island")
treasureMap += (2 -> "Find big X on the ground")
treasureMap += (3 -> "Dig!")

println(treasureMap(2))


