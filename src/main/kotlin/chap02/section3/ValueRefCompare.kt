package chap02.section3

fun main() {
    val a: Int = 128
    val b = a
    println(a === b)    //자료형이 기본형인 int형이 되어 값이 동일하므로 true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c == d)     //값의 내용만 비교하는 경우 동일하므로 true
    println(c === d)    //값의 내용은 같지만 참조 주소를 비교해 다른 객체(주소 다름)이므로 false
    println(c === e)    //값의 내용도 같고 참조된 객체도 동일(주소 동일)하므로 true
}
/*
참조형으로 선언한 변수 값이 -128~127 범위에 있으면
캐시에 그 값을 저장하고 변수는 캐시의 주소를 가리킨다.
위 예제에서 a의 값을 128이 아니라 -128~127의 값으로 변경하면
c와 d의 참조 주소 값이 같아진다. 그래서 삼중 등호로 비교한 값은 모두 true가 된다.
*/