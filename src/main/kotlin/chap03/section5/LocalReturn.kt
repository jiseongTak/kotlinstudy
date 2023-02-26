package chap03.section5

fun main() {
    shortFunc(3) {
        println("First call: $it")
        return
    }
}

private inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}

//비지역 반환(Non-local Return)