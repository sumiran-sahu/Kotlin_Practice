fun main() {
    val pizza1 = Pizza.Factory.create("Tomato")
    println(pizza1)

    //here I am calling via factory reference -Don't want to use factory ref
    //now after defining that as companion
    val pizza2 = Pizza.create("Peri Peri Paneer")
    println(pizza2)

    //one more thing we can do -We want everyone to call the create function if they want pizza
    //for that we will mark the constructor as private
    // var pizza3=Pizza() //Now everyone needs to call the create function
    //i.e : everyone has to call its  function now
}

//Example of Factory Pattern using companion object
class Pizza private constructor(val type: String, val toppings: String) {
    companion object Factory {
        fun create(pizzatype: String): Pizza {
            return when (pizzatype) {
                "Tomato" -> Pizza("Tomato", "Tomato,cheese")
                "Peri Peri Paneer" -> Pizza("Paneer", "Peri peri")
                else -> Pizza("basic", "onion,cheese,")
            }
        }
    }

    override fun toString(): String {

        return "Pizza(type-$type,toppings-$toppings)"
    }
}
