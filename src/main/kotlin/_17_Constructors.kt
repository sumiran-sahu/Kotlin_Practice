fun main(args:Array<String>){
    var car = Automobile1("Car",4,4,true)
    var person =person("sumi",20)
    println(person.age)
    println(person.name)
    println(person.canVote)

}

class Automobile(val name :String, val tyres:Int,val maxSeating:Int){  //primary constructors type 1
    fun drive(){}
    fun applybrakes(){}
}


class empty{}  //this class is of no use because doesn't have any property


class person(nameparam:String,ageparam:Int){  //primary constructor type 2
    val name :String="$nameparam-clan"  //here we can do some operation with the argument
    var age :Int=ageparam
    var canVote:Boolean =ageparam>18  //we can have some checks also using these
}


class Automobile1(val name :String, val tyres:Int,val maxSeating:Int,hasairbags:Boolean){
    //primary constructors and secondary both together
    var airbags=hasairbags
    fun drive(){}
    fun applybrakes(){}
}