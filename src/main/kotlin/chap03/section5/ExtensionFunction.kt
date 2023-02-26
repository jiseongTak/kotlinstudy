package chap03.section5

fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

// String 클래스를 확장해 getLongString() 함수 추가
// 확장 함수를 만들 때 확장하려는 대상에 동일한 이름의 멤버 함수 혹은 메서드가
// 존재한다면 항상 확장 함수보다 멤버 메서드가 우선으로 호출
private fun String.getLongString(target: String): String =
    // this는 확장 대상에 있던 자리의 문자열인 source 객체
    if (this.length > target.length) {
        this
    } else {
        target
    }
