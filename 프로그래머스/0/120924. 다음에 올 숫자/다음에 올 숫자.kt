import kotlin.math.*

class Solution {
    fun solution(common: IntArray): Int {
        var answer: Int = 0
        var c0 = common[0]
        var c1 = common[1]
        var c2 = common[2]
        
        if(c0 != 0 && c2 == c0 * (c1 / c0).toDouble().pow(2.0).toInt()) {
            answer = c0 * (c1 / c0).toDouble().pow((common.size).toDouble()).toInt()
        } else {
            answer = c0 + (common.size) * (c1 - c0)
        }
        
        return answer
    }
}