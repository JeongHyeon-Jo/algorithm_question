class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        var sum: Double = 0.0
        
        for(i: Int in numbers){
            if(i >= 0 && i <= 1000)
                sum += i
        }
        
        if(numbers.size >= 0 && numbers.size <= 100){
            answer = sum / numbers.size
        }
        
        return answer
    }
}