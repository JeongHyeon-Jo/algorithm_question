class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        val wantList = mutableListOf<String>()
        
        for(i in discount.indices) {
            var satisfied = true
            if(i + 10 <= discount.size) {
                val sale = discount.slice(i .. i+9).toMutableList()
                for(j in want.indices) {
                    if(sale.count { it -> it == want[j] } < number[j]) satisfied = false
                }
            } else { break }
            if(satisfied) answer++
        }
        
        return answer
    }
}