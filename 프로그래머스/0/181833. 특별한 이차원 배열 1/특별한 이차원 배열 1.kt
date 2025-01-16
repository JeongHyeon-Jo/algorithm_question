class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        
        for(i in 0 until n) {
            var row = IntArray(n)
            for(j in 0 until n) {
                if(i == j) {
                    row[j] = 1
                } else {
                    row[j] = 0
                }
            }
            answer = answer.plus(row)
        }
        
        return answer
    }
}