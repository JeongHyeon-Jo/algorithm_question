import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 2
        
        for(i in 1..n) {
            if(n == i.toDouble().pow(2).toInt()){
                answer = 1   
                break
            }
        }
        
        return answer
    }
}