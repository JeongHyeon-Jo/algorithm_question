class Solution {
    fun check_limit(n: Int): Boolean {
        return if(n >= 1 && n < 8_000_000) { true } else { false }
    }
    
    fun solution(num: Int): Int {
        var answer = 0
        var index = 0
        var temp: Long = num.toLong()
        
        if(check_limit(num)){
            while(temp != 1L){
                if(temp % 2 == 0L){
                    temp /= 2
                } else {
                    temp = (temp * 3) + 1
                }
                
                ++index
                
                if(index > 500){
                    index = -1
                    break
                }
            }
        }
        
        answer = index
        
        return answer
    }
}