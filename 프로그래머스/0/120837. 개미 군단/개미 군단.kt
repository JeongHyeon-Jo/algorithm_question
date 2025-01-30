class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var temp = 0
        var left = hp
        
        temp = left / 5
        left =  left - temp * 5
        answer += temp
        temp = left / 3
        left =  left - temp * 3
        answer += temp
        answer += left
        
        return answer
    }
}