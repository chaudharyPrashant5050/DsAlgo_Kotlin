


class List{

     class Node(d:Int){
        private var data:Int = 0
        init{
            this.data = d
        }
        var next:Node? = null

        fun getData():Int{
            return data
        }

    }

    private var root:Node? = null

    public fun add(data:Int){
        var dataNode = Node(data)

        if(root == null){
            root = dataNode
        }else{
            var temp = root

            while(temp?.next!= null){

                temp = temp.next

            }

            temp?.next = dataNode
        }
        println("Data has been inserted")

    }

    fun search(){
        var temp = root
        if(root == null){
            println("list is empty")
        }else{


            while(temp?.next!=null){
                print("${temp.getData()} ---  ")
                temp = temp.next
            }

            if (temp != null) {
                print(temp.getData())
            }


        }

    }
}

fun main(){

    var l = List()
    l.add(45)
    l.add(89)
    l.add(96)
    l.add(100)

    l.search()
}