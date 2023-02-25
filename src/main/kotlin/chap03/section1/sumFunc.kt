package chap03.section1

fun sum(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

fun sum3(a: Int, b: Int): Int = a + b

fun sum4(a: Int, b: Int) = a + b

fun main() {
    val result1 = sum(3, 2)
    val result2 = sum(6, 7)

    println(result1)
    println(result2)
}

//반환값이 없는 경우 반환값의 자료형을 Unit 으로 지정하거나 생략 가능
//생략해도 실제로는 반환값의 자료형은 Unit