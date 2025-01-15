class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer: IntArray = intArrayOf()
        var X = mutableListOf<Int>()
        var n = 0
        
        for(i in 0 .. arr.size - 1) {
            n = arr[i]
            
            if(flag[i]) {
                repeat(n * 2) { X.add(n) }
            } else {
                repeat(n) { X.removeAt(X.size-1) }
            }
        }
        
        answer = X.toIntArray()
        
        return answer
    }
}