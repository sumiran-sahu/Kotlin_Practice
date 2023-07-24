fun main(){
    val intcontainer=Container<Int>(5)
    val stringcontainer=Container<String>("Sumi")
    stringcontainer.gerValue()
}

//Generics need Scenario

class IntContainer(var data :Int){         //The class here is only INTEGER specific
    fun setValue(value:Int){               // we can not add String type
        data =value
    }
    fun gerValue()=data

}

class Container<T>(var data :T){          //Now it can have different type of datatype

    fun setValue(value:T){
        data =value
    }
    fun gerValue()=data
}
//List and Map are of Generic type