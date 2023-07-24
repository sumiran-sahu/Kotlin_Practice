fun main() {
    val LG = LG("SmartPhone")

}

open class MyPhone(val type: String) {      //parent is taking some parameter
    open val name: String = ""
    open val size: Int = 0

    fun makecall() = println("calling from mobile")
    fun display() = println("simple mobile  display")
    open fun powerOff() = println("shutting down")

}

class LG(typeparam: String) : MyPhone(typeparam) {
    //here how we send the value over to the parent class parameterized constructor
    override val name: String = "Lg"
    override val size: Int = 6
    override fun powerOff() {
        super.powerOff() //how we call the parent class methods
        println("Lg is shutting down")
    }

    //we can call the getter and setters also using super


}