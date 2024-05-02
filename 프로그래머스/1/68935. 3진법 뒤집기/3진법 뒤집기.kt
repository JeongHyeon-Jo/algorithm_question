import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var temp: Int = n
        var thr_list = mutableListOf<Int>()
        
        while(temp > 0 ){
            thr_list += (temp % 3)
            temp /= 3
        }
        
        thr_list.reverse()
        var sum: Int = 0
        
        for(i in 0 .. (thr_list.size-1)){
            sum += (thr_list[i] * (3.0.pow(i)).toInt())
        }
        
        answer = sum
        
        return answer
    }
}