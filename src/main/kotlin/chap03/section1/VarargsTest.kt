package chap03.section1

fun main() {
    normalVarargs(1,2,3,4)
    normalVarargs(4,5,6)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) { //counts는 Int형 배열
        print("$num ")
    }
    print("\n")
}
