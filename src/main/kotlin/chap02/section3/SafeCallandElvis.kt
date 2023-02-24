package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}")
}

//null 을 허용한 변수를 조금 더 안전하게 사용하려면
//세이프 콜과 엘비스 연산자(?:)를 함께 사용