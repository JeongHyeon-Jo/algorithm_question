class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(i in intervals.indices){
            for(j in intervals[i][0] .. intervals[i][1]){
                answer += arr[j]
            }
        }
        
        return answer
    }
}