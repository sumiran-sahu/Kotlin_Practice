fun main (args:Array<String>){
    val number =2
    for (i in 1..10){
        //2x1=2
       // println(number.toString()+" x "+i+" = "+number*i)

        //This one is called string templating
        println("$number x $i = ${number*i}")
    }
}