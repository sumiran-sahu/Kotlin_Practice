fun main(){
    val p1=Person2(1,"sumi")
    val p2=Person2(1,"sumi")


    println(p1)
    println(p2)
    println(p1==p2) //after declaring the Person2 class as a data class it works on data
                    //before it false as it checks the address

    val p3=p1.copy()      //we can copy also one object to other
    val p4=p1.copy(id=4) //we can also assign a new object like this
    println(p3)
    println(p4)

    val (id,name)=p1    //destructuring done here
    println(id)
    println(name)

    println(p1.component1())
    println(p1.component2()) //destructuring  done here in the background

}

data class Person2(val id:Int,val Name:String)

