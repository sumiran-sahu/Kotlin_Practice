

fun main(args:Array<String>){
    println(sum(1,2))
    println(evenOrodd(2))
    printmessage()
}

// Normal Function (If a function return nothing the by-default it's return type is UNIT )
fun sum(num1:Int,num2:Int):Int{
    return num1+num2
}

// fun sum(num1:Int,num2:Int):Int=num1+num2   (Making it InLIne Function)
fun evenOrodd(num1:Int):String{
    val result=if (num1%2==0) "even" else "odd"

    return result
}


//default argument  (If you pass some value it will take it otherwise choose the default value )
fun printmessage(count:Int=2){   //here the default values are of val type
    for (i in 1..count){
        println("Hello $i")
    }
}

