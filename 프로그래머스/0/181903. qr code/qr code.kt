class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer: String = ""
        var code_arr = code.toCharArray()
        
        for((i, v) in code_arr.withIndex()){
            if(i % q == r) { answer += v.toString() }
        }
        
        return answer
    }
}