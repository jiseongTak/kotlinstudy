package chap03.section3

fun main() {
    var result: Int
    val multi = {x: Int, y: Int -> x * y}
    result = multi(10, 20)
    println(result)
    val greet: () -> Unit = { println("Hello World") }
    println(greet())
}

//val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
//표현식이 2줄 이상이면 마지막 표현식이 반환값이 된다.
/*
    val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    val multi = {x: Int, y: Int -> x * y} 선언 자료형 생략
    val multi: (Int, Int) -> Int = {x, y -> x * y} 람다식 매개변수 자료형 생략
*/