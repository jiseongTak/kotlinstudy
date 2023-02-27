package chap04.section3

import java.lang.Exception

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
    } catch (e: Exception) {
        println("Exception is handled. ${e.message}")
        e.printStackTrace()
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}