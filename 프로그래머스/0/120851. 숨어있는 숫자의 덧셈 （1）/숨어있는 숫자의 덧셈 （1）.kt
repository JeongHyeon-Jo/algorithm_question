class Solution {
    fun solution(my_string: String): Int =
        my_string
        .filter{ !it.isLetter() }
        .map{ it.toString().toInt() }
        .sum()
}