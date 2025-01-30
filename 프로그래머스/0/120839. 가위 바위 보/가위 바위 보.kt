class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        
        for(r in rsp) {
            when(r) {
                '2' -> answer += "0"
                '0' -> answer += "5"
                '5' -> answer += "2"
            }
        }
        
        return answer
    }
}