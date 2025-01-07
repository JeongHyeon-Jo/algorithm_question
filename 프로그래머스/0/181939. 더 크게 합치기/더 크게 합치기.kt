class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        var ast = a.toString()
        var bst = b.toString()
        
        var an1 = (ast + bst).toInt()
        var an2 = (bst + ast).toInt()
        
        if(an1 >= an2) answer = an1
        else answer = an2
        
        return answer
    }
}