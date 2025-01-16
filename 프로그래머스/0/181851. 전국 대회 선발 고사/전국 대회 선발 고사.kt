class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var answer: Int = 0
        var attend_rank = emptyArray<Int>()
        val rank_ind = HashMap<Int, Int>()
        var itIndex = 0
        
        for(i in 0 .. rank.size - 1) {
            if(attendance[i]) {
                attend_rank += rank[i]
                rank_ind[rank[i]] = i
            }
        }
        
        attend_rank = attend_rank.sortedArray()
        
        for(it in 0 .. 2) {
            when(it) {
                0 -> {
                    itIndex = rank_ind[attend_rank[it]]!!
                    answer += (10000 * itIndex)
                }
                1 -> {
                    itIndex = rank_ind[attend_rank[it]]!!
                    answer += (100 * itIndex)
                }
                2 -> {
                    itIndex = rank_ind[attend_rank[it]]!!
                    answer += itIndex
                }
            }
        }
        
        return answer
    }
}