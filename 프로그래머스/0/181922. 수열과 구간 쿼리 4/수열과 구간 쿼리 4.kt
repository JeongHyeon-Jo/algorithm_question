class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        for(q in queries.indices){
            var s = queries[q][0]
            var e = queries[q][1]
            var k = queries[q][2]
            
            for(i in s..e) {
                if(i % k == 0) {
                    answer[i] += 1 
                }
            }
        }
        
        return answer
    }
}