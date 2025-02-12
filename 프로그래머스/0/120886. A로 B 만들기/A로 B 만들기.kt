class Solution {
    fun solution(before: String, after: String): Int {
        var answer: Int = 0
        var bearr = before.toCharArray().sortedArray()
        var afarr = after.toCharArray().sortedArray()
        
        if(bearr.joinToString("") == afarr.joinToString("")) {
            answer = 1
        } else {
            answer = 0
        }
        
        return answer
    }
}