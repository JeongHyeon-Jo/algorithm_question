class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var temp = 0
        
        for(n in num_list){
            temp = n
            while(temp != 1) {
                if(temp % 2 == 0) {
                    temp /= 2
                } else {
                    temp = (temp - 1) / 2
                }
                answer++
            }
        }

        
        return answer
    }
}