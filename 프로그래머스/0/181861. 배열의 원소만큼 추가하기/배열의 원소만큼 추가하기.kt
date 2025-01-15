class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(a in arr) {
            repeat(a) { answer += a }
        }
        
        return answer
    }
}