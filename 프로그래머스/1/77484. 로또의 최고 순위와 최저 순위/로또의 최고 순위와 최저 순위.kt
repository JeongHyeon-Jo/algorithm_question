class Solution {
    fun result(num: Int) =
        when(num){
            2 -> 5
            3 -> 4
            4 -> 3
            5 -> 2
            6 -> 1
            else -> 6
        }

    
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var best: Int = 0
        var worst: Int = 0
        
        for(i in 0 .. 5) {
            if(lottos[i] == 0) { best++ }
            if(win_nums.contains(lottos[i])){
                best++
                worst++
            }
        }
        
        answer += result(best)
        answer += result(worst)
        
        return answer
    }
}