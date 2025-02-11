import kotlin.math.*

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray = numlist.sortedWith(compareBy<Int> { abs(it - n) }.thenByDescending { it }).toIntArray()
}