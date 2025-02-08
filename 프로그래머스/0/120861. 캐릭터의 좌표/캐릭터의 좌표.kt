class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var maxX = (board[0] - 1) / 2; var minX = -maxX
        var maxY = (board[1] - 1) / 2; var minY = -maxY
        
        repeat(2) { answer += 0 }
        
        for(k in keyinput) {
            when(k) {
                "up" -> if(answer[1] < maxY) answer[1]++
                "down" -> if(answer[1] > minY) answer[1]--
                "right" -> if(answer[0] < maxX) answer[0]++
                "left" -> if(answer[0] > minX) answer[0]--
            }
        }
        
        return answer
    }
}