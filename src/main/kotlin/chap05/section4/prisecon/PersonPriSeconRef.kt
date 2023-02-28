package chap05.section4.prisecon

class Person(
    firstName: String,
    out: Unit = println("[Primary] Parameter"),
) {
    val fName = println("[Property] Person fName: $firstName")

    init {
        println("[init] Person init block")
    }

    constructor(
        firstName: String,
        age: Int,
        out: Unit = println("[Secondary] Parameter"),
    ) : this(firstName) {
        println("[Secondary] Body: $firstName, $age")
    }
}

fun main() {
    val p1 = Person("Kildong", 30)
    println()
    val p2 = Person("Dooly")
}
