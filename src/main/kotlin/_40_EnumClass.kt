fun main(){
    val day =Day.Sunday
    println(day)
    day.printformated()


    val day2=Day1.Monday
    println(day2.number)



    for (i in Day.values()){ //we can also run a loop on enum class
        println(i)
    }
}



//There will be a set of possible answers
//For example  :Gender -Male Female Other
//              Day-Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday


enum class Day(){
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;     //; we have to put at last  object to declare a function

    fun printformated(){
        println("Day is $this")// here This works on the object of the enum class
    }
}

//enum class with constructor
enum class Day1(val number :Int){
    Sunday(1),             //here we add all default constructor in all objects
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7)
}