fun main(){
    println("Hello world".formattedString())
  calculatetime { Loop(10000000) }
}

fun String.formattedString() :String{
                             //String class can't be inherited if we want to add another functions to it
                            //we have to ClassName.TheFunctionNameYouWantToAdd (This is called Extension Function)
                            //In this function we can not access any of the variable and function of the String class
    return "- - - - - - - -\n$this\n- - - - - - - -"
}


//Inline Function
fun Loop( n:Int){
    for (i in 1..n){
        //
    }
}
inline fun calculatetime(Fn :()->Unit){
    val start=System.currentTimeMillis()
    Fn()
    val end=System.currentTimeMillis()
    println("Time taken ${end-start}ms")
}
//If we define a lambda then a class will be made dynamically then make its instance then it can be used
//It is a performance hit
//If we mark it as inline ,then in the byte code no class and no object will be made
// The code will be directly copied ,That don't affect the performance 
