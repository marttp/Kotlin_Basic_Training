package OOP

fun main(args:Array<String>){
    var student1 = Student("Mart", "Test")
    println(student1.introduceYourSelf())
    var programmer = Programmer(student1.firstName, student1.lastName)
    programmer.introduceYourSelf()
    programmer.codeWebsite()
    var robot1 = Robot("Robotic")
    robot1.showData()
    var virus = Robot(123456789)
    virus.showData()
}
