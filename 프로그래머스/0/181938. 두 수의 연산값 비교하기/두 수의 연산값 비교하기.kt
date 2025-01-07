class Solution {
    fun solution(a: Int, b: Int): Int {
        var an1 = "$a$b".toInt()
        var an2 = 2 * a * b
        
        return if(an1 >= an2) an1 else an2
    }
}