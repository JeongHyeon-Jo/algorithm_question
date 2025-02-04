class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var my_set = mutableSetOf<Char>()
        
        for(m in my_string) {
            my_set.add(m)
        }
        
        answer = my_set.joinToString("")
        
        return answer
    }
}