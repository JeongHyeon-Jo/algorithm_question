class Solution {
    fun solution(s: String): String {
        var answer = ""
        var slist = s.split(" ")
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        
        for(sl in slist){
            var sint = sl.toInt()
            if(sint >= max) { max = sint }
            if(sint <= min) { min = sint }
        }
        
        answer = min.toString() + " " + max.toString()
        
        return answer
    }
}