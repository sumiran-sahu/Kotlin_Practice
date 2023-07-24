fun main(){
    //we can store function in a variable
    val fn: (a: Double, b: Double) -> Double =::ADDITION
    println(fn(4.0,5.0))
    //Higher Order Function :Function that accepts function as argument or return functions Or both
    calculator(4.0,5.0,::ADDITION)


}
fun ADDITION(a:Double,b:Double):Double{
    return a+b
}

fun calculator(a:Double,b:Double,gn:(a:Double,B:Double)->Double){
    //This one is higher order function as taking function aas input
    val result =gn(a,b)
   println(result)
}


//use example  : server side data read either successful or unsuccessful
//               if successful a function will run
//               if unsuccessful a function will run  Here we use Higher Order Function
// Here we add 2 different functions in the function of readServerData