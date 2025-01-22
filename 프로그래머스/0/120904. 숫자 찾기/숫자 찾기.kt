class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = 0
        var nmap = num.toString().map{ it.toString() }
        var kstr = k.toString()
        
        for((i, n) in nmap.withIndex()) {
            if(n == kstr) {
                answer = i + 1
                break
            }
        }
        
        return if(answer == 0) -1 else answer
    }
}