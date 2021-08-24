object FizzBuzzCollections extends App {
val myNumber = (1 to 100).toArray
 def getFizzBuzzText(n:Int) = {
  if (n % 5 == 0 && n % 7 == 0) "FizzBuzz"
  else if (n % 5 == 0) "Fizz"
  else if (n % 7 == 0) "Buzz"
  else s"$n"
 }
  val myFizzBuzz = for (n<- myNumber) yield getFizzBuzzText(n)
  myFizzBuzz.foreach(println)

}
