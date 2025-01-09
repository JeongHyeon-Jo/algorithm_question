class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk = mutableListOf<Int>()
        var i = 0
        var arrValue = 0
        var arrSize = arr.size 
        var listSize = 0
        
        while(i < arrSize) {
            listSize = stk.size
            arrValue = arr[i]
            if(listSize == 0) { stk.add(arr[i]); i++ }
            else{
                if(stk[listSize - 1] < arrValue) { stk.add(arrValue); i++ }
                else { stk.removeAt(listSize - 1) }
            }
        }
        
        return stk.toIntArray()
    }
}