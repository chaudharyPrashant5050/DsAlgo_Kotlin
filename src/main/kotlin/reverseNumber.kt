fun main(){

    var num = Integer.parseInt(readLine())
    var temp = num
    var reversedNum:Int = 1

    while(temp >0){
        var rem = temp%10
        reversedNum = reversedNum*10+rem
        temp = temp/10
    }

    print(reversedNum)
}