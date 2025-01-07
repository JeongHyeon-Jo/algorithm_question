class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var even = ""
        var odd = ""
        
        for(n in num_list){
            if(n % 2 == 0){
                even += n
            } else {
                odd += n
            }
        }
        
        answer = even.toInt() + odd.toInt()
        
        return answer
    }
}