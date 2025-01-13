class Solution {
    fun solution(myString: String): String = myString.map{ if(it.isUpperCase() && it != 'A') it.toLowerCase() else if(it.isLowerCase() && it == 'a') it.toUpperCase() else it }.joinToString("")
}