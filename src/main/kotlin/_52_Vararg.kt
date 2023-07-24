fun main(){
    add(1,2,3,4,5)

}

fun add(vararg values:Int){ //we can send multiple number of arguments here
    var sum =0              //Here it means values is the Array of Integers
    for (i in values){
        sum+=i
    }
    println(sum)
}