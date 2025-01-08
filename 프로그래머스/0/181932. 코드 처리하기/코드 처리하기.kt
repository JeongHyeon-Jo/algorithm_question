class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Boolean = false
        var codeArray = code.toCharArray()
        
        for((i, c) in codeArray.withIndex()){
            if(c == '1'){
                mode = !mode
                continue
            }
            
            if(mode){
                if(i % 2 != 0) answer += c
            } else {
                if(i % 2 == 0) answer += c
            }
        }
        
        return if(answer == "") "EMPTY" else answer
    }
}