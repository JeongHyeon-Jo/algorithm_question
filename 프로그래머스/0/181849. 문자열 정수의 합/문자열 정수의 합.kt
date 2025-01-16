class Solution {
    fun solution(num_str: String): Int = num_str.map { it.toString().toInt() }.sum()
}