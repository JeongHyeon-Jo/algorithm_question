class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        var max = 0
        var mid = 0
        var min = 0
        var temp = 0
        
        for(s in sides) {
            if(s > min) {
                min = s
            }
            if(min > mid) {
                temp = mid
                mid = min
                min = temp
            }
            if(mid > max) {
                temp = max
                max = mid
                mid = temp
            }
        }
        
        if(max < mid + min) answer = 1 else answer = 2
        
        return answer
    }
}