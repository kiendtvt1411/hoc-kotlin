import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by kiend on 6/9/2017.
 */

// .. tương đương với into 1..10 nghĩa là 1 đến 10

// loai for I : duyệt tuần tự hết danh sách i<=n
fun forTypeOne() {
    var gt: Int = 1
    val n: Int = 5
    for (i in 1..n) {
        gt *= i
    }
    println("$n! = $gt")
}

// loai for II : duyệt tuần tự gần hết giá trị trong danh sách i<n
fun forTypeTwo() {
    var sum: Int = 0
    var n: Int = 5
    for (i in 1 until n) {
        sum += i
    }
    println("Tong = $sum")
}

// loai for III : có bước nhảy step
fun forTypeThree() {
    var sum: Int = 0
    var n: Int = 10
    for (i in 2..n step 2) {
        sum += i
    }
    println("Tong chan = $sum")
}

// loai for IV : vòng for với con chạy giảm
fun forTypeFour() {
    var a: Int = 9
    var b: Int = 6
    var uscln = 1
    var min = if (a > b) b else a
    for (i in min downTo 1) {
        if (a % i == 0 && b % i == 0) {
            uscln = i
            break
        }
    }
    println("USCLN cua $a va $b = $uscln")
}

// loai for V : vòng lặp trên danh sách đối tượng trong 1 tập đối tượng
fun forTypeFive() {
    var arr: Array<String> = arrayOf("kotlin", "java", "c#", "python", "R")
    println("---------Cach 1 duyet tap hop doi tuong----------")
    for (item in arr) {
        println(item)
    }
    println("----------Cach 2 duyet tap hop doi tuong---------")
    for (i in arr.indices) { // theo chi so
        println("San pham thu $i co ten " + arr[i])
    }
    println("-----------Cach 3 duyet tap hop doi tuong---------")
    for ((index, value) in arr.withIndex()) {
        println("San pham thu $index co ten $value")
    }
}


fun main(args: Array<String>) {
    forTypeOne()
    forTypeTwo()
    forTypeThree()
    forTypeFour()
    forTypeFive()
}