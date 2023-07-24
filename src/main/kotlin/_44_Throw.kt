import java.lang.IllegalArgumentException

fun main(){
    createuserList(5)
    createuserList(-1)
}

fun createuserList(count:Int){
    if (count<0){
        throw IllegalArgumentException("Count must be greater than zero")
                                                   //Where we send an exception to the user
    }else{
        //code will run
        println("Code is running")
    }
}