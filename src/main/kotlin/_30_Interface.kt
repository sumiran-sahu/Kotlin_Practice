fun main(args: Array<String>) {
    draggingobjects(arrayOf(ccircle(2.0), ssquare(3.0)))

}

fun draggingobjects(objects: Array<sshape>) {   //it only takes the sshape class childern won't take others like here player
    for (i in objects) {
        i.drag()
    }
}

abstract class sshape {
    abstract fun area(): Double
    abstract fun drag()
}

class ccircle(val radius: Double) : sshape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is dragging ")
    }

}

class ssquare(val side: Double) : sshape() {
    override fun area(): Double {
        return side * side
    }

    override fun drag() {
        println("square is dragging")
    }

}

//later a  person class comes out of the shape parent-object scenario
//here the code won't work

class player(val name: String) {
    fun drag() = println("$name is dragging")
}

//this is the scenario where the INTERFACE comes to the scene


