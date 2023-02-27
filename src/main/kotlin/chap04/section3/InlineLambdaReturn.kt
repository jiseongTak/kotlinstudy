package chap04.section3

fun main() {
    retFunc()
}

private inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

private fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        if (result > 10) {
            return
        }
        println("result: $result")
    }
    println("end of retFunc")
} // 비지역 반환 Non-local

/*
 * 인라인으로 선언되지 않은 람다식에서는 return 을 그냥 사용할 수 없다.
 * return@label 과 같이 라벨 표기와 함께 사용해야 한다.
 * 라벨이란 코드에서 특정한 위치를 임의로 표시한 것
 */