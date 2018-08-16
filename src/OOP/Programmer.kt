package OOP

class Programmer(firstName: String, lastName: String) : Student(firstName, lastName) , WebDeveloper{
    var skills: List<String> = listOf("Java", "JavaScript")
    //    constructor(firstName: String, lastName: String, age:Byte): super(firstName, lastName){
    //
    //    }
    override fun introduceYourSelf() {
        println("My name is ${this.firstName} ${this.lastName}")
        println("My skills ${this.skills}")
    }
}