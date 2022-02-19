package Array


fun main(){

    var m = Array(6){Array(5){0L} }

    val ROW = m.size -1
    val COLUMN = m.indices.last-1

    for(column in 0..COLUMN){

        for(row in 0..ROW){

            m[row][column] = (1..6L).random()

        }
    }

    for(column in 0..COLUMN){

        for(row in 0..ROW){
            print("${m[row][column]}   ")
        }
        println()
    }

    m.shuffle()

    println("________________________________________________")


    for(column in 0..COLUMN){

        for(row in 0..ROW){
            print("${m[row][column]}   ")
        }
        println()
    }




}


