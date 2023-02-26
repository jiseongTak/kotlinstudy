package chap03.section5

fun main() {
    val number = 4
    println("Factorial: $number -> ${factorial(number)}")
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) {
        run.toLong()
    } else {
        factorial(n - 1, run * n)
    }
}

/*
 * 일반적인 재귀에서는 재귀 함수가 먼저 호출되고 계산되지만
 * 꼬리 재귀에서는 계산을 먼저 하고 재귀 함수가 호출
 *
 * factorial(4, 1)
 * factorial(3, 1 * 4)
 * factorial(2, 4 * 3)
 * factorial(1, 4 * 3 * 2)
 * 24
 */