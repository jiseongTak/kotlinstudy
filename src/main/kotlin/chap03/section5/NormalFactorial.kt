package chap03.section5

fun main() {
    val number = 4
    val result: Long

    result = factorial(number)
    println("Factorial: $number -> $result")
}

private fun factorial(n: Int): Long {
    return if (n == 1) {
        n.toLong()
    } else {
        n * factorial(n - 1)
    }
}

/*
 * factorial(4)
 * 4 * factorial(3)
 * 4 * (3*factorial(2))
 * 4 * (3*(2*factorial(1)))
 * 4 * (3*(2*1))
 * 24
 */