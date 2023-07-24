fun main() {
    val circle=C(4.0)
    val player=Player("sumi")

    //smart casting
    val array:Array<draggable>  = arrayOf(circle,player)
    for (obj in array){
        if (obj is C){
            println(obj.area())  //here the object is smartly shows only the function of class c kind of type-checking done here
        }else{
            (obj as Player).sayMyname() //here the other objects is smartly caste to player class
        }
    }


   // type checking
    if (circle is C){
        //There is some situation where we have some array of objects ,and
        // we want to do some specific tasks on specific objects
        println("This is circle")
    }


}

interface draggable{
    fun drag()
}
abstract class Myshape :draggable{
    abstract fun area(): Double

}

class C(val radius: Double) : Myshape() {
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() =println("Circle is dragging ")


}
class Player(val name: String) :draggable{
    override fun drag() = println("$name is dragging")
    fun sayMyname()= println("Hey my name is - $name")
}




