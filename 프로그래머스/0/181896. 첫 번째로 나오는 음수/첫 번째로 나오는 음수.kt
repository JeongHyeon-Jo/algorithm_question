class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var result = false
        
        for((i, n) in num_list.withIndex()) {
            if(n < 0) {
                answer = i
                result = true
                break
            }
        }
        
        
        return if(result) answer else -1
    }
}