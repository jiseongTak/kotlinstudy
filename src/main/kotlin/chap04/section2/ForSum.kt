package chap04.section2

fun main() {
    var sum = 0
    for (x in 1 until 10) {
        sum += x
    }
    println("sum: $sum")
}