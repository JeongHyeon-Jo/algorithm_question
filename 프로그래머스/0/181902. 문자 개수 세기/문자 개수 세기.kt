class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = IntArray(52) { 0 }
        var sarr = my_string.toCharArray()
        
        for(s in sarr){
            if(s.isUpperCase()){
                answer[s.toInt()-65]++
            } else {
                answer[s.toInt()-71]++
            }
        }
        
        return answer
    }
}