package Basic

fun main(args: Array<String>){
    // Number
    var byte : Byte = 1 //size: 8 bits
    var short : Short = 1 //size: 16 bits
    var int : Int = 1 //size: 32 bits
    var long : Long = 1 //size: 64 bits

    var float : Float = 1F //size: 32 bits
    var double : Double = 3.4 //size: 64 bits

    //Character
    val grade : Char = 'A'
    //String
    val name : String = "Mart"
    //Boolean
    var isOK : Boolean = false

    //Array
    var items: Array<Int> = arrayOf(1,2,3,4,5,6)
    var otherItems: Array<Int> = Array(10) { x -> x+2}

    var item: Int = items[2]
    items[3] = 50

}