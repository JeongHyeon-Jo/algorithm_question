class Solution {
    fun solution(s: String): String {
        var answer = ""
        var index = 0
        var count = 0
        var charr = s.toCharArray()
        
        for(ch in charr){            
            if(ch.isLetter()){
                if(count % 2 == 0){
                    if(ch.isLowerCase()) { charr[index] = ch.toUpperCase() }   
                } else {
                    if(ch.isUpperCase()) { charr[index] = ch.toLowerCase() }
                }
            }
            
            ++count
            ++index
            
            if(ch == ' ') {
                count = 0
            }
        }
        
        answer = charr.joinToString("")
        
        return answer
    }
}