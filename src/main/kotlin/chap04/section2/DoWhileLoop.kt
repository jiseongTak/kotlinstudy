package chap04.section2

fun main() {
    do {
        print("Enter an integer: ")
        val input = readln().toInt()

        for (i in 0 until input) { // for (i in 0..(input - 1))
            for (j in 0 until input) {
                print((i + j) % input + 1)
            }
            println()
        }

    } while (input != 0)
}