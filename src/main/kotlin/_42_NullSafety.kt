fun main(){
    val gender :String="Male" //"female" or "Other


    var gender2: String? =null   //Datatype+? =Nullable type
                                //Now we can assign null to it

    if (gender2 != null) {            //If we perform any action on it , it will provide nullException
        gender2.toUpperCase()        //To overcome this we have surround with null check
    }

    gender2?.toUpperCase()       // we can add ? to it for null safety (?--it is called safe call operator )


   gender2?.let {      //To perform many tasks we have let

       println("Line1")
       println("Line2 $gender2") // we can get the value of gender2
       println("line3 $it")  //we can also get the value og gender2 here by using 'it'

   }

    //suppose here a condition appear user choose any value we assign it to it
    //if not then we will assign default value to it
   var selectedValue=gender2 ?: "Na"    //?: --It is called elvia operator

    var value =gender2!!.toUpperCase() //Not null assert operator
                                      //whatever happen it call the function




}