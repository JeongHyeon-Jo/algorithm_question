class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var max = 0
        var ind = 0
        
        for((i, a) in array.withIndex()) {
            if(a > max) { max = a; ind = i }
        }
        
        answer += max
        answer += ind
        
        return answer
    }
}