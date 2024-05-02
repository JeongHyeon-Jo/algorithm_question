class Solution {
    fun solution(n: Long): IntArray {
        var answer = ArrayList<Int>()
        var temp: Long = n
        
        while(temp > 0){
            answer.add((temp % 10L).toInt())
            temp = temp / 10
        }
            
        return answer.toIntArray()
    }
}