class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0
        var bin = binomial.split(" ")
        
        when(bin[1]){
            "+" -> {
                answer = bin[0].toInt() + bin[2].toInt()
            }
            "-" -> {
                answer = bin[0].toInt() - bin[2].toInt()
            }
            "*" -> {
                answer = bin[0].toInt() * bin[2].toInt()
            }
        }
        
        return answer
    }
}