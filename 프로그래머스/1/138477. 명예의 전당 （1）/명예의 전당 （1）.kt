class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var honor = mutableListOf<Int>()
        
        for((day, sco) in score.withIndex()){
            if(day < k) { honor.add(sco) }
            else{
                if(honor[k-1] < sco) honor.set(k-1, sco)
            }
            honor.sortDescending()
            
            answer += honor.last()
        }
        
        return answer
    }
}