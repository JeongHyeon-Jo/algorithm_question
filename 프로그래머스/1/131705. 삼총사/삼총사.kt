class Solution {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        var count = 0
        var sum = 0
        
        for(ind1 in 0 .. (number.size-1)){
            sum += number[ind1]
            for(ind2 in (ind1+1) .. (number.size-1)){
                sum += number[ind2]
                for(ind3 in (ind2+1) .. (number.size-1)){
                    sum += number[ind3]
                    if(sum == 0) { ++count }
                    sum -= number[ind3]
                }
                sum -= number[ind2]
            }
            sum -= number[ind1]
        }
        
        answer = count
        
        return answer
    }
}