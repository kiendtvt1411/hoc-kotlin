import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by kiend on 6/9/2017.
 */

// thu vien xu ly so
fun formatDouble(d: Double): String {
    return "%.2f".format(d)
}

// 1234 thanh 1,234
fun formatInt(a: Int): String {
    var dcf = DecimalFormat("#,###")
    var dcfs = DecimalFormatSymbols(Locale.getDefault())
    dcfs.groupingSeparator = ','
    dcf.decimalFormatSymbols = dcfs
    return dcf.format(a)
}

// dinh dang ngay thang nam
fun formatDate() {
    var cal = Calendar.getInstance()
    var year = cal.get(Calendar.YEAR)
    var month = cal.get(Calendar.MONTH) + 1
    var day = cal.get(Calendar.DAY_OF_MONTH)
    println("Nam = $year")
    println("Thang = $month")
    println("Ngay = $day")

    var date = cal.time
    var sdf = SimpleDateFormat("dd/MM/yyyy")
    println(sdf.format(date))
    // hh la dinh dang 12h, HH la dinh dang 24h
    var sdf2 = SimpleDateFormat("dd/MM/yyyy - hh:mm:ss aaa")
    println(sdf2.format(date))
}

// thu vien xu ly toan hoc
fun libMath() {
    println("So PI = " + Math.PI)
    println("|-4| = " + Math.abs(-4))
    println("So " + Math.max(9, 2) + " la so lon hon trong hai so 9 va 2")
    println("3^4 = " + Math.pow(3.0, 4.0))
    var goc: Int = 45
    var rad = Math.PI * goc / 180
    println("sin($goc)=" + Math.sin(rad))
    println("cos($goc)=" + Math.cos(rad))
    println("tan($goc)=" + Math.tan(rad))
    println("cotan($goc)=" + Math.cos(rad) / Math.sin(rad))
}

// random lib
fun randomLib(){
    var rd = Random()
    var x = rd.nextInt(201) - 100 // -100 -> 100
    println(x)
}

// string processor
fun stringProcessor(){
    var sb = StringBuilder("Obama Putin") // mac dinh chua dc 16 ky tu
    println(sb.toString())
    sb.insert(5, " Kim Jong Un") // chèn chuỗi từ vị trị 5
    println(sb.toString())
    sb.append(" Donald Trump") // nối chuỗi
    println(sb.toString())
    sb.reverse()
    println(sb.toString())
}

fun main(args: Array<String>) {
    println(formatDouble(10.0 / 3.0))
    println(formatInt(488340981))
    formatDate()
    libMath()
    randomLib()
    stringProcessor()
}