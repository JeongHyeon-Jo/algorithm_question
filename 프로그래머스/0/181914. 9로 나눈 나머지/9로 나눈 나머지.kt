class Solution {
    fun solution(number: String): Int = number.map{ it.toString().toInt() }.toIntArray().sum() % 9
}