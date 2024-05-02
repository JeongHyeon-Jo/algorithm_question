class Solution {
    fun check_limit(num: Int): Boolean {
        return if(num >= 3 && num <= 1_000_000) true else false
    }
    
    fun solution(n: Int): Int {
        var answer: Int = 0
        var x: Int = 0
        if(check_limit(n)){
            for(i: Int in 1..n){
                if(n % i == 1){
                    x = i
                    break
                }
            }
            answer = x
        }
        
        return answer
    }
}