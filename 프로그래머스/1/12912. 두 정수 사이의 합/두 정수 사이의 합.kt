class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        var sum:Long = 0
        if(a < b){
            for(i in a..b){
                sum += i
            }
        answer = sum
        } else if(a > b){
            for(i in b..a){
                sum += i
            }
        answer = sum
        } else { answer = a.toLong() }
        
        return answer
    }
}