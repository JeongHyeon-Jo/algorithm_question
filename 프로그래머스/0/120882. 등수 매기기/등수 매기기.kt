class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        var avg = doubleArrayOf()
        
        for(s in score.indices) {
            avg = avg.plus(score[s].average())
        }
        
        var sd = avg.sortedArrayDescending()
        var rank = 1
        var avg_rank = HashMap<Double,Int>()
        var temp = 0.0
        for((i, d) in sd.withIndex()) {
            if(temp == d) {
                avg_rank[d] = rank
            } else {
                rank = i + 1
                avg_rank[d] = rank
                temp = d
            }
        }
        
        for(a in avg) {
            answer = answer.plus(avg_rank[a]!!)
        }
        
        return answer
    }
}