
//Named argument in method call we assign the argument(value) with the parameter our-self

fun main(args :Array<String>){
   addme(a=4,b=5)  //here we assign the value our-self
    addme(b=4,a=6)  //we can change the sequence ,but we have to assign all parameter values
}

fun addme(a:Int,b:Int):Int =a+b

