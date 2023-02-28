package chap05.section4

open class A {
    open fun f() = println("A Calss f()")
    fun a() = println("A Class a()")
}

interface B {
    fun f() = println("B Interface f()") // 인터페이스는 기본적으로 open임
    fun b() = println("B Interface b()")
}

class C : A(), B { // 쉼표를 사용해서 클래스와 인터페이스 지정
    // 컴파일되려면 f()가 오버라이딩되어야 함
    override fun f() {
        println("C Class f()")
    }

    fun test() {
        f() // 현재 클래스의 f()
        b() // 인터페이스 B의 B()
        super<A>.f() // A 클래스의 f()
        super<B>.f() // B 클래스의 f()
    }
}

fun main() {
    val c = C()
    c.test()
}