class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1
        var sum: Int = 0
        for(i in 0..9) {
            if(!numbers.contains(i)){
                sum += i
            }
        }
        
        answer = sum
        
        return answer
    }
}