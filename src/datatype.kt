/**
 * Created by kiend on 6/9/2017.
 */

// data type
// vung luu tru Byte < Short < Int < Long < Float < Double
var x: Long = 100L
var y: Double = 135.1
var f: Float = 123.3f
var i: Int = 1000
var s: Short = 8
var b: Byte = 1
var c: Char = 'c'
var str: String = "My name is Nguyen Trung Kien"
// constant
val PI: Double = 3.14

fun chuoiNhieuDong() {
    var ten: String = "My name is Nguyen Trung Kien"
    var address: String = """
        so 100 duong 100, khu pho X
        phuong 4, quan 10
        TPHCM
        """ // chuoi duoc khai bao tren nhieu dong dung 3 dau nhay """ noi dung """"
    println(ten + "\n" + address)
}

// khai bao mang
fun khaiBaoMang() {
    var arrX: IntArray = intArrayOf(1, 2, 3, 5)
    println(arrX[1])
    var arrY: DoubleArray = doubleArrayOf(1.5, 2.6, 9.0, 10.3, 26.0)
    println(arrY[3])
    var arrC: CharArray = charArrayOf('a', 'b', 'c')
    println(arrC[0])
}


fun main(args: Array<String>) {
    chuoiNhieuDong()
    khaiBaoMang()
}