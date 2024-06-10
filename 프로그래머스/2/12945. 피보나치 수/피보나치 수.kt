class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var F = HashMap<Int,Int>()
        F[0] = 0; F[1] = 1
        for(N in 2 .. n){
            F[N] = (F[N-1]!! + F[N-2]!!) % 1234567
        }
        
        answer = F[n]!!
        
        return answer
    }
}