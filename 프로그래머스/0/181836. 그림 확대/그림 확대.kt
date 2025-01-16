class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var temp = ""
        for(p in picture) {
            var parr = p.toCharArray()
            for(q in parr) {
                var qst = q.toString()
                repeat(k) {
                    temp += qst
                }
            }
            repeat(k) {
                answer += temp
            }
            temp = ""
        }
        
        return answer
    }
}