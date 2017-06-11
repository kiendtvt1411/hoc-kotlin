/**
 * Created by kiend on 6/9/2017.
 */

// toan tu trong kotlin

fun toanTuMotNgoi() {
    var a: Int = -8
    var b = a.unaryPlus()
    var c = a.unaryMinus()
    println("a = " + a)
    println("b = " + b)
    println("c = " + c)
}

fun phepToanCoBan(a: Int, b: Int) {
    println("Phep cong cach 1 : " + a + " + " + b + " = " + (a + b))
    println("Phep cong cach 2 : " + a + " + " + b + " = " + a.plus(b))
    println("Phep tru cach 1 : " + a + " - " + b + " = " + (a - b))
    println("Phep tru cach 2 : " + a + " - " + b + " = " + a.minus(b))
    println("Phep nhan cach 1 : " + a + " * " + b + " = " + (a * b))
    println("Phep nhan cach 2 : " + a + " * " + b + " = " + a.times(b))
    println("Phep chia cach 1 : " + a + " / " + b + " = " + (a / b))
    println("Phep chia cach 2 : " + a + " / " + b + " = " + a.div(b))
    println("Phep chia lay du cach 1 : " + a + " % " + b + " = " + (a % b))
    println("Phep chia lay du cach 2 : " + a + " % " + b + " = " + a.rem(b))
}

fun phepGan(){
    var x:Int = 5
    x+=2
    println("x = " + x)
    x-=2
    println("x = " + x)
    x*=2
    println("x = " + x)
    x/=2
    println("x = " + x)
    x=7
    x%=3
    println("x = " + x)
}

fun phepSoSanh(){
    var a:Int = 8
    var b:Int = 5
    println(a==b)
    println(a.equals(b))
    println(!a.equals(b))
    println(a.compareTo(b))
    println(3.compareTo(3))
    println(3.compareTo(5))
    println(5.compareTo(3))
}

fun main(args: Array<String>) {
    toanTuMotNgoi()
    phepToanCoBan(8,5)
    phepGan()
    phepSoSanh()
}