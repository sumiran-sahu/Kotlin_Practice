fun main (args:Array<String>){
   var functionvalue =::addsum  // we can store the function in a variable using ::
    println(functionvalue(1,2))
    //Here function value is a data type of  (a: Int, b: Int) -> Int


    var result=::powerfn
    val printresult=result(2,3)
    println(printresult)

}


fun powerfn(a:Int,b:Int): Double {
    return Math.pow(a.toDouble(), b.toDouble())
}

fun addsum(a:Int,b:Int):Int
{
    return a+b
}
