fun main() {
    var fn: (a: Int, b: Int) -> Int = ::MySum  //function store in a variable

    val lambda1: (Int, Int) -> Int ={ x:Int, y:Int->x+y}   //lambda expression

    val multilinelambda: () -> Int ={          //multiline lambda
                                    //the last line is the data type
        println("Hello world")
        val a:Int=2+3
        "Hello"            //here data type of lambda is String
        2
    }
      //Some type of lambda
    val singleParamLambda ={x:Int->x*x}
    val lambda2:(Int)->Int= {x->x*x}
    val simplyfylambda2 :(Int)->Int = {it*it}
    val sayHii={msg:String-> println("hello $msg") }

    cal(1,2) { a, b -> a + b }  //If the last argument is lambda we can right like this

}

fun MySum(a: Int, b: Int) = a + b

fun cal(a: Int, b: Int, op: (Int, Int) -> Int):Int{
    return op(a, b)
}