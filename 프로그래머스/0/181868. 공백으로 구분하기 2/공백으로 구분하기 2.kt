class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var keep = false
        var temp = ""
        
        for(s in my_string){
            if(s == ' ') {
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
        
        if(temp != "") {
            answer += temp
        }
        
        return answer
    }
}