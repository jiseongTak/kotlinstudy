package chap02.section2

fun main() {
    val number = 10
    var language = "Korean"
    val secondNumber: Int = 20
    language = "English"

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}

//코틀린은 변수를 val, var로 선언
//val은 불변, var는 바꿀 수 있음