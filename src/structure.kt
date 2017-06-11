/**
 * Created by kiend on 6/9/2017.
 */

// if - else truyền thống như 1 biểu thức điều kiện
fun ifVaElseTruyenThong() {
    var dtb: Double = 8.0
    if (dtb >= 5) {
        println("Pass!")
    } else {
        println("Failed!")
    }
}

// if - else Kotlin như 1 biểu thức trả về kết quả
// khi viết dạng này bắt buộc phải có else
fun ifElseKotlin() {
    var a: Int = 10
    var b: Int = 15
    var max: Int
    max = if (a > b) {
        println("Choose a")
        a // day la noi return ket qua
    } else {
        println("Choose b")
        b // day la noi return ket qua
    }
    println("So lon nhat = " + max)
}

// bieu thuc when thay cho switch truyen thong
fun bieuThucWhenKotlin() {
    var value: Int = 2
    when (value) {
        1 -> println("Hello Obama")
        2 -> println("Hello Putin")
        3 -> println("Hello Kim Jong Un")
        else -> println("Hello everyone!")
    }
}

fun examWhen() {
    var a: Double = 0.0
    var b: Double = 0.0
    var ope: String?
    println("Nhap a: ")
    var ia = readLine()
    if (ia != null) a = ia.toDouble()
    println("Nhap b: ")
    var ib = readLine()
    if (ib != null) b = ib.toDouble()
    println("Nhap toan tu (+,-,*,/): ")
    ope = readLine()
    when (ope) {
        "+" -> println("Phep toan cong " + a + " + " + b + " = " + (a + b))
        "-" -> println("Phep toan tru " + a + " - " + b + " = " + (a - b))
        "*" -> println("Phep toan nhan " + a + " * " + b + " = " + (a * b))
        "/" -> {
            if (b == 0.0) println("Khong thuc hien duoc!")
            else println("Phep toan chia " + a + " / " + b + " = " + (a / b))
        }
        else -> println("Ban nhap random a?")
    }
}

fun examTwoWhen() {
    var month: Int = 0
    println("Moi ban nhap thang: ")
    var s: String? = readLine()
    if (s != null) {
        month = s.toInt()
    }
    when (month) {
        1, 2, 3 -> println("Thang " + month + " thuoc quy I")
        4, 5, 6 -> println("Thang " + month + " thuoc quy II")
        7, 8, 9 -> println("Thang " + month + " thuoc quy III")
        10, 11, 12 -> println("Thang " + month + " thuoc quy IV")
        else -> println("Thang " + month + " khong hop le!")
    }
}

fun examThreeWhen() {
    var tuoi: Int = 0
    println("Moi ban nhap tuoi : ")
    var sa: String? = readLine()
    if (sa != null) {
        tuoi = sa.toInt()
    }
    when (tuoi) {
        in 1..5 -> println("$tuoi tuoi thuoc lua tuoi thieu nhi")
        in 6..9 -> println("$tuoi tuoi thuoc lua tuoi nhi dong")
        in 10..15 -> println("$tuoi tuoi thuoc lua tuoi thieu nien")
        in 16..28 -> println("$tuoi tuoi thuoc lua tuoi thanh nien")
        !in 1..100 -> println("Khong biet tuoi gi")
        else -> println("Tuoi gia khu de!")
    }
}

// when la bieu thuc tra ve ket qua giong nhu if
fun examFourWhen(){
    var x:Int = 8
    var result = when(x){
        in 1..10->x+100
        in 20..30->x-1000
        else->x
    }
    println(result)
}

fun main(args: Array<String>) {
//    ifVaElseTruyenThong()
//    ifElseKotlin()
//    bieuThucWhenKotlin()
//    examWhen()
//    examTwoWhen()
    examThreeWhen()
    examFourWhen()
}