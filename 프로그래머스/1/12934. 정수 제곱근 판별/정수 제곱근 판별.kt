class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var x: Long = 0
        
        if(n >= 1 && n <= 50_000_000_000_000){
            for (i: Long in 1..n){
                if(n == i*i){
                    x = i
                    answer = (x+1) * (x+1)
                    break
                } else{
                    answer = -1L
                }
            }
        }
        
        return answer
    }
}