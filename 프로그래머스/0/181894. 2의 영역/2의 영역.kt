class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var first_two = -1
        var last_two = -1
        
        for((i, a) in arr.withIndex()){
            if(a == 2){
                if(first_two == -1){
                    first_two = i
                    last_two = i
                } else {
                    last_two = i
                }
            }
        }
        
        if(first_two != -1 && last_two != -1) answer = arr.slice(first_two..last_two).toIntArray()
        else answer += -1
        
        return answer
    }
}