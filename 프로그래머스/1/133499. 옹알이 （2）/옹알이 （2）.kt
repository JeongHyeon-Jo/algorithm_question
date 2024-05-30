class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        var word = arrayOf<String>("aya", "ye", "woo", "ma")
        var temp = ""
        
        for(b in babbling){
            temp = b
            if(temp.contains("ayaaya") || temp.contains("yeye") ||
                temp.contains("woowoo") || temp.contains("mama")) { continue }
            
            for(w in word){
                if(temp.contains(w)) {
                    temp = temp.replace(w, " ")
                }
            }
            
            temp = temp.trim()
            
            if(temp == "") { answer++ }
        }
        
        return answer
    }
}