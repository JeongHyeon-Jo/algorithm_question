class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        answer = answer + n / 7
        if(n % 7 > 0) answer++
        
        return answer
    }
}