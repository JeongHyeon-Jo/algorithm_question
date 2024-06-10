class Solution {
    fun solution(s: String): String {
        var answer = ""
        var slist = s.toCharArray().toMutableList()
        var act: Boolean = true 
        for((ind, sl) in slist.withIndex()){
            if(act){
                if(sl.isLetter()){
                    if(sl.isUpperCase()){ act = false }
                    else { slist[ind] = sl.toUpperCase(); act = false }
                } else {
                    act = false
                }
            } else {
                if(sl.isLetter()){
                    if(sl.isUpperCase()){ slist[ind] = sl.toLowerCase() }
                }
            }
            if(sl == ' '){ act = true }
        }
        
        answer = slist.joinToString("")
        
        return answer
    }
}