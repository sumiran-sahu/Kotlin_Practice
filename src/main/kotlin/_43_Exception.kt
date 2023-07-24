fun main(args: Array<String>) {
    val arr: Array<Int> = arrayOf(1, 2, 3)


    try {
        println(arr[5])         //code that may produce error
    } catch (e: NullPointerException) {

    } catch (e: Exception) {        //multiple catch block can be possible here
                                   // RULE:First write specific one then the generic
        println("You are putting wrong value here ")
    } finally {
        println("It will execute no matter what happen ")
    }


}


/*Exception  : Suppose I want to connect to database,Unfortunately connection can't be made ,we can handel that
               By showing Some Error Happen , Please try after some time

               */