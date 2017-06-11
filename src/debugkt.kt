/**
 * Created by kiend on 6/9/2017.
 */

fun nhapGiaTri(): Double {
    var s: String? = readLine()
    if (s != null) {
        return s.toDouble()
    }
    return 0.0
}

// co tinh lam sai logic tinh nghiem phuong trinh bac 2
fun main(args: Array<String>) {
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0
    println("Nhap a: ")
    a = nhapGiaTri()
    println("Nhap b: ")
    b = nhapGiaTri()
    println("Nhap c: ")
    c = nhapGiaTri()
    if (a == 0.0) {
        if (b == 0.0 && c == 0.0) println("PT vo so nghiem")
        else if (b == 0.0 && c !== 0.0) println("PT vo nghiem")
        else println("PT co 1 nghiem x = " + (-b / c))
    } else {
        val delta: Double = Math.pow(b, 2.0) - 4 * a * c
        if (delta < 0) println("Vo nghiem")
        else if (delta == 0.0) {
            var x: Double = -b / (2 * a)
            println("Nghiem kep x1 = x2 = $x")
        } else {
            var x1: Double = (- b - Math.sqrt(delta)) / (2 * a)
            var x2: Double = (- b + Math.sqrt(delta)) / (2 * a)
            println("x1 = $x1")
            println("x2 = $x2")
        }
    }
}