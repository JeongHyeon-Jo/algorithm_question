class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        var sarr = s.toCharArray()
        var asci = 0
        
        for((i, v) in sarr.withIndex()){
            if(v.isLetter()){
                if(v.isUpperCase()){
                    asci = v.toInt() + n
                    if(asci > 90) asci = 65 + (asci - 91)
                    sarr[i] = asci.toChar()
                } else {
                    asci = v.toInt() + n
                    if(asci > 122) asci = 97 + (asci - 123)
                    sarr[i] = asci.toChar()
                }
            }
        }
        
        answer = sarr.joinToString("")
        
        return answer
    }
}