fun main (args:Array<String >){

    val age :Int=19
   //You can put the result of if and else statement in a variable also  (If else as expression)

    val result =if (age>=18){
        "Able to vote"
    }else{
        "Not able to vote "
    }

    println(result)



    val number :Int =20
    var value = if (number % 2==0) "even" else "Odd"  //if -else in single line
    print(value)
}