class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        var reversed: String = ""
        var s = 0
        var e = 0
        
        for(i in queries.indices){
            s = queries[i][0]
            e = queries[i][1]
            reversed = answer.substring(s, e+1).toCharArray().reversedArray().joinToString("")
            answer = answer.replaceRange(s, e+1, reversed)
        }
        
        return answer
    }
}