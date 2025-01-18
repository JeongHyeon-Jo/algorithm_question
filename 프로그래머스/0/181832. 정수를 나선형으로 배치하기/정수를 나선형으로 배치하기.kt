class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer: Array<IntArray> = Array(n) { IntArray(n) }
        var count = 1
        var direction = "right" // right -> down -> left -> up ->
        var i = 0; var j = 0
        var mr = n - 1; var md = n - 1; var ml = 0; var mu = 1
        
        while(count <= n * n) {
            when(direction) {
                "right" -> {
                    answer[i][j] = count
                    count++
                    if(j < mr) { j++ }
                    else {
                        direction = "down"
                        mr--
                        i++
                    }
                }
                "down" -> {
                    answer[i][j] = count
                    count++
                    if(i < md) { i++ }
                    else {
                        direction = "left"
                        md--
                        j--
                    }
                }
                "left" -> {
                    answer[i][j] = count
                    count++
                    if(j > ml) { j-- }
                    else {
                        direction = "up"
                        ml++
                        i--
                    }
                }
                "up" -> {
                    answer[i][j] = count
                    count++
                    if(i > mu) { i-- }
                    else {
                        direction = "right"
                        mu++
                        j++
                    }
                }
            }
        }
        
        return answer
    }
}