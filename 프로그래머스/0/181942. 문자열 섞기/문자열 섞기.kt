class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        var count = 0
        
        while(count < str1.length) {
            answer = answer + str1[count] + str2[count]
            count++
        }
        
        return answer
    }
}