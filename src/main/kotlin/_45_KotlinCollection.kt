fun main(){
    val nums= listOf<Int>(1,2,3,4)     //by -Default it is immutable
    println(nums.indexOf(3))
    println(nums.contains(5))


    //mutable list
    val number= mutableListOf<Int>(1,2,3,4)   //we can add,remove,delete,update here
    number.add(5)
    number.remove(2)
    println(number)

    val number2= listOf<Int>(11,12)

    number.addAll(number2)  //Important method
    println(number)





    /*Arrays -Fixed size once made
    *
    *  Lists -Dynamic size
    *    2 types -:Mutable(can be changed ) and immutable(can't be changed )
    *
    *    In an  array we can update the data but in immutable List we can't update the data
    *
    *
    *
    *
    *
    *
    * */

    //Maps
  /* key -value pair
     mutable and immutable 2 types

  */

    val student = mutableMapOf<Int,String>()
    student.put(1,"Sumi1")
    student.put(2,"sumi2")
    student.put(3,"Sumi3")

    for ((key,value) in student){
        println("$key--$value ")
    }

    val immutable = mapOf<Int,String>(1 to "sumi",2 to "sumi2",3 to "sumi")
      //To is used here as no put function is present in immutable
















}