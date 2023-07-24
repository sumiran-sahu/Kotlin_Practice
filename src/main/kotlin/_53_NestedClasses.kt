fun main(){
   // val Nestedobj =Outer.nested().test()   //Object making of nested classes

    val innerobj = Outer().nested().test()  //here we have to make object on outer class also

    val d0 = 1.0
    val f0 = 1f
    val l0 = 30L

    val s1:String ="Sumi"
    val s2:String ="Sahu"
    println(s1+s2)

}


class Outer{
    val i=0
 inner  class nested(){              // scenario -- a class alone no existence it only goes with outer class
        fun test(){            //But here we can not access the variable of the outer class
            println("I am in nested class $i ")     //To access its variable we have to make it inner class
        }
    }
}

// class inside class in nested class
//if we want to access outer class object then we have to assign it to inner