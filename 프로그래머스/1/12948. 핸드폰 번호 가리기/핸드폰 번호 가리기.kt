class Solution {
    fun solution(phone_number: String): String {
        var answer = ""
        var pn: CharArray = phone_number.toCharArray()
        
        for(i in 0..(pn.size - 5)){
            pn.set(i, '*')
        }
        
        answer = pn.joinToString("")
        
        return answer
    }
}