class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var max = -1
        var disarr = array.distinct()
        
        for(a in disarr) {
            var count = array.count{ it == a }
            if(count > max) {
                max = count
                answer = a
            } else if (count == max) {
                answer = -1
            }
        }
        
        return answer
    }
}