fun main(){
    val tile =Red("Mushroom",20)
    val tile2=Red("Fire",30)

    println("${tile.points}-${tile.type}")

    //Suppose a condition appear if red comes *2 and blue comes *5
    val tile3:Tile=Red("Mushroom",20)

    val points:Int=when(tile3){
        is Red ->tile3.points*2
        is Blue->tile3.points*5
        is white -> tile3.points*4
        else->1
    }

    println(points)
}


//In sealed class restrict set of type but in enum class we restrict value
//enum --value restricted  (single value and single state )
//sealed --types restricted  (many values and many states)

sealed class Tile
class Red (val type:String,val points:Int):Tile()
class Blue (val points:Int):Tile()
class white(val points:Int):Tile()