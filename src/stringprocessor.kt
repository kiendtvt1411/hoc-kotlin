/**
 * Created by kiend on 6/9/2017.
 */

fun findIndex() {
    var s: String = "Obama"
    var i = 0
    i = s.indexOf("a")
    println(i)
}

fun findLastIndex() {
    var s: String = "Hello everybody!"
    var i = 0
    i = s.lastIndexOf("e")
    println(i)
}

fun containS() {
    var s: String = "Hello everybody!"
    var s2 = "body"
    if (s.contains(s2)) {
        println("Co ton tai [$s2]")
    } else {
        println("Khong ton tai [$s2]")
    }
}

fun subS() {
    val s = "Xin chao Obama! Tui la Putin"
    val s2 = s.substring(9)
    println(s2)
    val s3 = s.substring(9, 14)
    println(s3)
}

fun replaceS() {
    var s = "Xin chao Obama! Tui la Putin"
    s = s.replace("Obama", "Kim Jong Un")
    println(s)
}

fun replaceFirstS() {
    var s = "Obama Xin chao Michelle Obama"
    s = s.replaceFirst("Obama", "Putin")
    println(s)
}

fun trimS() {
    var s: String = "   Nguyen Trung Kien    "
    val s2 = s.trimStart()
    println(s2 + "=>size=" + s2.length)
    val s3 = s.trimEnd()
    println(s3 + "=>size=" + s3.length)
    val s4 = s.trim()
    println(s4 + "=>size=" + s4.length)
}

fun compareToS(){
    val s1 = "Hanh phuc"
    val s2 = "Hanh PHUC"
    val x = s1.compareTo(s2, ignoreCase = true)
    println(x)
    val y = s1.compareTo(s2, ignoreCase = false)
    println(y)
}

fun plusS(){
    var s:String = "Obama"
    s = s.plus(" ")
    s = s.plus("Putin")
    println(s)
}

fun splitS(){
    var s:String = "Nguyen Trung Kien"
    var arr:List<String> = s.split(" ")
    println("So phan tu ${arr.size}")
    for (item in arr) {
        println(item)
    }
}

fun stringOptimize(s: String) : String{
    var sOpt = s
    sOpt = sOpt.trim()
    val arrWord: List<String> = sOpt.split(" ")
    sOpt = ""
    for (word in arrWord) {
        var newWord = word.toLowerCase()
        if (newWord.length > 0) {
            newWord = newWord.replaceFirst((newWord[0]), (newWord[0]).toUpperCase())
        }
        sOpt += newWord + " "
    }
    return sOpt.trim()
}

fun main(args: Array<String>) {
    findIndex()
    findLastIndex()
    containS()
    subS()
    replaceS()
    replaceFirstS()
    trimS()
    compareToS()
    plusS()
    splitS()
    stringOptimize("    NgUyễn trung    Kiên  ")
}