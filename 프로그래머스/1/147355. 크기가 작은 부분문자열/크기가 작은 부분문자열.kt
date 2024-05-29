class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var tlong = 0L
        var plong = p.toLong()
        var count = 0
        
        for(i in 0 .. (t.length-1)){
            tlong = t.subSequence(i, i+p.length).toString().toLong()
            if(tlong <= plong) { ++count }
            if(i+p.length == t.length) { break }
        }
        
        answer = count
        
        return answer
    }
}