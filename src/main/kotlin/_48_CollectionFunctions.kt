fun main() {
    val num = listOf<Int>(1, 2, 3, 4, 5)

    num.forEach{ println(it) }  //for each     --Iterate over one by one same as Loop

    //Filter function
    val list1 = num.filter(::isOdd)
    val list: List<Int> = num.filter { a: Int -> a % 2 != 0 }


    //simplify above one
    val list2 = num.filter { it % 2 != 0 }


    val userList = listOf<User>(User(1, "sumi1"), User(2, "sumi2"), User(3, "sumi3"))

    val list4 = userList.filter { it.id == 2 }
    println(list4)


    //Map function --shift one function to another function

    val list5 = num.map { it * it }
    println(list5)

    val paidUserList = userList.map { PaidUser(it.id, it.name, "Paid") }
    println(paidUserList)


}

fun isOdd(a: Int): Boolean {
    return a % 2 != 0
}


data class User(val id: Int, val name: String)
data class PaidUser(val id: Int, val name: String, val type: String)


/*use of map function
 Network pe call mari ,the data comes and has some extra fields ,but I need less fields
 ,then I map it to another list and update on UI

 */