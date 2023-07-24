fun main(){
    var testobj = object  {
        val a:Int=10
        fun method(){
            println("I am object expression")
        }
    }
    println(testobj.method())
}

//Anonymous object using object keyword
// Replacement of java anonymous inner class


//No need of making a class   we can directly make a single object and use inheritance and implements on it