fun main (args:Array<String>){
    var car=Vehicle("car",4,5,"petrol")
    var car2=Vehicle("car2","petrol")
            //due to the use of secondary constructor we don't have to give all values




}

class Vehicle(val name:String,val tyres:Int ,val maxseating:Int,val enginetype:String){
    init {
        println("$name is created")
    }
    init {
        print("2nd initializer block")
    }

    constructor(nameparam:String,engineparam:String):this(nameparam,4,5,engineparam)

    /*this is the secondary constructor
      we know car has 4 tyre and 5 seat ,So we don't have to assign it again and again
      Rule : whenever a secondary constructor is created we have to call the primary constructor along with it
     */

    fun drive(){}
    fun applybrakes(){}



}