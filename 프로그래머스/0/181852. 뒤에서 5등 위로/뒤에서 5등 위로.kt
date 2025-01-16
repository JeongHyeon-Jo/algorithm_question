class Solution {
    fun solution(num_list: IntArray): IntArray = num_list.sortedArray().filterIndexed{ ind, it -> ind > 4 }.toIntArray()
}