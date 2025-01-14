class Solution {
    fun solution(myStr: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var keep = false
        var temp = ""
        
        for(s in myStr) {
            if(s == 'a' || s == 'b' || s == 'c') {
                if(keep) {
                    answer += temp
                    temp = ""
                    keep = false
                }
            } else {
                temp += s.toString()
                keep = true
            }
        }
        
        if(keep) { answer += temp }
        if(answer.isEmpty()) { answer += "EMPTY" }
        
        return answer
    }
}