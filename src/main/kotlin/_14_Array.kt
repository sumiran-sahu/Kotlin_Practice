
fun main(args:Array<String>){

    //array  --> Object that stores multiple values of same type and fixed size

    val arr :Array<String>  = arrayOf("one","two","three")
    val arr1 = arrayOf(1,2,3,4,5)

    for (i in arr){
        println(i+" ")
    }


    //print array element along with  index

    for((i,e) in arr.withIndex()){   //i --index e--value
        println("$i - $e")
    }


    print(arr.size)  // number of elements in arr


}