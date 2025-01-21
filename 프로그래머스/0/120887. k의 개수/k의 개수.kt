class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0
        var kstr = k.toString()
        
        for(a in i..j) {
            answer += a.toString().map{ it.toString() }.count{ it == kstr }
        }
        
        return answer
    }
}