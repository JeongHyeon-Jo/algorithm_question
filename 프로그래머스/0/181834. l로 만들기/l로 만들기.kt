class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        var marr = myString.toCharArray()
        
        for(m in marr) {
            if(m.toInt() <= 108) {
                answer += "l"
            } else {
                answer += m.toString()
            }
        }
        
        return answer
    }
}