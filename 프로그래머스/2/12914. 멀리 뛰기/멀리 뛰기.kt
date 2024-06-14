class Solution {
    fun solution(n: Int): Long {
        var answer: Long = 0
        var fibo = HashMap<Int, Long>()
        
        fibo[0] = 0L
        fibo[1] = 1L
        for(i in 2 .. n+1){
            fibo[i] = (fibo[i-1]!! + fibo[i-2]!!) % 1234567
        }
        
        answer = fibo[n+1]!!
        
        return answer
    }
}