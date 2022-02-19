fun main(){


    var arr = arrayOf(1,4,6,0)

   arr.sort()

    var arr2 = arr.clone()
    arr[0] = 100

    for(i in arr2){
        println(i)
    }


   //    bubbleSort(arr)
}

fun bubbleSort(arr: Array<Int>) {

    var size = arr.size - 2


    for(round in 0..size){


        for(currentIndex  in 0..(size-round)){
            //println(currentIndex)

            if(arr[currentIndex]> arr[currentIndex+1]){
               var temp = arr[currentIndex]
                arr[currentIndex] = arr[currentIndex+1]
                arr[currentIndex+1] = temp
            }

        }
    }
        for(i in arr)
                println(i)


}





