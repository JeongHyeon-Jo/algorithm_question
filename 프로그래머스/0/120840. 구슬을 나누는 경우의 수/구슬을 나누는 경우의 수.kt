class Solution {
    fun fac(num: Int): Double {
        var result = 1.0
        if(num == 0) return result
        for(n in num downTo 1) {
            result *= n
        }
        return result
    }
    
    fun solution(balls: Int, share: Int): Int {
        var answer = 0
        var temp = 1.0
        
        if(balls - share > 0) {
            for(i in share + 1 .. balls) {
                temp *= i
            }
            answer = (temp / fac(balls - share)).toInt()
        } else {
            answer = 1
        }
        
        return answer
    }
}