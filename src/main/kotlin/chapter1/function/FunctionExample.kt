fun multiplyByTwo(x: Int): Int {
    println("multiplyByTwo 함수 실행")
    return x * 2
}

fun multiplyByThree(x: Int): Int = x * 3
fun multiplyByFour(x: Int) = x * 4

fun main() = println(multiplyByFour(5))