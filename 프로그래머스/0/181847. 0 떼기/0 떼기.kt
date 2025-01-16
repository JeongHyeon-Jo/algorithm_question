class Solution {
    fun solution(n_str: String): String {
        var answer: String = ""
        var n_list = n_str.toCharArray().toMutableList()
        var n = '0'
        
        while(n == '0') {
            n = n_list[0]
            if(n == '0') {
                n_list.removeAt(0)
            }
        }
        
        answer = n_list.joinToString("")
        
        return answer
    }
}