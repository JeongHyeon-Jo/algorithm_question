class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0
        val (num1, op, num2) = binomial.split(" ")
        
        when(op){
            "+" -> {
                answer = num1.toInt() + num2.toInt()
            }
            "-" -> {
                answer = num1.toInt() - num2.toInt()
            }
            "*" -> {
                answer = num1.toInt() * num2.toInt()
            }
        }
        
        return answer
    }
}