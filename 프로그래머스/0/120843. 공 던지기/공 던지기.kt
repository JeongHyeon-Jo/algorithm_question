class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = 0
        var people = numbers.size
        var count = 1
        var latestThrow = 0
        var latestCatch = 2
        
        while(count != k) {
            latestThrow = latestCatch
            if(latestCatch + 2 > people - 1) { latestCatch = latestCatch + 2 - people }
            else { latestCatch = latestCatch + 2 }
            count++
        }
        
        answer = numbers[latestThrow]
        
        return answer
    }
}