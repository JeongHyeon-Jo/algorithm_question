class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var emHash = HashMap<Int, Int>()
        var emSort = emergency.sortedArrayDescending()
        var order = 1
        
        for(e in emSort) {
            emHash[e] = order
            order++
        }
        
        for(em in emergency) {
            answer += emHash[em]!!
        }
        
        return answer
    }
}