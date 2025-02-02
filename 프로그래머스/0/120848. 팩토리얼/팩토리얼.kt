class Solution {
    fun fac(num: Int): Int {
        var result = 1
        if(num == 0) return -1
        for(n in num downTo 1) {
            result *= n
        }
        return result
    }
    
    fun solution(n: Int): Int {
        var answer: Int = 1
        
        while(true) {
            if(n < fac(answer)) break
            answer++
        }
        
        answer--
        
        return answer
    }
}