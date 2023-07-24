fun main (){
    SharingWidget.incrementfblikes()
    SharingWidget.incrementfblikes()
    SharingWidget.incrementfblikes()
    SharingWidget.incrementinstalikes()
    SharingWidget.display()

}

object SharingWidget{
   private var fblikes=0
   private var instalikes=0

    fun incrementfblikes()= fblikes++
    fun incrementinstalikes()= instalikes++
    fun display()= println("FACEBOOK --$fblikes--Instagram --$instalikes")
}


// if we want some data from a database
// we don't have to make many objects we can make one object and everyone ask from that single object
//here singleton pattern came to action