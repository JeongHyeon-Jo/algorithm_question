class Solution {
    fun solution(dot: IntArray): Int {
        var answer: Int = 0
        var x = dot[0]
        var y = dot[1]
        
        when {
            x > 0 && y > 0 -> answer = 1
            x < 0 && y > 0 -> answer = 2
            x < 0 && y < 0 -> answer = 3
            x > 0 && y < 0 -> answer = 4
        }
        
        return answer
    }
}