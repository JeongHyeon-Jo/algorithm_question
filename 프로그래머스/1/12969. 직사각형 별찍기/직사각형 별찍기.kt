fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    
    for(j in 1 .. b){
        for(i in 1 .. a){
            print('*')
        }
        println()
    }
}