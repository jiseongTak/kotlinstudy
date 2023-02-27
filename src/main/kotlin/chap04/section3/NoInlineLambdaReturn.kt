package chap04.section3

// 람다식에서 라벨과 함께 return 사용하기
fun main() {
    retFunc()

    val getMessage = lambda@{ num: Int ->
        if (num !in 1..100) {
            return@lambda "Error"
        }
        return@lambda "Success"
    }

    /*
     * 코틀린 공홈
     * Returns in a lambda
     * Avoid using multiple labeled returns in a lambda.
     * Consider restructuring the lambda so that it will have a single exit point.
     * If that's not possible or not clear enough, consider converting the lambda into an anonymous function.
     * Do not use a labeled return for the last statement in a lambda.
     */

    val getMessage2 = fun(num: Int): String {
        if (num !in 1..100) {
            return "Error"
        }
        return "Success"
    }

    println(getMessage(10))
    println(getMessage2(10))
    println("----------")

    fun greet() = { println("Hello") }
    greet()
    greet()()
    fun greet2() = fun() { println("Hello") }
    greet2()()
}

private fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

private fun retFunc() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b -> // 람다식 블록의 시작 부분에 라벨을 지정
        val result = a + b
        if (result > 10) {
            return@lit // 라벨을 사용한 블록의 끝부분으로 반환
//            return@inlineLambda // 람다식의 명칭을 그대로 라벨처럼 사용 -> 암묵적 라벨
        } // 이 부분으로 빠져나감
        println("result: $result")
    }
    println("end of retFunc")
}

// 람다식 대신 익명함수를 사용
private fun retFunc2() {
    println("start of retFunc")
    inlineLambda(13, 3, fun(a, b) {
        val result = a + b
        if (result > 10) {
            return
        }
        println("result: $result")
    })
    println("end of retFunc")
}

/*
 * 인라인으로 선언되지 않은 람다식에서는 return 을 그냥 사용할 수 없다.
 * return@label 과 같이 라벨 표기와 함께 사용해야 한다.
 * 라벨이란 코드에서 특정한 위치를 임의로 표시한 것
 */