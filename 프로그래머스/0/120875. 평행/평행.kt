class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var slope = emptyArray<Double>()
        
        val a = arrayOf(dots[0][0], dots[0][1])
        val b = arrayOf(dots[1][0], dots[1][1])
        val c = arrayOf(dots[2][0], dots[2][1])
        val d = arrayOf(dots[3][0], dots[3][1])
        
        if((a[1] - b[1]).toDouble() / (a[0] - b[0]).toDouble() == 
                (c[1] - d[1]).toDouble() / (c[0] - d[0]).toDouble()) answer = 1
        if((b[1] - c[1]).toDouble() / (b[0] - c[0]).toDouble() == 
                (a[1] - d[1]).toDouble() / (a[0] - d[0]).toDouble()) answer = 1
        if((a[1] - c[1]).toDouble() / (a[0] - c[0]).toDouble() == 
                (b[1] - d[1]).toDouble() / (b[0] - d[0]).toDouble()) answer = 1
        
        return answer
    }
}