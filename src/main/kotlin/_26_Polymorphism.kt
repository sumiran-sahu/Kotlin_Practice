fun main() {
    val circle: shapes = Circle(4.0)
    val square: shapes = square(4.0)
    //parent can hold references to it child
    //here reference we are making of parent class But we are making object of child class
    //It is possible because of polymorphism
    println(circle.area())
    println(square.area())
    //here the method of the parent class is not called But the method of the child class is called

}

open class shapes {

    open fun area(): Double {
        return 0.0
    }
}
class Circle(val radius: Double) : shapes() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
class square(val side: Double) : shapes() {
    override fun area(): Double {
        return side * side
    }
}



