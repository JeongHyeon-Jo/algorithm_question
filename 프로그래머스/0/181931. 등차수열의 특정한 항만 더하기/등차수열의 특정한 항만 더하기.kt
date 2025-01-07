class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var temp = a
        
        for(i in included){
            if(i){ answer += temp }
            temp += d
        }
        
        return answer
    }
}