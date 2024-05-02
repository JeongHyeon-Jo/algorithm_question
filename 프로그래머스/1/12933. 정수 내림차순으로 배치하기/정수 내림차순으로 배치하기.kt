class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var list = mutableListOf<Long>()
        var temp: Long = n
        
        while(temp > 0){
            list.add(temp %10)
            temp /= 10
        }
        
        list.sort()
        list.reverse()
        answer = list.joinToString("").toLong()
          
        return answer
    }
}