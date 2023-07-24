fun main() {
    val p1 = Person1("        me", 20)
    p1.age = -12
    print(p1.name)
    //here we can set the age -ve also and there is no check

}

class Person1(nameparam: String, ageparam: Int) {
    var name: String = nameparam
        get() {                                //when we get the parameter it is called
            return field.toUpperCase().trim()
        }
        set(value) {
            field = value
        }

    var age: Int = ageparam
        get() = field
        set(value) {                      //when we set the parameter it is called
            if (value > 0) {
                field = value
            } else {
                println("age can't be negative")
            }
        }


    var email: String = ""    //when we define a parameter kotlin by default add a getter and setter to it
        get() = field
        set(value) {
            field = value
        }
}