package chap03.section6

// a() 함수에 b() 함수의 내용을 선언
fun a() = b() // 최상위 함수이므로 b() 함수 선언 위치에 상관없이 사용 가능
fun b() = println("b")

fun c() {
    //fun d() = e() // d()는 지역 함수이며 e()의 이름을 모름
    fun e() = println("e")
}

fun main() {
    a() // 최상위 함수는 어디서든 호출될 수 있음
    // e()a
}