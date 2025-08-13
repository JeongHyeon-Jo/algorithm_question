class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        val hash = HashMap<String, Int>()
        
        for(i in name.indices) {
            hash[name[i]] = yearning[i]
        }
        
        for(p in photo) {
            val score = p.sumOf { person -> hash[person] ?: 0}
            answer += score
        }
        
        return answer
    }
}