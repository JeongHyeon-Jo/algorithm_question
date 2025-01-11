class Solution {
    fun solution(n: Int, k: Int): IntArray = (k..n step k).map{ it }.toIntArray()
}