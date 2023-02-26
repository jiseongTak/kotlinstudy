package chap03.section5

fun main() {
    shortFunc(3) {
        println("First call: $it")
        //return
    }
}

private inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc { out(a) }
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}

/*
out()을 직접 호출해 사용하지 않고 또 다른 함수에 중첩하면 실행 문맥이
달라지므로 return을 사용할 수 없음
이 때 crossinline 키워드 사용해서 비지역 반환을 금지해야 하는 람다식에 사용
 */