/**
 * Created by kiend on 6/9/2017.
 */

// De co the dung Kdocs thi phai /** @noi dung */ chu ko duoc dung /* */
/**
 * @author Nguyen Trung Kien
 * @param x bien x
 * @param y bien y
 * @return tong cua x va y
 * @sample x = 5, y = 6 => 11
 * This is note docs
 */
fun congHaiSo(a: Int, b: Int): Int {
    return a + b
}

/*
* This is main function
* It's used to running program
*/
fun main(args: Array<String>) {
    // call function calculate sum
    var t : Int = congHaiSo(9,10)
    print(t)
}
