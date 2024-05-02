class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 1234567890
        if(a.size == b.size){
            answer = 0
            for(n in 0 .. a.size - 1){
                answer += a[n] * b[n]
            }
        }
        return answer
    }
}