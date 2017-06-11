/**
 * Created by kiend on 6/9/2017.
 */

fun examWhileOne() {
    var n: Int = 5
    var gt: Int = 1
    var i: Int = 1
    while (i <= n) {
        gt *= i
        i++
    }
    println("$n! = $gt")
}

fun examWhileTwo(){
    var n:Int = 0
    var s:String?
    println("Chao mung den voi chuong trinh kiem tra so nguyen to")
    while (true) {
        println("Nhap so nguyen: ")
        s = readLine()
        if (s != null) {
            n = s.toInt()
            var dem: Int = 0
            for (i in 1..n) {
                if (n % i == 0) {
                    dem++
                }
            }
            if (dem == 2) {
                println("$n la so nguyen to!")
            } else {
                println("$n khong phai la so nguyen to")
            }
            println("Tiep khong? (C/K) : ")
            s = readLine()
            if (s == "k") break
        }
    }
    println("Chao tam biet!")
}

fun main(args: Array<String>) {
    examWhileOne()
    examWhileTwo()
}