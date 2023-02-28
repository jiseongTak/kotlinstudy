package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }
    fun access() {
        privateFunc()
    }
}

class OtherClass {
    //val opc = PrivateClass() // 불가 - 프로퍼티 op는 private이 되어야 함
    fun test() {
        val pc = PrivateClass() // 생성 가능
    } 
}

fun main() {
    val pc = PrivateClass() // 생성가능
//    pc.i // 접근 불가
//    pc.privateFunc() // 접근 불가
}

fun TopFunction() {
    val tpc = PrivateClass() // 객체 생성 가능
}