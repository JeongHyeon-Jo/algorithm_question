class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var sum = 0
        
        for(num in numbers){
            sum += num
            if(sum > n) break
        }
        
        return sum
    }
}