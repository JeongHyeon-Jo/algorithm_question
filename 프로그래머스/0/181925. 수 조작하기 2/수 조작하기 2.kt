class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        var now = 0
        var temp = 0
        
        for((i, v) in numLog.withIndex()){
            if(i == 0){
                now = v
                continue
            }
            temp = v - now
            when(temp){
                1 -> answer += "w"
                -1 -> answer += "s"
                10 -> answer += "d"
                else -> answer += "a"
            }
            now = v
        }
        
        return answer
    }
}