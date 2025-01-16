class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var alist = arr.toMutableList()
        
        for(d in delete_list) {
            if(alist.contains(d)) {
                alist.remove(d)
            }
        }
        
        answer = alist.toIntArray()
        
        return answer
    }
}