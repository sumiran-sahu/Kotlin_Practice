fun main() {
    val shapes = arrayOf(circle(3.0), circle(4.0), Square(4.0))
    calculatearea(shapes)
}

fun calculatearea(shape: Array<myshapes>) {
//here code will work differently based on the object
// suppose later a new shape comes we don't have to change the code accordingly in runtime
    for (i in shape) {
        println(i.area())
    }
}

open class myshapes {

    open fun area(): Double {
        return 0.0
    }
}


class circle(val radius: Double) : myshapes() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double) : myshapes() {
    override fun area(): Double {
        return side * side
    }
}
