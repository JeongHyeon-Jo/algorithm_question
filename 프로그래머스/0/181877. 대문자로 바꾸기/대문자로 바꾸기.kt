class Solution {
    fun solution(myString: String): String = myString.map{ it.toUpperCase() }.joinToString("")
}