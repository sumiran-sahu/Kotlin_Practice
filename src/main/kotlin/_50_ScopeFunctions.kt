//apply,let,with,run
fun main() {
   val emp1 =Employee("sumi",30)

   val obj: Employee = emp1.apply {   //To set  values of an object
                             // Return type of the function is a obj
        age=40
        name="SUMIRAN"
    }


    emp1.let{
        println(it.name)        //if you want to perform multiple operation on an object Then we use it
        println(it.age)        //Return type is -:Last line type
    }


    with(emp1){       //this reference is present here
                                // return type is the last line type
        this.name="Dj sumi"
        this.age=40
    }

    emp1.run {         //with+let ==run how it works
        this.name="Run sumi"      //return type -last line type
        this.age=23
    }

    println(emp1)






}


data class Employee(var name: String="", var age: Int)

