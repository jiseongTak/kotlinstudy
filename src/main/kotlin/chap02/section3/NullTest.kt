package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    //println("str1: $str1")
    //println("str1: $str1 length: ${str1?.length}")
//    println("str1: $str1 length: ${str1!!.length}")
    var len = if (str1 != null) str1.length else -1
    println("str1: $str1 length: ${len}")
}

//코틀린은 변수에 null 을 허용하지 않는다.
//변수에 null 할당을 허용하려면 자료형 뒤에 물음표 기호를 명시해야 함.
//세이프콜로 안전하게 호출 가능 (?.)
//non-null 단정 기호(!!.)를 사용하면 null 이 아님을 단정