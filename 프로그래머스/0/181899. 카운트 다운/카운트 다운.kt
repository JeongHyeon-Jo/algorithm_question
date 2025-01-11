class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray = (start_num downTo end_num).map{ it }.toIntArray()
}