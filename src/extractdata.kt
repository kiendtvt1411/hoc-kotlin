/**
 * Created by kiend on 6/9/2017.
 */

// ep kieu du lieu tuong minh
// can chu y khi ep kieu tu vung nho rong hon ve vung nho hep hon!!!
// Double -> Float -> Long -> Int -> Short -> Byte (ep kieu hep)
// Byte -> Short -> Int -> Long -> Float -> Double (ep kieu rong)

fun extractDataTypeLarge() {
    var x: Int = 10
    var y: Double = x.toDouble()

    println("x = " + x)
    println("y = " + y)
}

fun extractDataTypeNarrow() {
    var a: Double = 10.5
    var b: Int = a.toInt()
    println("a = " + a)
    println("b = " + b)
}

// ep kieu khong tuong minh
fun extractImplicit() {
    var t = 13L + 1 // tu dong lay vung nho cua Long (do Long > Int) -> var t: Long
    print("t = " + t)
}

fun main(args: Array<String>) {
    extractDataTypeLarge()
    extractDataTypeNarrow()
    extractImplicit()
}