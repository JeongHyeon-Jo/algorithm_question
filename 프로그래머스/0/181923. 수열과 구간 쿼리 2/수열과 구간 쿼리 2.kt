class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        var minList = mutableListOf<Int>()
        var satisfy = false
        
        for(q in queries.indices){
            var s = queries[q][0]
            var e = queries[q][1]
            var k = queries[q][2]
            
            for(i in s..e) {
                if(arr[i] > k) {
                    minList.add(arr[i])
                    satisfy = true
                }
            }
            
            if(satisfy){
                answer += minList.minOrNull()!!
                minList.clear()
                satisfy = false
            } else {
                answer += -1
            }
        }
        
        return answer
    }
}