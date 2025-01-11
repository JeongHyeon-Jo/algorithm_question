class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer: Int = 0
        var result = false
        
        for((i, v) in arr.withIndex()){
            if(i >= idx && v == 1){
                answer = i
                result = true
                break
            }
        }
        
        return if(result) answer else -1
    }
}