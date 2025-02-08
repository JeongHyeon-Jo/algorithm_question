class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var x1 = -256; var x2 = -256
        var y1 = -256; var y2 = -256
        
        for(d in dots.indices) {
            var x = dots[d][0]
            var y = dots[d][1]
            if(x > x1) {
                x2 = x1
                x1 = x
            } else if(x == x1) {
            } else {
                x2 = x
            }
            if(y > y1) {
                y2 = y1
                y1 = y
            } else if(y == y1) {
            } else {
                y2 = y
            }
        }
        
        answer = (x1 - x2) * (y1 - y2)
        
        return answer
    }
}