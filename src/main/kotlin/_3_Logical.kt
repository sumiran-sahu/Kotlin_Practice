fun main(){
    val above70 = false
    val knowshowtoProgramme =true

    //&& AND---TRUE+TRUE == True
    var callforInterview =above70&&knowshowtoProgramme
    print(callforInterview)


    //  || OR

     callforInterview =above70||knowshowtoProgramme
    println(callforInterview)


    // ! Not Operator
    val answer=false
    println(!answer)
    println(!!answer)



    // Short-circuiting
     var i=10
     var j=11

    var result =i==10 || ++j==12   /*Here the first part is true so compiler doesn't go for the second part
                                     it is called short-circuiting */
    print(i)
    print(j)




}