class Solution {
    fun solution(my_string: String, alp: String): String = my_string.map{ if(it.toString() == alp) it.toUpperCase() else it }.joinToString("")
}