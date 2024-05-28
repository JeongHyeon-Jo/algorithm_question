import kotlin.math.sqrt
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        for(i in 1 .. number) {
            var cnt = 0
            var sqr = sqrt(i.toDouble()).toInt()
            for(j in 1 .. sqr){
                if(i % j == 0){
                    if(j * j == i) cnt += 1
                    if(j * j != i) cnt += 2
                }
            }
            if (cnt > limit) {
                answer += power
            } else {
                answer += cnt
            }
        }
        
        return answer
    }
}