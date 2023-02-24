package chap02.section3

fun main() {
    val num = 256

    if (num is Int) {
        print(num)
    } else if (num !is Int) {
        print("Not a Int")
    }
}

//is를 사용하여 자료형을 검사하면 검사한 자료형으로 스마트 캐스트된다.