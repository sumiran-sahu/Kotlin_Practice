fun main(args:Array<String>){

    val mustang =Car("Mustang","Petrol",15000)  //object is created
    val bmw=Car("BMW","Diesel",5000)

    mustang.drivecar()
    mustang.applybrakes()


}

class Car(val name:String,val type:String,var kmran:Int){   //properties
    fun drivecar(){
        println("$name car is driving")
    }
    fun applybrakes(){
        println("$name car is stopped")
    }
}