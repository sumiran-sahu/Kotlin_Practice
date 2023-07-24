fun main(){

    val animal ="Dog"
    //Traditional way
    if(animal=="Horse"){
        println("Animal is horse ")
    }else if (animal=="cat"){
        println("Animal is cat ")
    }else if (animal =="Dog"){
        println("Animal is Dog ")
    }else
    {
        println("Animal not found ")
    }




    //when   (In java it is like switch statement)

    when(animal){
        "Horse" -> println("Animal is Horse")
        "Cat"->println("Animal is Cat")
        "Dog"-> println("Animal is Dog")
        else -> println("Animal not found !")
    }

    //when as an expression

    var result = when(animal){
        "Horse" -> "Animal is Horse"
        "Cat"->"Animal is Cat"
        "Dog"-> "Animal is Dog"
        else -> "Animal not found !"
    }

    println(result)


    //we can use the range function in  when statement as options
    val number =13
    val result1=when(number){
        11->"eleven"
        12->"twelve"
       in 13..19->"Teen"
        else->"Not in range "
    }
    println(result1)

}