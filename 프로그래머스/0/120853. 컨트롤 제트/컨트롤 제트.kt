class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var slist = s.split(" ")
        var temp = 0
        
        for(sl in slist) {
            if(sl == "Z") {
                answer -= temp
            } else {
                temp = sl.toInt()
                answer += temp
            }
        }
        
        return answer
    }
}