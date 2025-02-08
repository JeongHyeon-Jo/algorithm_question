class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for(i in 0 .. my_str.length - 1 step n) {
            if(i + n <= my_str.length - 1) {
                answer += my_str.substring(i, i + n)    
            } else {
                answer += my_str.substring(i)   
            }
        }
        
        return answer
    }
}