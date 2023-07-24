fun main() {
    val onePlus = OnePlus()
    onePlus.powerOff()
    onePlus.makecall()
    onePlus.display()

}


open class Mobile {   //this class is open for inheritance
    open val name: String = ""
    open val size: Int = 0

    open fun makecall() = println("calling from mobile")
    open fun display() = println("simple mobile  display")
    open fun powerOff() = println("shutting down") //here open means the method can be override

}


class OnePlus : Mobile() {
    override val name: String = "Oneplus"
    override val size: Int = 6
    override fun makecall() = println("Oneplus is calling")
    override fun display() = println("Oneplus is oled-screen")
    override fun powerOff() = println("Oneplus is shutting down")


}