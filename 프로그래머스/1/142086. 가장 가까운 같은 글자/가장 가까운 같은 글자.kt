class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var sarr = s.toCharArray()
        
        for((i, v) in sarr.withIndex()){
            if(i == 0){ answer += -1}
            else{
                for(j in (i-1) downTo 0 ){
                    var gap = i - j
                    if(sarr[j] == sarr[i]){ answer += gap; break}
                }
            }
            if(answer.size != i+1) { answer += -1}
        }
        
        return answer
    }
}