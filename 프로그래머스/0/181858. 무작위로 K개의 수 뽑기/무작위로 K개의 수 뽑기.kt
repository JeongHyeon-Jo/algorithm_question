class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(a in arr){
            if(answer.isEmpty()) {
                answer += a
            } else {
                if(!answer.contains(a)) {
                    answer += a
                }
            }
            if(answer.size == k) break
        }
        
        if(answer.size < k){
            repeat(k - answer.size) {
                answer += -1
            }
        }
        
        return answer
    }
}