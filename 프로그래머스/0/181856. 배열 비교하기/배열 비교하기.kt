class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0
        var a1 = arr1.size
        var a2 = arr2.size
        var a1Sum = arr1.sum()
        var a2Sum = arr2.sum()
        
        if(a1 > a2) {
            answer = 1
        } else if (a1 < a2) {
            answer = -1
        } else {
            if(a1Sum > a2Sum) answer = 1
            else if(a1Sum < a2Sum) answer = -1
            else answer = 0 
        }
        
        return answer
    }
}