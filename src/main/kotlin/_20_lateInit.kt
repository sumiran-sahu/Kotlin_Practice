fun main(){
    val obj =calculator()
//default constructor --if we don't define any constructor by default a constructor is created

    obj.add(2,3)

}

class calculator{

   lateinit var message :String

    /*here we have to provide the initial value but there is some cases
     where we don't know what will be the initial value*/
    //so here late-init is introduced Rule : It is always var , and we can't make it integer ,boolean and float

    fun add (a:Int,b:Int):Int{
        return a+b
    }fun multiply (a:Int,b:Int):Int{
        return a*b
    }

}