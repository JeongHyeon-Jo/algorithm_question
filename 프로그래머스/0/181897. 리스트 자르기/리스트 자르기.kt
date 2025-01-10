class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        when(n) {
            1 -> {
                answer = num_list.slice(0..slicer[1]).toIntArray()
            }
            2 -> {
                answer = num_list.slice(slicer[0]..(num_list.size - 1)).toIntArray()
            }
            3 -> {
                answer = num_list.slice(slicer[0]..slicer[1]).toIntArray()
            }
            4 -> {
                answer = num_list.slice(slicer[0]..slicer[1] step slicer[2]).toIntArray()
            }
        }
        
        return answer
    }
}