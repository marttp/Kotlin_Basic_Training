package Basic

fun main(args:Array<String>){
    val range: IntRange = 1..20
    val reverseRange: IntProgression = range.reversed() //20 downTo 1
    val stepRange: IntProgression = 1..20 step 5
    for(ele in range){
        println(ele)
    }
    println("======================")
    for(ele in reverseRange){
        println(ele)
    }
    println("======================")
    for(ele in stepRange){
        println(ele)
    }
}