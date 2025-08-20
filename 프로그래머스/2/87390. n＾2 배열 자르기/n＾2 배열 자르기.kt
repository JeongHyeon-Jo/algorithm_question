class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer: IntArray = intArrayOf()
        var count = left
        
        while(count <= right) {
            val i = count / n
            val j = count % n
            
            if(i >= j) answer += i.toInt() + 1
            else answer += j.toInt() + 1
            
            count++
        }
        
        return answer
    }
}