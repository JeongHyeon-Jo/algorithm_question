class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var even = 0; var odd = 0
        
        for(n in num_list) {
            if(n % 2 == 0) {
                even++
            } else {
                odd++
            }
        }
        
        answer += even
        answer += odd
        
        return answer
    }
}