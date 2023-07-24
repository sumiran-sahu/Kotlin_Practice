fun main(args:Array<String>):Unit{

    var number: Int=10   //you can change the value of it
    val number1 :Int=10  //you can not change the value of it

    // number1=11  impossible

    number =11  //it is possible here


    var name :String ="Sumiran"
    var canVote :Boolean=true
    var height :Float = 10.5f
    var age :Double =11.0
    var vowel :Char='A'



    var mynumber =10  //Automatically the mynumber is of type Int (Type inference )
    //  mynymber ="Sumiran"  //can't happen (Type checking {Compile time} )



    var i=13
    var j =2

    print(i.toDouble()/j)  //to convert from int to double 

}