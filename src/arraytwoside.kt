import java.util.*

/**
 * Created by kiend on 6/11/2017.
 */

fun workWithArrayTwoSide(){
    // array (row, {{column}}
    var M:Array<IntArray> = Array(10, {IntArray(5)})
    var rd:Random = Random()
    for (i in M.indices) {
        for (j in M[i].indices) {
            M[i][j] = rd.nextInt(100)
        }
    }
    println("Mang 2 chieu sau khi nhap: ")
    for (i in M.indices) { // row
        for(j in M[i].indices) print("${M[i][j]}\t") // column
        println()
    }
    println("Mang 2 chieu sau khi nhap - Cach 2: ")
    for (row in M) {
        for(cell in row) print("$cell\t")
        println()
    }
    println("Mang thu 1: ")
    var M1 = M[1]
    for(i in M1.indices) print("${M1[i]}\t")
    println()
}

fun main(args: Array<String>) {
    workWithArrayTwoSide()
}