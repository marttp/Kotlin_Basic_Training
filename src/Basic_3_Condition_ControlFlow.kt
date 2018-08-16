fun main(args: Array<String>) {
    println(max(5,9))
    println(testCheckGrade(readLine()!!.toInt()))
}

fun max(number1: Int, number2: Int): Int {
    return if (number1 < number2) {
        number2
    } else {
        number1
    }
}

fun testCheckGrade(score:Int): Char{
    return when(score){
        in 0..50 -> 'F'
        in 51..59 -> 'D'
        in 60..69 -> 'C'
        in 70..79 -> 'B'
        in 80..100 -> 'A'
        else -> {
            'N'
        }
    }
}