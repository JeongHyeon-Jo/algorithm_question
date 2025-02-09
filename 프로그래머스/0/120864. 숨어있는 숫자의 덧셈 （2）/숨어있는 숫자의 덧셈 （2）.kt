class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        var temp = ""
        for(m in my_string) {
            if(m.isDigit()) {
                temp += m.toString()
            } else {
                if(temp.isNotEmpty()) {
                    answer += temp.toInt()
                    temp = ""
                }
            }
        }
        
        if(temp.isNotEmpty()) {
            answer += temp.toInt()
            temp = ""
        }
        
        return answer
    }
}