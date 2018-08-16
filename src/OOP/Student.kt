package OOP

open class Student(var firstName: String, var lastName: String) {
    var age: Byte = 0

    init {
        println("Create student")
    }

    constructor(firstName: String, lastName: String, age:Byte)
            : this(firstName, lastName) {
        this.age = age
    }

    open fun introduceYourSelf(){
        println("My name is ${this.firstName} ${this.lastName}")
    }
}