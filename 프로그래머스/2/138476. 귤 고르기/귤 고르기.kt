class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var size_count = HashMap<Int, Int>()
        
        for(v in tangerine){
            size_count[v] = 0
        }
        
        for(t in tangerine){
            size_count[t] = size_count[t]!! + 1
        }
        
        var ta = 0
        var sc = size_count.toList().sortedByDescending { it.second }.toMap()
        
        for((key, va) in sc){
            ta += va
            answer++
            if(ta >= k) break
        }
        
        return answer
    }
}