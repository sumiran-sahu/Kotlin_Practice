fun main(args: Array<String>) {
    val mycircle = Mycircle(4.0)
    println(mycircle.area())
    val mysquare = Mysquare(4.0)
    println(mysquare.area())
}

abstract class OurShape {            //If an abstract method is present then the class must be abstract
                                    //we can't make an object of abstract class
    lateinit var name: String
    abstract fun area(): Double     //An Abstract function doesn't have a body

}


class Mycircle(val radius: Double) : OurShape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}


class Mysquare(val side: Double) : OurShape() {
    override fun area(): Double {
        return side * side
    }
}