class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        var one = intArrayOf(1, 2, 3, 4, 5)
        var two = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        var thr = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        var onco = 0; var twco = 0; var thco = 0;
        
        for((i, v) in answers.withIndex()){
            if(v == one[i % 5]) onco++
            if(v == two[i % 8]) twco++
            if(v == thr[i % 10]) thco++
             
        }
        var score = intArrayOf(onco, twco, thco)
        var max = score.maxOrNull()
        
        if(max == onco) answer += 1
        if(max == twco) answer += 2
        if(max == thco) answer += 3
        
        return answer
    }
}