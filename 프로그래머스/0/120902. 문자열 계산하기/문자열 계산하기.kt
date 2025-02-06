class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        val equation = my_string.split(" ")
        var op = "+"
        
        for(e in equation) {
            if(e == "+") {
                op = "+"
            } else if(e == "-") {
                op = "-"
            } else {
                when(op) {
                    "+" -> answer += e.toInt()
                    "-" -> answer -= e.toInt()
                }
            }
        }
        
        return answer
    }
}