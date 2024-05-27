class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var count = 1
        var preval = 0
        var temp = 0
        
        for((i, v) in section.withIndex()){
            if(i == 0) {
                preval = v
                continue 
            }
            if(v - preval + 1 > m){
                count++
                preval = v
            }
        }
        
        answer = count
        
        return answer
    }
}