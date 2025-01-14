class Solution {
    fun solution(num_list: IntArray): IntArray = num_list.sortedArray().slice(0 .. 4).toIntArray()
}