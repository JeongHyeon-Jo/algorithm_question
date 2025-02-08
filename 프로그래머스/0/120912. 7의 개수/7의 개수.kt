class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        
        for(a in array) {
            answer += a.toString().count{ it == '7' }
        }
        
        return answer
    }
}