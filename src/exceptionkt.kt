/**
 * Created by kiend on 6/9/2017.
 */

fun chia(a: Int, b: Int): Int {
    if (b == 0) {
        throw Exception("Mau so = 0") // nem vao catch voi custom message exception
    }
    return a / b
}

fun main(args: Array<String>) {
    try {
        chia(5, 0)
    } catch (e: Exception) {
        println(e.message)
    }
    try {
        var a: Int = 5
        var b: Int = 0
        var c = a / b
        println("$a/$b=$c")
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("Day la finally, 100% chay, cho du loi hay khong    ")
    }
}