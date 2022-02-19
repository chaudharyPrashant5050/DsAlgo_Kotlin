fun main(){

    var num = Integer.parseInt(readLine())

    var reversedNum = reversedNumber(num)
    print(reversedNum)


}

fun reversedNumber(num: Int): Any {


    var temp = num.toString().toCharArray()
    var size:Int = temp.size /2
    println(size)

    var i = 0
    var j = temp.size - 1
    while(i<size){
    print(i)
        var t = temp[i]
        temp[i] = temp[j]
        temp[j] = t
        i++
        j--



    }
    temp.forEach { index -> print(index) }
    return String(temp).toInt()

}


