class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray = intStrs.filter{
        it.substring(s..(s+l-1)).toInt() > k 
    }.map{ it.substring(s..(s+l-1)).toInt() }.toIntArray()
}