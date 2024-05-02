class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>()
        
        for(i: Int in 1..n){
            answer.add(x.toLong() * i)
        }
        
        return answer.toLongArray()
    }
}