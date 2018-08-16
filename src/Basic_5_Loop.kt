fun main(args:Array<String>){

    var person: Array<String> = arrayOf("Mart","Mart1","Mart2","Mart3")

    //start -> end
    for (ele in 0..2){
        println(person[ele])
    }
    // use this loop if you want to play with index
    for (ele in person.indices){
        println(person[ele])
    }

    for ((index, value) in person.withIndex()) {
        println("the element at $index is $value")
    }

    /*
    * Can use while and do-while too.
    * */

    repeat(5){
        print("-Hi-")
    }
}