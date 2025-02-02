class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var first = 0
        var second = 0
        var temp = 0
        
        for(n in numbers) {
            if(n >= second) {
                second = n
            }
            if(second >= first) {
                temp = first
                first = n
                second = temp
            }
        }
        
        answer = first * second
        
        return answer
    }
}