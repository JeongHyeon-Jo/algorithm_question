class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var sum = 0
        
        for(i in numbers.indices){
            for(j in (i+1) .. (numbers.size-1)){
                sum = numbers[i] + numbers[j] 
                if(!answer.contains(sum)) { answer += sum }
            }
        }
        answer.sort()
        
        return answer
    }
}