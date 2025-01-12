class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        for(i in queries.indices){
            for(j in queries[i][0] .. queries[i][1]){
                answer[j]++
            }
        }
        
        return answer
    }
}