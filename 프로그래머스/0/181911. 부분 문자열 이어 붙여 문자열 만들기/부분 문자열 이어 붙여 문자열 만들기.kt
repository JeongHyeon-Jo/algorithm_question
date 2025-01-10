class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        var maxIndex = my_strings.size - 1
        
        for(i in 0 .. maxIndex){
            answer += my_strings[i].substring(parts[i][0] .. parts[i][1])
        }
        
        return answer
    }
}