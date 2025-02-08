class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = Int.MIN_VALUE
        
        for(n in 0 until numbers.size) {
            if(n+1 < numbers.size){
                for(m in n+1 until numbers.size) {
                    val mul = numbers[n] * numbers[m]
                    if(mul > answer) answer = mul
                }
            }
        }
        
        return answer
    }
}