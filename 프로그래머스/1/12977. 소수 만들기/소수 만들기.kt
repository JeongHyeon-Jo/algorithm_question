class Solution {
    fun sosu(num: Int): Boolean {
        for(n in 2 .. num-1){
            if(num % n == 0) return false
        }
        return true
    }
    
    fun solution(nums: IntArray): Int {
        var answer = -1
        var sum = 0
        var count = 0
        for(i in 0 .. nums.size-3){
            for(j in i+1 .. nums.size - 2){
                for(k in j+1 .. nums.size - 1){
                    sum = nums[i] + nums[j] + nums[k]
                    if(sosu(sum)) count++
                }
            }
        }
        
        answer = count

        return answer
    }
}