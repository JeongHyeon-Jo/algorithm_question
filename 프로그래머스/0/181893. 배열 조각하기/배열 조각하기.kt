class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer: IntArray = arr
        
        for((i, v) in query.withIndex()){
            if(i % 2 == 0){
                answer = answer.filterIndexed{ ind, va -> ind <= v }.toIntArray()
            } else {
                answer = answer.filterIndexed{ ind, va -> ind >= v }.toIntArray()
            }
        }
        
        return answer
    }
}