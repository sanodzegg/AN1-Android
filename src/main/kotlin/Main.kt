fun main(args: Array<String>) {
    val list: ArrayList<Int> = ArrayList()
    for (i in 0..45) {
        list.add(i)
    }
    println(getArithmeticAverage(list))
    println(palindrome("sadsadssdasdas"))
}

fun getArithmeticAverage(list: ArrayList<Int>): Int {
    var result = 0
    var diver = 0
    for (i in 0..list.size - 1) {
        if (i % 2 == 0) {
            result += list[i]
            diver += 1
        }
    }
    result = result / diver

    return result
}
fun palindrome(word:String):Boolean{
    var palindrom = 0
    var res = false
    for (i in 0..word.length/2-1){
        if (word[i] == word[(word.length-1)-i]){
            palindrom += 1
            if (palindrom == word.length/2) res = true else res = false

        }
    }
    return res
}