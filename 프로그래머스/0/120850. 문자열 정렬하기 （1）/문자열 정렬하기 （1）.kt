class Solution {
    fun solution(my_string: String): IntArray = 
        my_string
        .filter{ !it.isLetter() }
        .map{ it.toString().toInt() }
        .toIntArray()
        .sortedArray()
}