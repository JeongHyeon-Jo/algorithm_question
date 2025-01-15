class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var stk = mutableListOf<Int>()
        var i = 0
        
        while(i < arr.size) {
            if(stk.isEmpty()) {
                stk.add(arr[i])
                i++
            } else {
                if(arr[i] == stk[stk.size - 1]) {
                    stk.removeAt(stk.size - 1)
                    i++
                } else {
                    stk.add(arr[i])
                    i++
                }
            }
        }
        
        if(stk.isEmpty()){
            answer += -1
        } else {
            answer = stk.toIntArray()
        }
        
        return answer
    }
}