import java.util.*

fun main(){
    System.out.println(56)
    val s:Stack<String> = Stack()
    s.push("hello")
    s.push("world")
    s.push("bye")

    while(!s.isEmpty()){
        print(s.peek())
        s.pop()
    }
}