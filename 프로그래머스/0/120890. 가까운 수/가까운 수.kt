import kotlin.math.*

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0
        var sort = array.sortedArray()
        var abs = 0
        var near = Int.MAX_VALUE
        
        for(a in sort) {
            abs = abs(a - n)
            if(near > abs) {
                near = abs
                answer = a
            }
        }
        
        return answer
    }
}