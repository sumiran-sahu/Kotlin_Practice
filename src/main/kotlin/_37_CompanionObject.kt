fun main(args:Array<String>){
   myclass.Myobject.f()
    myclass.f()  //after writing companion we can write this
    myclass.anotherObject.g()

    //in one class we can only make one companion object
    //it is same like static method in java ,to fulfill it kotlin has companion


}



class myclass {
   companion object Myobject{     //if we want a class level object
                                  // only one instance of Myobject and anotherObject can be made
      fun f(){
          println("Hello i am from object")
      }
    }

   object anotherObject{
      fun g(){
          println("Hello i am from object")
      }
    }
}



