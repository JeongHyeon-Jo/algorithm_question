class Solution {
    fun solution(myString: String, pat: String): Int = if(
        myString
        .map{ if(it == 'A') 'B' else 'A' }
        .joinToString("")
        .contains(pat)) 1 else 0
}