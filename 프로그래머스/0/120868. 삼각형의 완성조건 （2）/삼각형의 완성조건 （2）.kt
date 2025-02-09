class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        var s1 = sides[0]
        var s2 = sides[1]
        var sB = if(s1 > s2) s1 else s2
        var sS = if(s1 < s2) s1 else s2
        
        for(i in 1 .. sB) {
            if(sS + i > sB) answer++
        }
        
        for(j in (sB + 1) until (sS + sB)) {
            if(sS + sB > j) answer++
        }
        
        return answer
    }
}