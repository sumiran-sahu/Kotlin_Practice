fun main(){
    val oneplus :phone=SmartPhone()
    oneplus.getDeviceInfo()

}


open class phone{    //open is written here for the class can be inherited
    val name:String =""
    val type:String=""
    val volume:Int=10


    fun makecall(){}
    fun display(){}
    fun poweroff(){}
    fun getDeviceInfo(){}
}

class BasicPhone :phone(){  //here the BasicPhone inheriting the properties and functions from super class

    fun getScreenInfo(){}
}

class SmartPhone:phone(){

    fun playMovies(){}
    fun takepicture(){}
    fun getLocations(){}
}

