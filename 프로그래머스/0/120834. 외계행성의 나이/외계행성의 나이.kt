class Solution {
    fun solution(age: Int): String = age.toString().map{ (it.toString().toInt() + 97).toChar().toString() }.joinToString("")
}