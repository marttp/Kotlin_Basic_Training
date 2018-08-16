fun main(args:Array<String>){
//    var firstLambda: (Int, Int) -> Int = {
//        number1:Int, number2:Int -> number1+number2
//    }
//    println(firstLambda(50,60))
    var items: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)
    var doubled: Array<Int> = loopLambda(items) { item: Int -> item+item }
    for (ele in doubled){
        println(ele)
    }
}

inline fun loopLambda(items: Array<Int>, cl: (a: Int) -> Int) : Array<Int> {
    var newItems: Array<Int> = items
    var index = 0

    for (item in items){
        var transformed: Int = cl(item)
        newItems[index] = transformed
        index++
    }
    return newItems
}