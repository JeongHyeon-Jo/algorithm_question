class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        for(i in 1..n) {
            var count = 0
            for(j in 1..i) {
                if(i % j == 0) count++
            }
            if(count >= 3) answer++
        }
        
        return answer
    }
}