fun main(args:Array<String>){
    getName("Mart", "Test")
}

fun getName(vararg names: String) {
    for (name in names){
        println("The name is $name")
    }
}