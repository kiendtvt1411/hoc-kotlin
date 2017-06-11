import java.util.*

/**
 * Created by kiend on 6/11/2017.
 */

// Mang 1 chieu trong Kotlin
fun workWithArray(){
    var M:IntArray = IntArray(10)
    var rd = Random()
    for (i in M.indices) {
        M[i] = rd.nextInt(100)
    }
    println("Mang sau khi nhap - duyet theo gia tri")
    for (i in M) {
        print("$i\t")
    }
    println()
    println("Mang sau khi nhap - duyet theo vi tri")
    for (i in M.indices) {
        println("${M[i]}\t")
    }
    println()
    println("MAX=${M.max()}")
    println("MIN=${M.min()}")
    println("SUM=${M.sum()}")
    println("AVERAGE=${M.average()}")
    // count { int->boolean expression} tra ve so luong phan tu phu hop bieu thuc
    println("So chan = ${M.count { x->x%2==0 }}")
    println("So le = ${M.count { x->x%2 != 0}}")
    // sap xep tang dan
    M.sort()
    println("Tang dan: ")
    for(i in M) print("$i\t")
    println()
    // sap xep giam dan
    M.sortDescending()
    println("Giam dan: ")
    for(i in M) println("$i\t")
    println()
    // loc cac so chan trong mang
    var dsChan = M.filter { x->x%2==0 }
    println("Cac so chan: ")
    for(i in dsChan) print("$i\t")
    println()
    // loc cac so le trong mang
    var dsLe = M.filter { x->x%2==1 }
    println("Cac so le: ")
    for(i in dsLe) println("$i\t")
    println()
    // loc cac so >50 trong mang
    var k = 50
    var dsTim = M.filter { x->x>k }
    println("Cac so > $k: ")
    for(i in dsTim) println("$i\t")
    println()
}

fun main(args: Array<String>) {
    workWithArray()
}