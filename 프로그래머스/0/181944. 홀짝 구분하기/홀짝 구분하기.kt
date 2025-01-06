fun main(args: Array<String>) {
    val a = readLine()
    if(a!!.toInt() % 2 == 0){
        print("$a is even")
    } else {
        print("$a is odd")
    }
}