fun main(args:Array<String>){

    val sumi =Person("sumi",23)
    print(sumi.canvote())

}


class Person(val name:String,var age:Int){

    fun canvote():Boolean{
        val result=if (age>18) true else false
        return result
    }
}




