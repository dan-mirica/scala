import scala.io.StdIn.{ readLine, readInt }
import scala.math._
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

object ScalaTutorial {
  def main(args: Array[String]) {

    /*
		var i=0;

		while(i<=10){
		println(i)
		i=i+1
		}

		for (i<-1 to 10)
		println(i)

		val randomLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		for (i<-0 until randomLetters.length)
			println(randomLetters(i))
			*/

    /*
			val aList = List(1,2,3,4,5)
			for(i<-aList)
			println ("List items: "+i)
			*/

    /*
			var evenList = for { i<-1 to 20 if (i%2)==0} yield i

			for(i<-evenList)
			println ("List items: "+i)
			*/

    /*
			for (i<-1 to 5; j<-6 to 10){
				println("i: "+i +"   |   "+"j: "+j)
			}
			*/

    /*
			printPrimes

			def printPrimes(){
			val primes = List(1,2,3,5,7,11,13,17,23,29,31)

			for (i<- primes){
				if (i==11)
					return
				if (i!=1){ println(i)}
				}
			}
			*/

    /*
			var numberGuess = 0
			do {
			print ("guess a number: ");
			numberGuess = readLine.toInt //readInt
			}while(numberGuess!=15)

			printf("you guessed %d\n", numberGuess)
		*/

    /*
			val name = "olaf"
			val age = 8
			val weight = 9.12345
			println(s"Heloo $name")
			println(f"I am  ${age+1} and weight $weight%.2f")

			printf("'%05d'\n",9)
			printf("'%-5d'\n",9)
			printf("'%.5f'\n",3.14)
			printf("'%-5s'\n","hi")
			*/

    /*
			  def getSum(num1: Int = 1, num2: Int =1) : Int = {
			      //return num1 + num2
			    println("sum of num1: "+num1+" and num2: " + num2)
			    num1 + num2
			  }
			  println ("5+4="+getSum(num2=5,num1=4))
			  println ("4+5="+getSum(num2=4,num1=5))
	*/

    /*
   def sayHi():Unit = {
	      println ("hi");
	  }

	  sayHi
	  */

    /*	  def getSum(args: Int*):Int={
	    var sum:Int = 0
	    for(i<-args){
	      sum = sum + i
	    }
	    return sum
	  }

	  println(getSum(1,2,3,4,5))*/

    /*	  def factorial(num:BigInt):BigInt = {
	    if (num<=1)
	      return 1
	    else
	      num * factorial(num-1)
	  }

	  println(factorial(10))*/

    /*
    //array, fixed length
    val favNums = new Array[Int](20)
    val friends = Array("Bob", "Tom")
    friends(0) = "Sue"
    println("best friend: " + friends(0))
    //array buffer dynamic length
    val friends2 = ArrayBuffer[String]()
    friends2.insert(0, "Phill")
    friends2 += "Mark" // that works, but friends2 = friends2 + "Mark" doesnt work
    friends2 ++= Array("Susy", "Paul")
    friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")
    friends2.remove(1, 2)

    var friend: String = ""

    for (friend <- friends2) {
      println(friend)
    }

    for (j <- 0 to (favNums.length - 1)) {
      favNums(j) = j
      println(favNums(j))
    }

    val favNumsTimes2 = for (num <- favNums) yield 2 * num

    favNumsTimes2.foreach(println)

    val numbsDiv4 = for (num <- favNums if num % 4 == 0) yield num

    numbsDiv4.foreach(println)

    var mulTable = Array.ofDim[Int](10,10)

    for (i <- 0 to 9){
      for (j<-0 to 9){
          mulTable(i)(j) = i * j
      }
    }

    for (i <- 0 to 9){
      for (j<-0 to 9){
          printf("%d:%d=%d\n",i,j,mulTable(i)(j))
      }
    }

    println("sum: " + favNumsTimes2.sum)
    println("min: " + favNumsTimes2.min)
    println("max: " + favNumsTimes2.max)
    val sorted = favNumsTimes2.sortWith(_>_)
   println(sorted.deep.mkString(" | "))
 */

    /*    val empoyees = Map("Manager"-> "bob smith", "secretary"->"sue")
    if(empoyees.contains("Manager"))
      println(empoyees("Manager"))

      var customers = collection.mutable.Map(100->"paul", 101->"sue")

      customers(100) = "tom"
      customers(102) = "olaf"

      for ((k,v)<- customers){
        printf("%d - %s\n", k, v)
      }*/

    /*var tupleMarge = (103,"marge", 10.25)

    printf ("%s owes us %.2f dollars\n", tupleMarge._2, tupleMarge._3)

    tupleMarge.productIterator.foreach(println)

    println(tupleMarge.toString())*/

    /*
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("wof")
    printf("%s says %s\n", rover.getName(), rover.getSound())

    println(rover.toString())

    val olaf = new Dog("Olaf", "wooof", "grrrr")
    println(olaf.toString())
*/

    /*    println(sumCubesInterval(100, 200))
    println(sum(cube, 100, 200))

    println(sum((x: Int) => x, 100, 200))
    println(sum((x: Int) => x * x * x, 100, 200)) // this means: make sum of the following: before you give it to the sum, cubed it
    																							// also our sum has 2 params: the cubing and the numbers

    println(tail(x => x * x, 3, 7))*/

    /*
     println(sum2(cube)(1, 10)) // this means: we make sums of cubes, like a general rule, then we apply it to our numbers
                                // also now we chain functions like: sum of cubes chained to some numbers

     println(sum2(squared)(1,4))
     */

    var list = List(1,2,3,4,5)
    var list2 = list.map {x=>x*x}
    list2.foreach(println)

  }

  def increment(x:Int):Int ={
    x+1
  }

  def squared(x:Int):Int ={x*x}

  def sumCubesInterval(a: Int, b: Int): Int = {
    if (a > b) return 0
    else
      cube(a) + sumCubesInterval(a + 1, b)
  }

  def cube(x: Int): Int = {
    return x * x * x
  }

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def tail(f: Int => Int, a: Int, b: Int) = {
    def loop(a: Int, acc: Int): Int =
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    loop(a, 0)

  }

  // if i understand this: sum2 works a function f defined on an int and returns and int, works this function f over 2 ints and returns an int
  def sum2(f: Int => Int): (Int, Int) => Int = {
    // this is how we sum each individual result from f
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else
        f(a) + sumF(a + 1, b)
    sumF
  }

  def sum3(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum3(f)(a + 1, b)
  }

  ////////////////////////////////////////////////////////////
  class Animal(var name: String, var sound: String) {
    this.setName(name)

    val id = Animal.newIdNum

    def setName(name: String) {
      if (!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "NoName"
    }
    def setSound(sound: String) {
      this.sound = sound

    }

    def getName(): String = name
    def getSound(): String = sound

    def this(name: String) {
      this("NoName", "NoSound")
      this.setName(name)
    }

    def this() {
      this("NoName", "NoSound")
    }

    override def toString(): String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }

  }

  object Animal {
    private var idNumber = 0
    private def newIdNum = { idNumber += 1; idNumber }
  }

  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def this(name: String, sound: String) {
      this("noName", sound, "nogrowl")
      this.setName(name)
    }

    def this(name: String) {
      this("noName", "noSound", "nogrowl")
      this.setName(name)
    }

    def this() {
      this("noName", "noSound", "nogrowl")
    }

    override def toString: String = {
      return "%s with the id %d says %s and growls: %s".format(this.name, this.id, this.sound, this.growl)

    }

  }

}
