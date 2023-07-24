fun main(args: Array<String>) {
    draggingobjects1(arrayOf(ccircle1(2.0),ssquare1(3.0),player1("sumiran")))

}


fun draggingobjects1(objects: Array<Draggable1>) {   //it only takes the sshape class childern won't take others
    for (i in objects) {
        i.drag()
    }

}
interface Draggable1{

    //val dragspeed:Int   we can also add some variable also
    fun drag()
}                       //after adding these we can now drag any object in the above function
interface clonable1 {
    fun clone()
}

abstract class sshape1 :Draggable1,clonable1{  //we can implements many interface together
    abstract fun area(): Double

}

class ccircle1(val radius: Double) : sshape1() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is dragging ")
    }

    override fun clone() {
        TODO("Not yet implemented")
    }


}

class ssquare1(val side: Double) : sshape1() {
    override fun area(): Double {
        return side * side
    }

    override fun drag() {
        println("square is dragging")
    }

    override fun clone() {
        TODO("Not yet implemented")
    }
}

//later a  person class comes out of the shape parent-object scenario
//here the code won't work

class player1(val name: String) :Draggable1{
    override fun drag() = println("$name is dragging")
}

//this is the scenario where the INTERFACE comes to the scene


//after making the interface here we can now avoid the parent --child hierarchy we group the according to their behaviour
// we can now add any class and polymorphism is present

//only the new class has to implement the interface and override the function
