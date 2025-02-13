class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var n = total + num
        
        while(true) {
            val sum = num * (2 * n - num + 1) / 2
            if(sum == total){
                (n - num + 1 .. n).forEach{ answer += it }
                break
            } else {
                n--
            }
        }
        
        return answer
    }
}