class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""
        var starr = my_string.toCharArray()
        var temp = starr[num1]
        
        starr[num1] = starr[num2]
        starr[num2] = temp
        answer = starr.joinToString("")
        
        return answer
    }
}