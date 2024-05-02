class Solution {
    fun check_limit(num: Int): Boolean {
        return if(num >= 0 && num <= 3000) true else false
    }
    
    fun solution(n: Int): Int {
        var answer = 0
        var i = 1
        var sum = 0
        if(check_limit(n)){
            while(i <= n){
                if(n % i == 0){
                    sum += i
                }
                i += 1
            }
            i = 1
            answer = sum
        }
        
        return answer
    }
}