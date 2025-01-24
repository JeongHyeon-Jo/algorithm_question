class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        var str = my_string.map{ it.toString() }
        
        for(s in str) {
            repeat(n) { answer += s }
        }
        
        return answer
    }
}