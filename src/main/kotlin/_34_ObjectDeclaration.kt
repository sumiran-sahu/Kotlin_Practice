fun main(){
    println(Ab.num)
    b.test()

}

object Ab{
    val num :Int=10

}
object b{
    val g:Int=20
    fun test(){
        println("I am a object")
    }
}


/*No need of  class declare only  a single object is created
 No constructor is allowed (init block is allowed)
 singleton pattern
 cAN INHERIT class and interface
 simple --many objects need create class
          single object need create object
 */