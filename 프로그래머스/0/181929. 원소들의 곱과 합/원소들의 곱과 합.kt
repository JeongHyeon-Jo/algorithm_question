class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var sum = 0
        var multiply = 1
        
        for(n in num_list) {
            sum += n
            multiply *= n
        }
        
        answer = if(sum * sum >= multiply) 1 else 0
        
        return answer
    }
}