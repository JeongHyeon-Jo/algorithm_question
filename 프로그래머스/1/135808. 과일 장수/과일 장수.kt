class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var most: IntArray = score
        most.sortDescending()
        var box = mutableListOf<Int>()
        
        for(i in 0 .. most.size-1 step m){
            if(most.size - i < m) { break }
            for(j in i .. i+m-1){
                box.add(most[j])
            }
            answer += box[m-1] * m
            box.clear()
        }
        
        return answer
    }
}