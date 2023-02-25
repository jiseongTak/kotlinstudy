package chap02.section4

fun main() {
    var number1 = 12 //0000 1100
    var number2 = 25 //0001 1001

    number1 = number1 xor number2 //0001 0101 -> 21
    number2 = number1 xor number2 //0000 1100 -> 12
    number1 = number1 xor number2 //0001 1001 -> 25

    println(0b00010101)
    println("number1 = $number1")
    println("number2 = $number2")
}