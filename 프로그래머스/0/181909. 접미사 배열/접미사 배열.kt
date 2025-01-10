class Solution {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var i = 0
        var maxI = my_string.length - 1
        
        while(i <= maxI){
            answer += my_string.substring(i..maxI)
            i++
        }
        
        answer = answer.sortedArray()
        
        return answer
    }
}