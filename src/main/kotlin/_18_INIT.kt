fun main (args:Array<String>){
    val car =automobile("TATA",4,5)
}


class automobile( val name:String,val tyres:Int ,val maxseating:Int){

    init {
        println("$name is created")  // after the properties made then init block is initiated

    }


}

