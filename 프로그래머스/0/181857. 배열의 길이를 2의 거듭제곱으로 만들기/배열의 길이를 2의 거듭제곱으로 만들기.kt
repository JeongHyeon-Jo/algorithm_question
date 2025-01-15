import kotlin.math.*

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr
        var i = 0.0
        var pow = 0
        
        while(true) {
            pow = 2.0.pow(i).toInt()
            if(answer.size == pow) {
                break
            } else if(answer.size > pow) {
                i++
            } else {
                repeat(pow - answer.size) {
                    answer += 0
                }
            }
        }
        
        return answer
    }
}