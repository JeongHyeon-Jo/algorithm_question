class Solution {
    fun solution(num_list: IntArray): Int {
        var odd_sum = 0
        var even_sum = 0
        
        for((i, v) in num_list.withIndex()){
            if((i+1) % 2 != 0){
                odd_sum += v
            } else {
                even_sum += v
            }
        }
        
        return if(odd_sum >= even_sum) odd_sum else even_sum
    }
}